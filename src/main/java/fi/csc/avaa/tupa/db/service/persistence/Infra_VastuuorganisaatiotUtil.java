package fi.csc.avaa.tupa.db.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import fi.csc.avaa.tupa.db.model.Infra_Vastuuorganisaatiot;

import java.util.List;

/**
 * The persistence utility for the infra_ vastuuorganisaatiot service. This utility wraps {@link Infra_VastuuorganisaatiotPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CSC
 * @see Infra_VastuuorganisaatiotPersistence
 * @see Infra_VastuuorganisaatiotPersistenceImpl
 * @generated
 */
public class Infra_VastuuorganisaatiotUtil {
    private static Infra_VastuuorganisaatiotPersistence _persistence;

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
    public static void clearCache(
        Infra_Vastuuorganisaatiot infra_Vastuuorganisaatiot) {
        getPersistence().clearCache(infra_Vastuuorganisaatiot);
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
    public static List<Infra_Vastuuorganisaatiot> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<Infra_Vastuuorganisaatiot> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<Infra_Vastuuorganisaatiot> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static Infra_Vastuuorganisaatiot update(
        Infra_Vastuuorganisaatiot infra_Vastuuorganisaatiot)
        throws SystemException {
        return getPersistence().update(infra_Vastuuorganisaatiot);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static Infra_Vastuuorganisaatiot update(
        Infra_Vastuuorganisaatiot infra_Vastuuorganisaatiot,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(infra_Vastuuorganisaatiot, serviceContext);
    }

    /**
    * Returns all the infra_ vastuuorganisaatiots where infra_id = &#63;.
    *
    * @param infra_id the infra_id
    * @return the matching infra_ vastuuorganisaatiots
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<fi.csc.avaa.tupa.db.model.Infra_Vastuuorganisaatiot> findByinfraId(
        int infra_id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByinfraId(infra_id);
    }

    /**
    * Returns a range of all the infra_ vastuuorganisaatiots where infra_id = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.Infra_VastuuorganisaatiotModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param infra_id the infra_id
    * @param start the lower bound of the range of infra_ vastuuorganisaatiots
    * @param end the upper bound of the range of infra_ vastuuorganisaatiots (not inclusive)
    * @return the range of matching infra_ vastuuorganisaatiots
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<fi.csc.avaa.tupa.db.model.Infra_Vastuuorganisaatiot> findByinfraId(
        int infra_id, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByinfraId(infra_id, start, end);
    }

    /**
    * Returns an ordered range of all the infra_ vastuuorganisaatiots where infra_id = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.Infra_VastuuorganisaatiotModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param infra_id the infra_id
    * @param start the lower bound of the range of infra_ vastuuorganisaatiots
    * @param end the upper bound of the range of infra_ vastuuorganisaatiots (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching infra_ vastuuorganisaatiots
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<fi.csc.avaa.tupa.db.model.Infra_Vastuuorganisaatiot> findByinfraId(
        int infra_id, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByinfraId(infra_id, start, end, orderByComparator);
    }

    /**
    * Returns the first infra_ vastuuorganisaatiot in the ordered set where infra_id = &#63;.
    *
    * @param infra_id the infra_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching infra_ vastuuorganisaatiot
    * @throws fi.csc.avaa.tupa.db.NoSuchInfra_VastuuorganisaatiotException if a matching infra_ vastuuorganisaatiot could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.tupa.db.model.Infra_Vastuuorganisaatiot findByinfraId_First(
        int infra_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.tupa.db.NoSuchInfra_VastuuorganisaatiotException {
        return getPersistence().findByinfraId_First(infra_id, orderByComparator);
    }

    /**
    * Returns the first infra_ vastuuorganisaatiot in the ordered set where infra_id = &#63;.
    *
    * @param infra_id the infra_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching infra_ vastuuorganisaatiot, or <code>null</code> if a matching infra_ vastuuorganisaatiot could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.tupa.db.model.Infra_Vastuuorganisaatiot fetchByinfraId_First(
        int infra_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByinfraId_First(infra_id, orderByComparator);
    }

    /**
    * Returns the last infra_ vastuuorganisaatiot in the ordered set where infra_id = &#63;.
    *
    * @param infra_id the infra_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching infra_ vastuuorganisaatiot
    * @throws fi.csc.avaa.tupa.db.NoSuchInfra_VastuuorganisaatiotException if a matching infra_ vastuuorganisaatiot could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.tupa.db.model.Infra_Vastuuorganisaatiot findByinfraId_Last(
        int infra_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.tupa.db.NoSuchInfra_VastuuorganisaatiotException {
        return getPersistence().findByinfraId_Last(infra_id, orderByComparator);
    }

    /**
    * Returns the last infra_ vastuuorganisaatiot in the ordered set where infra_id = &#63;.
    *
    * @param infra_id the infra_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching infra_ vastuuorganisaatiot, or <code>null</code> if a matching infra_ vastuuorganisaatiot could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.tupa.db.model.Infra_Vastuuorganisaatiot fetchByinfraId_Last(
        int infra_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByinfraId_Last(infra_id, orderByComparator);
    }

    /**
    * Returns the infra_ vastuuorganisaatiots before and after the current infra_ vastuuorganisaatiot in the ordered set where infra_id = &#63;.
    *
    * @param infra_VastuuorganisaatiotPK the primary key of the current infra_ vastuuorganisaatiot
    * @param infra_id the infra_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next infra_ vastuuorganisaatiot
    * @throws fi.csc.avaa.tupa.db.NoSuchInfra_VastuuorganisaatiotException if a infra_ vastuuorganisaatiot with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.tupa.db.model.Infra_Vastuuorganisaatiot[] findByinfraId_PrevAndNext(
        fi.csc.avaa.tupa.db.service.persistence.Infra_VastuuorganisaatiotPK infra_VastuuorganisaatiotPK,
        int infra_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.tupa.db.NoSuchInfra_VastuuorganisaatiotException {
        return getPersistence()
                   .findByinfraId_PrevAndNext(infra_VastuuorganisaatiotPK,
            infra_id, orderByComparator);
    }

    /**
    * Removes all the infra_ vastuuorganisaatiots where infra_id = &#63; from the database.
    *
    * @param infra_id the infra_id
    * @throws SystemException if a system exception occurred
    */
    public static void removeByinfraId(int infra_id)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByinfraId(infra_id);
    }

    /**
    * Returns the number of infra_ vastuuorganisaatiots where infra_id = &#63;.
    *
    * @param infra_id the infra_id
    * @return the number of matching infra_ vastuuorganisaatiots
    * @throws SystemException if a system exception occurred
    */
    public static int countByinfraId(int infra_id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByinfraId(infra_id);
    }

    /**
    * Returns all the infra_ vastuuorganisaatiots where organisaatio_id = &#63;.
    *
    * @param organisaatio_id the organisaatio_id
    * @return the matching infra_ vastuuorganisaatiots
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<fi.csc.avaa.tupa.db.model.Infra_Vastuuorganisaatiot> findByorganisationId(
        int organisaatio_id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByorganisationId(organisaatio_id);
    }

    /**
    * Returns a range of all the infra_ vastuuorganisaatiots where organisaatio_id = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.Infra_VastuuorganisaatiotModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param organisaatio_id the organisaatio_id
    * @param start the lower bound of the range of infra_ vastuuorganisaatiots
    * @param end the upper bound of the range of infra_ vastuuorganisaatiots (not inclusive)
    * @return the range of matching infra_ vastuuorganisaatiots
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<fi.csc.avaa.tupa.db.model.Infra_Vastuuorganisaatiot> findByorganisationId(
        int organisaatio_id, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByorganisationId(organisaatio_id, start, end);
    }

    /**
    * Returns an ordered range of all the infra_ vastuuorganisaatiots where organisaatio_id = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.Infra_VastuuorganisaatiotModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param organisaatio_id the organisaatio_id
    * @param start the lower bound of the range of infra_ vastuuorganisaatiots
    * @param end the upper bound of the range of infra_ vastuuorganisaatiots (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching infra_ vastuuorganisaatiots
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<fi.csc.avaa.tupa.db.model.Infra_Vastuuorganisaatiot> findByorganisationId(
        int organisaatio_id, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByorganisationId(organisaatio_id, start, end,
            orderByComparator);
    }

    /**
    * Returns the first infra_ vastuuorganisaatiot in the ordered set where organisaatio_id = &#63;.
    *
    * @param organisaatio_id the organisaatio_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching infra_ vastuuorganisaatiot
    * @throws fi.csc.avaa.tupa.db.NoSuchInfra_VastuuorganisaatiotException if a matching infra_ vastuuorganisaatiot could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.tupa.db.model.Infra_Vastuuorganisaatiot findByorganisationId_First(
        int organisaatio_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.tupa.db.NoSuchInfra_VastuuorganisaatiotException {
        return getPersistence()
                   .findByorganisationId_First(organisaatio_id,
            orderByComparator);
    }

    /**
    * Returns the first infra_ vastuuorganisaatiot in the ordered set where organisaatio_id = &#63;.
    *
    * @param organisaatio_id the organisaatio_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching infra_ vastuuorganisaatiot, or <code>null</code> if a matching infra_ vastuuorganisaatiot could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.tupa.db.model.Infra_Vastuuorganisaatiot fetchByorganisationId_First(
        int organisaatio_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByorganisationId_First(organisaatio_id,
            orderByComparator);
    }

    /**
    * Returns the last infra_ vastuuorganisaatiot in the ordered set where organisaatio_id = &#63;.
    *
    * @param organisaatio_id the organisaatio_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching infra_ vastuuorganisaatiot
    * @throws fi.csc.avaa.tupa.db.NoSuchInfra_VastuuorganisaatiotException if a matching infra_ vastuuorganisaatiot could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.tupa.db.model.Infra_Vastuuorganisaatiot findByorganisationId_Last(
        int organisaatio_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.tupa.db.NoSuchInfra_VastuuorganisaatiotException {
        return getPersistence()
                   .findByorganisationId_Last(organisaatio_id, orderByComparator);
    }

    /**
    * Returns the last infra_ vastuuorganisaatiot in the ordered set where organisaatio_id = &#63;.
    *
    * @param organisaatio_id the organisaatio_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching infra_ vastuuorganisaatiot, or <code>null</code> if a matching infra_ vastuuorganisaatiot could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.tupa.db.model.Infra_Vastuuorganisaatiot fetchByorganisationId_Last(
        int organisaatio_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByorganisationId_Last(organisaatio_id,
            orderByComparator);
    }

    /**
    * Returns the infra_ vastuuorganisaatiots before and after the current infra_ vastuuorganisaatiot in the ordered set where organisaatio_id = &#63;.
    *
    * @param infra_VastuuorganisaatiotPK the primary key of the current infra_ vastuuorganisaatiot
    * @param organisaatio_id the organisaatio_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next infra_ vastuuorganisaatiot
    * @throws fi.csc.avaa.tupa.db.NoSuchInfra_VastuuorganisaatiotException if a infra_ vastuuorganisaatiot with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.tupa.db.model.Infra_Vastuuorganisaatiot[] findByorganisationId_PrevAndNext(
        fi.csc.avaa.tupa.db.service.persistence.Infra_VastuuorganisaatiotPK infra_VastuuorganisaatiotPK,
        int organisaatio_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.tupa.db.NoSuchInfra_VastuuorganisaatiotException {
        return getPersistence()
                   .findByorganisationId_PrevAndNext(infra_VastuuorganisaatiotPK,
            organisaatio_id, orderByComparator);
    }

    /**
    * Removes all the infra_ vastuuorganisaatiots where organisaatio_id = &#63; from the database.
    *
    * @param organisaatio_id the organisaatio_id
    * @throws SystemException if a system exception occurred
    */
    public static void removeByorganisationId(int organisaatio_id)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByorganisationId(organisaatio_id);
    }

    /**
    * Returns the number of infra_ vastuuorganisaatiots where organisaatio_id = &#63;.
    *
    * @param organisaatio_id the organisaatio_id
    * @return the number of matching infra_ vastuuorganisaatiots
    * @throws SystemException if a system exception occurred
    */
    public static int countByorganisationId(int organisaatio_id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByorganisationId(organisaatio_id);
    }

    /**
    * Caches the infra_ vastuuorganisaatiot in the entity cache if it is enabled.
    *
    * @param infra_Vastuuorganisaatiot the infra_ vastuuorganisaatiot
    */
    public static void cacheResult(
        fi.csc.avaa.tupa.db.model.Infra_Vastuuorganisaatiot infra_Vastuuorganisaatiot) {
        getPersistence().cacheResult(infra_Vastuuorganisaatiot);
    }

    /**
    * Caches the infra_ vastuuorganisaatiots in the entity cache if it is enabled.
    *
    * @param infra_Vastuuorganisaatiots the infra_ vastuuorganisaatiots
    */
    public static void cacheResult(
        java.util.List<fi.csc.avaa.tupa.db.model.Infra_Vastuuorganisaatiot> infra_Vastuuorganisaatiots) {
        getPersistence().cacheResult(infra_Vastuuorganisaatiots);
    }

    /**
    * Creates a new infra_ vastuuorganisaatiot with the primary key. Does not add the infra_ vastuuorganisaatiot to the database.
    *
    * @param infra_VastuuorganisaatiotPK the primary key for the new infra_ vastuuorganisaatiot
    * @return the new infra_ vastuuorganisaatiot
    */
    public static fi.csc.avaa.tupa.db.model.Infra_Vastuuorganisaatiot create(
        fi.csc.avaa.tupa.db.service.persistence.Infra_VastuuorganisaatiotPK infra_VastuuorganisaatiotPK) {
        return getPersistence().create(infra_VastuuorganisaatiotPK);
    }

    /**
    * Removes the infra_ vastuuorganisaatiot with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param infra_VastuuorganisaatiotPK the primary key of the infra_ vastuuorganisaatiot
    * @return the infra_ vastuuorganisaatiot that was removed
    * @throws fi.csc.avaa.tupa.db.NoSuchInfra_VastuuorganisaatiotException if a infra_ vastuuorganisaatiot with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.tupa.db.model.Infra_Vastuuorganisaatiot remove(
        fi.csc.avaa.tupa.db.service.persistence.Infra_VastuuorganisaatiotPK infra_VastuuorganisaatiotPK)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.tupa.db.NoSuchInfra_VastuuorganisaatiotException {
        return getPersistence().remove(infra_VastuuorganisaatiotPK);
    }

    public static fi.csc.avaa.tupa.db.model.Infra_Vastuuorganisaatiot updateImpl(
        fi.csc.avaa.tupa.db.model.Infra_Vastuuorganisaatiot infra_Vastuuorganisaatiot)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(infra_Vastuuorganisaatiot);
    }

    /**
    * Returns the infra_ vastuuorganisaatiot with the primary key or throws a {@link fi.csc.avaa.tupa.db.NoSuchInfra_VastuuorganisaatiotException} if it could not be found.
    *
    * @param infra_VastuuorganisaatiotPK the primary key of the infra_ vastuuorganisaatiot
    * @return the infra_ vastuuorganisaatiot
    * @throws fi.csc.avaa.tupa.db.NoSuchInfra_VastuuorganisaatiotException if a infra_ vastuuorganisaatiot with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.tupa.db.model.Infra_Vastuuorganisaatiot findByPrimaryKey(
        fi.csc.avaa.tupa.db.service.persistence.Infra_VastuuorganisaatiotPK infra_VastuuorganisaatiotPK)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.tupa.db.NoSuchInfra_VastuuorganisaatiotException {
        return getPersistence().findByPrimaryKey(infra_VastuuorganisaatiotPK);
    }

    /**
    * Returns the infra_ vastuuorganisaatiot with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param infra_VastuuorganisaatiotPK the primary key of the infra_ vastuuorganisaatiot
    * @return the infra_ vastuuorganisaatiot, or <code>null</code> if a infra_ vastuuorganisaatiot with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.tupa.db.model.Infra_Vastuuorganisaatiot fetchByPrimaryKey(
        fi.csc.avaa.tupa.db.service.persistence.Infra_VastuuorganisaatiotPK infra_VastuuorganisaatiotPK)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(infra_VastuuorganisaatiotPK);
    }

    /**
    * Returns all the infra_ vastuuorganisaatiots.
    *
    * @return the infra_ vastuuorganisaatiots
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<fi.csc.avaa.tupa.db.model.Infra_Vastuuorganisaatiot> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the infra_ vastuuorganisaatiots.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.Infra_VastuuorganisaatiotModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of infra_ vastuuorganisaatiots
    * @param end the upper bound of the range of infra_ vastuuorganisaatiots (not inclusive)
    * @return the range of infra_ vastuuorganisaatiots
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<fi.csc.avaa.tupa.db.model.Infra_Vastuuorganisaatiot> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the infra_ vastuuorganisaatiots.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.Infra_VastuuorganisaatiotModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of infra_ vastuuorganisaatiots
    * @param end the upper bound of the range of infra_ vastuuorganisaatiots (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of infra_ vastuuorganisaatiots
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<fi.csc.avaa.tupa.db.model.Infra_Vastuuorganisaatiot> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the infra_ vastuuorganisaatiots from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of infra_ vastuuorganisaatiots.
    *
    * @return the number of infra_ vastuuorganisaatiots
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static Infra_VastuuorganisaatiotPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (Infra_VastuuorganisaatiotPersistence) PortletBeanLocatorUtil.locate(fi.csc.avaa.tupa.db.service.ClpSerializer.getServletContextName(),
                    Infra_VastuuorganisaatiotPersistence.class.getName());

            ReferenceRegistry.registerReference(Infra_VastuuorganisaatiotUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(Infra_VastuuorganisaatiotPersistence persistence) {
    }
}
