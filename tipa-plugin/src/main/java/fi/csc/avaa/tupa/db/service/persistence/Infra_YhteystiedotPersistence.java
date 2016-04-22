package fi.csc.avaa.tupa.db.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import fi.csc.avaa.tupa.db.model.Infra_Yhteystiedot;

/**
 * The persistence interface for the infra_ yhteystiedot service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author pj,jmlehtin
 * @see Infra_YhteystiedotPersistenceImpl
 * @see Infra_YhteystiedotUtil
 * @generated
 */
public interface Infra_YhteystiedotPersistence extends BasePersistence<Infra_Yhteystiedot> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link Infra_YhteystiedotUtil} to access the infra_ yhteystiedot persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the infra_ yhteystiedot in the entity cache if it is enabled.
    *
    * @param infra_Yhteystiedot the infra_ yhteystiedot
    */
    public void cacheResult(
        fi.csc.avaa.tupa.db.model.Infra_Yhteystiedot infra_Yhteystiedot);

    /**
    * Caches the infra_ yhteystiedots in the entity cache if it is enabled.
    *
    * @param infra_Yhteystiedots the infra_ yhteystiedots
    */
    public void cacheResult(
        java.util.List<fi.csc.avaa.tupa.db.model.Infra_Yhteystiedot> infra_Yhteystiedots);

    /**
    * Creates a new infra_ yhteystiedot with the primary key. Does not add the infra_ yhteystiedot to the database.
    *
    * @param infra_YhteystiedotPK the primary key for the new infra_ yhteystiedot
    * @return the new infra_ yhteystiedot
    */
    public fi.csc.avaa.tupa.db.model.Infra_Yhteystiedot create(
        fi.csc.avaa.tupa.db.service.persistence.Infra_YhteystiedotPK infra_YhteystiedotPK);

    /**
    * Removes the infra_ yhteystiedot with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param infra_YhteystiedotPK the primary key of the infra_ yhteystiedot
    * @return the infra_ yhteystiedot that was removed
    * @throws fi.csc.avaa.tupa.db.NoSuchInfra_YhteystiedotException if a infra_ yhteystiedot with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.tupa.db.model.Infra_Yhteystiedot remove(
        fi.csc.avaa.tupa.db.service.persistence.Infra_YhteystiedotPK infra_YhteystiedotPK)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.tupa.db.NoSuchInfra_YhteystiedotException;

    public fi.csc.avaa.tupa.db.model.Infra_Yhteystiedot updateImpl(
        fi.csc.avaa.tupa.db.model.Infra_Yhteystiedot infra_Yhteystiedot)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the infra_ yhteystiedot with the primary key or throws a {@link fi.csc.avaa.tupa.db.NoSuchInfra_YhteystiedotException} if it could not be found.
    *
    * @param infra_YhteystiedotPK the primary key of the infra_ yhteystiedot
    * @return the infra_ yhteystiedot
    * @throws fi.csc.avaa.tupa.db.NoSuchInfra_YhteystiedotException if a infra_ yhteystiedot with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.tupa.db.model.Infra_Yhteystiedot findByPrimaryKey(
        fi.csc.avaa.tupa.db.service.persistence.Infra_YhteystiedotPK infra_YhteystiedotPK)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.tupa.db.NoSuchInfra_YhteystiedotException;

    /**
    * Returns the infra_ yhteystiedot with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param infra_YhteystiedotPK the primary key of the infra_ yhteystiedot
    * @return the infra_ yhteystiedot, or <code>null</code> if a infra_ yhteystiedot with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.tupa.db.model.Infra_Yhteystiedot fetchByPrimaryKey(
        fi.csc.avaa.tupa.db.service.persistence.Infra_YhteystiedotPK infra_YhteystiedotPK)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the infra_ yhteystiedots.
    *
    * @return the infra_ yhteystiedots
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.avaa.tupa.db.model.Infra_Yhteystiedot> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the infra_ yhteystiedots.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.Infra_YhteystiedotModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of infra_ yhteystiedots
    * @param end the upper bound of the range of infra_ yhteystiedots (not inclusive)
    * @return the range of infra_ yhteystiedots
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.avaa.tupa.db.model.Infra_Yhteystiedot> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the infra_ yhteystiedots.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.Infra_YhteystiedotModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of infra_ yhteystiedots
    * @param end the upper bound of the range of infra_ yhteystiedots (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of infra_ yhteystiedots
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.avaa.tupa.db.model.Infra_Yhteystiedot> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the infra_ yhteystiedots from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of infra_ yhteystiedots.
    *
    * @return the number of infra_ yhteystiedots
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
