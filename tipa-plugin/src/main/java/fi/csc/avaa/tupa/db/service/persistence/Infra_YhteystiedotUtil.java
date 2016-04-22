package fi.csc.avaa.tupa.db.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import fi.csc.avaa.tupa.db.model.Infra_Yhteystiedot;

import java.util.List;

/**
 * The persistence utility for the infra_ yhteystiedot service. This utility wraps {@link Infra_YhteystiedotPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author pj,jmlehtin
 * @see Infra_YhteystiedotPersistence
 * @see Infra_YhteystiedotPersistenceImpl
 * @generated
 */
public class Infra_YhteystiedotUtil {
    private static Infra_YhteystiedotPersistence _persistence;

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
    public static void clearCache(Infra_Yhteystiedot infra_Yhteystiedot) {
        getPersistence().clearCache(infra_Yhteystiedot);
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
    public static List<Infra_Yhteystiedot> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<Infra_Yhteystiedot> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<Infra_Yhteystiedot> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static Infra_Yhteystiedot update(
        Infra_Yhteystiedot infra_Yhteystiedot) throws SystemException {
        return getPersistence().update(infra_Yhteystiedot);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static Infra_Yhteystiedot update(
        Infra_Yhteystiedot infra_Yhteystiedot, ServiceContext serviceContext)
        throws SystemException {
        return getPersistence().update(infra_Yhteystiedot, serviceContext);
    }

    /**
    * Caches the infra_ yhteystiedot in the entity cache if it is enabled.
    *
    * @param infra_Yhteystiedot the infra_ yhteystiedot
    */
    public static void cacheResult(
        fi.csc.avaa.tupa.db.model.Infra_Yhteystiedot infra_Yhteystiedot) {
        getPersistence().cacheResult(infra_Yhteystiedot);
    }

    /**
    * Caches the infra_ yhteystiedots in the entity cache if it is enabled.
    *
    * @param infra_Yhteystiedots the infra_ yhteystiedots
    */
    public static void cacheResult(
        java.util.List<fi.csc.avaa.tupa.db.model.Infra_Yhteystiedot> infra_Yhteystiedots) {
        getPersistence().cacheResult(infra_Yhteystiedots);
    }

    /**
    * Creates a new infra_ yhteystiedot with the primary key. Does not add the infra_ yhteystiedot to the database.
    *
    * @param infra_YhteystiedotPK the primary key for the new infra_ yhteystiedot
    * @return the new infra_ yhteystiedot
    */
    public static fi.csc.avaa.tupa.db.model.Infra_Yhteystiedot create(
        fi.csc.avaa.tupa.db.service.persistence.Infra_YhteystiedotPK infra_YhteystiedotPK) {
        return getPersistence().create(infra_YhteystiedotPK);
    }

    /**
    * Removes the infra_ yhteystiedot with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param infra_YhteystiedotPK the primary key of the infra_ yhteystiedot
    * @return the infra_ yhteystiedot that was removed
    * @throws fi.csc.avaa.tupa.db.NoSuchInfra_YhteystiedotException if a infra_ yhteystiedot with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.tupa.db.model.Infra_Yhteystiedot remove(
        fi.csc.avaa.tupa.db.service.persistence.Infra_YhteystiedotPK infra_YhteystiedotPK)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.tupa.db.NoSuchInfra_YhteystiedotException {
        return getPersistence().remove(infra_YhteystiedotPK);
    }

    public static fi.csc.avaa.tupa.db.model.Infra_Yhteystiedot updateImpl(
        fi.csc.avaa.tupa.db.model.Infra_Yhteystiedot infra_Yhteystiedot)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(infra_Yhteystiedot);
    }

    /**
    * Returns the infra_ yhteystiedot with the primary key or throws a {@link fi.csc.avaa.tupa.db.NoSuchInfra_YhteystiedotException} if it could not be found.
    *
    * @param infra_YhteystiedotPK the primary key of the infra_ yhteystiedot
    * @return the infra_ yhteystiedot
    * @throws fi.csc.avaa.tupa.db.NoSuchInfra_YhteystiedotException if a infra_ yhteystiedot with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.tupa.db.model.Infra_Yhteystiedot findByPrimaryKey(
        fi.csc.avaa.tupa.db.service.persistence.Infra_YhteystiedotPK infra_YhteystiedotPK)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.tupa.db.NoSuchInfra_YhteystiedotException {
        return getPersistence().findByPrimaryKey(infra_YhteystiedotPK);
    }

    /**
    * Returns the infra_ yhteystiedot with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param infra_YhteystiedotPK the primary key of the infra_ yhteystiedot
    * @return the infra_ yhteystiedot, or <code>null</code> if a infra_ yhteystiedot with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.tupa.db.model.Infra_Yhteystiedot fetchByPrimaryKey(
        fi.csc.avaa.tupa.db.service.persistence.Infra_YhteystiedotPK infra_YhteystiedotPK)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(infra_YhteystiedotPK);
    }

    /**
    * Returns all the infra_ yhteystiedots.
    *
    * @return the infra_ yhteystiedots
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<fi.csc.avaa.tupa.db.model.Infra_Yhteystiedot> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the infra_ yhteystiedots.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.Infra_YhteystiedotModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of infra_ yhteystiedots
    * @param end the upper bound of the range of infra_ yhteystiedots (not inclusive)
    * @return the range of infra_ yhteystiedots
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<fi.csc.avaa.tupa.db.model.Infra_Yhteystiedot> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the infra_ yhteystiedots.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.Infra_YhteystiedotModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of infra_ yhteystiedots
    * @param end the upper bound of the range of infra_ yhteystiedots (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of infra_ yhteystiedots
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<fi.csc.avaa.tupa.db.model.Infra_Yhteystiedot> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the infra_ yhteystiedots from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of infra_ yhteystiedots.
    *
    * @return the number of infra_ yhteystiedots
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static Infra_YhteystiedotPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (Infra_YhteystiedotPersistence) PortletBeanLocatorUtil.locate(fi.csc.avaa.tupa.db.service.ClpSerializer.getServletContextName(),
                    Infra_YhteystiedotPersistence.class.getName());

            ReferenceRegistry.registerReference(Infra_YhteystiedotUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(Infra_YhteystiedotPersistence persistence) {
    }
}
