package fi.csc.avaa.tupa.db.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import fi.csc.avaa.tupa.db.model.TpServize;

/**
 * The persistence interface for the tp servize service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CSC
 * @see TpServizePersistenceImpl
 * @see TpServizeUtil
 * @generated
 */
public interface TpServizePersistence extends BasePersistence<TpServize> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link TpServizeUtil} to access the tp servize persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the tp servize in the entity cache if it is enabled.
    *
    * @param tpServize the tp servize
    */
    public void cacheResult(fi.csc.avaa.tupa.db.model.TpServize tpServize);

    /**
    * Caches the tp servizes in the entity cache if it is enabled.
    *
    * @param tpServizes the tp servizes
    */
    public void cacheResult(
        java.util.List<fi.csc.avaa.tupa.db.model.TpServize> tpServizes);

    /**
    * Creates a new tp servize with the primary key. Does not add the tp servize to the database.
    *
    * @param id the primary key for the new tp servize
    * @return the new tp servize
    */
    public fi.csc.avaa.tupa.db.model.TpServize create(int id);

    /**
    * Removes the tp servize with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the tp servize
    * @return the tp servize that was removed
    * @throws fi.csc.avaa.tupa.db.NoSuchTpServizeException if a tp servize with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.tupa.db.model.TpServize remove(int id)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.tupa.db.NoSuchTpServizeException;

    public fi.csc.avaa.tupa.db.model.TpServize updateImpl(
        fi.csc.avaa.tupa.db.model.TpServize tpServize)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the tp servize with the primary key or throws a {@link fi.csc.avaa.tupa.db.NoSuchTpServizeException} if it could not be found.
    *
    * @param id the primary key of the tp servize
    * @return the tp servize
    * @throws fi.csc.avaa.tupa.db.NoSuchTpServizeException if a tp servize with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.tupa.db.model.TpServize findByPrimaryKey(int id)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.tupa.db.NoSuchTpServizeException;

    /**
    * Returns the tp servize with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param id the primary key of the tp servize
    * @return the tp servize, or <code>null</code> if a tp servize with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.tupa.db.model.TpServize fetchByPrimaryKey(int id)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the tp servizes.
    *
    * @return the tp servizes
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.avaa.tupa.db.model.TpServize> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the tp servizes.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.TpServizeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of tp servizes
    * @param end the upper bound of the range of tp servizes (not inclusive)
    * @return the range of tp servizes
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.avaa.tupa.db.model.TpServize> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the tp servizes.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.TpServizeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of tp servizes
    * @param end the upper bound of the range of tp servizes (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of tp servizes
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.avaa.tupa.db.model.TpServize> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the tp servizes from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of tp servizes.
    *
    * @return the number of tp servizes
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
