/**
 * 
 */
package fi.csc.avaa.tupa.vaadin.portlet;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.Page;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;

import fi.csc.avaa.tools.vaadin.language.LanguageConst;
import fi.csc.avaa.tupa.ViewContent;
import fi.csc.avaa.vaadin.portlet.AvaaUI;
import fi.csc.avaa.vaadin.tools.VaadinTools;

/**
 * @author jmlehtin
 *
 */
@Theme("valo")
public class ViewUI extends AvaaUI {

	@SuppressWarnings("serial")
//	@WebServlet(value = "/VAADIN/*", asyncSupported = true)
	@WebServlet(urlPatterns = {"/*"}, asyncSupported = true)
	@VaadinServletConfiguration(productionMode = true, ui = ViewUI.class)
	public static class Servlet extends VaadinServlet {
//
//		/**
//		 * Override to handle the CORS requests.
//		 */
//		@Override
//		protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//			// Origin is needed for all CORS requests
//			String origin = request.getHeader("Origin");
//			if (origin != null && isAllowedRequestOrigin(origin)) {
//
//				// Handle a preflight "option" requests
//				if ("options".equalsIgnoreCase(request.getMethod())) {
//					response.addHeader("Access-Control-Allow-Origin", origin);
//					response.setHeader("Allow", "GET, HEAD, POST, PUT, DELETE, TRACE, OPTIONS");
//
//					// allow the requested method
//					String method = request.getHeader("Access-Control-Request-Method");
//					response.addHeader("Access-Control-Allow-Methods", method);
//
//					// allow the requested headers
//					String headers = request.getHeader("Access-Control-Request-Headers");
//					response.addHeader("Access-Control-Allow-Headers", headers);
//
//					response.addHeader("Access-Control-Allow-Credentials", "true");
//					response.setContentType("application/json");
//					response.setCharacterEncoding("utf-8");
//					response.getWriter().flush();
//					return;
//				} // Handle UIDL post requests
//				else if ("post".equalsIgnoreCase(request.getMethod())) {
//					response.addHeader("Access-Control-Allow-Origin", origin);
//					response.addHeader("Access-Control-Allow-Credentials", "true");
//					super.service(request, response);
//					return;
//				}
//			}
//
//			// All the other requests nothing to do with CORS
//			super.service(request, response);
//
//		}
//
//		/**
//		 * Check that the page Origin header is allowed.
//		 */
//		private boolean isAllowedRequestOrigin(String origin) {
//			// TODO: Remember to limit the origins.
//			return origin.matches("http://avoin-test.csc.fi");
//		}
	}

	private static final long serialVersionUID = 1L;
	private ViewContent view;

	@Override
	protected void init(VaadinRequest request) {
		super.init(request);
		// Does not work in iframe since preferences cannot be set if portlet is embedded in liferay web content display
//		String localeStr =  portletPrefs.getValue(TupaConst.PORTLET_PREFERENCE_KEY_LANGUAGE, null); 
		String localeStr = request.getParameter("lang");
		if(localeStr == null) {
			VaadinTools.showWarning("Please select application language from the preferences of this portlet", null);
		} else {
			translator.setDefaultLocale(LanguageConst.getLocaleFromLocaleStr(localeStr));
			Page.getCurrent().setTitle(translator.localize("Application.Title"));
			try {
				view = new ViewContent(request, translator, ipc, Page.getCurrent().getUriFragment());
				setContent(view);
			} catch (Exception e) {
				setContent(VaadinTools.createErrorLayout(e, translator.getDefaultLocaleStr()));
			}
		}
	}

	@Override
	protected void refresh(VaadinRequest request) {
		super.refresh(request);
		init(request);
	}
}
