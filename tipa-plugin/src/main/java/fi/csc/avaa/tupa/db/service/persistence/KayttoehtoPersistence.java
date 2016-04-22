package fi.csc.avaa.tupa.db.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import fi.csc.avaa.tupa.db.model.Kayttoehto;

/**
 * The persistence interface for the kayttoehto service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author pj,jmlehtin
 * @see KayttoehtoPersistenceImpl
 * @see KayttoehtoUtil
 * @generated
 */
public interface KayttoehtoPersistence extends BasePersistence<Kayttoehto> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link KayttoehtoUtil} to access the kayttoehto persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the kayttoehto in the entity cache if it is enabled.
    *
    * @param kayttoehto the kayttoehto
    */
    public void cacheResult(fi.csc.avaa.tupa.db.model.Kayttoehto kayttoehto);

    /**
    * Caches the kayttoehtos in the entity cache if it is enabled.
    *
    * @param kayttoehtos the kayttoehtos
    */
    public void cacheResult(
        java.util.List<fi.csc.avaa.tupa.db.model.Kayttoehto> kayttoehtos);

    /**
    * Creates a new kayttoehto with the primary key. Does not add the kayttoehto to the database.
    *
    * @param infra_id the primary key for the new kayttoehto
    * @return the new kayttoehto
    */
    public fi.csc.avaa.tupa.db.model.Kayttoehto create(int infra_id);

    /**
    * Removes the kayttoehto with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param infra_id the primary key of the kayttoehto
    * @return the kayttoehto that was removed
    * @throws fi.csc.avaa.tupa.db.NoSuchKayttoehtoException if a kayttoehto with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.tupa.db.model.Kayttoehto remove(int infra_id)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.tupa.db.NoSuchKayttoehtoException;

    public fi.csc.avaa.tupa.db.model.Kayttoehto updateImpl(
        fi.csc.avaa.tupa.db.model.Kayttoehto kayttoehto)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the kayttoehto with the primary key or throws a {@link fi.csc.avaa.tupa.db.NoSuchKayttoehtoException} if it could not be found.
    *
    * @param infra_id the primary key of the kayttoehto
    * @return the kayttoehto
    * @throws fi.csc.avaa.tupa.db.NoSuchKayttoehtoException if a kayttoehto with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.tupa.db.model.Kayttoehto findByPrimaryKey(int infra_id)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.tupa.db.NoSuchKayttoehtoException;

    /**
    * Returns the kayttoehto with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param infra_id the primary key of the kayttoehto
    * @return the kayttoehto, or <code>null</code> if a kayttoehto with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.tupa.db.model.Kayttoehto fetchByPrimaryKey(int infra_id)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the kayttoehtos.
    *
    * @return the kayttoehtos
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.avaa.tupa.db.model.Kayttoehto> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the kayttoehtos.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.KayttoehtoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of kayttoehtos
    * @param end the upper bound of the range of kayttoehtos (not inclusive)
    * @return the range of kayttoehtos
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.avaa.tupa.db.model.Kayttoehto> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the kayttoehtos.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.KayttoehtoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of kayttoehtos
    * @param end the upper bound of the range of kayttoehtos (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of kayttoehtos
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.avaa.tupa.db.model.Kayttoehto> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the kayttoehtos from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of kayttoehtos.
    *
    * @return the number of kayttoehtos
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
