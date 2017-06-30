package fi.csc.avaa.tupa.db.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import fi.csc.avaa.tupa.db.model.Identifier;

/**
 * The persistence interface for the identifier service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CSC
 * @see IdentifierPersistenceImpl
 * @see IdentifierUtil
 * @generated
 */
public interface IdentifierPersistence extends BasePersistence<Identifier> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link IdentifierUtil} to access the identifier persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns all the identifiers where identifier_name = &#63;.
    *
    * @param identifier_name the identifier_name
    * @return the matching identifiers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.avaa.tupa.db.model.Identifier> findByidentifierName(
        java.lang.String identifier_name)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<fi.csc.avaa.tupa.db.model.Identifier> findByidentifierName(
        java.lang.String identifier_name, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<fi.csc.avaa.tupa.db.model.Identifier> findByidentifierName(
        java.lang.String identifier_name, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first identifier in the ordered set where identifier_name = &#63;.
    *
    * @param identifier_name the identifier_name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching identifier
    * @throws fi.csc.avaa.tupa.db.NoSuchIdentifierException if a matching identifier could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.tupa.db.model.Identifier findByidentifierName_First(
        java.lang.String identifier_name,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.tupa.db.NoSuchIdentifierException;

    /**
    * Returns the first identifier in the ordered set where identifier_name = &#63;.
    *
    * @param identifier_name the identifier_name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching identifier, or <code>null</code> if a matching identifier could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.tupa.db.model.Identifier fetchByidentifierName_First(
        java.lang.String identifier_name,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last identifier in the ordered set where identifier_name = &#63;.
    *
    * @param identifier_name the identifier_name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching identifier
    * @throws fi.csc.avaa.tupa.db.NoSuchIdentifierException if a matching identifier could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.tupa.db.model.Identifier findByidentifierName_Last(
        java.lang.String identifier_name,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.tupa.db.NoSuchIdentifierException;

    /**
    * Returns the last identifier in the ordered set where identifier_name = &#63;.
    *
    * @param identifier_name the identifier_name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching identifier, or <code>null</code> if a matching identifier could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.tupa.db.model.Identifier fetchByidentifierName_Last(
        java.lang.String identifier_name,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public fi.csc.avaa.tupa.db.model.Identifier[] findByidentifierName_PrevAndNext(
        int identifier_type, java.lang.String identifier_name,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.tupa.db.NoSuchIdentifierException;

    /**
    * Removes all the identifiers where identifier_name = &#63; from the database.
    *
    * @param identifier_name the identifier_name
    * @throws SystemException if a system exception occurred
    */
    public void removeByidentifierName(java.lang.String identifier_name)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of identifiers where identifier_name = &#63;.
    *
    * @param identifier_name the identifier_name
    * @return the number of matching identifiers
    * @throws SystemException if a system exception occurred
    */
    public int countByidentifierName(java.lang.String identifier_name)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the identifier in the entity cache if it is enabled.
    *
    * @param identifier the identifier
    */
    public void cacheResult(fi.csc.avaa.tupa.db.model.Identifier identifier);

    /**
    * Caches the identifiers in the entity cache if it is enabled.
    *
    * @param identifiers the identifiers
    */
    public void cacheResult(
        java.util.List<fi.csc.avaa.tupa.db.model.Identifier> identifiers);

    /**
    * Creates a new identifier with the primary key. Does not add the identifier to the database.
    *
    * @param identifier_type the primary key for the new identifier
    * @return the new identifier
    */
    public fi.csc.avaa.tupa.db.model.Identifier create(int identifier_type);

    /**
    * Removes the identifier with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param identifier_type the primary key of the identifier
    * @return the identifier that was removed
    * @throws fi.csc.avaa.tupa.db.NoSuchIdentifierException if a identifier with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.tupa.db.model.Identifier remove(int identifier_type)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.tupa.db.NoSuchIdentifierException;

    public fi.csc.avaa.tupa.db.model.Identifier updateImpl(
        fi.csc.avaa.tupa.db.model.Identifier identifier)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the identifier with the primary key or throws a {@link fi.csc.avaa.tupa.db.NoSuchIdentifierException} if it could not be found.
    *
    * @param identifier_type the primary key of the identifier
    * @return the identifier
    * @throws fi.csc.avaa.tupa.db.NoSuchIdentifierException if a identifier with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.tupa.db.model.Identifier findByPrimaryKey(
        int identifier_type)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.tupa.db.NoSuchIdentifierException;

    /**
    * Returns the identifier with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param identifier_type the primary key of the identifier
    * @return the identifier, or <code>null</code> if a identifier with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.tupa.db.model.Identifier fetchByPrimaryKey(
        int identifier_type)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the identifiers.
    *
    * @return the identifiers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.avaa.tupa.db.model.Identifier> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<fi.csc.avaa.tupa.db.model.Identifier> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<fi.csc.avaa.tupa.db.model.Identifier> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the identifiers from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of identifiers.
    *
    * @return the number of identifiers
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
