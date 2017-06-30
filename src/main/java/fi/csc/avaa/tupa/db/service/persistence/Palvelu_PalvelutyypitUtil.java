package fi.csc.avaa.tupa.db.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import fi.csc.avaa.tupa.db.model.Palvelu_Palvelutyypit;

import java.util.List;

/**
 * The persistence utility for the palvelu_ palvelutyypit service. This utility wraps {@link Palvelu_PalvelutyypitPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CSC
 * @see Palvelu_PalvelutyypitPersistence
 * @see Palvelu_PalvelutyypitPersistenceImpl
 * @generated
 */
public class Palvelu_PalvelutyypitUtil {
    private static Palvelu_PalvelutyypitPersistence _persistence;

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
    public static void clearCache(Palvelu_Palvelutyypit palvelu_Palvelutyypit) {
        getPersistence().clearCache(palvelu_Palvelutyypit);
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
    public static List<Palvelu_Palvelutyypit> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<Palvelu_Palvelutyypit> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<Palvelu_Palvelutyypit> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static Palvelu_Palvelutyypit update(
        Palvelu_Palvelutyypit palvelu_Palvelutyypit) throws SystemException {
        return getPersistence().update(palvelu_Palvelutyypit);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static Palvelu_Palvelutyypit update(
        Palvelu_Palvelutyypit palvelu_Palvelutyypit,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(palvelu_Palvelutyypit, serviceContext);
    }

    /**
    * Caches the palvelu_ palvelutyypit in the entity cache if it is enabled.
    *
    * @param palvelu_Palvelutyypit the palvelu_ palvelutyypit
    */
    public static void cacheResult(
        fi.csc.avaa.tupa.db.model.Palvelu_Palvelutyypit palvelu_Palvelutyypit) {
        getPersistence().cacheResult(palvelu_Palvelutyypit);
    }

    /**
    * Caches the palvelu_ palvelutyypits in the entity cache if it is enabled.
    *
    * @param palvelu_Palvelutyypits the palvelu_ palvelutyypits
    */
    public static void cacheResult(
        java.util.List<fi.csc.avaa.tupa.db.model.Palvelu_Palvelutyypit> palvelu_Palvelutyypits) {
        getPersistence().cacheResult(palvelu_Palvelutyypits);
    }

    /**
    * Creates a new palvelu_ palvelutyypit with the primary key. Does not add the palvelu_ palvelutyypit to the database.
    *
    * @param palvelu_PalvelutyypitPK the primary key for the new palvelu_ palvelutyypit
    * @return the new palvelu_ palvelutyypit
    */
    public static fi.csc.avaa.tupa.db.model.Palvelu_Palvelutyypit create(
        fi.csc.avaa.tupa.db.service.persistence.Palvelu_PalvelutyypitPK palvelu_PalvelutyypitPK) {
        return getPersistence().create(palvelu_PalvelutyypitPK);
    }

    /**
    * Removes the palvelu_ palvelutyypit with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param palvelu_PalvelutyypitPK the primary key of the palvelu_ palvelutyypit
    * @return the palvelu_ palvelutyypit that was removed
    * @throws fi.csc.avaa.tupa.db.NoSuchPalvelu_PalvelutyypitException if a palvelu_ palvelutyypit with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.tupa.db.model.Palvelu_Palvelutyypit remove(
        fi.csc.avaa.tupa.db.service.persistence.Palvelu_PalvelutyypitPK palvelu_PalvelutyypitPK)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.tupa.db.NoSuchPalvelu_PalvelutyypitException {
        return getPersistence().remove(palvelu_PalvelutyypitPK);
    }

    public static fi.csc.avaa.tupa.db.model.Palvelu_Palvelutyypit updateImpl(
        fi.csc.avaa.tupa.db.model.Palvelu_Palvelutyypit palvelu_Palvelutyypit)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(palvelu_Palvelutyypit);
    }

    /**
    * Returns the palvelu_ palvelutyypit with the primary key or throws a {@link fi.csc.avaa.tupa.db.NoSuchPalvelu_PalvelutyypitException} if it could not be found.
    *
    * @param palvelu_PalvelutyypitPK the primary key of the palvelu_ palvelutyypit
    * @return the palvelu_ palvelutyypit
    * @throws fi.csc.avaa.tupa.db.NoSuchPalvelu_PalvelutyypitException if a palvelu_ palvelutyypit with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.tupa.db.model.Palvelu_Palvelutyypit findByPrimaryKey(
        fi.csc.avaa.tupa.db.service.persistence.Palvelu_PalvelutyypitPK palvelu_PalvelutyypitPK)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.tupa.db.NoSuchPalvelu_PalvelutyypitException {
        return getPersistence().findByPrimaryKey(palvelu_PalvelutyypitPK);
    }

    /**
    * Returns the palvelu_ palvelutyypit with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param palvelu_PalvelutyypitPK the primary key of the palvelu_ palvelutyypit
    * @return the palvelu_ palvelutyypit, or <code>null</code> if a palvelu_ palvelutyypit with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.tupa.db.model.Palvelu_Palvelutyypit fetchByPrimaryKey(
        fi.csc.avaa.tupa.db.service.persistence.Palvelu_PalvelutyypitPK palvelu_PalvelutyypitPK)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(palvelu_PalvelutyypitPK);
    }

    /**
    * Returns all the palvelu_ palvelutyypits.
    *
    * @return the palvelu_ palvelutyypits
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<fi.csc.avaa.tupa.db.model.Palvelu_Palvelutyypit> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the palvelu_ palvelutyypits.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.Palvelu_PalvelutyypitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of palvelu_ palvelutyypits
    * @param end the upper bound of the range of palvelu_ palvelutyypits (not inclusive)
    * @return the range of palvelu_ palvelutyypits
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<fi.csc.avaa.tupa.db.model.Palvelu_Palvelutyypit> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the palvelu_ palvelutyypits.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.Palvelu_PalvelutyypitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of palvelu_ palvelutyypits
    * @param end the upper bound of the range of palvelu_ palvelutyypits (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of palvelu_ palvelutyypits
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<fi.csc.avaa.tupa.db.model.Palvelu_Palvelutyypit> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the palvelu_ palvelutyypits from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of palvelu_ palvelutyypits.
    *
    * @return the number of palvelu_ palvelutyypits
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static Palvelu_PalvelutyypitPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (Palvelu_PalvelutyypitPersistence) PortletBeanLocatorUtil.locate(fi.csc.avaa.tupa.db.service.ClpSerializer.getServletContextName(),
                    Palvelu_PalvelutyypitPersistence.class.getName());

            ReferenceRegistry.registerReference(Palvelu_PalvelutyypitUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(Palvelu_PalvelutyypitPersistence persistence) {
    }
}
