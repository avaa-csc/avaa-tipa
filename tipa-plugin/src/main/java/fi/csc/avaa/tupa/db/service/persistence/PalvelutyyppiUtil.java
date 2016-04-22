package fi.csc.avaa.tupa.db.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import fi.csc.avaa.tupa.db.model.Palvelutyyppi;

import java.util.List;

/**
 * The persistence utility for the palvelutyyppi service. This utility wraps {@link PalvelutyyppiPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author pj,jmlehtin
 * @see PalvelutyyppiPersistence
 * @see PalvelutyyppiPersistenceImpl
 * @generated
 */
public class PalvelutyyppiUtil {
    private static PalvelutyyppiPersistence _persistence;

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
    public static void clearCache(Palvelutyyppi palvelutyyppi) {
        getPersistence().clearCache(palvelutyyppi);
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
    public static List<Palvelutyyppi> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<Palvelutyyppi> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<Palvelutyyppi> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static Palvelutyyppi update(Palvelutyyppi palvelutyyppi)
        throws SystemException {
        return getPersistence().update(palvelutyyppi);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static Palvelutyyppi update(Palvelutyyppi palvelutyyppi,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(palvelutyyppi, serviceContext);
    }

    /**
    * Caches the palvelutyyppi in the entity cache if it is enabled.
    *
    * @param palvelutyyppi the palvelutyyppi
    */
    public static void cacheResult(
        fi.csc.avaa.tupa.db.model.Palvelutyyppi palvelutyyppi) {
        getPersistence().cacheResult(palvelutyyppi);
    }

    /**
    * Caches the palvelutyyppis in the entity cache if it is enabled.
    *
    * @param palvelutyyppis the palvelutyyppis
    */
    public static void cacheResult(
        java.util.List<fi.csc.avaa.tupa.db.model.Palvelutyyppi> palvelutyyppis) {
        getPersistence().cacheResult(palvelutyyppis);
    }

    /**
    * Creates a new palvelutyyppi with the primary key. Does not add the palvelutyyppi to the database.
    *
    * @param palvelutyyppi_id the primary key for the new palvelutyyppi
    * @return the new palvelutyyppi
    */
    public static fi.csc.avaa.tupa.db.model.Palvelutyyppi create(
        int palvelutyyppi_id) {
        return getPersistence().create(palvelutyyppi_id);
    }

    /**
    * Removes the palvelutyyppi with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param palvelutyyppi_id the primary key of the palvelutyyppi
    * @return the palvelutyyppi that was removed
    * @throws fi.csc.avaa.tupa.db.NoSuchPalvelutyyppiException if a palvelutyyppi with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.tupa.db.model.Palvelutyyppi remove(
        int palvelutyyppi_id)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.tupa.db.NoSuchPalvelutyyppiException {
        return getPersistence().remove(palvelutyyppi_id);
    }

    public static fi.csc.avaa.tupa.db.model.Palvelutyyppi updateImpl(
        fi.csc.avaa.tupa.db.model.Palvelutyyppi palvelutyyppi)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(palvelutyyppi);
    }

    /**
    * Returns the palvelutyyppi with the primary key or throws a {@link fi.csc.avaa.tupa.db.NoSuchPalvelutyyppiException} if it could not be found.
    *
    * @param palvelutyyppi_id the primary key of the palvelutyyppi
    * @return the palvelutyyppi
    * @throws fi.csc.avaa.tupa.db.NoSuchPalvelutyyppiException if a palvelutyyppi with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.tupa.db.model.Palvelutyyppi findByPrimaryKey(
        int palvelutyyppi_id)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.tupa.db.NoSuchPalvelutyyppiException {
        return getPersistence().findByPrimaryKey(palvelutyyppi_id);
    }

    /**
    * Returns the palvelutyyppi with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param palvelutyyppi_id the primary key of the palvelutyyppi
    * @return the palvelutyyppi, or <code>null</code> if a palvelutyyppi with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.tupa.db.model.Palvelutyyppi fetchByPrimaryKey(
        int palvelutyyppi_id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(palvelutyyppi_id);
    }

    /**
    * Returns all the palvelutyyppis.
    *
    * @return the palvelutyyppis
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<fi.csc.avaa.tupa.db.model.Palvelutyyppi> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the palvelutyyppis.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.PalvelutyyppiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of palvelutyyppis
    * @param end the upper bound of the range of palvelutyyppis (not inclusive)
    * @return the range of palvelutyyppis
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<fi.csc.avaa.tupa.db.model.Palvelutyyppi> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the palvelutyyppis.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.PalvelutyyppiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of palvelutyyppis
    * @param end the upper bound of the range of palvelutyyppis (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of palvelutyyppis
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<fi.csc.avaa.tupa.db.model.Palvelutyyppi> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the palvelutyyppis from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of palvelutyyppis.
    *
    * @return the number of palvelutyyppis
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static PalvelutyyppiPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (PalvelutyyppiPersistence) PortletBeanLocatorUtil.locate(fi.csc.avaa.tupa.db.service.ClpSerializer.getServletContextName(),
                    PalvelutyyppiPersistence.class.getName());

            ReferenceRegistry.registerReference(PalvelutyyppiUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(PalvelutyyppiPersistence persistence) {
    }
}
