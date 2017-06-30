package fi.csc.avaa.tupa.db.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import fi.csc.avaa.tupa.db.model.Palvelutyyppi;

/**
 * The persistence interface for the palvelutyyppi service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CSC
 * @see PalvelutyyppiPersistenceImpl
 * @see PalvelutyyppiUtil
 * @generated
 */
public interface PalvelutyyppiPersistence extends BasePersistence<Palvelutyyppi> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link PalvelutyyppiUtil} to access the palvelutyyppi persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns all the palvelutyyppis where tyyppi = &#63;.
    *
    * @param tyyppi the tyyppi
    * @return the matching palvelutyyppis
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.avaa.tupa.db.model.Palvelutyyppi> findBydefinitionId(
        int tyyppi) throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the palvelutyyppis where tyyppi = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.PalvelutyyppiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param tyyppi the tyyppi
    * @param start the lower bound of the range of palvelutyyppis
    * @param end the upper bound of the range of palvelutyyppis (not inclusive)
    * @return the range of matching palvelutyyppis
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.avaa.tupa.db.model.Palvelutyyppi> findBydefinitionId(
        int tyyppi, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the palvelutyyppis where tyyppi = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.PalvelutyyppiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param tyyppi the tyyppi
    * @param start the lower bound of the range of palvelutyyppis
    * @param end the upper bound of the range of palvelutyyppis (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching palvelutyyppis
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.avaa.tupa.db.model.Palvelutyyppi> findBydefinitionId(
        int tyyppi, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first palvelutyyppi in the ordered set where tyyppi = &#63;.
    *
    * @param tyyppi the tyyppi
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching palvelutyyppi
    * @throws fi.csc.avaa.tupa.db.NoSuchPalvelutyyppiException if a matching palvelutyyppi could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.tupa.db.model.Palvelutyyppi findBydefinitionId_First(
        int tyyppi,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.tupa.db.NoSuchPalvelutyyppiException;

    /**
    * Returns the first palvelutyyppi in the ordered set where tyyppi = &#63;.
    *
    * @param tyyppi the tyyppi
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching palvelutyyppi, or <code>null</code> if a matching palvelutyyppi could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.tupa.db.model.Palvelutyyppi fetchBydefinitionId_First(
        int tyyppi,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last palvelutyyppi in the ordered set where tyyppi = &#63;.
    *
    * @param tyyppi the tyyppi
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching palvelutyyppi
    * @throws fi.csc.avaa.tupa.db.NoSuchPalvelutyyppiException if a matching palvelutyyppi could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.tupa.db.model.Palvelutyyppi findBydefinitionId_Last(
        int tyyppi,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.tupa.db.NoSuchPalvelutyyppiException;

    /**
    * Returns the last palvelutyyppi in the ordered set where tyyppi = &#63;.
    *
    * @param tyyppi the tyyppi
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching palvelutyyppi, or <code>null</code> if a matching palvelutyyppi could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.tupa.db.model.Palvelutyyppi fetchBydefinitionId_Last(
        int tyyppi,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the palvelutyyppis before and after the current palvelutyyppi in the ordered set where tyyppi = &#63;.
    *
    * @param palvelutyyppi_id the primary key of the current palvelutyyppi
    * @param tyyppi the tyyppi
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next palvelutyyppi
    * @throws fi.csc.avaa.tupa.db.NoSuchPalvelutyyppiException if a palvelutyyppi with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.tupa.db.model.Palvelutyyppi[] findBydefinitionId_PrevAndNext(
        int palvelutyyppi_id, int tyyppi,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.tupa.db.NoSuchPalvelutyyppiException;

    /**
    * Removes all the palvelutyyppis where tyyppi = &#63; from the database.
    *
    * @param tyyppi the tyyppi
    * @throws SystemException if a system exception occurred
    */
    public void removeBydefinitionId(int tyyppi)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of palvelutyyppis where tyyppi = &#63;.
    *
    * @param tyyppi the tyyppi
    * @return the number of matching palvelutyyppis
    * @throws SystemException if a system exception occurred
    */
    public int countBydefinitionId(int tyyppi)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the palvelutyyppi in the entity cache if it is enabled.
    *
    * @param palvelutyyppi the palvelutyyppi
    */
    public void cacheResult(
        fi.csc.avaa.tupa.db.model.Palvelutyyppi palvelutyyppi);

    /**
    * Caches the palvelutyyppis in the entity cache if it is enabled.
    *
    * @param palvelutyyppis the palvelutyyppis
    */
    public void cacheResult(
        java.util.List<fi.csc.avaa.tupa.db.model.Palvelutyyppi> palvelutyyppis);

    /**
    * Creates a new palvelutyyppi with the primary key. Does not add the palvelutyyppi to the database.
    *
    * @param palvelutyyppi_id the primary key for the new palvelutyyppi
    * @return the new palvelutyyppi
    */
    public fi.csc.avaa.tupa.db.model.Palvelutyyppi create(int palvelutyyppi_id);

    /**
    * Removes the palvelutyyppi with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param palvelutyyppi_id the primary key of the palvelutyyppi
    * @return the palvelutyyppi that was removed
    * @throws fi.csc.avaa.tupa.db.NoSuchPalvelutyyppiException if a palvelutyyppi with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.tupa.db.model.Palvelutyyppi remove(int palvelutyyppi_id)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.tupa.db.NoSuchPalvelutyyppiException;

    public fi.csc.avaa.tupa.db.model.Palvelutyyppi updateImpl(
        fi.csc.avaa.tupa.db.model.Palvelutyyppi palvelutyyppi)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the palvelutyyppi with the primary key or throws a {@link fi.csc.avaa.tupa.db.NoSuchPalvelutyyppiException} if it could not be found.
    *
    * @param palvelutyyppi_id the primary key of the palvelutyyppi
    * @return the palvelutyyppi
    * @throws fi.csc.avaa.tupa.db.NoSuchPalvelutyyppiException if a palvelutyyppi with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.tupa.db.model.Palvelutyyppi findByPrimaryKey(
        int palvelutyyppi_id)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.tupa.db.NoSuchPalvelutyyppiException;

    /**
    * Returns the palvelutyyppi with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param palvelutyyppi_id the primary key of the palvelutyyppi
    * @return the palvelutyyppi, or <code>null</code> if a palvelutyyppi with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.tupa.db.model.Palvelutyyppi fetchByPrimaryKey(
        int palvelutyyppi_id)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the palvelutyyppis.
    *
    * @return the palvelutyyppis
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.avaa.tupa.db.model.Palvelutyyppi> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the palvelutyyppis.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.PalvelutyyppiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of palvelutyyppis
    * @param end the upper bound of the range of palvelutyyppis (not inclusive)
    * @return the range of palvelutyyppis
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.avaa.tupa.db.model.Palvelutyyppi> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the palvelutyyppis.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.PalvelutyyppiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of palvelutyyppis
    * @param end the upper bound of the range of palvelutyyppis (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of palvelutyyppis
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.avaa.tupa.db.model.Palvelutyyppi> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the palvelutyyppis from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of palvelutyyppis.
    *
    * @return the number of palvelutyyppis
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
