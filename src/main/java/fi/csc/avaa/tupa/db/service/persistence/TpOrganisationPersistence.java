package fi.csc.avaa.tupa.db.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import fi.csc.avaa.tupa.db.model.TpOrganisation;

/**
 * The persistence interface for the tp organisation service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CSC
 * @see TpOrganisationPersistenceImpl
 * @see TpOrganisationUtil
 * @generated
 */
public interface TpOrganisationPersistence extends BasePersistence<TpOrganisation> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link TpOrganisationUtil} to access the tp organisation persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the tp organisation in the entity cache if it is enabled.
    *
    * @param tpOrganisation the tp organisation
    */
    public void cacheResult(
        fi.csc.avaa.tupa.db.model.TpOrganisation tpOrganisation);

    /**
    * Caches the tp organisations in the entity cache if it is enabled.
    *
    * @param tpOrganisations the tp organisations
    */
    public void cacheResult(
        java.util.List<fi.csc.avaa.tupa.db.model.TpOrganisation> tpOrganisations);

    /**
    * Creates a new tp organisation with the primary key. Does not add the tp organisation to the database.
    *
    * @param id the primary key for the new tp organisation
    * @return the new tp organisation
    */
    public fi.csc.avaa.tupa.db.model.TpOrganisation create(int id);

    /**
    * Removes the tp organisation with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the tp organisation
    * @return the tp organisation that was removed
    * @throws fi.csc.avaa.tupa.db.NoSuchTpOrganisationException if a tp organisation with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.tupa.db.model.TpOrganisation remove(int id)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.tupa.db.NoSuchTpOrganisationException;

    public fi.csc.avaa.tupa.db.model.TpOrganisation updateImpl(
        fi.csc.avaa.tupa.db.model.TpOrganisation tpOrganisation)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the tp organisation with the primary key or throws a {@link fi.csc.avaa.tupa.db.NoSuchTpOrganisationException} if it could not be found.
    *
    * @param id the primary key of the tp organisation
    * @return the tp organisation
    * @throws fi.csc.avaa.tupa.db.NoSuchTpOrganisationException if a tp organisation with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.tupa.db.model.TpOrganisation findByPrimaryKey(int id)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.tupa.db.NoSuchTpOrganisationException;

    /**
    * Returns the tp organisation with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param id the primary key of the tp organisation
    * @return the tp organisation, or <code>null</code> if a tp organisation with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.tupa.db.model.TpOrganisation fetchByPrimaryKey(int id)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the tp organisations.
    *
    * @return the tp organisations
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.avaa.tupa.db.model.TpOrganisation> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the tp organisations.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.TpOrganisationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of tp organisations
    * @param end the upper bound of the range of tp organisations (not inclusive)
    * @return the range of tp organisations
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.avaa.tupa.db.model.TpOrganisation> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the tp organisations.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.TpOrganisationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of tp organisations
    * @param end the upper bound of the range of tp organisations (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of tp organisations
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.avaa.tupa.db.model.TpOrganisation> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the tp organisations from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of tp organisations.
    *
    * @return the number of tp organisations
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
