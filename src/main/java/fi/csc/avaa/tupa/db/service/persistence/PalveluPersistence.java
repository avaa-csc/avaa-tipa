package fi.csc.avaa.tupa.db.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import fi.csc.avaa.tupa.db.model.Palvelu;

/**
 * The persistence interface for the palvelu service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CSC
 * @see PalveluPersistenceImpl
 * @see PalveluUtil
 * @generated
 */
public interface PalveluPersistence extends BasePersistence<Palvelu> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link PalveluUtil} to access the palvelu persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns all the palvelus where lat = &#63;.
    *
    * @param lat the lat
    * @return the matching palvelus
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.avaa.tupa.db.model.Palvelu> findBylocationLatitude(
        double lat) throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the palvelus where lat = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.PalveluModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param lat the lat
    * @param start the lower bound of the range of palvelus
    * @param end the upper bound of the range of palvelus (not inclusive)
    * @return the range of matching palvelus
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.avaa.tupa.db.model.Palvelu> findBylocationLatitude(
        double lat, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the palvelus where lat = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.PalveluModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param lat the lat
    * @param start the lower bound of the range of palvelus
    * @param end the upper bound of the range of palvelus (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching palvelus
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.avaa.tupa.db.model.Palvelu> findBylocationLatitude(
        double lat, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first palvelu in the ordered set where lat = &#63;.
    *
    * @param lat the lat
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching palvelu
    * @throws fi.csc.avaa.tupa.db.NoSuchPalveluException if a matching palvelu could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.tupa.db.model.Palvelu findBylocationLatitude_First(
        double lat,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.tupa.db.NoSuchPalveluException;

    /**
    * Returns the first palvelu in the ordered set where lat = &#63;.
    *
    * @param lat the lat
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching palvelu, or <code>null</code> if a matching palvelu could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.tupa.db.model.Palvelu fetchBylocationLatitude_First(
        double lat,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last palvelu in the ordered set where lat = &#63;.
    *
    * @param lat the lat
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching palvelu
    * @throws fi.csc.avaa.tupa.db.NoSuchPalveluException if a matching palvelu could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.tupa.db.model.Palvelu findBylocationLatitude_Last(
        double lat,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.tupa.db.NoSuchPalveluException;

    /**
    * Returns the last palvelu in the ordered set where lat = &#63;.
    *
    * @param lat the lat
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching palvelu, or <code>null</code> if a matching palvelu could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.tupa.db.model.Palvelu fetchBylocationLatitude_Last(
        double lat,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the palvelus before and after the current palvelu in the ordered set where lat = &#63;.
    *
    * @param palvelu_id the primary key of the current palvelu
    * @param lat the lat
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next palvelu
    * @throws fi.csc.avaa.tupa.db.NoSuchPalveluException if a palvelu with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.tupa.db.model.Palvelu[] findBylocationLatitude_PrevAndNext(
        int palvelu_id, double lat,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.tupa.db.NoSuchPalveluException;

    /**
    * Removes all the palvelus where lat = &#63; from the database.
    *
    * @param lat the lat
    * @throws SystemException if a system exception occurred
    */
    public void removeBylocationLatitude(double lat)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of palvelus where lat = &#63;.
    *
    * @param lat the lat
    * @return the number of matching palvelus
    * @throws SystemException if a system exception occurred
    */
    public int countBylocationLatitude(double lat)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the palvelus where lon = &#63;.
    *
    * @param lon the lon
    * @return the matching palvelus
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.avaa.tupa.db.model.Palvelu> findBylocationLongitude(
        double lon) throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the palvelus where lon = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.PalveluModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param lon the lon
    * @param start the lower bound of the range of palvelus
    * @param end the upper bound of the range of palvelus (not inclusive)
    * @return the range of matching palvelus
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.avaa.tupa.db.model.Palvelu> findBylocationLongitude(
        double lon, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the palvelus where lon = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.PalveluModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param lon the lon
    * @param start the lower bound of the range of palvelus
    * @param end the upper bound of the range of palvelus (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching palvelus
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.avaa.tupa.db.model.Palvelu> findBylocationLongitude(
        double lon, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first palvelu in the ordered set where lon = &#63;.
    *
    * @param lon the lon
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching palvelu
    * @throws fi.csc.avaa.tupa.db.NoSuchPalveluException if a matching palvelu could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.tupa.db.model.Palvelu findBylocationLongitude_First(
        double lon,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.tupa.db.NoSuchPalveluException;

    /**
    * Returns the first palvelu in the ordered set where lon = &#63;.
    *
    * @param lon the lon
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching palvelu, or <code>null</code> if a matching palvelu could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.tupa.db.model.Palvelu fetchBylocationLongitude_First(
        double lon,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last palvelu in the ordered set where lon = &#63;.
    *
    * @param lon the lon
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching palvelu
    * @throws fi.csc.avaa.tupa.db.NoSuchPalveluException if a matching palvelu could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.tupa.db.model.Palvelu findBylocationLongitude_Last(
        double lon,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.tupa.db.NoSuchPalveluException;

    /**
    * Returns the last palvelu in the ordered set where lon = &#63;.
    *
    * @param lon the lon
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching palvelu, or <code>null</code> if a matching palvelu could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.tupa.db.model.Palvelu fetchBylocationLongitude_Last(
        double lon,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the palvelus before and after the current palvelu in the ordered set where lon = &#63;.
    *
    * @param palvelu_id the primary key of the current palvelu
    * @param lon the lon
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next palvelu
    * @throws fi.csc.avaa.tupa.db.NoSuchPalveluException if a palvelu with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.tupa.db.model.Palvelu[] findBylocationLongitude_PrevAndNext(
        int palvelu_id, double lon,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.tupa.db.NoSuchPalveluException;

    /**
    * Removes all the palvelus where lon = &#63; from the database.
    *
    * @param lon the lon
    * @throws SystemException if a system exception occurred
    */
    public void removeBylocationLongitude(double lon)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of palvelus where lon = &#63;.
    *
    * @param lon the lon
    * @return the number of matching palvelus
    * @throws SystemException if a system exception occurred
    */
    public int countBylocationLongitude(double lon)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the palvelus where paikkatyyppi = &#63;.
    *
    * @param paikkatyyppi the paikkatyyppi
    * @return the matching palvelus
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.avaa.tupa.db.model.Palvelu> findBylocationTypeId(
        int paikkatyyppi)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the palvelus where paikkatyyppi = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.PalveluModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param paikkatyyppi the paikkatyyppi
    * @param start the lower bound of the range of palvelus
    * @param end the upper bound of the range of palvelus (not inclusive)
    * @return the range of matching palvelus
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.avaa.tupa.db.model.Palvelu> findBylocationTypeId(
        int paikkatyyppi, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the palvelus where paikkatyyppi = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.PalveluModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param paikkatyyppi the paikkatyyppi
    * @param start the lower bound of the range of palvelus
    * @param end the upper bound of the range of palvelus (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching palvelus
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.avaa.tupa.db.model.Palvelu> findBylocationTypeId(
        int paikkatyyppi, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first palvelu in the ordered set where paikkatyyppi = &#63;.
    *
    * @param paikkatyyppi the paikkatyyppi
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching palvelu
    * @throws fi.csc.avaa.tupa.db.NoSuchPalveluException if a matching palvelu could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.tupa.db.model.Palvelu findBylocationTypeId_First(
        int paikkatyyppi,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.tupa.db.NoSuchPalveluException;

    /**
    * Returns the first palvelu in the ordered set where paikkatyyppi = &#63;.
    *
    * @param paikkatyyppi the paikkatyyppi
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching palvelu, or <code>null</code> if a matching palvelu could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.tupa.db.model.Palvelu fetchBylocationTypeId_First(
        int paikkatyyppi,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last palvelu in the ordered set where paikkatyyppi = &#63;.
    *
    * @param paikkatyyppi the paikkatyyppi
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching palvelu
    * @throws fi.csc.avaa.tupa.db.NoSuchPalveluException if a matching palvelu could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.tupa.db.model.Palvelu findBylocationTypeId_Last(
        int paikkatyyppi,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.tupa.db.NoSuchPalveluException;

    /**
    * Returns the last palvelu in the ordered set where paikkatyyppi = &#63;.
    *
    * @param paikkatyyppi the paikkatyyppi
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching palvelu, or <code>null</code> if a matching palvelu could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.tupa.db.model.Palvelu fetchBylocationTypeId_Last(
        int paikkatyyppi,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the palvelus before and after the current palvelu in the ordered set where paikkatyyppi = &#63;.
    *
    * @param palvelu_id the primary key of the current palvelu
    * @param paikkatyyppi the paikkatyyppi
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next palvelu
    * @throws fi.csc.avaa.tupa.db.NoSuchPalveluException if a palvelu with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.tupa.db.model.Palvelu[] findBylocationTypeId_PrevAndNext(
        int palvelu_id, int paikkatyyppi,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.tupa.db.NoSuchPalveluException;

    /**
    * Removes all the palvelus where paikkatyyppi = &#63; from the database.
    *
    * @param paikkatyyppi the paikkatyyppi
    * @throws SystemException if a system exception occurred
    */
    public void removeBylocationTypeId(int paikkatyyppi)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of palvelus where paikkatyyppi = &#63;.
    *
    * @param paikkatyyppi the paikkatyyppi
    * @return the number of matching palvelus
    * @throws SystemException if a system exception occurred
    */
    public int countBylocationTypeId(int paikkatyyppi)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the palvelu in the entity cache if it is enabled.
    *
    * @param palvelu the palvelu
    */
    public void cacheResult(fi.csc.avaa.tupa.db.model.Palvelu palvelu);

    /**
    * Caches the palvelus in the entity cache if it is enabled.
    *
    * @param palvelus the palvelus
    */
    public void cacheResult(
        java.util.List<fi.csc.avaa.tupa.db.model.Palvelu> palvelus);

    /**
    * Creates a new palvelu with the primary key. Does not add the palvelu to the database.
    *
    * @param palvelu_id the primary key for the new palvelu
    * @return the new palvelu
    */
    public fi.csc.avaa.tupa.db.model.Palvelu create(int palvelu_id);

    /**
    * Removes the palvelu with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param palvelu_id the primary key of the palvelu
    * @return the palvelu that was removed
    * @throws fi.csc.avaa.tupa.db.NoSuchPalveluException if a palvelu with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.tupa.db.model.Palvelu remove(int palvelu_id)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.tupa.db.NoSuchPalveluException;

    public fi.csc.avaa.tupa.db.model.Palvelu updateImpl(
        fi.csc.avaa.tupa.db.model.Palvelu palvelu)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the palvelu with the primary key or throws a {@link fi.csc.avaa.tupa.db.NoSuchPalveluException} if it could not be found.
    *
    * @param palvelu_id the primary key of the palvelu
    * @return the palvelu
    * @throws fi.csc.avaa.tupa.db.NoSuchPalveluException if a palvelu with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.tupa.db.model.Palvelu findByPrimaryKey(int palvelu_id)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.tupa.db.NoSuchPalveluException;

    /**
    * Returns the palvelu with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param palvelu_id the primary key of the palvelu
    * @return the palvelu, or <code>null</code> if a palvelu with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.tupa.db.model.Palvelu fetchByPrimaryKey(int palvelu_id)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the palvelus.
    *
    * @return the palvelus
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.avaa.tupa.db.model.Palvelu> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the palvelus.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.PalveluModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of palvelus
    * @param end the upper bound of the range of palvelus (not inclusive)
    * @return the range of palvelus
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.avaa.tupa.db.model.Palvelu> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the palvelus.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.PalveluModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of palvelus
    * @param end the upper bound of the range of palvelus (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of palvelus
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.avaa.tupa.db.model.Palvelu> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the palvelus from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of palvelus.
    *
    * @return the number of palvelus
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
