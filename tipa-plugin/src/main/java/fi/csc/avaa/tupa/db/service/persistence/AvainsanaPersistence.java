package fi.csc.avaa.tupa.db.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import fi.csc.avaa.tupa.db.model.Avainsana;

/**
 * The persistence interface for the avainsana service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author pj,jmlehtin
 * @see AvainsanaPersistenceImpl
 * @see AvainsanaUtil
 * @generated
 */
public interface AvainsanaPersistence extends BasePersistence<Avainsana> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link AvainsanaUtil} to access the avainsana persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the avainsana in the entity cache if it is enabled.
    *
    * @param avainsana the avainsana
    */
    public void cacheResult(fi.csc.avaa.tupa.db.model.Avainsana avainsana);

    /**
    * Caches the avainsanas in the entity cache if it is enabled.
    *
    * @param avainsanas the avainsanas
    */
    public void cacheResult(
        java.util.List<fi.csc.avaa.tupa.db.model.Avainsana> avainsanas);

    /**
    * Creates a new avainsana with the primary key. Does not add the avainsana to the database.
    *
    * @param avainsana_id the primary key for the new avainsana
    * @return the new avainsana
    */
    public fi.csc.avaa.tupa.db.model.Avainsana create(int avainsana_id);

    /**
    * Removes the avainsana with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param avainsana_id the primary key of the avainsana
    * @return the avainsana that was removed
    * @throws fi.csc.avaa.tupa.db.NoSuchAvainsanaException if a avainsana with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.tupa.db.model.Avainsana remove(int avainsana_id)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.tupa.db.NoSuchAvainsanaException;

    public fi.csc.avaa.tupa.db.model.Avainsana updateImpl(
        fi.csc.avaa.tupa.db.model.Avainsana avainsana)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the avainsana with the primary key or throws a {@link fi.csc.avaa.tupa.db.NoSuchAvainsanaException} if it could not be found.
    *
    * @param avainsana_id the primary key of the avainsana
    * @return the avainsana
    * @throws fi.csc.avaa.tupa.db.NoSuchAvainsanaException if a avainsana with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.tupa.db.model.Avainsana findByPrimaryKey(
        int avainsana_id)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.tupa.db.NoSuchAvainsanaException;

    /**
    * Returns the avainsana with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param avainsana_id the primary key of the avainsana
    * @return the avainsana, or <code>null</code> if a avainsana with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.tupa.db.model.Avainsana fetchByPrimaryKey(
        int avainsana_id)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the avainsanas.
    *
    * @return the avainsanas
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.avaa.tupa.db.model.Avainsana> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the avainsanas.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.AvainsanaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of avainsanas
    * @param end the upper bound of the range of avainsanas (not inclusive)
    * @return the range of avainsanas
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.avaa.tupa.db.model.Avainsana> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the avainsanas.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.AvainsanaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of avainsanas
    * @param end the upper bound of the range of avainsanas (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of avainsanas
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.avaa.tupa.db.model.Avainsana> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the avainsanas from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of avainsanas.
    *
    * @return the number of avainsanas
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
