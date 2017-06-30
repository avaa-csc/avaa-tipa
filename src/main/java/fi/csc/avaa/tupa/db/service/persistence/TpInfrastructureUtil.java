package fi.csc.avaa.tupa.db.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import fi.csc.avaa.tupa.db.model.TpInfrastructure;

import java.util.List;

/**
 * The persistence utility for the tp infrastructure service. This utility wraps {@link TpInfrastructurePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CSC
 * @see TpInfrastructurePersistence
 * @see TpInfrastructurePersistenceImpl
 * @generated
 */
public class TpInfrastructureUtil {
    private static TpInfrastructurePersistence _persistence;

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
    public static void clearCache(TpInfrastructure tpInfrastructure) {
        getPersistence().clearCache(tpInfrastructure);
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
    public static List<TpInfrastructure> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<TpInfrastructure> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<TpInfrastructure> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static TpInfrastructure update(TpInfrastructure tpInfrastructure)
        throws SystemException {
        return getPersistence().update(tpInfrastructure);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static TpInfrastructure update(TpInfrastructure tpInfrastructure,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(tpInfrastructure, serviceContext);
    }

    /**
    * Caches the tp infrastructure in the entity cache if it is enabled.
    *
    * @param tpInfrastructure the tp infrastructure
    */
    public static void cacheResult(
        fi.csc.avaa.tupa.db.model.TpInfrastructure tpInfrastructure) {
        getPersistence().cacheResult(tpInfrastructure);
    }

    /**
    * Caches the tp infrastructures in the entity cache if it is enabled.
    *
    * @param tpInfrastructures the tp infrastructures
    */
    public static void cacheResult(
        java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure> tpInfrastructures) {
        getPersistence().cacheResult(tpInfrastructures);
    }

    /**
    * Creates a new tp infrastructure with the primary key. Does not add the tp infrastructure to the database.
    *
    * @param id the primary key for the new tp infrastructure
    * @return the new tp infrastructure
    */
    public static fi.csc.avaa.tupa.db.model.TpInfrastructure create(int id) {
        return getPersistence().create(id);
    }

    /**
    * Removes the tp infrastructure with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the tp infrastructure
    * @return the tp infrastructure that was removed
    * @throws fi.csc.avaa.tupa.db.NoSuchTpInfrastructureException if a tp infrastructure with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.tupa.db.model.TpInfrastructure remove(int id)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.tupa.db.NoSuchTpInfrastructureException {
        return getPersistence().remove(id);
    }

    public static fi.csc.avaa.tupa.db.model.TpInfrastructure updateImpl(
        fi.csc.avaa.tupa.db.model.TpInfrastructure tpInfrastructure)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(tpInfrastructure);
    }

    /**
    * Returns the tp infrastructure with the primary key or throws a {@link fi.csc.avaa.tupa.db.NoSuchTpInfrastructureException} if it could not be found.
    *
    * @param id the primary key of the tp infrastructure
    * @return the tp infrastructure
    * @throws fi.csc.avaa.tupa.db.NoSuchTpInfrastructureException if a tp infrastructure with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.tupa.db.model.TpInfrastructure findByPrimaryKey(
        int id)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.tupa.db.NoSuchTpInfrastructureException {
        return getPersistence().findByPrimaryKey(id);
    }

    /**
    * Returns the tp infrastructure with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param id the primary key of the tp infrastructure
    * @return the tp infrastructure, or <code>null</code> if a tp infrastructure with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.tupa.db.model.TpInfrastructure fetchByPrimaryKey(
        int id) throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(id);
    }

    /**
    * Returns all the tp infrastructures.
    *
    * @return the tp infrastructures
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the tp infrastructures.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.TpInfrastructureModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of tp infrastructures
    * @param end the upper bound of the range of tp infrastructures (not inclusive)
    * @return the range of tp infrastructures
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the tp infrastructures.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.TpInfrastructureModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of tp infrastructures
    * @param end the upper bound of the range of tp infrastructures (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of tp infrastructures
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the tp infrastructures from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of tp infrastructures.
    *
    * @return the number of tp infrastructures
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static TpInfrastructurePersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (TpInfrastructurePersistence) PortletBeanLocatorUtil.locate(fi.csc.avaa.tupa.db.service.ClpSerializer.getServletContextName(),
                    TpInfrastructurePersistence.class.getName());

            ReferenceRegistry.registerReference(TpInfrastructureUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(TpInfrastructurePersistence persistence) {
    }
}
