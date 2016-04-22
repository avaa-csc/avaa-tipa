package fi.csc.avaa.tupa.db.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import fi.csc.avaa.tupa.db.model.Yhteystieto;

/**
 * The persistence interface for the yhteystieto service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author pj,jmlehtin
 * @see YhteystietoPersistenceImpl
 * @see YhteystietoUtil
 * @generated
 */
public interface YhteystietoPersistence extends BasePersistence<Yhteystieto> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link YhteystietoUtil} to access the yhteystieto persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the yhteystieto in the entity cache if it is enabled.
    *
    * @param yhteystieto the yhteystieto
    */
    public void cacheResult(fi.csc.avaa.tupa.db.model.Yhteystieto yhteystieto);

    /**
    * Caches the yhteystietos in the entity cache if it is enabled.
    *
    * @param yhteystietos the yhteystietos
    */
    public void cacheResult(
        java.util.List<fi.csc.avaa.tupa.db.model.Yhteystieto> yhteystietos);

    /**
    * Creates a new yhteystieto with the primary key. Does not add the yhteystieto to the database.
    *
    * @param yhteystieto_id the primary key for the new yhteystieto
    * @return the new yhteystieto
    */
    public fi.csc.avaa.tupa.db.model.Yhteystieto create(int yhteystieto_id);

    /**
    * Removes the yhteystieto with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param yhteystieto_id the primary key of the yhteystieto
    * @return the yhteystieto that was removed
    * @throws fi.csc.avaa.tupa.db.NoSuchYhteystietoException if a yhteystieto with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.tupa.db.model.Yhteystieto remove(int yhteystieto_id)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.tupa.db.NoSuchYhteystietoException;

    public fi.csc.avaa.tupa.db.model.Yhteystieto updateImpl(
        fi.csc.avaa.tupa.db.model.Yhteystieto yhteystieto)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the yhteystieto with the primary key or throws a {@link fi.csc.avaa.tupa.db.NoSuchYhteystietoException} if it could not be found.
    *
    * @param yhteystieto_id the primary key of the yhteystieto
    * @return the yhteystieto
    * @throws fi.csc.avaa.tupa.db.NoSuchYhteystietoException if a yhteystieto with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.tupa.db.model.Yhteystieto findByPrimaryKey(
        int yhteystieto_id)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.tupa.db.NoSuchYhteystietoException;

    /**
    * Returns the yhteystieto with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param yhteystieto_id the primary key of the yhteystieto
    * @return the yhteystieto, or <code>null</code> if a yhteystieto with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.tupa.db.model.Yhteystieto fetchByPrimaryKey(
        int yhteystieto_id)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the yhteystietos.
    *
    * @return the yhteystietos
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.avaa.tupa.db.model.Yhteystieto> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the yhteystietos.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.YhteystietoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of yhteystietos
    * @param end the upper bound of the range of yhteystietos (not inclusive)
    * @return the range of yhteystietos
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.avaa.tupa.db.model.Yhteystieto> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the yhteystietos.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.YhteystietoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of yhteystietos
    * @param end the upper bound of the range of yhteystietos (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of yhteystietos
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.avaa.tupa.db.model.Yhteystieto> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the yhteystietos from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of yhteystietos.
    *
    * @return the number of yhteystietos
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
