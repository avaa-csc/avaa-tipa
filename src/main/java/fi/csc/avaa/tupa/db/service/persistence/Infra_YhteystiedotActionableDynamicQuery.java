package fi.csc.avaa.tupa.db.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import fi.csc.avaa.tupa.db.model.Infra_Yhteystiedot;
import fi.csc.avaa.tupa.db.service.Infra_YhteystiedotLocalServiceUtil;

/**
 * @author CSC
 * @generated
 */
public abstract class Infra_YhteystiedotActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public Infra_YhteystiedotActionableDynamicQuery() throws SystemException {
        setBaseLocalService(Infra_YhteystiedotLocalServiceUtil.getService());
        setClass(Infra_Yhteystiedot.class);

        setClassLoader(fi.csc.avaa.tupa.db.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("primaryKey.infra_id");
    }
}
