package fi.csc.avaa.tupa.db.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import fi.csc.avaa.tupa.db.model.Yhteystieto;
import fi.csc.avaa.tupa.db.service.YhteystietoLocalServiceUtil;

/**
 * @author pj,jmlehtin
 * @generated
 */
public abstract class YhteystietoActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public YhteystietoActionableDynamicQuery() throws SystemException {
        setBaseLocalService(YhteystietoLocalServiceUtil.getService());
        setClass(Yhteystieto.class);

        setClassLoader(fi.csc.avaa.tupa.db.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("yhteystieto_id");
    }
}
