package fi.csc.avaa.tupa.db.service.messaging;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;

import fi.csc.avaa.tupa.db.service.AvainsanaLocalServiceUtil;
import fi.csc.avaa.tupa.db.service.ClpSerializer;
import fi.csc.avaa.tupa.db.service.InfraLocalServiceUtil;
import fi.csc.avaa.tupa.db.service.Infra_AvainsanatLocalServiceUtil;
import fi.csc.avaa.tupa.db.service.Infra_PalvelutLocalServiceUtil;
import fi.csc.avaa.tupa.db.service.Infra_VastuuorganisaatiotLocalServiceUtil;
import fi.csc.avaa.tupa.db.service.Infra_YhteystiedotLocalServiceUtil;
import fi.csc.avaa.tupa.db.service.KayttoehtoLocalServiceUtil;
import fi.csc.avaa.tupa.db.service.OrganisaatioLocalServiceUtil;
import fi.csc.avaa.tupa.db.service.PalveluLocalServiceUtil;
import fi.csc.avaa.tupa.db.service.Palvelu_PalvelutyypitLocalServiceUtil;
import fi.csc.avaa.tupa.db.service.PalvelutyyppiLocalServiceUtil;
import fi.csc.avaa.tupa.db.service.SeliteLocalServiceUtil;
import fi.csc.avaa.tupa.db.service.YhteystietoLocalServiceUtil;


public class ClpMessageListener extends BaseMessageListener {
    public static String getServletContextName() {
        return ClpSerializer.getServletContextName();
    }

    @Override
    protected void doReceive(Message message) throws Exception {
        String command = message.getString("command");
        String servletContextName = message.getString("servletContextName");

        if (command.equals("undeploy") &&
                servletContextName.equals(getServletContextName())) {
            AvainsanaLocalServiceUtil.clearService();

            InfraLocalServiceUtil.clearService();

            Infra_AvainsanatLocalServiceUtil.clearService();

            Infra_PalvelutLocalServiceUtil.clearService();

            Infra_VastuuorganisaatiotLocalServiceUtil.clearService();

            Infra_YhteystiedotLocalServiceUtil.clearService();

            KayttoehtoLocalServiceUtil.clearService();

            OrganisaatioLocalServiceUtil.clearService();

            PalveluLocalServiceUtil.clearService();

            Palvelu_PalvelutyypitLocalServiceUtil.clearService();

            PalvelutyyppiLocalServiceUtil.clearService();

            SeliteLocalServiceUtil.clearService();

            YhteystietoLocalServiceUtil.clearService();
        }
    }
}
