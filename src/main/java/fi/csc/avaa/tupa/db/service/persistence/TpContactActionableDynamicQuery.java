package fi.csc.avaa.tupa.db.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import fi.csc.avaa.tupa.db.model.TpContact;
import fi.csc.avaa.tupa.db.service.TpContactLocalServiceUtil;

/**
 * @author CSC
 * @generated
 */
public abstract class TpContactActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public TpContactActionableDynamicQuery() throws SystemException {
        setBaseLocalService(TpContactLocalServiceUtil.getService());
        setClass(TpContact.class);

        setClassLoader(fi.csc.avaa.tupa.db.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("id");
    }
}
