package fi.csc.avaa.tupa.db.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import fi.csc.avaa.tupa.db.model.Palvelu_Palvelutyypit;

/**
 * The persistence interface for the palvelu_ palvelutyypit service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author pj,jmlehtin
 * @see Palvelu_PalvelutyypitPersistenceImpl
 * @see Palvelu_PalvelutyypitUtil
 * @generated
 */
public interface Palvelu_PalvelutyypitPersistence extends BasePersistence<Palvelu_Palvelutyypit> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link Palvelu_PalvelutyypitUtil} to access the palvelu_ palvelutyypit persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the palvelu_ palvelutyypit in the entity cache if it is enabled.
    *
    * @param palvelu_Palvelutyypit the palvelu_ palvelutyypit
    */
    public void cacheResult(
        fi.csc.avaa.tupa.db.model.Palvelu_Palvelutyypit palvelu_Palvelutyypit);

    /**
    * Caches the palvelu_ palvelutyypits in the entity cache if it is enabled.
    *
    * @param palvelu_Palvelutyypits the palvelu_ palvelutyypits
    */
    public void cacheResult(
        java.util.List<fi.csc.avaa.tupa.db.model.Palvelu_Palvelutyypit> palvelu_Palvelutyypits);

    /**
    * Creates a new palvelu_ palvelutyypit with the primary key. Does not add the palvelu_ palvelutyypit to the database.
    *
    * @param palvelu_PalvelutyypitPK the primary key for the new palvelu_ palvelutyypit
    * @return the new palvelu_ palvelutyypit
    */
    public fi.csc.avaa.tupa.db.model.Palvelu_Palvelutyypit create(
        fi.csc.avaa.tupa.db.service.persistence.Palvelu_PalvelutyypitPK palvelu_PalvelutyypitPK);

    /**
    * Removes the palvelu_ palvelutyypit with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param palvelu_PalvelutyypitPK the primary key of the palvelu_ palvelutyypit
    * @return the palvelu_ palvelutyypit that was removed
    * @throws fi.csc.avaa.tupa.db.NoSuchPalvelu_PalvelutyypitException if a palvelu_ palvelutyypit with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.tupa.db.model.Palvelu_Palvelutyypit remove(
        fi.csc.avaa.tupa.db.service.persistence.Palvelu_PalvelutyypitPK palvelu_PalvelutyypitPK)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.tupa.db.NoSuchPalvelu_PalvelutyypitException;

    public fi.csc.avaa.tupa.db.model.Palvelu_Palvelutyypit updateImpl(
        fi.csc.avaa.tupa.db.model.Palvelu_Palvelutyypit palvelu_Palvelutyypit)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the palvelu_ palvelutyypit with the primary key or throws a {@link fi.csc.avaa.tupa.db.NoSuchPalvelu_PalvelutyypitException} if it could not be found.
    *
    * @param palvelu_PalvelutyypitPK the primary key of the palvelu_ palvelutyypit
    * @return the palvelu_ palvelutyypit
    * @throws fi.csc.avaa.tupa.db.NoSuchPalvelu_PalvelutyypitException if a palvelu_ palvelutyypit with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.tupa.db.model.Palvelu_Palvelutyypit findByPrimaryKey(
        fi.csc.avaa.tupa.db.service.persistence.Palvelu_PalvelutyypitPK palvelu_PalvelutyypitPK)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.tupa.db.NoSuchPalvelu_PalvelutyypitException;

    /**
    * Returns the palvelu_ palvelutyypit with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param palvelu_PalvelutyypitPK the primary key of the palvelu_ palvelutyypit
    * @return the palvelu_ palvelutyypit, or <code>null</code> if a palvelu_ palvelutyypit with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.tupa.db.model.Palvelu_Palvelutyypit fetchByPrimaryKey(
        fi.csc.avaa.tupa.db.service.persistence.Palvelu_PalvelutyypitPK palvelu_PalvelutyypitPK)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the palvelu_ palvelutyypits.
    *
    * @return the palvelu_ palvelutyypits
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.avaa.tupa.db.model.Palvelu_Palvelutyypit> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the palvelu_ palvelutyypits.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.Palvelu_PalvelutyypitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of palvelu_ palvelutyypits
    * @param end the upper bound of the range of palvelu_ palvelutyypits (not inclusive)
    * @return the range of palvelu_ palvelutyypits
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.avaa.tupa.db.model.Palvelu_Palvelutyypit> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the palvelu_ palvelutyypits.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.Palvelu_PalvelutyypitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of palvelu_ palvelutyypits
    * @param end the upper bound of the range of palvelu_ palvelutyypits (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of palvelu_ palvelutyypits
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.avaa.tupa.db.model.Palvelu_Palvelutyypit> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the palvelu_ palvelutyypits from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of palvelu_ palvelutyypits.
    *
    * @return the number of palvelu_ palvelutyypits
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
