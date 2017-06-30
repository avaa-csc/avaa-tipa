package fi.csc.avaa.tupa.db.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import fi.csc.avaa.tupa.db.model.TpOrganisation;

import java.util.List;

/**
 * The persistence utility for the tp organisation service. This utility wraps {@link TpOrganisationPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CSC
 * @see TpOrganisationPersistence
 * @see TpOrganisationPersistenceImpl
 * @generated
 */
public class TpOrganisationUtil {
    private static TpOrganisationPersistence _persistence;

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
    public static void clearCache(TpOrganisation tpOrganisation) {
        getPersistence().clearCache(tpOrganisation);
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
    public static List<TpOrganisation> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<TpOrganisation> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<TpOrganisation> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static TpOrganisation update(TpOrganisation tpOrganisation)
        throws SystemException {
        return getPersistence().update(tpOrganisation);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static TpOrganisation update(TpOrganisation tpOrganisation,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(tpOrganisation, serviceContext);
    }

    /**
    * Caches the tp organisation in the entity cache if it is enabled.
    *
    * @param tpOrganisation the tp organisation
    */
    public static void cacheResult(
        fi.csc.avaa.tupa.db.model.TpOrganisation tpOrganisation) {
        getPersistence().cacheResult(tpOrganisation);
    }

    /**
    * Caches the tp organisations in the entity cache if it is enabled.
    *
    * @param tpOrganisations the tp organisations
    */
    public static void cacheResult(
        java.util.List<fi.csc.avaa.tupa.db.model.TpOrganisation> tpOrganisations) {
        getPersistence().cacheResult(tpOrganisations);
    }

    /**
    * Creates a new tp organisation with the primary key. Does not add the tp organisation to the database.
    *
    * @param id the primary key for the new tp organisation
    * @return the new tp organisation
    */
    public static fi.csc.avaa.tupa.db.model.TpOrganisation create(int id) {
        return getPersistence().create(id);
    }

    /**
    * Removes the tp organisation with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the tp organisation
    * @return the tp organisation that was removed
    * @throws fi.csc.avaa.tupa.db.NoSuchTpOrganisationException if a tp organisation with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.tupa.db.model.TpOrganisation remove(int id)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.tupa.db.NoSuchTpOrganisationException {
        return getPersistence().remove(id);
    }

    public static fi.csc.avaa.tupa.db.model.TpOrganisation updateImpl(
        fi.csc.avaa.tupa.db.model.TpOrganisation tpOrganisation)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(tpOrganisation);
    }

    /**
    * Returns the tp organisation with the primary key or throws a {@link fi.csc.avaa.tupa.db.NoSuchTpOrganisationException} if it could not be found.
    *
    * @param id the primary key of the tp organisation
    * @return the tp organisation
    * @throws fi.csc.avaa.tupa.db.NoSuchTpOrganisationException if a tp organisation with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.tupa.db.model.TpOrganisation findByPrimaryKey(
        int id)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.tupa.db.NoSuchTpOrganisationException {
        return getPersistence().findByPrimaryKey(id);
    }

    /**
    * Returns the tp organisation with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param id the primary key of the tp organisation
    * @return the tp organisation, or <code>null</code> if a tp organisation with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.tupa.db.model.TpOrganisation fetchByPrimaryKey(
        int id) throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(id);
    }

    /**
    * Returns all the tp organisations.
    *
    * @return the tp organisations
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<fi.csc.avaa.tupa.db.model.TpOrganisation> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the tp organisations.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.TpOrganisationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of tp organisations
    * @param end the upper bound of the range of tp organisations (not inclusive)
    * @return the range of tp organisations
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<fi.csc.avaa.tupa.db.model.TpOrganisation> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the tp organisations.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.TpOrganisationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of tp organisations
    * @param end the upper bound of the range of tp organisations (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of tp organisations
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<fi.csc.avaa.tupa.db.model.TpOrganisation> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the tp organisations from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of tp organisations.
    *
    * @return the number of tp organisations
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static TpOrganisationPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (TpOrganisationPersistence) PortletBeanLocatorUtil.locate(fi.csc.avaa.tupa.db.service.ClpSerializer.getServletContextName(),
                    TpOrganisationPersistence.class.getName());

            ReferenceRegistry.registerReference(TpOrganisationUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(TpOrganisationPersistence persistence) {
    }
}
