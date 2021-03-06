package fi.csc.avaa.tupa.db.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import fi.csc.avaa.tupa.db.model.TpAPI;

/**
 * The persistence interface for the tp a p i service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CSC
 * @see TpAPIPersistenceImpl
 * @see TpAPIUtil
 * @generated
 */
public interface TpAPIPersistence extends BasePersistence<TpAPI> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link TpAPIUtil} to access the tp a p i persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the tp a p i in the entity cache if it is enabled.
    *
    * @param tpAPI the tp a p i
    */
    public void cacheResult(fi.csc.avaa.tupa.db.model.TpAPI tpAPI);

    /**
    * Caches the tp a p is in the entity cache if it is enabled.
    *
    * @param tpAPIs the tp a p is
    */
    public void cacheResult(
        java.util.List<fi.csc.avaa.tupa.db.model.TpAPI> tpAPIs);

    /**
    * Creates a new tp a p i with the primary key. Does not add the tp a p i to the database.
    *
    * @param methodsDescription the primary key for the new tp a p i
    * @return the new tp a p i
    */
    public fi.csc.avaa.tupa.db.model.TpAPI create(
        java.lang.String methodsDescription);

    /**
    * Removes the tp a p i with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param methodsDescription the primary key of the tp a p i
    * @return the tp a p i that was removed
    * @throws fi.csc.avaa.tupa.db.NoSuchTpAPIException if a tp a p i with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.tupa.db.model.TpAPI remove(
        java.lang.String methodsDescription)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.tupa.db.NoSuchTpAPIException;

    public fi.csc.avaa.tupa.db.model.TpAPI updateImpl(
        fi.csc.avaa.tupa.db.model.TpAPI tpAPI)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the tp a p i with the primary key or throws a {@link fi.csc.avaa.tupa.db.NoSuchTpAPIException} if it could not be found.
    *
    * @param methodsDescription the primary key of the tp a p i
    * @return the tp a p i
    * @throws fi.csc.avaa.tupa.db.NoSuchTpAPIException if a tp a p i with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.tupa.db.model.TpAPI findByPrimaryKey(
        java.lang.String methodsDescription)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.tupa.db.NoSuchTpAPIException;

    /**
    * Returns the tp a p i with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param methodsDescription the primary key of the tp a p i
    * @return the tp a p i, or <code>null</code> if a tp a p i with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.tupa.db.model.TpAPI fetchByPrimaryKey(
        java.lang.String methodsDescription)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the tp a p is.
    *
    * @return the tp a p is
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.avaa.tupa.db.model.TpAPI> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the tp a p is.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.TpAPIModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of tp a p is
    * @param end the upper bound of the range of tp a p is (not inclusive)
    * @return the range of tp a p is
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.avaa.tupa.db.model.TpAPI> findAll(int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the tp a p is.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.TpAPIModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of tp a p is
    * @param end the upper bound of the range of tp a p is (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of tp a p is
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.avaa.tupa.db.model.TpAPI> findAll(int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the tp a p is from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of tp a p is.
    *
    * @return the number of tp a p is
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
