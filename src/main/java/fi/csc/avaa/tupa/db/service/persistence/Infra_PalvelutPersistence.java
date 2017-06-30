package fi.csc.avaa.tupa.db.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import fi.csc.avaa.tupa.db.model.Infra_Palvelut;

/**
 * The persistence interface for the infra_ palvelut service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CSC
 * @see Infra_PalvelutPersistenceImpl
 * @see Infra_PalvelutUtil
 * @generated
 */
public interface Infra_PalvelutPersistence extends BasePersistence<Infra_Palvelut> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link Infra_PalvelutUtil} to access the infra_ palvelut persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the infra_ palvelut in the entity cache if it is enabled.
    *
    * @param infra_Palvelut the infra_ palvelut
    */
    public void cacheResult(
        fi.csc.avaa.tupa.db.model.Infra_Palvelut infra_Palvelut);

    /**
    * Caches the infra_ palveluts in the entity cache if it is enabled.
    *
    * @param infra_Palveluts the infra_ palveluts
    */
    public void cacheResult(
        java.util.List<fi.csc.avaa.tupa.db.model.Infra_Palvelut> infra_Palveluts);

    /**
    * Creates a new infra_ palvelut with the primary key. Does not add the infra_ palvelut to the database.
    *
    * @param infra_PalvelutPK the primary key for the new infra_ palvelut
    * @return the new infra_ palvelut
    */
    public fi.csc.avaa.tupa.db.model.Infra_Palvelut create(
        fi.csc.avaa.tupa.db.service.persistence.Infra_PalvelutPK infra_PalvelutPK);

    /**
    * Removes the infra_ palvelut with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param infra_PalvelutPK the primary key of the infra_ palvelut
    * @return the infra_ palvelut that was removed
    * @throws fi.csc.avaa.tupa.db.NoSuchInfra_PalvelutException if a infra_ palvelut with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.tupa.db.model.Infra_Palvelut remove(
        fi.csc.avaa.tupa.db.service.persistence.Infra_PalvelutPK infra_PalvelutPK)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.tupa.db.NoSuchInfra_PalvelutException;

    public fi.csc.avaa.tupa.db.model.Infra_Palvelut updateImpl(
        fi.csc.avaa.tupa.db.model.Infra_Palvelut infra_Palvelut)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the infra_ palvelut with the primary key or throws a {@link fi.csc.avaa.tupa.db.NoSuchInfra_PalvelutException} if it could not be found.
    *
    * @param infra_PalvelutPK the primary key of the infra_ palvelut
    * @return the infra_ palvelut
    * @throws fi.csc.avaa.tupa.db.NoSuchInfra_PalvelutException if a infra_ palvelut with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.tupa.db.model.Infra_Palvelut findByPrimaryKey(
        fi.csc.avaa.tupa.db.service.persistence.Infra_PalvelutPK infra_PalvelutPK)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.tupa.db.NoSuchInfra_PalvelutException;

    /**
    * Returns the infra_ palvelut with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param infra_PalvelutPK the primary key of the infra_ palvelut
    * @return the infra_ palvelut, or <code>null</code> if a infra_ palvelut with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.tupa.db.model.Infra_Palvelut fetchByPrimaryKey(
        fi.csc.avaa.tupa.db.service.persistence.Infra_PalvelutPK infra_PalvelutPK)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the infra_ palveluts.
    *
    * @return the infra_ palveluts
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.avaa.tupa.db.model.Infra_Palvelut> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the infra_ palveluts.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.Infra_PalvelutModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of infra_ palveluts
    * @param end the upper bound of the range of infra_ palveluts (not inclusive)
    * @return the range of infra_ palveluts
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.avaa.tupa.db.model.Infra_Palvelut> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the infra_ palveluts.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.Infra_PalvelutModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of infra_ palveluts
    * @param end the upper bound of the range of infra_ palveluts (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of infra_ palveluts
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.avaa.tupa.db.model.Infra_Palvelut> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the infra_ palveluts from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of infra_ palveluts.
    *
    * @return the number of infra_ palveluts
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
