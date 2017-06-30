package fi.csc.avaa.tupa.db.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import fi.csc.avaa.tupa.db.model.TpOrganisation;
import fi.csc.avaa.tupa.db.service.TpOrganisationLocalServiceUtil;

/**
 * @author CSC
 * @generated
 */
public abstract class TpOrganisationActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public TpOrganisationActionableDynamicQuery() throws SystemException {
        setBaseLocalService(TpOrganisationLocalServiceUtil.getService());
        setClass(TpOrganisation.class);

        setClassLoader(fi.csc.avaa.tupa.db.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("id");
    }
}
