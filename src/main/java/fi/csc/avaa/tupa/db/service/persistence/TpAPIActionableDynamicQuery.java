package fi.csc.avaa.tupa.db.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import fi.csc.avaa.tupa.db.model.TpAPI;
import fi.csc.avaa.tupa.db.service.TpAPILocalServiceUtil;

/**
 * @author CSC
 * @generated
 */
public abstract class TpAPIActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public TpAPIActionableDynamicQuery() throws SystemException {
        setBaseLocalService(TpAPILocalServiceUtil.getService());
        setClass(TpAPI.class);

        setClassLoader(fi.csc.avaa.tupa.db.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("id");
    }
}
