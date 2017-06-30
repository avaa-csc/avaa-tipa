package fi.csc.avaa.tupa.db.service.messaging;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;

import fi.csc.avaa.tupa.db.service.AvainsanaLocalServiceUtil;
import fi.csc.avaa.tupa.db.service.ClpSerializer;
import fi.csc.avaa.tupa.db.service.IdentifierLocalServiceUtil;
import fi.csc.avaa.tupa.db.service.InfraLocalServiceUtil;
import fi.csc.avaa.tupa.db.service.Infra_AvainsanatLocalServiceUtil;
import fi.csc.avaa.tupa.db.service.Infra_IdentifierLocalServiceUtil;
import fi.csc.avaa.tupa.db.service.Infra_PalvelutLocalServiceUtil;
import fi.csc.avaa.tupa.db.service.Infra_VastuuorganisaatiotLocalServiceUtil;
import fi.csc.avaa.tupa.db.service.Infra_YhteystiedotLocalServiceUtil;
import fi.csc.avaa.tupa.db.service.KayttoehtoLocalServiceUtil;
import fi.csc.avaa.tupa.db.service.OrganisaatioLocalServiceUtil;
import fi.csc.avaa.tupa.db.service.PalveluLocalServiceUtil;
import fi.csc.avaa.tupa.db.service.Palvelu_PalvelutyypitLocalServiceUtil;
import fi.csc.avaa.tupa.db.service.PalvelutyyppiLocalServiceUtil;
import fi.csc.avaa.tupa.db.service.SeliteLocalServiceUtil;
import fi.csc.avaa.tupa.db.service.TpAPILocalServiceUtil;
import fi.csc.avaa.tupa.db.service.TpAPIServiceUtil;
import fi.csc.avaa.tupa.db.service.TpContactLocalServiceUtil;
import fi.csc.avaa.tupa.db.service.TpContactServiceUtil;
import fi.csc.avaa.tupa.db.service.TpInfrastructureLocalServiceUtil;
import fi.csc.avaa.tupa.db.service.TpInfrastructureServiceUtil;
import fi.csc.avaa.tupa.db.service.TpOrganisationLocalServiceUtil;
import fi.csc.avaa.tupa.db.service.TpOrganisationServiceUtil;
import fi.csc.avaa.tupa.db.service.TpServizeLocalServiceUtil;
import fi.csc.avaa.tupa.db.service.TpServizeServiceUtil;
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

            IdentifierLocalServiceUtil.clearService();

            InfraLocalServiceUtil.clearService();

            Infra_AvainsanatLocalServiceUtil.clearService();

            Infra_IdentifierLocalServiceUtil.clearService();

            Infra_PalvelutLocalServiceUtil.clearService();

            Infra_VastuuorganisaatiotLocalServiceUtil.clearService();

            Infra_YhteystiedotLocalServiceUtil.clearService();

            KayttoehtoLocalServiceUtil.clearService();

            OrganisaatioLocalServiceUtil.clearService();

            PalveluLocalServiceUtil.clearService();

            Palvelu_PalvelutyypitLocalServiceUtil.clearService();

            PalvelutyyppiLocalServiceUtil.clearService();

            SeliteLocalServiceUtil.clearService();

            TpAPILocalServiceUtil.clearService();

            TpAPIServiceUtil.clearService();
            TpContactLocalServiceUtil.clearService();

            TpContactServiceUtil.clearService();
            TpInfrastructureLocalServiceUtil.clearService();

            TpInfrastructureServiceUtil.clearService();
            TpOrganisationLocalServiceUtil.clearService();

            TpOrganisationServiceUtil.clearService();
            TpServizeLocalServiceUtil.clearService();

            TpServizeServiceUtil.clearService();
            YhteystietoLocalServiceUtil.clearService();
        }
    }
}
