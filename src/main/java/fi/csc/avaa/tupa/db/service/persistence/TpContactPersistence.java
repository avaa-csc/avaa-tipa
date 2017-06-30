package fi.csc.avaa.tupa.db.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import fi.csc.avaa.tupa.db.model.TpContact;

/**
 * The persistence interface for the tp contact service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CSC
 * @see TpContactPersistenceImpl
 * @see TpContactUtil
 * @generated
 */
public interface TpContactPersistence extends BasePersistence<TpContact> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link TpContactUtil} to access the tp contact persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the tp contact in the entity cache if it is enabled.
    *
    * @param tpContact the tp contact
    */
    public void cacheResult(fi.csc.avaa.tupa.db.model.TpContact tpContact);

    /**
    * Caches the tp contacts in the entity cache if it is enabled.
    *
    * @param tpContacts the tp contacts
    */
    public void cacheResult(
        java.util.List<fi.csc.avaa.tupa.db.model.TpContact> tpContacts);

    /**
    * Creates a new tp contact with the primary key. Does not add the tp contact to the database.
    *
    * @param id the primary key for the new tp contact
    * @return the new tp contact
    */
    public fi.csc.avaa.tupa.db.model.TpContact create(int id);

    /**
    * Removes the tp contact with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the tp contact
    * @return the tp contact that was removed
    * @throws fi.csc.avaa.tupa.db.NoSuchTpContactException if a tp contact with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.tupa.db.model.TpContact remove(int id)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.tupa.db.NoSuchTpContactException;

    public fi.csc.avaa.tupa.db.model.TpContact updateImpl(
        fi.csc.avaa.tupa.db.model.TpContact tpContact)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the tp contact with the primary key or throws a {@link fi.csc.avaa.tupa.db.NoSuchTpContactException} if it could not be found.
    *
    * @param id the primary key of the tp contact
    * @return the tp contact
    * @throws fi.csc.avaa.tupa.db.NoSuchTpContactException if a tp contact with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.tupa.db.model.TpContact findByPrimaryKey(int id)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.tupa.db.NoSuchTpContactException;

    /**
    * Returns the tp contact with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param id the primary key of the tp contact
    * @return the tp contact, or <code>null</code> if a tp contact with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.tupa.db.model.TpContact fetchByPrimaryKey(int id)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the tp contacts.
    *
    * @return the tp contacts
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.avaa.tupa.db.model.TpContact> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the tp contacts.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.TpContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of tp contacts
    * @param end the upper bound of the range of tp contacts (not inclusive)
    * @return the range of tp contacts
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.avaa.tupa.db.model.TpContact> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the tp contacts.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.TpContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of tp contacts
    * @param end the upper bound of the range of tp contacts (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of tp contacts
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.avaa.tupa.db.model.TpContact> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the tp contacts from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of tp contacts.
    *
    * @return the number of tp contacts
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
