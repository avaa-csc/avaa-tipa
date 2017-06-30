package fi.csc.avaa.tupa.db.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import fi.csc.avaa.tupa.db.model.TpServize;
import fi.csc.avaa.tupa.db.service.TpServizeLocalServiceUtil;

/**
 * @author CSC
 * @generated
 */
public abstract class TpServizeActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public TpServizeActionableDynamicQuery() throws SystemException {
        setBaseLocalService(TpServizeLocalServiceUtil.getService());
        setClass(TpServize.class);

        setClassLoader(fi.csc.avaa.tupa.db.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("id");
    }
}
