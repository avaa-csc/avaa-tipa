package fi.csc.avaa.tupa.db.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import fi.csc.avaa.tupa.db.model.Yhteystieto;

import java.util.List;

/**
 * The persistence utility for the yhteystieto service. This utility wraps {@link YhteystietoPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CSC
 * @see YhteystietoPersistence
 * @see YhteystietoPersistenceImpl
 * @generated
 */
public class YhteystietoUtil {
    private static YhteystietoPersistence _persistence;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
     */
    public static void clearCache() {
        getPersistence().clearCache();
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
     */
    public static void clearCache(Yhteystieto yhteystieto) {
        getPersistence().clearCache(yhteystieto);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
     */
    public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().countWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
     */
    public static List<Yhteystieto> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<Yhteystieto> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<Yhteystieto> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static Yhteystieto update(Yhteystieto yhteystieto)
        throws SystemException {
        return getPersistence().update(yhteystieto);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static Yhteystieto update(Yhteystieto yhteystieto,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(yhteystieto, serviceContext);
    }

    /**
    * Caches the yhteystieto in the entity cache if it is enabled.
    *
    * @param yhteystieto the yhteystieto
    */
    public static void cacheResult(
        fi.csc.avaa.tupa.db.model.Yhteystieto yhteystieto) {
        getPersistence().cacheResult(yhteystieto);
    }

    /**
    * Caches the yhteystietos in the entity cache if it is enabled.
    *
    * @param yhteystietos the yhteystietos
    */
    public static void cacheResult(
        java.util.List<fi.csc.avaa.tupa.db.model.Yhteystieto> yhteystietos) {
        getPersistence().cacheResult(yhteystietos);
    }

    /**
    * Creates a new yhteystieto with the primary key. Does not add the yhteystieto to the database.
    *
    * @param yhteystieto_id the primary key for the new yhteystieto
    * @return the new yhteystieto
    */
    public static fi.csc.avaa.tupa.db.model.Yhteystieto create(
        int yhteystieto_id) {
        return getPersistence().create(yhteystieto_id);
    }

    /**
    * Removes the yhteystieto with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param yhteystieto_id the primary key of the yhteystieto
    * @return the yhteystieto that was removed
    * @throws fi.csc.avaa.tupa.db.NoSuchYhteystietoException if a yhteystieto with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.tupa.db.model.Yhteystieto remove(
        int yhteystieto_id)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.tupa.db.NoSuchYhteystietoException {
        return getPersistence().remove(yhteystieto_id);
    }

    public static fi.csc.avaa.tupa.db.model.Yhteystieto updateImpl(
        fi.csc.avaa.tupa.db.model.Yhteystieto yhteystieto)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(yhteystieto);
    }

    /**
    * Returns the yhteystieto with the primary key or throws a {@link fi.csc.avaa.tupa.db.NoSuchYhteystietoException} if it could not be found.
    *
    * @param yhteystieto_id the primary key of the yhteystieto
    * @return the yhteystieto
    * @throws fi.csc.avaa.tupa.db.NoSuchYhteystietoException if a yhteystieto with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.tupa.db.model.Yhteystieto findByPrimaryKey(
        int yhteystieto_id)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.tupa.db.NoSuchYhteystietoException {
        return getPersistence().findByPrimaryKey(yhteystieto_id);
    }

    /**
    * Returns the yhteystieto with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param yhteystieto_id the primary key of the yhteystieto
    * @return the yhteystieto, or <code>null</code> if a yhteystieto with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.tupa.db.model.Yhteystieto fetchByPrimaryKey(
        int yhteystieto_id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(yhteystieto_id);
    }

    /**
    * Returns all the yhteystietos.
    *
    * @return the yhteystietos
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<fi.csc.avaa.tupa.db.model.Yhteystieto> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the yhteystietos.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.YhteystietoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of yhteystietos
    * @param end the upper bound of the range of yhteystietos (not inclusive)
    * @return the range of yhteystietos
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<fi.csc.avaa.tupa.db.model.Yhteystieto> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the yhteystietos.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.YhteystietoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of yhteystietos
    * @param end the upper bound of the range of yhteystietos (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of yhteystietos
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<fi.csc.avaa.tupa.db.model.Yhteystieto> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the yhteystietos from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of yhteystietos.
    *
    * @return the number of yhteystietos
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static YhteystietoPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (YhteystietoPersistence) PortletBeanLocatorUtil.locate(fi.csc.avaa.tupa.db.service.ClpSerializer.getServletContextName(),
                    YhteystietoPersistence.class.getName());

            ReferenceRegistry.registerReference(YhteystietoUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(YhteystietoPersistence persistence) {
    }
}
