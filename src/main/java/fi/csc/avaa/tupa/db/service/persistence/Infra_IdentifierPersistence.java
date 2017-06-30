package fi.csc.avaa.tupa.db.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import fi.csc.avaa.tupa.db.model.Infra_Identifier;

/**
 * The persistence interface for the infra_ identifier service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CSC
 * @see Infra_IdentifierPersistenceImpl
 * @see Infra_IdentifierUtil
 * @generated
 */
public interface Infra_IdentifierPersistence extends BasePersistence<Infra_Identifier> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link Infra_IdentifierUtil} to access the infra_ identifier persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns all the infra_ identifiers where infra_id = &#63;.
    *
    * @param infra_id the infra_id
    * @return the matching infra_ identifiers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.avaa.tupa.db.model.Infra_Identifier> findByinfraId(
        int infra_id)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the infra_ identifiers where infra_id = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.Infra_IdentifierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param infra_id the infra_id
    * @param start the lower bound of the range of infra_ identifiers
    * @param end the upper bound of the range of infra_ identifiers (not inclusive)
    * @return the range of matching infra_ identifiers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.avaa.tupa.db.model.Infra_Identifier> findByinfraId(
        int infra_id, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the infra_ identifiers where infra_id = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.Infra_IdentifierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param infra_id the infra_id
    * @param start the lower bound of the range of infra_ identifiers
    * @param end the upper bound of the range of infra_ identifiers (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching infra_ identifiers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.avaa.tupa.db.model.Infra_Identifier> findByinfraId(
        int infra_id, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first infra_ identifier in the ordered set where infra_id = &#63;.
    *
    * @param infra_id the infra_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching infra_ identifier
    * @throws fi.csc.avaa.tupa.db.NoSuchInfra_IdentifierException if a matching infra_ identifier could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.tupa.db.model.Infra_Identifier findByinfraId_First(
        int infra_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.tupa.db.NoSuchInfra_IdentifierException;

    /**
    * Returns the first infra_ identifier in the ordered set where infra_id = &#63;.
    *
    * @param infra_id the infra_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching infra_ identifier, or <code>null</code> if a matching infra_ identifier could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.tupa.db.model.Infra_Identifier fetchByinfraId_First(
        int infra_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last infra_ identifier in the ordered set where infra_id = &#63;.
    *
    * @param infra_id the infra_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching infra_ identifier
    * @throws fi.csc.avaa.tupa.db.NoSuchInfra_IdentifierException if a matching infra_ identifier could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.tupa.db.model.Infra_Identifier findByinfraId_Last(
        int infra_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.tupa.db.NoSuchInfra_IdentifierException;

    /**
    * Returns the last infra_ identifier in the ordered set where infra_id = &#63;.
    *
    * @param infra_id the infra_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching infra_ identifier, or <code>null</code> if a matching infra_ identifier could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.tupa.db.model.Infra_Identifier fetchByinfraId_Last(
        int infra_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the infra_ identifiers before and after the current infra_ identifier in the ordered set where infra_id = &#63;.
    *
    * @param infra_IdentifierPK the primary key of the current infra_ identifier
    * @param infra_id the infra_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next infra_ identifier
    * @throws fi.csc.avaa.tupa.db.NoSuchInfra_IdentifierException if a infra_ identifier with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.tupa.db.model.Infra_Identifier[] findByinfraId_PrevAndNext(
        fi.csc.avaa.tupa.db.service.persistence.Infra_IdentifierPK infra_IdentifierPK,
        int infra_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.tupa.db.NoSuchInfra_IdentifierException;

    /**
    * Removes all the infra_ identifiers where infra_id = &#63; from the database.
    *
    * @param infra_id the infra_id
    * @throws SystemException if a system exception occurred
    */
    public void removeByinfraId(int infra_id)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of infra_ identifiers where infra_id = &#63;.
    *
    * @param infra_id the infra_id
    * @return the number of matching infra_ identifiers
    * @throws SystemException if a system exception occurred
    */
    public int countByinfraId(int infra_id)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the infra_ identifiers where identifier_type = &#63;.
    *
    * @param identifier_type the identifier_type
    * @return the matching infra_ identifiers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.avaa.tupa.db.model.Infra_Identifier> findByidentifierType(
        int identifier_type)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the infra_ identifiers where identifier_type = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.Infra_IdentifierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param identifier_type the identifier_type
    * @param start the lower bound of the range of infra_ identifiers
    * @param end the upper bound of the range of infra_ identifiers (not inclusive)
    * @return the range of matching infra_ identifiers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.avaa.tupa.db.model.Infra_Identifier> findByidentifierType(
        int identifier_type, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the infra_ identifiers where identifier_type = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.Infra_IdentifierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param identifier_type the identifier_type
    * @param start the lower bound of the range of infra_ identifiers
    * @param end the upper bound of the range of infra_ identifiers (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching infra_ identifiers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.avaa.tupa.db.model.Infra_Identifier> findByidentifierType(
        int identifier_type, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first infra_ identifier in the ordered set where identifier_type = &#63;.
    *
    * @param identifier_type the identifier_type
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching infra_ identifier
    * @throws fi.csc.avaa.tupa.db.NoSuchInfra_IdentifierException if a matching infra_ identifier could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.tupa.db.model.Infra_Identifier findByidentifierType_First(
        int identifier_type,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.tupa.db.NoSuchInfra_IdentifierException;

    /**
    * Returns the first infra_ identifier in the ordered set where identifier_type = &#63;.
    *
    * @param identifier_type the identifier_type
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching infra_ identifier, or <code>null</code> if a matching infra_ identifier could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.tupa.db.model.Infra_Identifier fetchByidentifierType_First(
        int identifier_type,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last infra_ identifier in the ordered set where identifier_type = &#63;.
    *
    * @param identifier_type the identifier_type
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching infra_ identifier
    * @throws fi.csc.avaa.tupa.db.NoSuchInfra_IdentifierException if a matching infra_ identifier could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.tupa.db.model.Infra_Identifier findByidentifierType_Last(
        int identifier_type,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.tupa.db.NoSuchInfra_IdentifierException;

    /**
    * Returns the last infra_ identifier in the ordered set where identifier_type = &#63;.
    *
    * @param identifier_type the identifier_type
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching infra_ identifier, or <code>null</code> if a matching infra_ identifier could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.tupa.db.model.Infra_Identifier fetchByidentifierType_Last(
        int identifier_type,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the infra_ identifiers before and after the current infra_ identifier in the ordered set where identifier_type = &#63;.
    *
    * @param infra_IdentifierPK the primary key of the current infra_ identifier
    * @param identifier_type the identifier_type
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next infra_ identifier
    * @throws fi.csc.avaa.tupa.db.NoSuchInfra_IdentifierException if a infra_ identifier with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.tupa.db.model.Infra_Identifier[] findByidentifierType_PrevAndNext(
        fi.csc.avaa.tupa.db.service.persistence.Infra_IdentifierPK infra_IdentifierPK,
        int identifier_type,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.tupa.db.NoSuchInfra_IdentifierException;

    /**
    * Removes all the infra_ identifiers where identifier_type = &#63; from the database.
    *
    * @param identifier_type the identifier_type
    * @throws SystemException if a system exception occurred
    */
    public void removeByidentifierType(int identifier_type)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of infra_ identifiers where identifier_type = &#63;.
    *
    * @param identifier_type the identifier_type
    * @return the number of matching infra_ identifiers
    * @throws SystemException if a system exception occurred
    */
    public int countByidentifierType(int identifier_type)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the infra_ identifiers where identifier_value = &#63;.
    *
    * @param identifier_value the identifier_value
    * @return the matching infra_ identifiers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.avaa.tupa.db.model.Infra_Identifier> findByidentifierValue(
        java.lang.String identifier_value)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the infra_ identifiers where identifier_value = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.Infra_IdentifierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param identifier_value the identifier_value
    * @param start the lower bound of the range of infra_ identifiers
    * @param end the upper bound of the range of infra_ identifiers (not inclusive)
    * @return the range of matching infra_ identifiers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.avaa.tupa.db.model.Infra_Identifier> findByidentifierValue(
        java.lang.String identifier_value, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the infra_ identifiers where identifier_value = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.Infra_IdentifierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param identifier_value the identifier_value
    * @param start the lower bound of the range of infra_ identifiers
    * @param end the upper bound of the range of infra_ identifiers (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching infra_ identifiers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.avaa.tupa.db.model.Infra_Identifier> findByidentifierValue(
        java.lang.String identifier_value, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first infra_ identifier in the ordered set where identifier_value = &#63;.
    *
    * @param identifier_value the identifier_value
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching infra_ identifier
    * @throws fi.csc.avaa.tupa.db.NoSuchInfra_IdentifierException if a matching infra_ identifier could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.tupa.db.model.Infra_Identifier findByidentifierValue_First(
        java.lang.String identifier_value,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.tupa.db.NoSuchInfra_IdentifierException;

    /**
    * Returns the first infra_ identifier in the ordered set where identifier_value = &#63;.
    *
    * @param identifier_value the identifier_value
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching infra_ identifier, or <code>null</code> if a matching infra_ identifier could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.tupa.db.model.Infra_Identifier fetchByidentifierValue_First(
        java.lang.String identifier_value,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last infra_ identifier in the ordered set where identifier_value = &#63;.
    *
    * @param identifier_value the identifier_value
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching infra_ identifier
    * @throws fi.csc.avaa.tupa.db.NoSuchInfra_IdentifierException if a matching infra_ identifier could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.tupa.db.model.Infra_Identifier findByidentifierValue_Last(
        java.lang.String identifier_value,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.tupa.db.NoSuchInfra_IdentifierException;

    /**
    * Returns the last infra_ identifier in the ordered set where identifier_value = &#63;.
    *
    * @param identifier_value the identifier_value
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching infra_ identifier, or <code>null</code> if a matching infra_ identifier could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.tupa.db.model.Infra_Identifier fetchByidentifierValue_Last(
        java.lang.String identifier_value,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the infra_ identifiers before and after the current infra_ identifier in the ordered set where identifier_value = &#63;.
    *
    * @param infra_IdentifierPK the primary key of the current infra_ identifier
    * @param identifier_value the identifier_value
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next infra_ identifier
    * @throws fi.csc.avaa.tupa.db.NoSuchInfra_IdentifierException if a infra_ identifier with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.tupa.db.model.Infra_Identifier[] findByidentifierValue_PrevAndNext(
        fi.csc.avaa.tupa.db.service.persistence.Infra_IdentifierPK infra_IdentifierPK,
        java.lang.String identifier_value,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.tupa.db.NoSuchInfra_IdentifierException;

    /**
    * Removes all the infra_ identifiers where identifier_value = &#63; from the database.
    *
    * @param identifier_value the identifier_value
    * @throws SystemException if a system exception occurred
    */
    public void removeByidentifierValue(java.lang.String identifier_value)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of infra_ identifiers where identifier_value = &#63;.
    *
    * @param identifier_value the identifier_value
    * @return the number of matching infra_ identifiers
    * @throws SystemException if a system exception occurred
    */
    public int countByidentifierValue(java.lang.String identifier_value)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the infra_ identifier in the entity cache if it is enabled.
    *
    * @param infra_Identifier the infra_ identifier
    */
    public void cacheResult(
        fi.csc.avaa.tupa.db.model.Infra_Identifier infra_Identifier);

    /**
    * Caches the infra_ identifiers in the entity cache if it is enabled.
    *
    * @param infra_Identifiers the infra_ identifiers
    */
    public void cacheResult(
        java.util.List<fi.csc.avaa.tupa.db.model.Infra_Identifier> infra_Identifiers);

    /**
    * Creates a new infra_ identifier with the primary key. Does not add the infra_ identifier to the database.
    *
    * @param infra_IdentifierPK the primary key for the new infra_ identifier
    * @return the new infra_ identifier
    */
    public fi.csc.avaa.tupa.db.model.Infra_Identifier create(
        fi.csc.avaa.tupa.db.service.persistence.Infra_IdentifierPK infra_IdentifierPK);

    /**
    * Removes the infra_ identifier with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param infra_IdentifierPK the primary key of the infra_ identifier
    * @return the infra_ identifier that was removed
    * @throws fi.csc.avaa.tupa.db.NoSuchInfra_IdentifierException if a infra_ identifier with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.tupa.db.model.Infra_Identifier remove(
        fi.csc.avaa.tupa.db.service.persistence.Infra_IdentifierPK infra_IdentifierPK)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.tupa.db.NoSuchInfra_IdentifierException;

    public fi.csc.avaa.tupa.db.model.Infra_Identifier updateImpl(
        fi.csc.avaa.tupa.db.model.Infra_Identifier infra_Identifier)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the infra_ identifier with the primary key or throws a {@link fi.csc.avaa.tupa.db.NoSuchInfra_IdentifierException} if it could not be found.
    *
    * @param infra_IdentifierPK the primary key of the infra_ identifier
    * @return the infra_ identifier
    * @throws fi.csc.avaa.tupa.db.NoSuchInfra_IdentifierException if a infra_ identifier with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.tupa.db.model.Infra_Identifier findByPrimaryKey(
        fi.csc.avaa.tupa.db.service.persistence.Infra_IdentifierPK infra_IdentifierPK)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.tupa.db.NoSuchInfra_IdentifierException;

    /**
    * Returns the infra_ identifier with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param infra_IdentifierPK the primary key of the infra_ identifier
    * @return the infra_ identifier, or <code>null</code> if a infra_ identifier with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.tupa.db.model.Infra_Identifier fetchByPrimaryKey(
        fi.csc.avaa.tupa.db.service.persistence.Infra_IdentifierPK infra_IdentifierPK)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the infra_ identifiers.
    *
    * @return the infra_ identifiers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.avaa.tupa.db.model.Infra_Identifier> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the infra_ identifiers.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.Infra_IdentifierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of infra_ identifiers
    * @param end the upper bound of the range of infra_ identifiers (not inclusive)
    * @return the range of infra_ identifiers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.avaa.tupa.db.model.Infra_Identifier> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the infra_ identifiers.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.Infra_IdentifierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of infra_ identifiers
    * @param end the upper bound of the range of infra_ identifiers (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of infra_ identifiers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.avaa.tupa.db.model.Infra_Identifier> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the infra_ identifiers from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of infra_ identifiers.
    *
    * @return the number of infra_ identifiers
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
