package fi.csc.avaa.tupa.db.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import fi.csc.avaa.tupa.db.model.Infra_Vastuuorganisaatiot;

/**
 * The persistence interface for the infra_ vastuuorganisaatiot service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CSC
 * @see Infra_VastuuorganisaatiotPersistenceImpl
 * @see Infra_VastuuorganisaatiotUtil
 * @generated
 */
public interface Infra_VastuuorganisaatiotPersistence extends BasePersistence<Infra_Vastuuorganisaatiot> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link Infra_VastuuorganisaatiotUtil} to access the infra_ vastuuorganisaatiot persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns all the infra_ vastuuorganisaatiots where infra_id = &#63;.
    *
    * @param infra_id the infra_id
    * @return the matching infra_ vastuuorganisaatiots
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.avaa.tupa.db.model.Infra_Vastuuorganisaatiot> findByinfraId(
        int infra_id)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<fi.csc.avaa.tupa.db.model.Infra_Vastuuorganisaatiot> findByinfraId(
        int infra_id, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<fi.csc.avaa.tupa.db.model.Infra_Vastuuorganisaatiot> findByinfraId(
        int infra_id, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first infra_ vastuuorganisaatiot in the ordered set where infra_id = &#63;.
    *
    * @param infra_id the infra_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching infra_ vastuuorganisaatiot
    * @throws fi.csc.avaa.tupa.db.NoSuchInfra_VastuuorganisaatiotException if a matching infra_ vastuuorganisaatiot could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.tupa.db.model.Infra_Vastuuorganisaatiot findByinfraId_First(
        int infra_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.tupa.db.NoSuchInfra_VastuuorganisaatiotException;

    /**
    * Returns the first infra_ vastuuorganisaatiot in the ordered set where infra_id = &#63;.
    *
    * @param infra_id the infra_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching infra_ vastuuorganisaatiot, or <code>null</code> if a matching infra_ vastuuorganisaatiot could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.tupa.db.model.Infra_Vastuuorganisaatiot fetchByinfraId_First(
        int infra_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last infra_ vastuuorganisaatiot in the ordered set where infra_id = &#63;.
    *
    * @param infra_id the infra_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching infra_ vastuuorganisaatiot
    * @throws fi.csc.avaa.tupa.db.NoSuchInfra_VastuuorganisaatiotException if a matching infra_ vastuuorganisaatiot could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.tupa.db.model.Infra_Vastuuorganisaatiot findByinfraId_Last(
        int infra_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.tupa.db.NoSuchInfra_VastuuorganisaatiotException;

    /**
    * Returns the last infra_ vastuuorganisaatiot in the ordered set where infra_id = &#63;.
    *
    * @param infra_id the infra_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching infra_ vastuuorganisaatiot, or <code>null</code> if a matching infra_ vastuuorganisaatiot could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.tupa.db.model.Infra_Vastuuorganisaatiot fetchByinfraId_Last(
        int infra_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public fi.csc.avaa.tupa.db.model.Infra_Vastuuorganisaatiot[] findByinfraId_PrevAndNext(
        fi.csc.avaa.tupa.db.service.persistence.Infra_VastuuorganisaatiotPK infra_VastuuorganisaatiotPK,
        int infra_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.tupa.db.NoSuchInfra_VastuuorganisaatiotException;

    /**
    * Removes all the infra_ vastuuorganisaatiots where infra_id = &#63; from the database.
    *
    * @param infra_id the infra_id
    * @throws SystemException if a system exception occurred
    */
    public void removeByinfraId(int infra_id)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of infra_ vastuuorganisaatiots where infra_id = &#63;.
    *
    * @param infra_id the infra_id
    * @return the number of matching infra_ vastuuorganisaatiots
    * @throws SystemException if a system exception occurred
    */
    public int countByinfraId(int infra_id)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the infra_ vastuuorganisaatiots where organisaatio_id = &#63;.
    *
    * @param organisaatio_id the organisaatio_id
    * @return the matching infra_ vastuuorganisaatiots
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.avaa.tupa.db.model.Infra_Vastuuorganisaatiot> findByorganisationId(
        int organisaatio_id)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<fi.csc.avaa.tupa.db.model.Infra_Vastuuorganisaatiot> findByorganisationId(
        int organisaatio_id, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<fi.csc.avaa.tupa.db.model.Infra_Vastuuorganisaatiot> findByorganisationId(
        int organisaatio_id, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first infra_ vastuuorganisaatiot in the ordered set where organisaatio_id = &#63;.
    *
    * @param organisaatio_id the organisaatio_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching infra_ vastuuorganisaatiot
    * @throws fi.csc.avaa.tupa.db.NoSuchInfra_VastuuorganisaatiotException if a matching infra_ vastuuorganisaatiot could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.tupa.db.model.Infra_Vastuuorganisaatiot findByorganisationId_First(
        int organisaatio_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.tupa.db.NoSuchInfra_VastuuorganisaatiotException;

    /**
    * Returns the first infra_ vastuuorganisaatiot in the ordered set where organisaatio_id = &#63;.
    *
    * @param organisaatio_id the organisaatio_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching infra_ vastuuorganisaatiot, or <code>null</code> if a matching infra_ vastuuorganisaatiot could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.tupa.db.model.Infra_Vastuuorganisaatiot fetchByorganisationId_First(
        int organisaatio_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last infra_ vastuuorganisaatiot in the ordered set where organisaatio_id = &#63;.
    *
    * @param organisaatio_id the organisaatio_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching infra_ vastuuorganisaatiot
    * @throws fi.csc.avaa.tupa.db.NoSuchInfra_VastuuorganisaatiotException if a matching infra_ vastuuorganisaatiot could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.tupa.db.model.Infra_Vastuuorganisaatiot findByorganisationId_Last(
        int organisaatio_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.tupa.db.NoSuchInfra_VastuuorganisaatiotException;

    /**
    * Returns the last infra_ vastuuorganisaatiot in the ordered set where organisaatio_id = &#63;.
    *
    * @param organisaatio_id the organisaatio_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching infra_ vastuuorganisaatiot, or <code>null</code> if a matching infra_ vastuuorganisaatiot could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.tupa.db.model.Infra_Vastuuorganisaatiot fetchByorganisationId_Last(
        int organisaatio_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public fi.csc.avaa.tupa.db.model.Infra_Vastuuorganisaatiot[] findByorganisationId_PrevAndNext(
        fi.csc.avaa.tupa.db.service.persistence.Infra_VastuuorganisaatiotPK infra_VastuuorganisaatiotPK,
        int organisaatio_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.tupa.db.NoSuchInfra_VastuuorganisaatiotException;

    /**
    * Removes all the infra_ vastuuorganisaatiots where organisaatio_id = &#63; from the database.
    *
    * @param organisaatio_id the organisaatio_id
    * @throws SystemException if a system exception occurred
    */
    public void removeByorganisationId(int organisaatio_id)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of infra_ vastuuorganisaatiots where organisaatio_id = &#63;.
    *
    * @param organisaatio_id the organisaatio_id
    * @return the number of matching infra_ vastuuorganisaatiots
    * @throws SystemException if a system exception occurred
    */
    public int countByorganisationId(int organisaatio_id)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the infra_ vastuuorganisaatiot in the entity cache if it is enabled.
    *
    * @param infra_Vastuuorganisaatiot the infra_ vastuuorganisaatiot
    */
    public void cacheResult(
        fi.csc.avaa.tupa.db.model.Infra_Vastuuorganisaatiot infra_Vastuuorganisaatiot);

    /**
    * Caches the infra_ vastuuorganisaatiots in the entity cache if it is enabled.
    *
    * @param infra_Vastuuorganisaatiots the infra_ vastuuorganisaatiots
    */
    public void cacheResult(
        java.util.List<fi.csc.avaa.tupa.db.model.Infra_Vastuuorganisaatiot> infra_Vastuuorganisaatiots);

    /**
    * Creates a new infra_ vastuuorganisaatiot with the primary key. Does not add the infra_ vastuuorganisaatiot to the database.
    *
    * @param infra_VastuuorganisaatiotPK the primary key for the new infra_ vastuuorganisaatiot
    * @return the new infra_ vastuuorganisaatiot
    */
    public fi.csc.avaa.tupa.db.model.Infra_Vastuuorganisaatiot create(
        fi.csc.avaa.tupa.db.service.persistence.Infra_VastuuorganisaatiotPK infra_VastuuorganisaatiotPK);

    /**
    * Removes the infra_ vastuuorganisaatiot with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param infra_VastuuorganisaatiotPK the primary key of the infra_ vastuuorganisaatiot
    * @return the infra_ vastuuorganisaatiot that was removed
    * @throws fi.csc.avaa.tupa.db.NoSuchInfra_VastuuorganisaatiotException if a infra_ vastuuorganisaatiot with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.tupa.db.model.Infra_Vastuuorganisaatiot remove(
        fi.csc.avaa.tupa.db.service.persistence.Infra_VastuuorganisaatiotPK infra_VastuuorganisaatiotPK)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.tupa.db.NoSuchInfra_VastuuorganisaatiotException;

    public fi.csc.avaa.tupa.db.model.Infra_Vastuuorganisaatiot updateImpl(
        fi.csc.avaa.tupa.db.model.Infra_Vastuuorganisaatiot infra_Vastuuorganisaatiot)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the infra_ vastuuorganisaatiot with the primary key or throws a {@link fi.csc.avaa.tupa.db.NoSuchInfra_VastuuorganisaatiotException} if it could not be found.
    *
    * @param infra_VastuuorganisaatiotPK the primary key of the infra_ vastuuorganisaatiot
    * @return the infra_ vastuuorganisaatiot
    * @throws fi.csc.avaa.tupa.db.NoSuchInfra_VastuuorganisaatiotException if a infra_ vastuuorganisaatiot with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.tupa.db.model.Infra_Vastuuorganisaatiot findByPrimaryKey(
        fi.csc.avaa.tupa.db.service.persistence.Infra_VastuuorganisaatiotPK infra_VastuuorganisaatiotPK)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.tupa.db.NoSuchInfra_VastuuorganisaatiotException;

    /**
    * Returns the infra_ vastuuorganisaatiot with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param infra_VastuuorganisaatiotPK the primary key of the infra_ vastuuorganisaatiot
    * @return the infra_ vastuuorganisaatiot, or <code>null</code> if a infra_ vastuuorganisaatiot with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.tupa.db.model.Infra_Vastuuorganisaatiot fetchByPrimaryKey(
        fi.csc.avaa.tupa.db.service.persistence.Infra_VastuuorganisaatiotPK infra_VastuuorganisaatiotPK)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the infra_ vastuuorganisaatiots.
    *
    * @return the infra_ vastuuorganisaatiots
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.avaa.tupa.db.model.Infra_Vastuuorganisaatiot> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<fi.csc.avaa.tupa.db.model.Infra_Vastuuorganisaatiot> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<fi.csc.avaa.tupa.db.model.Infra_Vastuuorganisaatiot> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the infra_ vastuuorganisaatiots from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of infra_ vastuuorganisaatiots.
    *
    * @return the number of infra_ vastuuorganisaatiots
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
