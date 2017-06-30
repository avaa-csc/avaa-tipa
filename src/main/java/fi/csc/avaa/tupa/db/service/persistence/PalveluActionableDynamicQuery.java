package fi.csc.avaa.tupa.db.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import fi.csc.avaa.tupa.db.model.Palvelu;
import fi.csc.avaa.tupa.db.service.PalveluLocalServiceUtil;

/**
 * @author CSC
 * @generated
 */
public abstract class PalveluActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public PalveluActionableDynamicQuery() throws SystemException {
        setBaseLocalService(PalveluLocalServiceUtil.getService());
        setClass(Palvelu.class);

        setClassLoader(fi.csc.avaa.tupa.db.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("palvelu_id");
    }
}
