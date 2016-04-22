package fi.csc.avaa.tupa.db.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import fi.csc.avaa.tupa.db.model.Infra_Avainsanat;

import java.util.List;

/**
 * The persistence utility for the infra_ avainsanat service. This utility wraps {@link Infra_AvainsanatPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author pj,jmlehtin
 * @see Infra_AvainsanatPersistence
 * @see Infra_AvainsanatPersistenceImpl
 * @generated
 */
public class Infra_AvainsanatUtil {
    private static Infra_AvainsanatPersistence _persistence;

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
    public static void clearCache(Infra_Avainsanat infra_Avainsanat) {
        getPersistence().clearCache(infra_Avainsanat);
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
    public static List<Infra_Avainsanat> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<Infra_Avainsanat> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<Infra_Avainsanat> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static Infra_Avainsanat update(Infra_Avainsanat infra_Avainsanat)
        throws SystemException {
        return getPersistence().update(infra_Avainsanat);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static Infra_Avainsanat update(Infra_Avainsanat infra_Avainsanat,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(infra_Avainsanat, serviceContext);
    }

    /**
    * Caches the infra_ avainsanat in the entity cache if it is enabled.
    *
    * @param infra_Avainsanat the infra_ avainsanat
    */
    public static void cacheResult(
        fi.csc.avaa.tupa.db.model.Infra_Avainsanat infra_Avainsanat) {
        getPersistence().cacheResult(infra_Avainsanat);
    }

    /**
    * Caches the infra_ avainsanats in the entity cache if it is enabled.
    *
    * @param infra_Avainsanats the infra_ avainsanats
    */
    public static void cacheResult(
        java.util.List<fi.csc.avaa.tupa.db.model.Infra_Avainsanat> infra_Avainsanats) {
        getPersistence().cacheResult(infra_Avainsanats);
    }

    /**
    * Creates a new infra_ avainsanat with the primary key. Does not add the infra_ avainsanat to the database.
    *
    * @param infra_AvainsanatPK the primary key for the new infra_ avainsanat
    * @return the new infra_ avainsanat
    */
    public static fi.csc.avaa.tupa.db.model.Infra_Avainsanat create(
        fi.csc.avaa.tupa.db.service.persistence.Infra_AvainsanatPK infra_AvainsanatPK) {
        return getPersistence().create(infra_AvainsanatPK);
    }

    /**
    * Removes the infra_ avainsanat with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param infra_AvainsanatPK the primary key of the infra_ avainsanat
    * @return the infra_ avainsanat that was removed
    * @throws fi.csc.avaa.tupa.db.NoSuchInfra_AvainsanatException if a infra_ avainsanat with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.tupa.db.model.Infra_Avainsanat remove(
        fi.csc.avaa.tupa.db.service.persistence.Infra_AvainsanatPK infra_AvainsanatPK)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.tupa.db.NoSuchInfra_AvainsanatException {
        return getPersistence().remove(infra_AvainsanatPK);
    }

    public static fi.csc.avaa.tupa.db.model.Infra_Avainsanat updateImpl(
        fi.csc.avaa.tupa.db.model.Infra_Avainsanat infra_Avainsanat)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(infra_Avainsanat);
    }

    /**
    * Returns the infra_ avainsanat with the primary key or throws a {@link fi.csc.avaa.tupa.db.NoSuchInfra_AvainsanatException} if it could not be found.
    *
    * @param infra_AvainsanatPK the primary key of the infra_ avainsanat
    * @return the infra_ avainsanat
    * @throws fi.csc.avaa.tupa.db.NoSuchInfra_AvainsanatException if a infra_ avainsanat with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.tupa.db.model.Infra_Avainsanat findByPrimaryKey(
        fi.csc.avaa.tupa.db.service.persistence.Infra_AvainsanatPK infra_AvainsanatPK)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.tupa.db.NoSuchInfra_AvainsanatException {
        return getPersistence().findByPrimaryKey(infra_AvainsanatPK);
    }

    /**
    * Returns the infra_ avainsanat with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param infra_AvainsanatPK the primary key of the infra_ avainsanat
    * @return the infra_ avainsanat, or <code>null</code> if a infra_ avainsanat with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.tupa.db.model.Infra_Avainsanat fetchByPrimaryKey(
        fi.csc.avaa.tupa.db.service.persistence.Infra_AvainsanatPK infra_AvainsanatPK)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(infra_AvainsanatPK);
    }

    /**
    * Returns all the infra_ avainsanats.
    *
    * @return the infra_ avainsanats
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<fi.csc.avaa.tupa.db.model.Infra_Avainsanat> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the infra_ avainsanats.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.Infra_AvainsanatModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of infra_ avainsanats
    * @param end the upper bound of the range of infra_ avainsanats (not inclusive)
    * @return the range of infra_ avainsanats
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<fi.csc.avaa.tupa.db.model.Infra_Avainsanat> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the infra_ avainsanats.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.Infra_AvainsanatModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of infra_ avainsanats
    * @param end the upper bound of the range of infra_ avainsanats (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of infra_ avainsanats
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<fi.csc.avaa.tupa.db.model.Infra_Avainsanat> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the infra_ avainsanats from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of infra_ avainsanats.
    *
    * @return the number of infra_ avainsanats
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static Infra_AvainsanatPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (Infra_AvainsanatPersistence) PortletBeanLocatorUtil.locate(fi.csc.avaa.tupa.db.service.ClpSerializer.getServletContextName(),
                    Infra_AvainsanatPersistence.class.getName());

            ReferenceRegistry.registerReference(Infra_AvainsanatUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(Infra_AvainsanatPersistence persistence) {
    }
}
