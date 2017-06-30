package fi.csc.avaa.tupa.db.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import fi.csc.avaa.tupa.db.model.TpInfrastructure;

/**
 * The persistence interface for the tp infrastructure service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CSC
 * @see TpInfrastructurePersistenceImpl
 * @see TpInfrastructureUtil
 * @generated
 */
public interface TpInfrastructurePersistence extends BasePersistence<TpInfrastructure> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link TpInfrastructureUtil} to access the tp infrastructure persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the tp infrastructure in the entity cache if it is enabled.
    *
    * @param tpInfrastructure the tp infrastructure
    */
    public void cacheResult(
        fi.csc.avaa.tupa.db.model.TpInfrastructure tpInfrastructure);

    /**
    * Caches the tp infrastructures in the entity cache if it is enabled.
    *
    * @param tpInfrastructures the tp infrastructures
    */
    public void cacheResult(
        java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure> tpInfrastructures);

    /**
    * Creates a new tp infrastructure with the primary key. Does not add the tp infrastructure to the database.
    *
    * @param id the primary key for the new tp infrastructure
    * @return the new tp infrastructure
    */
    public fi.csc.avaa.tupa.db.model.TpInfrastructure create(int id);

    /**
    * Removes the tp infrastructure with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the tp infrastructure
    * @return the tp infrastructure that was removed
    * @throws fi.csc.avaa.tupa.db.NoSuchTpInfrastructureException if a tp infrastructure with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.tupa.db.model.TpInfrastructure remove(int id)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.tupa.db.NoSuchTpInfrastructureException;

    public fi.csc.avaa.tupa.db.model.TpInfrastructure updateImpl(
        fi.csc.avaa.tupa.db.model.TpInfrastructure tpInfrastructure)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the tp infrastructure with the primary key or throws a {@link fi.csc.avaa.tupa.db.NoSuchTpInfrastructureException} if it could not be found.
    *
    * @param id the primary key of the tp infrastructure
    * @return the tp infrastructure
    * @throws fi.csc.avaa.tupa.db.NoSuchTpInfrastructureException if a tp infrastructure with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.tupa.db.model.TpInfrastructure findByPrimaryKey(int id)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.tupa.db.NoSuchTpInfrastructureException;

    /**
    * Returns the tp infrastructure with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param id the primary key of the tp infrastructure
    * @return the tp infrastructure, or <code>null</code> if a tp infrastructure with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.tupa.db.model.TpInfrastructure fetchByPrimaryKey(int id)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the tp infrastructures.
    *
    * @return the tp infrastructures
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the tp infrastructures.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.TpInfrastructureModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of tp infrastructures
    * @param end the upper bound of the range of tp infrastructures (not inclusive)
    * @return the range of tp infrastructures
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the tp infrastructures.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.TpInfrastructureModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of tp infrastructures
    * @param end the upper bound of the range of tp infrastructures (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of tp infrastructures
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the tp infrastructures from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of tp infrastructures.
    *
    * @return the number of tp infrastructures
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
