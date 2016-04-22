package fi.csc.avaa.tupa.db.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import fi.csc.avaa.tupa.db.model.Palvelu;

import java.util.List;

/**
 * The persistence utility for the palvelu service. This utility wraps {@link PalveluPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author pj,jmlehtin
 * @see PalveluPersistence
 * @see PalveluPersistenceImpl
 * @generated
 */
public class PalveluUtil {
    private static PalveluPersistence _persistence;

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
    public static void clearCache(Palvelu palvelu) {
        getPersistence().clearCache(palvelu);
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
    public static List<Palvelu> findWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<Palvelu> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<Palvelu> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static Palvelu update(Palvelu palvelu) throws SystemException {
        return getPersistence().update(palvelu);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static Palvelu update(Palvelu palvelu, ServiceContext serviceContext)
        throws SystemException {
        return getPersistence().update(palvelu, serviceContext);
    }

    /**
    * Caches the palvelu in the entity cache if it is enabled.
    *
    * @param palvelu the palvelu
    */
    public static void cacheResult(fi.csc.avaa.tupa.db.model.Palvelu palvelu) {
        getPersistence().cacheResult(palvelu);
    }

    /**
    * Caches the palvelus in the entity cache if it is enabled.
    *
    * @param palvelus the palvelus
    */
    public static void cacheResult(
        java.util.List<fi.csc.avaa.tupa.db.model.Palvelu> palvelus) {
        getPersistence().cacheResult(palvelus);
    }

    /**
    * Creates a new palvelu with the primary key. Does not add the palvelu to the database.
    *
    * @param palvelu_id the primary key for the new palvelu
    * @return the new palvelu
    */
    public static fi.csc.avaa.tupa.db.model.Palvelu create(int palvelu_id) {
        return getPersistence().create(palvelu_id);
    }

    /**
    * Removes the palvelu with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param palvelu_id the primary key of the palvelu
    * @return the palvelu that was removed
    * @throws fi.csc.avaa.tupa.db.NoSuchPalveluException if a palvelu with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.tupa.db.model.Palvelu remove(int palvelu_id)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.tupa.db.NoSuchPalveluException {
        return getPersistence().remove(palvelu_id);
    }

    public static fi.csc.avaa.tupa.db.model.Palvelu updateImpl(
        fi.csc.avaa.tupa.db.model.Palvelu palvelu)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(palvelu);
    }

    /**
    * Returns the palvelu with the primary key or throws a {@link fi.csc.avaa.tupa.db.NoSuchPalveluException} if it could not be found.
    *
    * @param palvelu_id the primary key of the palvelu
    * @return the palvelu
    * @throws fi.csc.avaa.tupa.db.NoSuchPalveluException if a palvelu with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.tupa.db.model.Palvelu findByPrimaryKey(
        int palvelu_id)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.tupa.db.NoSuchPalveluException {
        return getPersistence().findByPrimaryKey(palvelu_id);
    }

    /**
    * Returns the palvelu with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param palvelu_id the primary key of the palvelu
    * @return the palvelu, or <code>null</code> if a palvelu with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.tupa.db.model.Palvelu fetchByPrimaryKey(
        int palvelu_id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(palvelu_id);
    }

    /**
    * Returns all the palvelus.
    *
    * @return the palvelus
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<fi.csc.avaa.tupa.db.model.Palvelu> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the palvelus.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.PalveluModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of palvelus
    * @param end the upper bound of the range of palvelus (not inclusive)
    * @return the range of palvelus
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<fi.csc.avaa.tupa.db.model.Palvelu> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the palvelus.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.PalveluModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of palvelus
    * @param end the upper bound of the range of palvelus (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of palvelus
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<fi.csc.avaa.tupa.db.model.Palvelu> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the palvelus from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of palvelus.
    *
    * @return the number of palvelus
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static PalveluPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (PalveluPersistence) PortletBeanLocatorUtil.locate(fi.csc.avaa.tupa.db.service.ClpSerializer.getServletContextName(),
                    PalveluPersistence.class.getName());

            ReferenceRegistry.registerReference(PalveluUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(PalveluPersistence persistence) {
    }
}
