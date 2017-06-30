package fi.csc.avaa.tupa.db.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import fi.csc.avaa.tupa.db.model.Organisaatio;

/**
 * The persistence interface for the organisaatio service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CSC
 * @see OrganisaatioPersistenceImpl
 * @see OrganisaatioUtil
 * @generated
 */
public interface OrganisaatioPersistence extends BasePersistence<Organisaatio> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link OrganisaatioUtil} to access the organisaatio persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns all the organisaatios where ISNI = &#63;.
    *
    * @param ISNI the i s n i
    * @return the matching organisaatios
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.avaa.tupa.db.model.Organisaatio> findByisni(
        java.lang.String ISNI)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<fi.csc.avaa.tupa.db.model.Organisaatio> findByisni(
        java.lang.String ISNI, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<fi.csc.avaa.tupa.db.model.Organisaatio> findByisni(
        java.lang.String ISNI, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first organisaatio in the ordered set where ISNI = &#63;.
    *
    * @param ISNI the i s n i
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching organisaatio
    * @throws fi.csc.avaa.tupa.db.NoSuchOrganisaatioException if a matching organisaatio could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.tupa.db.model.Organisaatio findByisni_First(
        java.lang.String ISNI,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.tupa.db.NoSuchOrganisaatioException;

    /**
    * Returns the first organisaatio in the ordered set where ISNI = &#63;.
    *
    * @param ISNI the i s n i
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching organisaatio, or <code>null</code> if a matching organisaatio could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.tupa.db.model.Organisaatio fetchByisni_First(
        java.lang.String ISNI,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last organisaatio in the ordered set where ISNI = &#63;.
    *
    * @param ISNI the i s n i
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching organisaatio
    * @throws fi.csc.avaa.tupa.db.NoSuchOrganisaatioException if a matching organisaatio could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.tupa.db.model.Organisaatio findByisni_Last(
        java.lang.String ISNI,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.tupa.db.NoSuchOrganisaatioException;

    /**
    * Returns the last organisaatio in the ordered set where ISNI = &#63;.
    *
    * @param ISNI the i s n i
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching organisaatio, or <code>null</code> if a matching organisaatio could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.tupa.db.model.Organisaatio fetchByisni_Last(
        java.lang.String ISNI,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public fi.csc.avaa.tupa.db.model.Organisaatio[] findByisni_PrevAndNext(
        int organisaatio_id, java.lang.String ISNI,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.tupa.db.NoSuchOrganisaatioException;

    /**
    * Removes all the organisaatios where ISNI = &#63; from the database.
    *
    * @param ISNI the i s n i
    * @throws SystemException if a system exception occurred
    */
    public void removeByisni(java.lang.String ISNI)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of organisaatios where ISNI = &#63;.
    *
    * @param ISNI the i s n i
    * @return the number of matching organisaatios
    * @throws SystemException if a system exception occurred
    */
    public int countByisni(java.lang.String ISNI)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the organisaatios where maa = &#63;.
    *
    * @param maa the maa
    * @return the matching organisaatios
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.avaa.tupa.db.model.Organisaatio> findBycountry(
        java.lang.String maa)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<fi.csc.avaa.tupa.db.model.Organisaatio> findBycountry(
        java.lang.String maa, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<fi.csc.avaa.tupa.db.model.Organisaatio> findBycountry(
        java.lang.String maa, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first organisaatio in the ordered set where maa = &#63;.
    *
    * @param maa the maa
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching organisaatio
    * @throws fi.csc.avaa.tupa.db.NoSuchOrganisaatioException if a matching organisaatio could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.tupa.db.model.Organisaatio findBycountry_First(
        java.lang.String maa,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.tupa.db.NoSuchOrganisaatioException;

    /**
    * Returns the first organisaatio in the ordered set where maa = &#63;.
    *
    * @param maa the maa
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching organisaatio, or <code>null</code> if a matching organisaatio could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.tupa.db.model.Organisaatio fetchBycountry_First(
        java.lang.String maa,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last organisaatio in the ordered set where maa = &#63;.
    *
    * @param maa the maa
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching organisaatio
    * @throws fi.csc.avaa.tupa.db.NoSuchOrganisaatioException if a matching organisaatio could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.tupa.db.model.Organisaatio findBycountry_Last(
        java.lang.String maa,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.tupa.db.NoSuchOrganisaatioException;

    /**
    * Returns the last organisaatio in the ordered set where maa = &#63;.
    *
    * @param maa the maa
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching organisaatio, or <code>null</code> if a matching organisaatio could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.tupa.db.model.Organisaatio fetchBycountry_Last(
        java.lang.String maa,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public fi.csc.avaa.tupa.db.model.Organisaatio[] findBycountry_PrevAndNext(
        int organisaatio_id, java.lang.String maa,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.tupa.db.NoSuchOrganisaatioException;

    /**
    * Removes all the organisaatios where maa = &#63; from the database.
    *
    * @param maa the maa
    * @throws SystemException if a system exception occurred
    */
    public void removeBycountry(java.lang.String maa)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of organisaatios where maa = &#63;.
    *
    * @param maa the maa
    * @return the number of matching organisaatios
    * @throws SystemException if a system exception occurred
    */
    public int countBycountry(java.lang.String maa)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the organisaatio in the entity cache if it is enabled.
    *
    * @param organisaatio the organisaatio
    */
    public void cacheResult(fi.csc.avaa.tupa.db.model.Organisaatio organisaatio);

    /**
    * Caches the organisaatios in the entity cache if it is enabled.
    *
    * @param organisaatios the organisaatios
    */
    public void cacheResult(
        java.util.List<fi.csc.avaa.tupa.db.model.Organisaatio> organisaatios);

    /**
    * Creates a new organisaatio with the primary key. Does not add the organisaatio to the database.
    *
    * @param organisaatio_id the primary key for the new organisaatio
    * @return the new organisaatio
    */
    public fi.csc.avaa.tupa.db.model.Organisaatio create(int organisaatio_id);

    /**
    * Removes the organisaatio with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param organisaatio_id the primary key of the organisaatio
    * @return the organisaatio that was removed
    * @throws fi.csc.avaa.tupa.db.NoSuchOrganisaatioException if a organisaatio with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.tupa.db.model.Organisaatio remove(int organisaatio_id)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.tupa.db.NoSuchOrganisaatioException;

    public fi.csc.avaa.tupa.db.model.Organisaatio updateImpl(
        fi.csc.avaa.tupa.db.model.Organisaatio organisaatio)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the organisaatio with the primary key or throws a {@link fi.csc.avaa.tupa.db.NoSuchOrganisaatioException} if it could not be found.
    *
    * @param organisaatio_id the primary key of the organisaatio
    * @return the organisaatio
    * @throws fi.csc.avaa.tupa.db.NoSuchOrganisaatioException if a organisaatio with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.tupa.db.model.Organisaatio findByPrimaryKey(
        int organisaatio_id)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.tupa.db.NoSuchOrganisaatioException;

    /**
    * Returns the organisaatio with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param organisaatio_id the primary key of the organisaatio
    * @return the organisaatio, or <code>null</code> if a organisaatio with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.tupa.db.model.Organisaatio fetchByPrimaryKey(
        int organisaatio_id)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the organisaatios.
    *
    * @return the organisaatios
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.avaa.tupa.db.model.Organisaatio> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<fi.csc.avaa.tupa.db.model.Organisaatio> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<fi.csc.avaa.tupa.db.model.Organisaatio> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the organisaatios from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of organisaatios.
    *
    * @return the number of organisaatios
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
