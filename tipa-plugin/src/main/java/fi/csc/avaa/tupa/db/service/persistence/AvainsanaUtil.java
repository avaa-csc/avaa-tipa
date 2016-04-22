package fi.csc.avaa.tupa.db.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import fi.csc.avaa.tupa.db.model.Avainsana;

import java.util.List;

/**
 * The persistence utility for the avainsana service. This utility wraps {@link AvainsanaPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author pj,jmlehtin
 * @see AvainsanaPersistence
 * @see AvainsanaPersistenceImpl
 * @generated
 */
public class AvainsanaUtil {
    private static AvainsanaPersistence _persistence;

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
    public static void clearCache(Avainsana avainsana) {
        getPersistence().clearCache(avainsana);
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
    public static List<Avainsana> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<Avainsana> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<Avainsana> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static Avainsana update(Avainsana avainsana)
        throws SystemException {
        return getPersistence().update(avainsana);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static Avainsana update(Avainsana avainsana,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(avainsana, serviceContext);
    }

    /**
    * Caches the avainsana in the entity cache if it is enabled.
    *
    * @param avainsana the avainsana
    */
    public static void cacheResult(
        fi.csc.avaa.tupa.db.model.Avainsana avainsana) {
        getPersistence().cacheResult(avainsana);
    }

    /**
    * Caches the avainsanas in the entity cache if it is enabled.
    *
    * @param avainsanas the avainsanas
    */
    public static void cacheResult(
        java.util.List<fi.csc.avaa.tupa.db.model.Avainsana> avainsanas) {
        getPersistence().cacheResult(avainsanas);
    }

    /**
    * Creates a new avainsana with the primary key. Does not add the avainsana to the database.
    *
    * @param avainsana_id the primary key for the new avainsana
    * @return the new avainsana
    */
    public static fi.csc.avaa.tupa.db.model.Avainsana create(int avainsana_id) {
        return getPersistence().create(avainsana_id);
    }

    /**
    * Removes the avainsana with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param avainsana_id the primary key of the avainsana
    * @return the avainsana that was removed
    * @throws fi.csc.avaa.tupa.db.NoSuchAvainsanaException if a avainsana with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.tupa.db.model.Avainsana remove(int avainsana_id)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.tupa.db.NoSuchAvainsanaException {
        return getPersistence().remove(avainsana_id);
    }

    public static fi.csc.avaa.tupa.db.model.Avainsana updateImpl(
        fi.csc.avaa.tupa.db.model.Avainsana avainsana)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(avainsana);
    }

    /**
    * Returns the avainsana with the primary key or throws a {@link fi.csc.avaa.tupa.db.NoSuchAvainsanaException} if it could not be found.
    *
    * @param avainsana_id the primary key of the avainsana
    * @return the avainsana
    * @throws fi.csc.avaa.tupa.db.NoSuchAvainsanaException if a avainsana with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.tupa.db.model.Avainsana findByPrimaryKey(
        int avainsana_id)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.tupa.db.NoSuchAvainsanaException {
        return getPersistence().findByPrimaryKey(avainsana_id);
    }

    /**
    * Returns the avainsana with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param avainsana_id the primary key of the avainsana
    * @return the avainsana, or <code>null</code> if a avainsana with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.tupa.db.model.Avainsana fetchByPrimaryKey(
        int avainsana_id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(avainsana_id);
    }

    /**
    * Returns all the avainsanas.
    *
    * @return the avainsanas
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<fi.csc.avaa.tupa.db.model.Avainsana> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the avainsanas.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.AvainsanaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of avainsanas
    * @param end the upper bound of the range of avainsanas (not inclusive)
    * @return the range of avainsanas
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<fi.csc.avaa.tupa.db.model.Avainsana> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the avainsanas.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.AvainsanaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of avainsanas
    * @param end the upper bound of the range of avainsanas (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of avainsanas
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<fi.csc.avaa.tupa.db.model.Avainsana> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the avainsanas from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of avainsanas.
    *
    * @return the number of avainsanas
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static AvainsanaPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (AvainsanaPersistence) PortletBeanLocatorUtil.locate(fi.csc.avaa.tupa.db.service.ClpSerializer.getServletContextName(),
                    AvainsanaPersistence.class.getName());

            ReferenceRegistry.registerReference(AvainsanaUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(AvainsanaPersistence persistence) {
    }
}
