package fi.csc.avaa.tupa.db.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import fi.csc.avaa.tupa.db.model.Infra;
import fi.csc.avaa.tupa.db.service.InfraLocalServiceUtil;

/**
 * @author pj,jmlehtin
 * @generated
 */
public abstract class InfraActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public InfraActionableDynamicQuery() throws SystemException {
        setBaseLocalService(InfraLocalServiceUtil.getService());
        setClass(Infra.class);

        setClassLoader(fi.csc.avaa.tupa.db.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("infra_id");
    }
}
