package fi.csc.avaa.tupa.db.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import fi.csc.avaa.tupa.db.model.Infra_Avainsanat;
import fi.csc.avaa.tupa.db.service.Infra_AvainsanatLocalServiceUtil;

/**
 * @author CSC
 * @generated
 */
public abstract class Infra_AvainsanatActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public Infra_AvainsanatActionableDynamicQuery() throws SystemException {
        setBaseLocalService(Infra_AvainsanatLocalServiceUtil.getService());
        setClass(Infra_Avainsanat.class);

        setClassLoader(fi.csc.avaa.tupa.db.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("primaryKey.infra_id");
    }
}
