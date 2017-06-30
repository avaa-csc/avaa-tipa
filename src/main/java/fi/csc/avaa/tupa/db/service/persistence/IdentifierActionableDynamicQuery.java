package fi.csc.avaa.tupa.db.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import fi.csc.avaa.tupa.db.model.Identifier;
import fi.csc.avaa.tupa.db.service.IdentifierLocalServiceUtil;

/**
 * @author CSC
 * @generated
 */
public abstract class IdentifierActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public IdentifierActionableDynamicQuery() throws SystemException {
        setBaseLocalService(IdentifierLocalServiceUtil.getService());
        setClass(Identifier.class);

        setClassLoader(fi.csc.avaa.tupa.db.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("identifier_type");
    }
}
