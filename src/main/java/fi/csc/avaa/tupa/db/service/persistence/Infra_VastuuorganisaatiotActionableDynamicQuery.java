package fi.csc.avaa.tupa.db.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import fi.csc.avaa.tupa.db.model.Infra_Vastuuorganisaatiot;
import fi.csc.avaa.tupa.db.service.Infra_VastuuorganisaatiotLocalServiceUtil;

/**
 * @author CSC
 * @generated
 */
public abstract class Infra_VastuuorganisaatiotActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public Infra_VastuuorganisaatiotActionableDynamicQuery()
        throws SystemException {
        setBaseLocalService(Infra_VastuuorganisaatiotLocalServiceUtil.getService());
        setClass(Infra_Vastuuorganisaatiot.class);

        setClassLoader(fi.csc.avaa.tupa.db.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("primaryKey.infra_id");
    }
}
