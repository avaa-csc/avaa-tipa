package fi.csc.avaa.tupa.db.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import fi.csc.avaa.tupa.db.model.Kayttoehto;

import java.util.List;

/**
 * The persistence utility for the kayttoehto service. This utility wraps {@link KayttoehtoPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CSC
 * @see KayttoehtoPersistence
 * @see KayttoehtoPersistenceImpl
 * @generated
 */
public class KayttoehtoUtil {
    private static KayttoehtoPersistence _persistence;

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
    public static void clearCache(Kayttoehto kayttoehto) {
        getPersistence().clearCache(kayttoehto);
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
    public static List<Kayttoehto> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<Kayttoehto> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<Kayttoehto> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static Kayttoehto update(Kayttoehto kayttoehto)
        throws SystemException {
        return getPersistence().update(kayttoehto);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static Kayttoehto update(Kayttoehto kayttoehto,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(kayttoehto, serviceContext);
    }

    /**
    * Caches the kayttoehto in the entity cache if it is enabled.
    *
    * @param kayttoehto the kayttoehto
    */
    public static void cacheResult(
        fi.csc.avaa.tupa.db.model.Kayttoehto kayttoehto) {
        getPersistence().cacheResult(kayttoehto);
    }

    /**
    * Caches the kayttoehtos in the entity cache if it is enabled.
    *
    * @param kayttoehtos the kayttoehtos
    */
    public static void cacheResult(
        java.util.List<fi.csc.avaa.tupa.db.model.Kayttoehto> kayttoehtos) {
        getPersistence().cacheResult(kayttoehtos);
    }

    /**
    * Creates a new kayttoehto with the primary key. Does not add the kayttoehto to the database.
    *
    * @param infra_id the primary key for the new kayttoehto
    * @return the new kayttoehto
    */
    public static fi.csc.avaa.tupa.db.model.Kayttoehto create(int infra_id) {
        return getPersistence().create(infra_id);
    }

    /**
    * Removes the kayttoehto with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param infra_id the primary key of the kayttoehto
    * @return the kayttoehto that was removed
    * @throws fi.csc.avaa.tupa.db.NoSuchKayttoehtoException if a kayttoehto with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.tupa.db.model.Kayttoehto remove(int infra_id)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.tupa.db.NoSuchKayttoehtoException {
        return getPersistence().remove(infra_id);
    }

    public static fi.csc.avaa.tupa.db.model.Kayttoehto updateImpl(
        fi.csc.avaa.tupa.db.model.Kayttoehto kayttoehto)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(kayttoehto);
    }

    /**
    * Returns the kayttoehto with the primary key or throws a {@link fi.csc.avaa.tupa.db.NoSuchKayttoehtoException} if it could not be found.
    *
    * @param infra_id the primary key of the kayttoehto
    * @return the kayttoehto
    * @throws fi.csc.avaa.tupa.db.NoSuchKayttoehtoException if a kayttoehto with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.tupa.db.model.Kayttoehto findByPrimaryKey(
        int infra_id)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.tupa.db.NoSuchKayttoehtoException {
        return getPersistence().findByPrimaryKey(infra_id);
    }

    /**
    * Returns the kayttoehto with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param infra_id the primary key of the kayttoehto
    * @return the kayttoehto, or <code>null</code> if a kayttoehto with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.tupa.db.model.Kayttoehto fetchByPrimaryKey(
        int infra_id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(infra_id);
    }

    /**
    * Returns all the kayttoehtos.
    *
    * @return the kayttoehtos
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<fi.csc.avaa.tupa.db.model.Kayttoehto> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the kayttoehtos.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.KayttoehtoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of kayttoehtos
    * @param end the upper bound of the range of kayttoehtos (not inclusive)
    * @return the range of kayttoehtos
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<fi.csc.avaa.tupa.db.model.Kayttoehto> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the kayttoehtos.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.KayttoehtoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of kayttoehtos
    * @param end the upper bound of the range of kayttoehtos (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of kayttoehtos
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<fi.csc.avaa.tupa.db.model.Kayttoehto> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the kayttoehtos from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of kayttoehtos.
    *
    * @return the number of kayttoehtos
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static KayttoehtoPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (KayttoehtoPersistence) PortletBeanLocatorUtil.locate(fi.csc.avaa.tupa.db.service.ClpSerializer.getServletContextName(),
                    KayttoehtoPersistence.class.getName());

            ReferenceRegistry.registerReference(KayttoehtoUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(KayttoehtoPersistence persistence) {
    }
}
