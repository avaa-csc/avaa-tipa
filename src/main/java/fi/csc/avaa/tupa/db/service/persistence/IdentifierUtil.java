package fi.csc.avaa.tupa.db.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import fi.csc.avaa.tupa.db.model.Identifier;

import java.util.List;

/**
 * The persistence utility for the identifier service. This utility wraps {@link IdentifierPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CSC
 * @see IdentifierPersistence
 * @see IdentifierPersistenceImpl
 * @generated
 */
public class IdentifierUtil {
    private static IdentifierPersistence _persistence;

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
    public static void clearCache(Identifier identifier) {
        getPersistence().clearCache(identifier);
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
    public static List<Identifier> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<Identifier> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<Identifier> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static Identifier update(Identifier identifier)
        throws SystemException {
        return getPersistence().update(identifier);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static Identifier update(Identifier identifier,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(identifier, serviceContext);
    }

    /**
    * Returns all the identifiers where identifier_name = &#63;.
    *
    * @param identifier_name the identifier_name
    * @return the matching identifiers
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<fi.csc.avaa.tupa.db.model.Identifier> findByidentifierName(
        java.lang.String identifier_name)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByidentifierName(identifier_name);
    }

    /**
    * Returns a range of all the identifiers where identifier_name = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.IdentifierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param identifier_name the identifier_name
    * @param start the lower bound of the range of identifiers
    * @param end the upper bound of the range of identifiers (not inclusive)
    * @return the range of matching identifiers
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<fi.csc.avaa.tupa.db.model.Identifier> findByidentifierName(
        java.lang.String identifier_name, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByidentifierName(identifier_name, start, end);
    }

    /**
    * Returns an ordered range of all the identifiers where identifier_name = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.IdentifierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param identifier_name the identifier_name
    * @param start the lower bound of the range of identifiers
    * @param end the upper bound of the range of identifiers (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching identifiers
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<fi.csc.avaa.tupa.db.model.Identifier> findByidentifierName(
        java.lang.String identifier_name, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByidentifierName(identifier_name, start, end,
            orderByComparator);
    }

    /**
    * Returns the first identifier in the ordered set where identifier_name = &#63;.
    *
    * @param identifier_name the identifier_name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching identifier
    * @throws fi.csc.avaa.tupa.db.NoSuchIdentifierException if a matching identifier could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.tupa.db.model.Identifier findByidentifierName_First(
        java.lang.String identifier_name,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.tupa.db.NoSuchIdentifierException {
        return getPersistence()
                   .findByidentifierName_First(identifier_name,
            orderByComparator);
    }

    /**
    * Returns the first identifier in the ordered set where identifier_name = &#63;.
    *
    * @param identifier_name the identifier_name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching identifier, or <code>null</code> if a matching identifier could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.tupa.db.model.Identifier fetchByidentifierName_First(
        java.lang.String identifier_name,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByidentifierName_First(identifier_name,
            orderByComparator);
    }

    /**
    * Returns the last identifier in the ordered set where identifier_name = &#63;.
    *
    * @param identifier_name the identifier_name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching identifier
    * @throws fi.csc.avaa.tupa.db.NoSuchIdentifierException if a matching identifier could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.tupa.db.model.Identifier findByidentifierName_Last(
        java.lang.String identifier_name,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.tupa.db.NoSuchIdentifierException {
        return getPersistence()
                   .findByidentifierName_Last(identifier_name, orderByComparator);
    }

    /**
    * Returns the last identifier in the ordered set where identifier_name = &#63;.
    *
    * @param identifier_name the identifier_name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching identifier, or <code>null</code> if a matching identifier could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.tupa.db.model.Identifier fetchByidentifierName_Last(
        java.lang.String identifier_name,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByidentifierName_Last(identifier_name,
            orderByComparator);
    }

    /**
    * Returns the identifiers before and after the current identifier in the ordered set where identifier_name = &#63;.
    *
    * @param identifier_type the primary key of the current identifier
    * @param identifier_name the identifier_name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next identifier
    * @throws fi.csc.avaa.tupa.db.NoSuchIdentifierException if a identifier with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.tupa.db.model.Identifier[] findByidentifierName_PrevAndNext(
        int identifier_type, java.lang.String identifier_name,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.tupa.db.NoSuchIdentifierException {
        return getPersistence()
                   .findByidentifierName_PrevAndNext(identifier_type,
            identifier_name, orderByComparator);
    }

    /**
    * Removes all the identifiers where identifier_name = &#63; from the database.
    *
    * @param identifier_name the identifier_name
    * @throws SystemException if a system exception occurred
    */
    public static void removeByidentifierName(java.lang.String identifier_name)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByidentifierName(identifier_name);
    }

    /**
    * Returns the number of identifiers where identifier_name = &#63;.
    *
    * @param identifier_name the identifier_name
    * @return the number of matching identifiers
    * @throws SystemException if a system exception occurred
    */
    public static int countByidentifierName(java.lang.String identifier_name)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByidentifierName(identifier_name);
    }

    /**
    * Caches the identifier in the entity cache if it is enabled.
    *
    * @param identifier the identifier
    */
    public static void cacheResult(
        fi.csc.avaa.tupa.db.model.Identifier identifier) {
        getPersistence().cacheResult(identifier);
    }

    /**
    * Caches the identifiers in the entity cache if it is enabled.
    *
    * @param identifiers the identifiers
    */
    public static void cacheResult(
        java.util.List<fi.csc.avaa.tupa.db.model.Identifier> identifiers) {
        getPersistence().cacheResult(identifiers);
    }

    /**
    * Creates a new identifier with the primary key. Does not add the identifier to the database.
    *
    * @param identifier_type the primary key for the new identifier
    * @return the new identifier
    */
    public static fi.csc.avaa.tupa.db.model.Identifier create(
        int identifier_type) {
        return getPersistence().create(identifier_type);
    }

    /**
    * Removes the identifier with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param identifier_type the primary key of the identifier
    * @return the identifier that was removed
    * @throws fi.csc.avaa.tupa.db.NoSuchIdentifierException if a identifier with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.tupa.db.model.Identifier remove(
        int identifier_type)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.tupa.db.NoSuchIdentifierException {
        return getPersistence().remove(identifier_type);
    }

    public static fi.csc.avaa.tupa.db.model.Identifier updateImpl(
        fi.csc.avaa.tupa.db.model.Identifier identifier)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(identifier);
    }

    /**
    * Returns the identifier with the primary key or throws a {@link fi.csc.avaa.tupa.db.NoSuchIdentifierException} if it could not be found.
    *
    * @param identifier_type the primary key of the identifier
    * @return the identifier
    * @throws fi.csc.avaa.tupa.db.NoSuchIdentifierException if a identifier with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.tupa.db.model.Identifier findByPrimaryKey(
        int identifier_type)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.tupa.db.NoSuchIdentifierException {
        return getPersistence().findByPrimaryKey(identifier_type);
    }

    /**
    * Returns the identifier with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param identifier_type the primary key of the identifier
    * @return the identifier, or <code>null</code> if a identifier with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.tupa.db.model.Identifier fetchByPrimaryKey(
        int identifier_type)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(identifier_type);
    }

    /**
    * Returns all the identifiers.
    *
    * @return the identifiers
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<fi.csc.avaa.tupa.db.model.Identifier> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the identifiers.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.IdentifierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of identifiers
    * @param end the upper bound of the range of identifiers (not inclusive)
    * @return the range of identifiers
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<fi.csc.avaa.tupa.db.model.Identifier> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the identifiers.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.IdentifierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of identifiers
    * @param end the upper bound of the range of identifiers (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of identifiers
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<fi.csc.avaa.tupa.db.model.Identifier> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the identifiers from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of identifiers.
    *
    * @return the number of identifiers
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static IdentifierPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (IdentifierPersistence) PortletBeanLocatorUtil.locate(fi.csc.avaa.tupa.db.service.ClpSerializer.getServletContextName(),
                    IdentifierPersistence.class.getName());

            ReferenceRegistry.registerReference(IdentifierUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(IdentifierPersistence persistence) {
    }
}
