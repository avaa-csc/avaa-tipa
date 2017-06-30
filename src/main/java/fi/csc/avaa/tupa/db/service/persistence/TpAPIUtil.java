package fi.csc.avaa.tupa.db.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import fi.csc.avaa.tupa.db.model.TpAPI;

import java.util.List;

/**
 * The persistence utility for the tp a p i service. This utility wraps {@link TpAPIPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CSC
 * @see TpAPIPersistence
 * @see TpAPIPersistenceImpl
 * @generated
 */
public class TpAPIUtil {
    private static TpAPIPersistence _persistence;

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
    public static void clearCache(TpAPI tpAPI) {
        getPersistence().clearCache(tpAPI);
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
    public static List<TpAPI> findWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<TpAPI> findWithDynamicQuery(DynamicQuery dynamicQuery,
        int start, int end) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<TpAPI> findWithDynamicQuery(DynamicQuery dynamicQuery,
        int start, int end, OrderByComparator orderByComparator)
        throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static TpAPI update(TpAPI tpAPI) throws SystemException {
        return getPersistence().update(tpAPI);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static TpAPI update(TpAPI tpAPI, ServiceContext serviceContext)
        throws SystemException {
        return getPersistence().update(tpAPI, serviceContext);
    }

    /**
    * Caches the tp a p i in the entity cache if it is enabled.
    *
    * @param tpAPI the tp a p i
    */
    public static void cacheResult(fi.csc.avaa.tupa.db.model.TpAPI tpAPI) {
        getPersistence().cacheResult(tpAPI);
    }

    /**
    * Caches the tp a p is in the entity cache if it is enabled.
    *
    * @param tpAPIs the tp a p is
    */
    public static void cacheResult(
        java.util.List<fi.csc.avaa.tupa.db.model.TpAPI> tpAPIs) {
        getPersistence().cacheResult(tpAPIs);
    }

    /**
    * Creates a new tp a p i with the primary key. Does not add the tp a p i to the database.
    *
    * @param methodsDescription the primary key for the new tp a p i
    * @return the new tp a p i
    */
    public static fi.csc.avaa.tupa.db.model.TpAPI create(
        java.lang.String methodsDescription) {
        return getPersistence().create(methodsDescription);
    }

    /**
    * Removes the tp a p i with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param methodsDescription the primary key of the tp a p i
    * @return the tp a p i that was removed
    * @throws fi.csc.avaa.tupa.db.NoSuchTpAPIException if a tp a p i with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.tupa.db.model.TpAPI remove(
        java.lang.String methodsDescription)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.tupa.db.NoSuchTpAPIException {
        return getPersistence().remove(methodsDescription);
    }

    public static fi.csc.avaa.tupa.db.model.TpAPI updateImpl(
        fi.csc.avaa.tupa.db.model.TpAPI tpAPI)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(tpAPI);
    }

    /**
    * Returns the tp a p i with the primary key or throws a {@link fi.csc.avaa.tupa.db.NoSuchTpAPIException} if it could not be found.
    *
    * @param methodsDescription the primary key of the tp a p i
    * @return the tp a p i
    * @throws fi.csc.avaa.tupa.db.NoSuchTpAPIException if a tp a p i with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.tupa.db.model.TpAPI findByPrimaryKey(
        java.lang.String methodsDescription)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.tupa.db.NoSuchTpAPIException {
        return getPersistence().findByPrimaryKey(methodsDescription);
    }

    /**
    * Returns the tp a p i with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param methodsDescription the primary key of the tp a p i
    * @return the tp a p i, or <code>null</code> if a tp a p i with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.tupa.db.model.TpAPI fetchByPrimaryKey(
        java.lang.String methodsDescription)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(methodsDescription);
    }

    /**
    * Returns all the tp a p is.
    *
    * @return the tp a p is
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<fi.csc.avaa.tupa.db.model.TpAPI> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the tp a p is.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.TpAPIModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of tp a p is
    * @param end the upper bound of the range of tp a p is (not inclusive)
    * @return the range of tp a p is
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<fi.csc.avaa.tupa.db.model.TpAPI> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the tp a p is.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.TpAPIModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of tp a p is
    * @param end the upper bound of the range of tp a p is (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of tp a p is
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<fi.csc.avaa.tupa.db.model.TpAPI> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the tp a p is from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of tp a p is.
    *
    * @return the number of tp a p is
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static TpAPIPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (TpAPIPersistence) PortletBeanLocatorUtil.locate(fi.csc.avaa.tupa.db.service.ClpSerializer.getServletContextName(),
                    TpAPIPersistence.class.getName());

            ReferenceRegistry.registerReference(TpAPIUtil.class, "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(TpAPIPersistence persistence) {
    }
}
