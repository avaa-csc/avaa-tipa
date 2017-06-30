package fi.csc.avaa.tupa.db.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import fi.csc.avaa.tupa.db.model.Organisaatio;
import fi.csc.avaa.tupa.db.service.OrganisaatioLocalServiceUtil;

/**
 * @author CSC
 * @generated
 */
public abstract class OrganisaatioActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public OrganisaatioActionableDynamicQuery() throws SystemException {
        setBaseLocalService(OrganisaatioLocalServiceUtil.getService());
        setClass(Organisaatio.class);

        setClassLoader(fi.csc.avaa.tupa.db.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("organisaatio_id");
    }
}
