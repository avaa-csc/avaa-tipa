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
 * @author pj,jmlehtin
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
