package fi.csc.avaa.tupa.db.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import fi.csc.avaa.tupa.db.model.TpInfrastructure;
import fi.csc.avaa.tupa.db.service.TpInfrastructureLocalServiceUtil;

/**
 * @author CSC
 * @generated
 */
public abstract class TpInfrastructureActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public TpInfrastructureActionableDynamicQuery() throws SystemException {
        setBaseLocalService(TpInfrastructureLocalServiceUtil.getService());
        setClass(TpInfrastructure.class);

        setClassLoader(fi.csc.avaa.tupa.db.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("id");
    }
}
