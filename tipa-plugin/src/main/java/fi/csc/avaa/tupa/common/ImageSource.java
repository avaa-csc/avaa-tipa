package fi.csc.avaa.tupa.common;

import java.io.InputStream;
import java.net.URL;

import com.vaadin.server.StreamResource.StreamSource;

public class ImageSource implements StreamSource {
	private static final long serialVersionUID = 1L;

	private String urlStr;
	public ImageSource(String urlStr) {
		this.urlStr = urlStr;
	}
	@Override
	public InputStream getStream() {
		InputStream inputStream = null;
		try {
			URL url = new URL(urlStr);
			inputStream = url.openStream();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return inputStream;
	}
}
