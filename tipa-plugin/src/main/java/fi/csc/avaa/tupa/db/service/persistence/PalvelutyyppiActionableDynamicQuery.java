package fi.csc.avaa.tupa.db.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import fi.csc.avaa.tupa.db.model.Palvelutyyppi;
import fi.csc.avaa.tupa.db.service.PalvelutyyppiLocalServiceUtil;

/**
 * @author pj,jmlehtin
 * @generated
 */
public abstract class PalvelutyyppiActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public PalvelutyyppiActionableDynamicQuery() throws SystemException {
        setBaseLocalService(PalvelutyyppiLocalServiceUtil.getService());
        setClass(Palvelutyyppi.class);

        setClassLoader(fi.csc.avaa.tupa.db.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("palvelutyyppi_id");
    }
}
