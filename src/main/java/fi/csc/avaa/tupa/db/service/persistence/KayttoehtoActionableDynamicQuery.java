package fi.csc.avaa.tupa.db.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import fi.csc.avaa.tupa.db.model.Kayttoehto;
import fi.csc.avaa.tupa.db.service.KayttoehtoLocalServiceUtil;

/**
 * @author CSC
 * @generated
 */
public abstract class KayttoehtoActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public KayttoehtoActionableDynamicQuery() throws SystemException {
        setBaseLocalService(KayttoehtoLocalServiceUtil.getService());
        setClass(Kayttoehto.class);

        setClassLoader(fi.csc.avaa.tupa.db.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("infra_id");
    }
}
