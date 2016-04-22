package fi.csc.avaa.tupa.db.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import fi.csc.avaa.tupa.db.model.Selite;
import fi.csc.avaa.tupa.db.service.SeliteLocalServiceUtil;

/**
 * @author pj,jmlehtin
 * @generated
 */
public abstract class SeliteActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public SeliteActionableDynamicQuery() throws SystemException {
        setBaseLocalService(SeliteLocalServiceUtil.getService());
        setClass(Selite.class);

        setClassLoader(fi.csc.avaa.tupa.db.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("selite_id");
    }
}
