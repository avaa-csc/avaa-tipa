package fi.csc.avaa.tupa.db.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import fi.csc.avaa.tupa.db.model.Infra_Identifier;
import fi.csc.avaa.tupa.db.service.Infra_IdentifierLocalServiceUtil;

/**
 * @author CSC
 * @generated
 */
public abstract class Infra_IdentifierActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public Infra_IdentifierActionableDynamicQuery() throws SystemException {
        setBaseLocalService(Infra_IdentifierLocalServiceUtil.getService());
        setClass(Infra_Identifier.class);

        setClassLoader(fi.csc.avaa.tupa.db.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("primaryKey.identifier_type");
    }
}
