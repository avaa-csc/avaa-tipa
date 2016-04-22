package fi.csc.avaa.tupa.db.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import fi.csc.avaa.tupa.db.model.Infra_Palvelut;
import fi.csc.avaa.tupa.db.service.Infra_PalvelutLocalServiceUtil;

/**
 * @author pj,jmlehtin
 * @generated
 */
public abstract class Infra_PalvelutActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public Infra_PalvelutActionableDynamicQuery() throws SystemException {
        setBaseLocalService(Infra_PalvelutLocalServiceUtil.getService());
        setClass(Infra_Palvelut.class);

        setClassLoader(fi.csc.avaa.tupa.db.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("primaryKey.infra_id");
    }
}
