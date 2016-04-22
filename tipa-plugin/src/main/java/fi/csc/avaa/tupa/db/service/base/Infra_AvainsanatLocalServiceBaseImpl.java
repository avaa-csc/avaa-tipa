package fi.csc.avaa.tupa.db.service.base;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.service.BaseLocalServiceImpl;
import com.liferay.portal.service.PersistedModelLocalServiceRegistryUtil;
import com.liferay.portal.service.persistence.UserPersistence;

import fi.csc.avaa.tupa.db.model.Infra_Avainsanat;
import fi.csc.avaa.tupa.db.service.Infra_AvainsanatLocalService;
import fi.csc.avaa.tupa.db.service.persistence.AvainsanaPersistence;
import fi.csc.avaa.tupa.db.service.persistence.InfraPersistence;
import fi.csc.avaa.tupa.db.service.persistence.Infra_AvainsanatPK;
import fi.csc.avaa.tupa.db.service.persistence.Infra_AvainsanatPersistence;
import fi.csc.avaa.tupa.db.service.persistence.Infra_PalvelutPersistence;
import fi.csc.avaa.tupa.db.service.persistence.Infra_VastuuorganisaatiotPersistence;
import fi.csc.avaa.tupa.db.service.persistence.Infra_YhteystiedotPersistence;
import fi.csc.avaa.tupa.db.service.persistence.KayttoehtoPersistence;
import fi.csc.avaa.tupa.db.service.persistence.OrganisaatioPersistence;
import fi.csc.avaa.tupa.db.service.persistence.PalveluPersistence;
import fi.csc.avaa.tupa.db.service.persistence.Palvelu_PalvelutyypitPersistence;
import fi.csc.avaa.tupa.db.service.persistence.PalvelutyyppiPersistence;
import fi.csc.avaa.tupa.db.service.persistence.SelitePersistence;
import fi.csc.avaa.tupa.db.service.persistence.YhteystietoPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the infra_ avainsanat local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link fi.csc.avaa.tupa.db.service.impl.Infra_AvainsanatLocalServiceImpl}.
 * </p>
 *
 * @author pj,jmlehtin
 * @see fi.csc.avaa.tupa.db.service.impl.Infra_AvainsanatLocalServiceImpl
 * @see fi.csc.avaa.tupa.db.service.Infra_AvainsanatLocalServiceUtil
 * @generated
 */
public abstract class Infra_AvainsanatLocalServiceBaseImpl
    extends BaseLocalServiceImpl implements Infra_AvainsanatLocalService,
        IdentifiableBean {
    @BeanReference(type = fi.csc.avaa.tupa.db.service.AvainsanaLocalService.class)
    protected fi.csc.avaa.tupa.db.service.AvainsanaLocalService avainsanaLocalService;
    @BeanReference(type = AvainsanaPersistence.class)
    protected AvainsanaPersistence avainsanaPersistence;
    @BeanReference(type = fi.csc.avaa.tupa.db.service.InfraLocalService.class)
    protected fi.csc.avaa.tupa.db.service.InfraLocalService infraLocalService;
    @BeanReference(type = InfraPersistence.class)
    protected InfraPersistence infraPersistence;
    @BeanReference(type = fi.csc.avaa.tupa.db.service.Infra_AvainsanatLocalService.class)
    protected fi.csc.avaa.tupa.db.service.Infra_AvainsanatLocalService infra_AvainsanatLocalService;
    @BeanReference(type = Infra_AvainsanatPersistence.class)
    protected Infra_AvainsanatPersistence infra_AvainsanatPersistence;
    @BeanReference(type = fi.csc.avaa.tupa.db.service.Infra_PalvelutLocalService.class)
    protected fi.csc.avaa.tupa.db.service.Infra_PalvelutLocalService infra_PalvelutLocalService;
    @BeanReference(type = Infra_PalvelutPersistence.class)
    protected Infra_PalvelutPersistence infra_PalvelutPersistence;
    @BeanReference(type = fi.csc.avaa.tupa.db.service.Infra_VastuuorganisaatiotLocalService.class)
    protected fi.csc.avaa.tupa.db.service.Infra_VastuuorganisaatiotLocalService infra_VastuuorganisaatiotLocalService;
    @BeanReference(type = Infra_VastuuorganisaatiotPersistence.class)
    protected Infra_VastuuorganisaatiotPersistence infra_VastuuorganisaatiotPersistence;
    @BeanReference(type = fi.csc.avaa.tupa.db.service.Infra_YhteystiedotLocalService.class)
    protected fi.csc.avaa.tupa.db.service.Infra_YhteystiedotLocalService infra_YhteystiedotLocalService;
    @BeanReference(type = Infra_YhteystiedotPersistence.class)
    protected Infra_YhteystiedotPersistence infra_YhteystiedotPersistence;
    @BeanReference(type = fi.csc.avaa.tupa.db.service.KayttoehtoLocalService.class)
    protected fi.csc.avaa.tupa.db.service.KayttoehtoLocalService kayttoehtoLocalService;
    @BeanReference(type = KayttoehtoPersistence.class)
    protected KayttoehtoPersistence kayttoehtoPersistence;
    @BeanReference(type = fi.csc.avaa.tupa.db.service.OrganisaatioLocalService.class)
    protected fi.csc.avaa.tupa.db.service.OrganisaatioLocalService organisaatioLocalService;
    @BeanReference(type = OrganisaatioPersistence.class)
    protected OrganisaatioPersistence organisaatioPersistence;
    @BeanReference(type = fi.csc.avaa.tupa.db.service.PalveluLocalService.class)
    protected fi.csc.avaa.tupa.db.service.PalveluLocalService palveluLocalService;
    @BeanReference(type = PalveluPersistence.class)
    protected PalveluPersistence palveluPersistence;
    @BeanReference(type = fi.csc.avaa.tupa.db.service.Palvelu_PalvelutyypitLocalService.class)
    protected fi.csc.avaa.tupa.db.service.Palvelu_PalvelutyypitLocalService palvelu_PalvelutyypitLocalService;
    @BeanReference(type = Palvelu_PalvelutyypitPersistence.class)
    protected Palvelu_PalvelutyypitPersistence palvelu_PalvelutyypitPersistence;
    @BeanReference(type = fi.csc.avaa.tupa.db.service.PalvelutyyppiLocalService.class)
    protected fi.csc.avaa.tupa.db.service.PalvelutyyppiLocalService palvelutyyppiLocalService;
    @BeanReference(type = PalvelutyyppiPersistence.class)
    protected PalvelutyyppiPersistence palvelutyyppiPersistence;
    @BeanReference(type = fi.csc.avaa.tupa.db.service.SeliteLocalService.class)
    protected fi.csc.avaa.tupa.db.service.SeliteLocalService seliteLocalService;
    @BeanReference(type = SelitePersistence.class)
    protected SelitePersistence selitePersistence;
    @BeanReference(type = fi.csc.avaa.tupa.db.service.YhteystietoLocalService.class)
    protected fi.csc.avaa.tupa.db.service.YhteystietoLocalService yhteystietoLocalService;
    @BeanReference(type = YhteystietoPersistence.class)
    protected YhteystietoPersistence yhteystietoPersistence;
    @BeanReference(type = com.liferay.counter.service.CounterLocalService.class)
    protected com.liferay.counter.service.CounterLocalService counterLocalService;
    @BeanReference(type = com.liferay.portal.service.ResourceLocalService.class)
    protected com.liferay.portal.service.ResourceLocalService resourceLocalService;
    @BeanReference(type = com.liferay.portal.service.UserLocalService.class)
    protected com.liferay.portal.service.UserLocalService userLocalService;
    @BeanReference(type = com.liferay.portal.service.UserService.class)
    protected com.liferay.portal.service.UserService userService;
    @BeanReference(type = UserPersistence.class)
    protected UserPersistence userPersistence;
    private String _beanIdentifier;
    private ClassLoader _classLoader;
    private Infra_AvainsanatLocalServiceClpInvoker _clpInvoker = new Infra_AvainsanatLocalServiceClpInvoker();

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link fi.csc.avaa.tupa.db.service.Infra_AvainsanatLocalServiceUtil} to access the infra_ avainsanat local service.
     */

    /**
     * Adds the infra_ avainsanat to the database. Also notifies the appropriate model listeners.
     *
     * @param infra_Avainsanat the infra_ avainsanat
     * @return the infra_ avainsanat that was added
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.REINDEX)
    @Override
    public Infra_Avainsanat addInfra_Avainsanat(
        Infra_Avainsanat infra_Avainsanat) throws SystemException {
        infra_Avainsanat.setNew(true);

        return infra_AvainsanatPersistence.update(infra_Avainsanat);
    }

    /**
     * Creates a new infra_ avainsanat with the primary key. Does not add the infra_ avainsanat to the database.
     *
     * @param infra_AvainsanatPK the primary key for the new infra_ avainsanat
     * @return the new infra_ avainsanat
     */
    @Override
    public Infra_Avainsanat createInfra_Avainsanat(
        Infra_AvainsanatPK infra_AvainsanatPK) {
        return infra_AvainsanatPersistence.create(infra_AvainsanatPK);
    }

    /**
     * Deletes the infra_ avainsanat with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param infra_AvainsanatPK the primary key of the infra_ avainsanat
     * @return the infra_ avainsanat that was removed
     * @throws PortalException if a infra_ avainsanat with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.DELETE)
    @Override
    public Infra_Avainsanat deleteInfra_Avainsanat(
        Infra_AvainsanatPK infra_AvainsanatPK)
        throws PortalException, SystemException {
        return infra_AvainsanatPersistence.remove(infra_AvainsanatPK);
    }

    /**
     * Deletes the infra_ avainsanat from the database. Also notifies the appropriate model listeners.
     *
     * @param infra_Avainsanat the infra_ avainsanat
     * @return the infra_ avainsanat that was removed
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.DELETE)
    @Override
    public Infra_Avainsanat deleteInfra_Avainsanat(
        Infra_Avainsanat infra_Avainsanat) throws SystemException {
        return infra_AvainsanatPersistence.remove(infra_Avainsanat);
    }

    @Override
    public DynamicQuery dynamicQuery() {
        Class<?> clazz = getClass();

        return DynamicQueryFactoryUtil.forClass(Infra_Avainsanat.class,
            clazz.getClassLoader());
    }

    /**
     * Performs a dynamic query on the database and returns the matching rows.
     *
     * @param dynamicQuery the dynamic query
     * @return the matching rows
     * @throws SystemException if a system exception occurred
     */
    @Override
    @SuppressWarnings("rawtypes")
    public List dynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return infra_AvainsanatPersistence.findWithDynamicQuery(dynamicQuery);
    }

    /**
     * Performs a dynamic query on the database and returns a range of the matching rows.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.Infra_AvainsanatModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param dynamicQuery the dynamic query
     * @param start the lower bound of the range of model instances
     * @param end the upper bound of the range of model instances (not inclusive)
     * @return the range of matching rows
     * @throws SystemException if a system exception occurred
     */
    @Override
    @SuppressWarnings("rawtypes")
    public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return infra_AvainsanatPersistence.findWithDynamicQuery(dynamicQuery,
            start, end);
    }

    /**
     * Performs a dynamic query on the database and returns an ordered range of the matching rows.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.Infra_AvainsanatModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param dynamicQuery the dynamic query
     * @param start the lower bound of the range of model instances
     * @param end the upper bound of the range of model instances (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching rows
     * @throws SystemException if a system exception occurred
     */
    @Override
    @SuppressWarnings("rawtypes")
    public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return infra_AvainsanatPersistence.findWithDynamicQuery(dynamicQuery,
            start, end, orderByComparator);
    }

    /**
     * Returns the number of rows that match the dynamic query.
     *
     * @param dynamicQuery the dynamic query
     * @return the number of rows that match the dynamic query
     * @throws SystemException if a system exception occurred
     */
    @Override
    public long dynamicQueryCount(DynamicQuery dynamicQuery)
        throws SystemException {
        return infra_AvainsanatPersistence.countWithDynamicQuery(dynamicQuery);
    }

    /**
     * Returns the number of rows that match the dynamic query.
     *
     * @param dynamicQuery the dynamic query
     * @param projection the projection to apply to the query
     * @return the number of rows that match the dynamic query
     * @throws SystemException if a system exception occurred
     */
    @Override
    public long dynamicQueryCount(DynamicQuery dynamicQuery,
        Projection projection) throws SystemException {
        return infra_AvainsanatPersistence.countWithDynamicQuery(dynamicQuery,
            projection);
    }

    @Override
    public Infra_Avainsanat fetchInfra_Avainsanat(
        Infra_AvainsanatPK infra_AvainsanatPK) throws SystemException {
        return infra_AvainsanatPersistence.fetchByPrimaryKey(infra_AvainsanatPK);
    }

    /**
     * Returns the infra_ avainsanat with the primary key.
     *
     * @param infra_AvainsanatPK the primary key of the infra_ avainsanat
     * @return the infra_ avainsanat
     * @throws PortalException if a infra_ avainsanat with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Infra_Avainsanat getInfra_Avainsanat(
        Infra_AvainsanatPK infra_AvainsanatPK)
        throws PortalException, SystemException {
        return infra_AvainsanatPersistence.findByPrimaryKey(infra_AvainsanatPK);
    }

    @Override
    public PersistedModel getPersistedModel(Serializable primaryKeyObj)
        throws PortalException, SystemException {
        return infra_AvainsanatPersistence.findByPrimaryKey(primaryKeyObj);
    }

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
    @Override
    public List<Infra_Avainsanat> getInfra_Avainsanats(int start, int end)
        throws SystemException {
        return infra_AvainsanatPersistence.findAll(start, end);
    }

    /**
     * Returns the number of infra_ avainsanats.
     *
     * @return the number of infra_ avainsanats
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int getInfra_AvainsanatsCount() throws SystemException {
        return infra_AvainsanatPersistence.countAll();
    }

    /**
     * Updates the infra_ avainsanat in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
     *
     * @param infra_Avainsanat the infra_ avainsanat
     * @return the infra_ avainsanat that was updated
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.REINDEX)
    @Override
    public Infra_Avainsanat updateInfra_Avainsanat(
        Infra_Avainsanat infra_Avainsanat) throws SystemException {
        return infra_AvainsanatPersistence.update(infra_Avainsanat);
    }

    /**
     * Returns the avainsana local service.
     *
     * @return the avainsana local service
     */
    public fi.csc.avaa.tupa.db.service.AvainsanaLocalService getAvainsanaLocalService() {
        return avainsanaLocalService;
    }

    /**
     * Sets the avainsana local service.
     *
     * @param avainsanaLocalService the avainsana local service
     */
    public void setAvainsanaLocalService(
        fi.csc.avaa.tupa.db.service.AvainsanaLocalService avainsanaLocalService) {
        this.avainsanaLocalService = avainsanaLocalService;
    }

    /**
     * Returns the avainsana persistence.
     *
     * @return the avainsana persistence
     */
    public AvainsanaPersistence getAvainsanaPersistence() {
        return avainsanaPersistence;
    }

    /**
     * Sets the avainsana persistence.
     *
     * @param avainsanaPersistence the avainsana persistence
     */
    public void setAvainsanaPersistence(
        AvainsanaPersistence avainsanaPersistence) {
        this.avainsanaPersistence = avainsanaPersistence;
    }

    /**
     * Returns the infra local service.
     *
     * @return the infra local service
     */
    public fi.csc.avaa.tupa.db.service.InfraLocalService getInfraLocalService() {
        return infraLocalService;
    }

    /**
     * Sets the infra local service.
     *
     * @param infraLocalService the infra local service
     */
    public void setInfraLocalService(
        fi.csc.avaa.tupa.db.service.InfraLocalService infraLocalService) {
        this.infraLocalService = infraLocalService;
    }

    /**
     * Returns the infra persistence.
     *
     * @return the infra persistence
     */
    public InfraPersistence getInfraPersistence() {
        return infraPersistence;
    }

    /**
     * Sets the infra persistence.
     *
     * @param infraPersistence the infra persistence
     */
    public void setInfraPersistence(InfraPersistence infraPersistence) {
        this.infraPersistence = infraPersistence;
    }

    /**
     * Returns the infra_ avainsanat local service.
     *
     * @return the infra_ avainsanat local service
     */
    public fi.csc.avaa.tupa.db.service.Infra_AvainsanatLocalService getInfra_AvainsanatLocalService() {
        return infra_AvainsanatLocalService;
    }

    /**
     * Sets the infra_ avainsanat local service.
     *
     * @param infra_AvainsanatLocalService the infra_ avainsanat local service
     */
    public void setInfra_AvainsanatLocalService(
        fi.csc.avaa.tupa.db.service.Infra_AvainsanatLocalService infra_AvainsanatLocalService) {
        this.infra_AvainsanatLocalService = infra_AvainsanatLocalService;
    }

    /**
     * Returns the infra_ avainsanat persistence.
     *
     * @return the infra_ avainsanat persistence
     */
    public Infra_AvainsanatPersistence getInfra_AvainsanatPersistence() {
        return infra_AvainsanatPersistence;
    }

    /**
     * Sets the infra_ avainsanat persistence.
     *
     * @param infra_AvainsanatPersistence the infra_ avainsanat persistence
     */
    public void setInfra_AvainsanatPersistence(
        Infra_AvainsanatPersistence infra_AvainsanatPersistence) {
        this.infra_AvainsanatPersistence = infra_AvainsanatPersistence;
    }

    /**
     * Returns the infra_ palvelut local service.
     *
     * @return the infra_ palvelut local service
     */
    public fi.csc.avaa.tupa.db.service.Infra_PalvelutLocalService getInfra_PalvelutLocalService() {
        return infra_PalvelutLocalService;
    }

    /**
     * Sets the infra_ palvelut local service.
     *
     * @param infra_PalvelutLocalService the infra_ palvelut local service
     */
    public void setInfra_PalvelutLocalService(
        fi.csc.avaa.tupa.db.service.Infra_PalvelutLocalService infra_PalvelutLocalService) {
        this.infra_PalvelutLocalService = infra_PalvelutLocalService;
    }

    /**
     * Returns the infra_ palvelut persistence.
     *
     * @return the infra_ palvelut persistence
     */
    public Infra_PalvelutPersistence getInfra_PalvelutPersistence() {
        return infra_PalvelutPersistence;
    }

    /**
     * Sets the infra_ palvelut persistence.
     *
     * @param infra_PalvelutPersistence the infra_ palvelut persistence
     */
    public void setInfra_PalvelutPersistence(
        Infra_PalvelutPersistence infra_PalvelutPersistence) {
        this.infra_PalvelutPersistence = infra_PalvelutPersistence;
    }

    /**
     * Returns the infra_ vastuuorganisaatiot local service.
     *
     * @return the infra_ vastuuorganisaatiot local service
     */
    public fi.csc.avaa.tupa.db.service.Infra_VastuuorganisaatiotLocalService getInfra_VastuuorganisaatiotLocalService() {
        return infra_VastuuorganisaatiotLocalService;
    }

    /**
     * Sets the infra_ vastuuorganisaatiot local service.
     *
     * @param infra_VastuuorganisaatiotLocalService the infra_ vastuuorganisaatiot local service
     */
    public void setInfra_VastuuorganisaatiotLocalService(
        fi.csc.avaa.tupa.db.service.Infra_VastuuorganisaatiotLocalService infra_VastuuorganisaatiotLocalService) {
        this.infra_VastuuorganisaatiotLocalService = infra_VastuuorganisaatiotLocalService;
    }

    /**
     * Returns the infra_ vastuuorganisaatiot persistence.
     *
     * @return the infra_ vastuuorganisaatiot persistence
     */
    public Infra_VastuuorganisaatiotPersistence getInfra_VastuuorganisaatiotPersistence() {
        return infra_VastuuorganisaatiotPersistence;
    }

    /**
     * Sets the infra_ vastuuorganisaatiot persistence.
     *
     * @param infra_VastuuorganisaatiotPersistence the infra_ vastuuorganisaatiot persistence
     */
    public void setInfra_VastuuorganisaatiotPersistence(
        Infra_VastuuorganisaatiotPersistence infra_VastuuorganisaatiotPersistence) {
        this.infra_VastuuorganisaatiotPersistence = infra_VastuuorganisaatiotPersistence;
    }

    /**
     * Returns the infra_ yhteystiedot local service.
     *
     * @return the infra_ yhteystiedot local service
     */
    public fi.csc.avaa.tupa.db.service.Infra_YhteystiedotLocalService getInfra_YhteystiedotLocalService() {
        return infra_YhteystiedotLocalService;
    }

    /**
     * Sets the infra_ yhteystiedot local service.
     *
     * @param infra_YhteystiedotLocalService the infra_ yhteystiedot local service
     */
    public void setInfra_YhteystiedotLocalService(
        fi.csc.avaa.tupa.db.service.Infra_YhteystiedotLocalService infra_YhteystiedotLocalService) {
        this.infra_YhteystiedotLocalService = infra_YhteystiedotLocalService;
    }

    /**
     * Returns the infra_ yhteystiedot persistence.
     *
     * @return the infra_ yhteystiedot persistence
     */
    public Infra_YhteystiedotPersistence getInfra_YhteystiedotPersistence() {
        return infra_YhteystiedotPersistence;
    }

    /**
     * Sets the infra_ yhteystiedot persistence.
     *
     * @param infra_YhteystiedotPersistence the infra_ yhteystiedot persistence
     */
    public void setInfra_YhteystiedotPersistence(
        Infra_YhteystiedotPersistence infra_YhteystiedotPersistence) {
        this.infra_YhteystiedotPersistence = infra_YhteystiedotPersistence;
    }

    /**
     * Returns the kayttoehto local service.
     *
     * @return the kayttoehto local service
     */
    public fi.csc.avaa.tupa.db.service.KayttoehtoLocalService getKayttoehtoLocalService() {
        return kayttoehtoLocalService;
    }

    /**
     * Sets the kayttoehto local service.
     *
     * @param kayttoehtoLocalService the kayttoehto local service
     */
    public void setKayttoehtoLocalService(
        fi.csc.avaa.tupa.db.service.KayttoehtoLocalService kayttoehtoLocalService) {
        this.kayttoehtoLocalService = kayttoehtoLocalService;
    }

    /**
     * Returns the kayttoehto persistence.
     *
     * @return the kayttoehto persistence
     */
    public KayttoehtoPersistence getKayttoehtoPersistence() {
        return kayttoehtoPersistence;
    }

    /**
     * Sets the kayttoehto persistence.
     *
     * @param kayttoehtoPersistence the kayttoehto persistence
     */
    public void setKayttoehtoPersistence(
        KayttoehtoPersistence kayttoehtoPersistence) {
        this.kayttoehtoPersistence = kayttoehtoPersistence;
    }

    /**
     * Returns the organisaatio local service.
     *
     * @return the organisaatio local service
     */
    public fi.csc.avaa.tupa.db.service.OrganisaatioLocalService getOrganisaatioLocalService() {
        return organisaatioLocalService;
    }

    /**
     * Sets the organisaatio local service.
     *
     * @param organisaatioLocalService the organisaatio local service
     */
    public void setOrganisaatioLocalService(
        fi.csc.avaa.tupa.db.service.OrganisaatioLocalService organisaatioLocalService) {
        this.organisaatioLocalService = organisaatioLocalService;
    }

    /**
     * Returns the organisaatio persistence.
     *
     * @return the organisaatio persistence
     */
    public OrganisaatioPersistence getOrganisaatioPersistence() {
        return organisaatioPersistence;
    }

    /**
     * Sets the organisaatio persistence.
     *
     * @param organisaatioPersistence the organisaatio persistence
     */
    public void setOrganisaatioPersistence(
        OrganisaatioPersistence organisaatioPersistence) {
        this.organisaatioPersistence = organisaatioPersistence;
    }

    /**
     * Returns the palvelu local service.
     *
     * @return the palvelu local service
     */
    public fi.csc.avaa.tupa.db.service.PalveluLocalService getPalveluLocalService() {
        return palveluLocalService;
    }

    /**
     * Sets the palvelu local service.
     *
     * @param palveluLocalService the palvelu local service
     */
    public void setPalveluLocalService(
        fi.csc.avaa.tupa.db.service.PalveluLocalService palveluLocalService) {
        this.palveluLocalService = palveluLocalService;
    }

    /**
     * Returns the palvelu persistence.
     *
     * @return the palvelu persistence
     */
    public PalveluPersistence getPalveluPersistence() {
        return palveluPersistence;
    }

    /**
     * Sets the palvelu persistence.
     *
     * @param palveluPersistence the palvelu persistence
     */
    public void setPalveluPersistence(PalveluPersistence palveluPersistence) {
        this.palveluPersistence = palveluPersistence;
    }

    /**
     * Returns the palvelu_ palvelutyypit local service.
     *
     * @return the palvelu_ palvelutyypit local service
     */
    public fi.csc.avaa.tupa.db.service.Palvelu_PalvelutyypitLocalService getPalvelu_PalvelutyypitLocalService() {
        return palvelu_PalvelutyypitLocalService;
    }

    /**
     * Sets the palvelu_ palvelutyypit local service.
     *
     * @param palvelu_PalvelutyypitLocalService the palvelu_ palvelutyypit local service
     */
    public void setPalvelu_PalvelutyypitLocalService(
        fi.csc.avaa.tupa.db.service.Palvelu_PalvelutyypitLocalService palvelu_PalvelutyypitLocalService) {
        this.palvelu_PalvelutyypitLocalService = palvelu_PalvelutyypitLocalService;
    }

    /**
     * Returns the palvelu_ palvelutyypit persistence.
     *
     * @return the palvelu_ palvelutyypit persistence
     */
    public Palvelu_PalvelutyypitPersistence getPalvelu_PalvelutyypitPersistence() {
        return palvelu_PalvelutyypitPersistence;
    }

    /**
     * Sets the palvelu_ palvelutyypit persistence.
     *
     * @param palvelu_PalvelutyypitPersistence the palvelu_ palvelutyypit persistence
     */
    public void setPalvelu_PalvelutyypitPersistence(
        Palvelu_PalvelutyypitPersistence palvelu_PalvelutyypitPersistence) {
        this.palvelu_PalvelutyypitPersistence = palvelu_PalvelutyypitPersistence;
    }

    /**
     * Returns the palvelutyyppi local service.
     *
     * @return the palvelutyyppi local service
     */
    public fi.csc.avaa.tupa.db.service.PalvelutyyppiLocalService getPalvelutyyppiLocalService() {
        return palvelutyyppiLocalService;
    }

    /**
     * Sets the palvelutyyppi local service.
     *
     * @param palvelutyyppiLocalService the palvelutyyppi local service
     */
    public void setPalvelutyyppiLocalService(
        fi.csc.avaa.tupa.db.service.PalvelutyyppiLocalService palvelutyyppiLocalService) {
        this.palvelutyyppiLocalService = palvelutyyppiLocalService;
    }

    /**
     * Returns the palvelutyyppi persistence.
     *
     * @return the palvelutyyppi persistence
     */
    public PalvelutyyppiPersistence getPalvelutyyppiPersistence() {
        return palvelutyyppiPersistence;
    }

    /**
     * Sets the palvelutyyppi persistence.
     *
     * @param palvelutyyppiPersistence the palvelutyyppi persistence
     */
    public void setPalvelutyyppiPersistence(
        PalvelutyyppiPersistence palvelutyyppiPersistence) {
        this.palvelutyyppiPersistence = palvelutyyppiPersistence;
    }

    /**
     * Returns the selite local service.
     *
     * @return the selite local service
     */
    public fi.csc.avaa.tupa.db.service.SeliteLocalService getSeliteLocalService() {
        return seliteLocalService;
    }

    /**
     * Sets the selite local service.
     *
     * @param seliteLocalService the selite local service
     */
    public void setSeliteLocalService(
        fi.csc.avaa.tupa.db.service.SeliteLocalService seliteLocalService) {
        this.seliteLocalService = seliteLocalService;
    }

    /**
     * Returns the selite persistence.
     *
     * @return the selite persistence
     */
    public SelitePersistence getSelitePersistence() {
        return selitePersistence;
    }

    /**
     * Sets the selite persistence.
     *
     * @param selitePersistence the selite persistence
     */
    public void setSelitePersistence(SelitePersistence selitePersistence) {
        this.selitePersistence = selitePersistence;
    }

    /**
     * Returns the yhteystieto local service.
     *
     * @return the yhteystieto local service
     */
    public fi.csc.avaa.tupa.db.service.YhteystietoLocalService getYhteystietoLocalService() {
        return yhteystietoLocalService;
    }

    /**
     * Sets the yhteystieto local service.
     *
     * @param yhteystietoLocalService the yhteystieto local service
     */
    public void setYhteystietoLocalService(
        fi.csc.avaa.tupa.db.service.YhteystietoLocalService yhteystietoLocalService) {
        this.yhteystietoLocalService = yhteystietoLocalService;
    }

    /**
     * Returns the yhteystieto persistence.
     *
     * @return the yhteystieto persistence
     */
    public YhteystietoPersistence getYhteystietoPersistence() {
        return yhteystietoPersistence;
    }

    /**
     * Sets the yhteystieto persistence.
     *
     * @param yhteystietoPersistence the yhteystieto persistence
     */
    public void setYhteystietoPersistence(
        YhteystietoPersistence yhteystietoPersistence) {
        this.yhteystietoPersistence = yhteystietoPersistence;
    }

    /**
     * Returns the counter local service.
     *
     * @return the counter local service
     */
    public com.liferay.counter.service.CounterLocalService getCounterLocalService() {
        return counterLocalService;
    }

    /**
     * Sets the counter local service.
     *
     * @param counterLocalService the counter local service
     */
    public void setCounterLocalService(
        com.liferay.counter.service.CounterLocalService counterLocalService) {
        this.counterLocalService = counterLocalService;
    }

    /**
     * Returns the resource local service.
     *
     * @return the resource local service
     */
    public com.liferay.portal.service.ResourceLocalService getResourceLocalService() {
        return resourceLocalService;
    }

    /**
     * Sets the resource local service.
     *
     * @param resourceLocalService the resource local service
     */
    public void setResourceLocalService(
        com.liferay.portal.service.ResourceLocalService resourceLocalService) {
        this.resourceLocalService = resourceLocalService;
    }

    /**
     * Returns the user local service.
     *
     * @return the user local service
     */
    public com.liferay.portal.service.UserLocalService getUserLocalService() {
        return userLocalService;
    }

    /**
     * Sets the user local service.
     *
     * @param userLocalService the user local service
     */
    public void setUserLocalService(
        com.liferay.portal.service.UserLocalService userLocalService) {
        this.userLocalService = userLocalService;
    }

    /**
     * Returns the user remote service.
     *
     * @return the user remote service
     */
    public com.liferay.portal.service.UserService getUserService() {
        return userService;
    }

    /**
     * Sets the user remote service.
     *
     * @param userService the user remote service
     */
    public void setUserService(
        com.liferay.portal.service.UserService userService) {
        this.userService = userService;
    }

    /**
     * Returns the user persistence.
     *
     * @return the user persistence
     */
    public UserPersistence getUserPersistence() {
        return userPersistence;
    }

    /**
     * Sets the user persistence.
     *
     * @param userPersistence the user persistence
     */
    public void setUserPersistence(UserPersistence userPersistence) {
        this.userPersistence = userPersistence;
    }

    public void afterPropertiesSet() {
        Class<?> clazz = getClass();

        _classLoader = clazz.getClassLoader();

        PersistedModelLocalServiceRegistryUtil.register("fi.csc.avaa.tupa.db.model.Infra_Avainsanat",
            infra_AvainsanatLocalService);
    }

    public void destroy() {
        PersistedModelLocalServiceRegistryUtil.unregister(
            "fi.csc.avaa.tupa.db.model.Infra_Avainsanat");
    }

    /**
     * Returns the Spring bean ID for this bean.
     *
     * @return the Spring bean ID for this bean
     */
    @Override
    public String getBeanIdentifier() {
        return _beanIdentifier;
    }

    /**
     * Sets the Spring bean ID for this bean.
     *
     * @param beanIdentifier the Spring bean ID for this bean
     */
    @Override
    public void setBeanIdentifier(String beanIdentifier) {
        _beanIdentifier = beanIdentifier;
    }

    @Override
    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        Thread currentThread = Thread.currentThread();

        ClassLoader contextClassLoader = currentThread.getContextClassLoader();

        if (contextClassLoader != _classLoader) {
            currentThread.setContextClassLoader(_classLoader);
        }

        try {
            return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
        } finally {
            if (contextClassLoader != _classLoader) {
                currentThread.setContextClassLoader(contextClassLoader);
            }
        }
    }

    protected Class<?> getModelClass() {
        return Infra_Avainsanat.class;
    }

    protected String getModelClassName() {
        return Infra_Avainsanat.class.getName();
    }

    /**
     * Performs an SQL query.
     *
     * @param sql the sql query
     */
    protected void runSQL(String sql) throws SystemException {
        try {
            DataSource dataSource = infra_AvainsanatPersistence.getDataSource();

            SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
                    sql, new int[0]);

            sqlUpdate.update();
        } catch (Exception e) {
            throw new SystemException(e);
        }
    }
}
