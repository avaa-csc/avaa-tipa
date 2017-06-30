package fi.csc.avaa.tupa.db.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import fi.csc.avaa.tupa.db.model.Organisaatio;

import java.util.List;

/**
 * The persistence utility for the organisaatio service. This utility wraps {@link OrganisaatioPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CSC
 * @see OrganisaatioPersistence
 * @see OrganisaatioPersistenceImpl
 * @generated
 */
public class OrganisaatioUtil {
    private static OrganisaatioPersistence _persistence;

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
    public static void clearCache(Organisaatio organisaatio) {
        getPersistence().clearCache(organisaatio);
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
    public static List<Organisaatio> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<Organisaatio> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<Organisaatio> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static Organisaatio update(Organisaatio organisaatio)
        throws SystemException {
        return getPersistence().update(organisaatio);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static Organisaatio update(Organisaatio organisaatio,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(organisaatio, serviceContext);
    }

    /**
    * Returns all the organisaatios where ISNI = &#63;.
    *
    * @param ISNI the i s n i
    * @return the matching organisaatios
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<fi.csc.avaa.tupa.db.model.Organisaatio> findByisni(
        java.lang.String ISNI)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByisni(ISNI);
    }

    /**
    * Returns a range of all the organisaatios where ISNI = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.OrganisaatioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param ISNI the i s n i
    * @param start the lower bound of the range of organisaatios
    * @param end the upper bound of the range of organisaatios (not inclusive)
    * @return the range of matching organisaatios
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<fi.csc.avaa.tupa.db.model.Organisaatio> findByisni(
        java.lang.String ISNI, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByisni(ISNI, start, end);
    }

    /**
    * Returns an ordered range of all the organisaatios where ISNI = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.OrganisaatioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param ISNI the i s n i
    * @param start the lower bound of the range of organisaatios
    * @param end the upper bound of the range of organisaatios (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching organisaatios
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<fi.csc.avaa.tupa.db.model.Organisaatio> findByisni(
        java.lang.String ISNI, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByisni(ISNI, start, end, orderByComparator);
    }

    /**
    * Returns the first organisaatio in the ordered set where ISNI = &#63;.
    *
    * @param ISNI the i s n i
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching organisaatio
    * @throws fi.csc.avaa.tupa.db.NoSuchOrganisaatioException if a matching organisaatio could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.tupa.db.model.Organisaatio findByisni_First(
        java.lang.String ISNI,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.tupa.db.NoSuchOrganisaatioException {
        return getPersistence().findByisni_First(ISNI, orderByComparator);
    }

    /**
    * Returns the first organisaatio in the ordered set where ISNI = &#63;.
    *
    * @param ISNI the i s n i
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching organisaatio, or <code>null</code> if a matching organisaatio could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.tupa.db.model.Organisaatio fetchByisni_First(
        java.lang.String ISNI,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByisni_First(ISNI, orderByComparator);
    }

    /**
    * Returns the last organisaatio in the ordered set where ISNI = &#63;.
    *
    * @param ISNI the i s n i
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching organisaatio
    * @throws fi.csc.avaa.tupa.db.NoSuchOrganisaatioException if a matching organisaatio could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.tupa.db.model.Organisaatio findByisni_Last(
        java.lang.String ISNI,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.tupa.db.NoSuchOrganisaatioException {
        return getPersistence().findByisni_Last(ISNI, orderByComparator);
    }

    /**
    * Returns the last organisaatio in the ordered set where ISNI = &#63;.
    *
    * @param ISNI the i s n i
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching organisaatio, or <code>null</code> if a matching organisaatio could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.tupa.db.model.Organisaatio fetchByisni_Last(
        java.lang.String ISNI,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByisni_Last(ISNI, orderByComparator);
    }

    /**
    * Returns the organisaatios before and after the current organisaatio in the ordered set where ISNI = &#63;.
    *
    * @param organisaatio_id the primary key of the current organisaatio
    * @param ISNI the i s n i
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next organisaatio
    * @throws fi.csc.avaa.tupa.db.NoSuchOrganisaatioException if a organisaatio with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.tupa.db.model.Organisaatio[] findByisni_PrevAndNext(
        int organisaatio_id, java.lang.String ISNI,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.tupa.db.NoSuchOrganisaatioException {
        return getPersistence()
                   .findByisni_PrevAndNext(organisaatio_id, ISNI,
            orderByComparator);
    }

    /**
    * Removes all the organisaatios where ISNI = &#63; from the database.
    *
    * @param ISNI the i s n i
    * @throws SystemException if a system exception occurred
    */
    public static void removeByisni(java.lang.String ISNI)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByisni(ISNI);
    }

    /**
    * Returns the number of organisaatios where ISNI = &#63;.
    *
    * @param ISNI the i s n i
    * @return the number of matching organisaatios
    * @throws SystemException if a system exception occurred
    */
    public static int countByisni(java.lang.String ISNI)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByisni(ISNI);
    }

    /**
    * Returns all the organisaatios where maa = &#63;.
    *
    * @param maa the maa
    * @return the matching organisaatios
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<fi.csc.avaa.tupa.db.model.Organisaatio> findBycountry(
        java.lang.String maa)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findBycountry(maa);
    }

    /**
    * Returns a range of all the organisaatios where maa = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.OrganisaatioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param maa the maa
    * @param start the lower bound of the range of organisaatios
    * @param end the upper bound of the range of organisaatios (not inclusive)
    * @return the range of matching organisaatios
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<fi.csc.avaa.tupa.db.model.Organisaatio> findBycountry(
        java.lang.String maa, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findBycountry(maa, start, end);
    }

    /**
    * Returns an ordered range of all the organisaatios where maa = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.OrganisaatioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param maa the maa
    * @param start the lower bound of the range of organisaatios
    * @param end the upper bound of the range of organisaatios (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching organisaatios
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<fi.csc.avaa.tupa.db.model.Organisaatio> findBycountry(
        java.lang.String maa, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findBycountry(maa, start, end, orderByComparator);
    }

    /**
    * Returns the first organisaatio in the ordered set where maa = &#63;.
    *
    * @param maa the maa
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching organisaatio
    * @throws fi.csc.avaa.tupa.db.NoSuchOrganisaatioException if a matching organisaatio could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.tupa.db.model.Organisaatio findBycountry_First(
        java.lang.String maa,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.tupa.db.NoSuchOrganisaatioException {
        return getPersistence().findBycountry_First(maa, orderByComparator);
    }

    /**
    * Returns the first organisaatio in the ordered set where maa = &#63;.
    *
    * @param maa the maa
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching organisaatio, or <code>null</code> if a matching organisaatio could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.tupa.db.model.Organisaatio fetchBycountry_First(
        java.lang.String maa,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchBycountry_First(maa, orderByComparator);
    }

    /**
    * Returns the last organisaatio in the ordered set where maa = &#63;.
    *
    * @param maa the maa
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching organisaatio
    * @throws fi.csc.avaa.tupa.db.NoSuchOrganisaatioException if a matching organisaatio could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.tupa.db.model.Organisaatio findBycountry_Last(
        java.lang.String maa,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.tupa.db.NoSuchOrganisaatioException {
        return getPersistence().findBycountry_Last(maa, orderByComparator);
    }

    /**
    * Returns the last organisaatio in the ordered set where maa = &#63;.
    *
    * @param maa the maa
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching organisaatio, or <code>null</code> if a matching organisaatio could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.tupa.db.model.Organisaatio fetchBycountry_Last(
        java.lang.String maa,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchBycountry_Last(maa, orderByComparator);
    }

    /**
    * Returns the organisaatios before and after the current organisaatio in the ordered set where maa = &#63;.
    *
    * @param organisaatio_id the primary key of the current organisaatio
    * @param maa the maa
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next organisaatio
    * @throws fi.csc.avaa.tupa.db.NoSuchOrganisaatioException if a organisaatio with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.tupa.db.model.Organisaatio[] findBycountry_PrevAndNext(
        int organisaatio_id, java.lang.String maa,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.tupa.db.NoSuchOrganisaatioException {
        return getPersistence()
                   .findBycountry_PrevAndNext(organisaatio_id, maa,
            orderByComparator);
    }

    /**
    * Removes all the organisaatios where maa = &#63; from the database.
    *
    * @param maa the maa
    * @throws SystemException if a system exception occurred
    */
    public static void removeBycountry(java.lang.String maa)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeBycountry(maa);
    }

    /**
    * Returns the number of organisaatios where maa = &#63;.
    *
    * @param maa the maa
    * @return the number of matching organisaatios
    * @throws SystemException if a system exception occurred
    */
    public static int countBycountry(java.lang.String maa)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countBycountry(maa);
    }

    /**
    * Caches the organisaatio in the entity cache if it is enabled.
    *
    * @param organisaatio the organisaatio
    */
    public static void cacheResult(
        fi.csc.avaa.tupa.db.model.Organisaatio organisaatio) {
        getPersistence().cacheResult(organisaatio);
    }

    /**
    * Caches the organisaatios in the entity cache if it is enabled.
    *
    * @param organisaatios the organisaatios
    */
    public static void cacheResult(
        java.util.List<fi.csc.avaa.tupa.db.model.Organisaatio> organisaatios) {
        getPersistence().cacheResult(organisaatios);
    }

    /**
    * Creates a new organisaatio with the primary key. Does not add the organisaatio to the database.
    *
    * @param organisaatio_id the primary key for the new organisaatio
    * @return the new organisaatio
    */
    public static fi.csc.avaa.tupa.db.model.Organisaatio create(
        int organisaatio_id) {
        return getPersistence().create(organisaatio_id);
    }

    /**
    * Removes the organisaatio with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param organisaatio_id the primary key of the organisaatio
    * @return the organisaatio that was removed
    * @throws fi.csc.avaa.tupa.db.NoSuchOrganisaatioException if a organisaatio with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.tupa.db.model.Organisaatio remove(
        int organisaatio_id)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.tupa.db.NoSuchOrganisaatioException {
        return getPersistence().remove(organisaatio_id);
    }

    public static fi.csc.avaa.tupa.db.model.Organisaatio updateImpl(
        fi.csc.avaa.tupa.db.model.Organisaatio organisaatio)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(organisaatio);
    }

    /**
    * Returns the organisaatio with the primary key or throws a {@link fi.csc.avaa.tupa.db.NoSuchOrganisaatioException} if it could not be found.
    *
    * @param organisaatio_id the primary key of the organisaatio
    * @return the organisaatio
    * @throws fi.csc.avaa.tupa.db.NoSuchOrganisaatioException if a organisaatio with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.tupa.db.model.Organisaatio findByPrimaryKey(
        int organisaatio_id)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.tupa.db.NoSuchOrganisaatioException {
        return getPersistence().findByPrimaryKey(organisaatio_id);
    }

    /**
    * Returns the organisaatio with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param organisaatio_id the primary key of the organisaatio
    * @return the organisaatio, or <code>null</code> if a organisaatio with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.tupa.db.model.Organisaatio fetchByPrimaryKey(
        int organisaatio_id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(organisaatio_id);
    }

    /**
    * Returns all the organisaatios.
    *
    * @return the organisaatios
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<fi.csc.avaa.tupa.db.model.Organisaatio> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the organisaatios.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.OrganisaatioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of organisaatios
    * @param end the upper bound of the range of organisaatios (not inclusive)
    * @return the range of organisaatios
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<fi.csc.avaa.tupa.db.model.Organisaatio> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the organisaatios.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.OrganisaatioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of organisaatios
    * @param end the upper bound of the range of organisaatios (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of organisaatios
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<fi.csc.avaa.tupa.db.model.Organisaatio> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the organisaatios from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of organisaatios.
    *
    * @return the number of organisaatios
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static OrganisaatioPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (OrganisaatioPersistence) PortletBeanLocatorUtil.locate(fi.csc.avaa.tupa.db.service.ClpSerializer.getServletContextName(),
                    OrganisaatioPersistence.class.getName());

            ReferenceRegistry.registerReference(OrganisaatioUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(OrganisaatioPersistence persistence) {
    }
}
