package fi.csc.avaa.tupa.db.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import fi.csc.avaa.tupa.db.model.Palvelu_Palvelutyypit;
import fi.csc.avaa.tupa.db.service.Palvelu_PalvelutyypitLocalServiceUtil;

/**
 * @author pj,jmlehtin
 * @generated
 */
public abstract class Palvelu_PalvelutyypitActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public Palvelu_PalvelutyypitActionableDynamicQuery()
        throws SystemException {
        setBaseLocalService(Palvelu_PalvelutyypitLocalServiceUtil.getService());
        setClass(Palvelu_Palvelutyypit.class);

        setClassLoader(fi.csc.avaa.tupa.db.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("primaryKey.palvelu_id");
    }
}
