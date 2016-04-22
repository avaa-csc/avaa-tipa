package fi.csc.avaa.tupa.db.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import fi.csc.avaa.tupa.db.model.Infra;

import java.util.List;

/**
 * The persistence utility for the infra service. This utility wraps {@link InfraPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author pj,jmlehtin
 * @see InfraPersistence
 * @see InfraPersistenceImpl
 * @generated
 */
public class InfraUtil {
    private static InfraPersistence _persistence;

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
    public static void clearCache(Infra infra) {
        getPersistence().clearCache(infra);
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
    public static List<Infra> findWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<Infra> findWithDynamicQuery(DynamicQuery dynamicQuery,
        int start, int end) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<Infra> findWithDynamicQuery(DynamicQuery dynamicQuery,
        int start, int end, OrderByComparator orderByComparator)
        throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static Infra update(Infra infra) throws SystemException {
        return getPersistence().update(infra);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static Infra update(Infra infra, ServiceContext serviceContext)
        throws SystemException {
        return getPersistence().update(infra, serviceContext);
    }

    /**
    * Caches the infra in the entity cache if it is enabled.
    *
    * @param infra the infra
    */
    public static void cacheResult(fi.csc.avaa.tupa.db.model.Infra infra) {
        getPersistence().cacheResult(infra);
    }

    /**
    * Caches the infras in the entity cache if it is enabled.
    *
    * @param infras the infras
    */
    public static void cacheResult(
        java.util.List<fi.csc.avaa.tupa.db.model.Infra> infras) {
        getPersistence().cacheResult(infras);
    }

    /**
    * Creates a new infra with the primary key. Does not add the infra to the database.
    *
    * @param infra_id the primary key for the new infra
    * @return the new infra
    */
    public static fi.csc.avaa.tupa.db.model.Infra create(int infra_id) {
        return getPersistence().create(infra_id);
    }

    /**
    * Removes the infra with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param infra_id the primary key of the infra
    * @return the infra that was removed
    * @throws fi.csc.avaa.tupa.db.NoSuchInfraException if a infra with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.tupa.db.model.Infra remove(int infra_id)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.tupa.db.NoSuchInfraException {
        return getPersistence().remove(infra_id);
    }

    public static fi.csc.avaa.tupa.db.model.Infra updateImpl(
        fi.csc.avaa.tupa.db.model.Infra infra)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(infra);
    }

    /**
    * Returns the infra with the primary key or throws a {@link fi.csc.avaa.tupa.db.NoSuchInfraException} if it could not be found.
    *
    * @param infra_id the primary key of the infra
    * @return the infra
    * @throws fi.csc.avaa.tupa.db.NoSuchInfraException if a infra with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.tupa.db.model.Infra findByPrimaryKey(int infra_id)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.tupa.db.NoSuchInfraException {
        return getPersistence().findByPrimaryKey(infra_id);
    }

    /**
    * Returns the infra with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param infra_id the primary key of the infra
    * @return the infra, or <code>null</code> if a infra with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.tupa.db.model.Infra fetchByPrimaryKey(
        int infra_id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(infra_id);
    }

    /**
    * Returns all the infras.
    *
    * @return the infras
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<fi.csc.avaa.tupa.db.model.Infra> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the infras.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.InfraModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of infras
    * @param end the upper bound of the range of infras (not inclusive)
    * @return the range of infras
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<fi.csc.avaa.tupa.db.model.Infra> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the infras.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.InfraModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of infras
    * @param end the upper bound of the range of infras (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of infras
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<fi.csc.avaa.tupa.db.model.Infra> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the infras from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of infras.
    *
    * @return the number of infras
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static InfraPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (InfraPersistence) PortletBeanLocatorUtil.locate(fi.csc.avaa.tupa.db.service.ClpSerializer.getServletContextName(),
                    InfraPersistence.class.getName());

            ReferenceRegistry.registerReference(InfraUtil.class, "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(InfraPersistence persistence) {
    }
}
