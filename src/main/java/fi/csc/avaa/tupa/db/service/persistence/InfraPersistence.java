package fi.csc.avaa.tupa.db.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import fi.csc.avaa.tupa.db.model.Infra;

/**
 * The persistence interface for the infra service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CSC
 * @see InfraPersistenceImpl
 * @see InfraUtil
 * @generated
 */
public interface InfraPersistence extends BasePersistence<Infra> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link InfraUtil} to access the infra persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns all the infras where edellinen_infra = &#63;.
    *
    * @param edellinen_infra the edellinen_infra
    * @return the matching infras
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.avaa.tupa.db.model.Infra> findBypreviousId(
        int edellinen_infra)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the infras where edellinen_infra = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.InfraModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param edellinen_infra the edellinen_infra
    * @param start the lower bound of the range of infras
    * @param end the upper bound of the range of infras (not inclusive)
    * @return the range of matching infras
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.avaa.tupa.db.model.Infra> findBypreviousId(
        int edellinen_infra, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the infras where edellinen_infra = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.InfraModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param edellinen_infra the edellinen_infra
    * @param start the lower bound of the range of infras
    * @param end the upper bound of the range of infras (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching infras
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.avaa.tupa.db.model.Infra> findBypreviousId(
        int edellinen_infra, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first infra in the ordered set where edellinen_infra = &#63;.
    *
    * @param edellinen_infra the edellinen_infra
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching infra
    * @throws fi.csc.avaa.tupa.db.NoSuchInfraException if a matching infra could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.tupa.db.model.Infra findBypreviousId_First(
        int edellinen_infra,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.tupa.db.NoSuchInfraException;

    /**
    * Returns the first infra in the ordered set where edellinen_infra = &#63;.
    *
    * @param edellinen_infra the edellinen_infra
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching infra, or <code>null</code> if a matching infra could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.tupa.db.model.Infra fetchBypreviousId_First(
        int edellinen_infra,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last infra in the ordered set where edellinen_infra = &#63;.
    *
    * @param edellinen_infra the edellinen_infra
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching infra
    * @throws fi.csc.avaa.tupa.db.NoSuchInfraException if a matching infra could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.tupa.db.model.Infra findBypreviousId_Last(
        int edellinen_infra,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.tupa.db.NoSuchInfraException;

    /**
    * Returns the last infra in the ordered set where edellinen_infra = &#63;.
    *
    * @param edellinen_infra the edellinen_infra
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching infra, or <code>null</code> if a matching infra could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.tupa.db.model.Infra fetchBypreviousId_Last(
        int edellinen_infra,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the infras before and after the current infra in the ordered set where edellinen_infra = &#63;.
    *
    * @param infra_id the primary key of the current infra
    * @param edellinen_infra the edellinen_infra
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next infra
    * @throws fi.csc.avaa.tupa.db.NoSuchInfraException if a infra with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.tupa.db.model.Infra[] findBypreviousId_PrevAndNext(
        int infra_id, int edellinen_infra,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.tupa.db.NoSuchInfraException;

    /**
    * Removes all the infras where edellinen_infra = &#63; from the database.
    *
    * @param edellinen_infra the edellinen_infra
    * @throws SystemException if a system exception occurred
    */
    public void removeBypreviousId(int edellinen_infra)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of infras where edellinen_infra = &#63;.
    *
    * @param edellinen_infra the edellinen_infra
    * @return the number of matching infras
    * @throws SystemException if a system exception occurred
    */
    public int countBypreviousId(int edellinen_infra)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the infras where api_date = &#63;.
    *
    * @param api_date the api_date
    * @return the matching infras
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.avaa.tupa.db.model.Infra> findByapiDate(
        java.util.Date api_date)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the infras where api_date = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.InfraModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param api_date the api_date
    * @param start the lower bound of the range of infras
    * @param end the upper bound of the range of infras (not inclusive)
    * @return the range of matching infras
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.avaa.tupa.db.model.Infra> findByapiDate(
        java.util.Date api_date, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the infras where api_date = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.InfraModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param api_date the api_date
    * @param start the lower bound of the range of infras
    * @param end the upper bound of the range of infras (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching infras
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.avaa.tupa.db.model.Infra> findByapiDate(
        java.util.Date api_date, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first infra in the ordered set where api_date = &#63;.
    *
    * @param api_date the api_date
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching infra
    * @throws fi.csc.avaa.tupa.db.NoSuchInfraException if a matching infra could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.tupa.db.model.Infra findByapiDate_First(
        java.util.Date api_date,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.tupa.db.NoSuchInfraException;

    /**
    * Returns the first infra in the ordered set where api_date = &#63;.
    *
    * @param api_date the api_date
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching infra, or <code>null</code> if a matching infra could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.tupa.db.model.Infra fetchByapiDate_First(
        java.util.Date api_date,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last infra in the ordered set where api_date = &#63;.
    *
    * @param api_date the api_date
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching infra
    * @throws fi.csc.avaa.tupa.db.NoSuchInfraException if a matching infra could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.tupa.db.model.Infra findByapiDate_Last(
        java.util.Date api_date,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.tupa.db.NoSuchInfraException;

    /**
    * Returns the last infra in the ordered set where api_date = &#63;.
    *
    * @param api_date the api_date
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching infra, or <code>null</code> if a matching infra could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.tupa.db.model.Infra fetchByapiDate_Last(
        java.util.Date api_date,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the infras before and after the current infra in the ordered set where api_date = &#63;.
    *
    * @param infra_id the primary key of the current infra
    * @param api_date the api_date
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next infra
    * @throws fi.csc.avaa.tupa.db.NoSuchInfraException if a infra with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.tupa.db.model.Infra[] findByapiDate_PrevAndNext(
        int infra_id, java.util.Date api_date,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.tupa.db.NoSuchInfraException;

    /**
    * Removes all the infras where api_date = &#63; from the database.
    *
    * @param api_date the api_date
    * @throws SystemException if a system exception occurred
    */
    public void removeByapiDate(java.util.Date api_date)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of infras where api_date = &#63;.
    *
    * @param api_date the api_date
    * @return the number of matching infras
    * @throws SystemException if a system exception occurred
    */
    public int countByapiDate(java.util.Date api_date)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the infra in the entity cache if it is enabled.
    *
    * @param infra the infra
    */
    public void cacheResult(fi.csc.avaa.tupa.db.model.Infra infra);

    /**
    * Caches the infras in the entity cache if it is enabled.
    *
    * @param infras the infras
    */
    public void cacheResult(
        java.util.List<fi.csc.avaa.tupa.db.model.Infra> infras);

    /**
    * Creates a new infra with the primary key. Does not add the infra to the database.
    *
    * @param infra_id the primary key for the new infra
    * @return the new infra
    */
    public fi.csc.avaa.tupa.db.model.Infra create(int infra_id);

    /**
    * Removes the infra with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param infra_id the primary key of the infra
    * @return the infra that was removed
    * @throws fi.csc.avaa.tupa.db.NoSuchInfraException if a infra with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.tupa.db.model.Infra remove(int infra_id)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.tupa.db.NoSuchInfraException;

    public fi.csc.avaa.tupa.db.model.Infra updateImpl(
        fi.csc.avaa.tupa.db.model.Infra infra)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the infra with the primary key or throws a {@link fi.csc.avaa.tupa.db.NoSuchInfraException} if it could not be found.
    *
    * @param infra_id the primary key of the infra
    * @return the infra
    * @throws fi.csc.avaa.tupa.db.NoSuchInfraException if a infra with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.tupa.db.model.Infra findByPrimaryKey(int infra_id)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.tupa.db.NoSuchInfraException;

    /**
    * Returns the infra with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param infra_id the primary key of the infra
    * @return the infra, or <code>null</code> if a infra with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.tupa.db.model.Infra fetchByPrimaryKey(int infra_id)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the infras.
    *
    * @return the infras
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.avaa.tupa.db.model.Infra> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the infras.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.InfraModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of infras
    * @param end the upper bound of the range of infras (not inclusive)
    * @return the range of infras
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.avaa.tupa.db.model.Infra> findAll(int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the infras.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.InfraModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of infras
    * @param end the upper bound of the range of infras (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of infras
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.avaa.tupa.db.model.Infra> findAll(int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the infras from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of infras.
    *
    * @return the number of infras
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
