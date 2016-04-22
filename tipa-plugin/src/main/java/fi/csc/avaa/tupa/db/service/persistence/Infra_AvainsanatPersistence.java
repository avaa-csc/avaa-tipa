package fi.csc.avaa.tupa.db.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import fi.csc.avaa.tupa.db.model.Infra_Avainsanat;

/**
 * The persistence interface for the infra_ avainsanat service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author pj,jmlehtin
 * @see Infra_AvainsanatPersistenceImpl
 * @see Infra_AvainsanatUtil
 * @generated
 */
public interface Infra_AvainsanatPersistence extends BasePersistence<Infra_Avainsanat> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link Infra_AvainsanatUtil} to access the infra_ avainsanat persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the infra_ avainsanat in the entity cache if it is enabled.
    *
    * @param infra_Avainsanat the infra_ avainsanat
    */
    public void cacheResult(
        fi.csc.avaa.tupa.db.model.Infra_Avainsanat infra_Avainsanat);

    /**
    * Caches the infra_ avainsanats in the entity cache if it is enabled.
    *
    * @param infra_Avainsanats the infra_ avainsanats
    */
    public void cacheResult(
        java.util.List<fi.csc.avaa.tupa.db.model.Infra_Avainsanat> infra_Avainsanats);

    /**
    * Creates a new infra_ avainsanat with the primary key. Does not add the infra_ avainsanat to the database.
    *
    * @param infra_AvainsanatPK the primary key for the new infra_ avainsanat
    * @return the new infra_ avainsanat
    */
    public fi.csc.avaa.tupa.db.model.Infra_Avainsanat create(
        fi.csc.avaa.tupa.db.service.persistence.Infra_AvainsanatPK infra_AvainsanatPK);

    /**
    * Removes the infra_ avainsanat with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param infra_AvainsanatPK the primary key of the infra_ avainsanat
    * @return the infra_ avainsanat that was removed
    * @throws fi.csc.avaa.tupa.db.NoSuchInfra_AvainsanatException if a infra_ avainsanat with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.tupa.db.model.Infra_Avainsanat remove(
        fi.csc.avaa.tupa.db.service.persistence.Infra_AvainsanatPK infra_AvainsanatPK)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.tupa.db.NoSuchInfra_AvainsanatException;

    public fi.csc.avaa.tupa.db.model.Infra_Avainsanat updateImpl(
        fi.csc.avaa.tupa.db.model.Infra_Avainsanat infra_Avainsanat)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the infra_ avainsanat with the primary key or throws a {@link fi.csc.avaa.tupa.db.NoSuchInfra_AvainsanatException} if it could not be found.
    *
    * @param infra_AvainsanatPK the primary key of the infra_ avainsanat
    * @return the infra_ avainsanat
    * @throws fi.csc.avaa.tupa.db.NoSuchInfra_AvainsanatException if a infra_ avainsanat with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.tupa.db.model.Infra_Avainsanat findByPrimaryKey(
        fi.csc.avaa.tupa.db.service.persistence.Infra_AvainsanatPK infra_AvainsanatPK)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.tupa.db.NoSuchInfra_AvainsanatException;

    /**
    * Returns the infra_ avainsanat with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param infra_AvainsanatPK the primary key of the infra_ avainsanat
    * @return the infra_ avainsanat, or <code>null</code> if a infra_ avainsanat with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.tupa.db.model.Infra_Avainsanat fetchByPrimaryKey(
        fi.csc.avaa.tupa.db.service.persistence.Infra_AvainsanatPK infra_AvainsanatPK)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the infra_ avainsanats.
    *
    * @return the infra_ avainsanats
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.avaa.tupa.db.model.Infra_Avainsanat> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the infra_ avainsanats.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.Infra_AvainsanatModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of infra_ avainsanats
    * @param end the upper bound of the range of infra_ avainsanats (not inclusive)
    * @return the range of infra_ avainsanats
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.avaa.tupa.db.model.Infra_Avainsanat> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the infra_ avainsanats.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.Infra_AvainsanatModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of infra_ avainsanats
    * @param end the upper bound of the range of infra_ avainsanats (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of infra_ avainsanats
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.avaa.tupa.db.model.Infra_Avainsanat> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the infra_ avainsanats from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of infra_ avainsanats.
    *
    * @return the number of infra_ avainsanats
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
