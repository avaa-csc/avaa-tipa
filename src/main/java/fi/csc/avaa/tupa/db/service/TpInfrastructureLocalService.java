package fi.csc.avaa.tupa.db.service;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.service.BaseLocalService;
import com.liferay.portal.service.InvokableLocalService;
import com.liferay.portal.service.PersistedModelLocalService;

import fi.csc.avaa.tupa.db.model.*;
import fi.csc.avaa.tupa.db.service.*;
import fi.csc.avaa.tupa.db.service.AvainsanaLocalServiceUtil.*;
import fi.csc.avaa.tupa.db.service.PalveluLocalServiceUtil.*;

/**
 * Provides the local service interface for TpInfrastructure. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author CSC
 * @see TpInfrastructureLocalServiceUtil
 * @see fi.csc.avaa.tupa.db.service.base.TpInfrastructureLocalServiceBaseImpl
 * @see fi.csc.avaa.tupa.db.service.impl.TpInfrastructureLocalServiceImpl
 * @generated
 */
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
    PortalException.class, SystemException.class}
)
public interface TpInfrastructureLocalService extends BaseLocalService,
    InvokableLocalService, PersistedModelLocalService {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link TpInfrastructureLocalServiceUtil} to access the tp infrastructure local service. Add custom service methods to {@link fi.csc.avaa.tupa.db.service.impl.TpInfrastructureLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
     */

    /**
    * Adds the tp infrastructure to the database. Also notifies the appropriate model listeners.
    *
    * @param tpInfrastructure the tp infrastructure
    * @return the tp infrastructure that was added
    * @throws SystemException if a system exception occurred
    */
    @com.liferay.portal.kernel.search.Indexable(type = IndexableType.REINDEX)
    public fi.csc.avaa.tupa.db.model.TpInfrastructure addTpInfrastructure(
        fi.csc.avaa.tupa.db.model.TpInfrastructure tpInfrastructure)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Creates a new tp infrastructure with the primary key. Does not add the tp infrastructure to the database.
    *
    * @param id the primary key for the new tp infrastructure
    * @return the new tp infrastructure
    */
    public fi.csc.avaa.tupa.db.model.TpInfrastructure createTpInfrastructure(
        int id);

    /**
    * Deletes the tp infrastructure with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the tp infrastructure
    * @return the tp infrastructure that was removed
    * @throws PortalException if a tp infrastructure with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @com.liferay.portal.kernel.search.Indexable(type = IndexableType.DELETE)
    public fi.csc.avaa.tupa.db.model.TpInfrastructure deleteTpInfrastructure(
        int id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Deletes the tp infrastructure from the database. Also notifies the appropriate model listeners.
    *
    * @param tpInfrastructure the tp infrastructure
    * @return the tp infrastructure that was removed
    * @throws SystemException if a system exception occurred
    */
    @com.liferay.portal.kernel.search.Indexable(type = IndexableType.DELETE)
    public fi.csc.avaa.tupa.db.model.TpInfrastructure deleteTpInfrastructure(
        fi.csc.avaa.tupa.db.model.TpInfrastructure tpInfrastructure)
        throws com.liferay.portal.kernel.exception.SystemException;

    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery();

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.TpInfrastructureModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @return the range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.TpInfrastructureModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException;

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public fi.csc.avaa.tupa.db.model.TpInfrastructure fetchTpInfrastructure(
        int id) throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the tp infrastructure with the primary key.
    *
    * @param id the primary key of the tp infrastructure
    * @return the tp infrastructure
    * @throws PortalException if a tp infrastructure with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public fi.csc.avaa.tupa.db.model.TpInfrastructure getTpInfrastructure(
        int id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    @Override
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the tp infrastructures.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.TpInfrastructureModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of tp infrastructures
    * @param end the upper bound of the range of tp infrastructures (not inclusive)
    * @return the range of tp infrastructures
    * @throws SystemException if a system exception occurred
    */
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure> getTpInfrastructures(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of tp infrastructures.
    *
    * @return the number of tp infrastructures
    * @throws SystemException if a system exception occurred
    */
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public int getTpInfrastructuresCount()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Updates the tp infrastructure in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param tpInfrastructure the tp infrastructure
    * @return the tp infrastructure that was updated
    * @throws SystemException if a system exception occurred
    */
    @com.liferay.portal.kernel.search.Indexable(type = IndexableType.REINDEX)
    public fi.csc.avaa.tupa.db.model.TpInfrastructure updateTpInfrastructure(
        fi.csc.avaa.tupa.db.model.TpInfrastructure tpInfrastructure)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public java.lang.String getBeanIdentifier();

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public void setBeanIdentifier(java.lang.String beanIdentifier);

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable;

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure> getAllInfrastructures();

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure> getInfrastructuresByInfrastructuresIds(
        int[] infrastructuresIds);

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure> getInfrastructuresByUrns(
        java.lang.String[] urns);

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure> getInfrastructuresByOrganisationIds(
        int[] organisationsIds);

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure> getInfrastructuresByServiceIds(
        int[] servicesIds);

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure> getInfrastructuresByContactIds(
        int[] contactIds);

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure> getInfrastructuresByKeywords(
        java.lang.String[] keywords);

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure> getInfrastructuresByServiceTypes(
        java.lang.String[] serviceTypes);

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure> getInfrastructuresByLocationTypes(
        java.lang.String[] locationTypes);

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure> getInfrastructuresByPostalCodes(
        int[] PostalCodes);

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure> getInfrastructuresByLocation(
        double latitude, double longitude);

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure> getInfrastructuresByCountries(
        java.lang.String[] countries);

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure> getInfrastructuresByPreviousIds(
        int[] previousIds);

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public java.lang.String[][] getKeywords();

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public java.lang.String[] getPids();

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure> getInfrastructuresByPids(
        java.lang.String[] PIDs);

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure> getInfrastructuresByPreviousUrns(
        java.lang.String[] previousUrns);

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public int[] getInfrastructuresIdsByUrns(java.lang.String[] urns);

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public com.liferay.portal.kernel.json.JSONObject getPidsJson(int infraId);
}
