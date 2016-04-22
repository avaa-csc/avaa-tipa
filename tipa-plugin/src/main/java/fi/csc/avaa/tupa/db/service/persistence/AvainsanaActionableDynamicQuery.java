package fi.csc.avaa.tupa.db.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import fi.csc.avaa.tupa.db.model.Avainsana;
import fi.csc.avaa.tupa.db.service.AvainsanaLocalServiceUtil;

/**
 * @author pj,jmlehtin
 * @generated
 */
public abstract class AvainsanaActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public AvainsanaActionableDynamicQuery() throws SystemException {
        setBaseLocalService(AvainsanaLocalServiceUtil.getService());
        setClass(Avainsana.class);

        setClassLoader(fi.csc.avaa.tupa.db.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("avainsana_id");
    }
}
