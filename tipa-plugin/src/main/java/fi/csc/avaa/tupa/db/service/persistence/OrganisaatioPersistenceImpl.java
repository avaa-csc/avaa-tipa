package fi.csc.avaa.tupa.db.service.persistence;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import fi.csc.avaa.tupa.db.NoSuchOrganisaatioException;
import fi.csc.avaa.tupa.db.model.Organisaatio;
import fi.csc.avaa.tupa.db.model.impl.OrganisaatioImpl;
import fi.csc.avaa.tupa.db.model.impl.OrganisaatioModelImpl;
import fi.csc.avaa.tupa.db.service.persistence.OrganisaatioPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the organisaatio service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author pj,jmlehtin
 * @see OrganisaatioPersistence
 * @see OrganisaatioUtil
 * @generated
 */
public class OrganisaatioPersistenceImpl extends BasePersistenceImpl<Organisaatio>
    implements OrganisaatioPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link OrganisaatioUtil} to access the organisaatio persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = OrganisaatioImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(OrganisaatioModelImpl.ENTITY_CACHE_ENABLED,
            OrganisaatioModelImpl.FINDER_CACHE_ENABLED, OrganisaatioImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(OrganisaatioModelImpl.ENTITY_CACHE_ENABLED,
            OrganisaatioModelImpl.FINDER_CACHE_ENABLED, OrganisaatioImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(OrganisaatioModelImpl.ENTITY_CACHE_ENABLED,
            OrganisaatioModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_ORGANISAATIO = "SELECT organisaatio FROM Organisaatio organisaatio";
    private static final String _SQL_COUNT_ORGANISAATIO = "SELECT COUNT(organisaatio) FROM Organisaatio organisaatio";
    private static final String _ORDER_BY_ENTITY_ALIAS = "organisaatio.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Organisaatio exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(OrganisaatioPersistenceImpl.class);
    private static Organisaatio _nullOrganisaatio = new OrganisaatioImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<Organisaatio> toCacheModel() {
                return _nullOrganisaatioCacheModel;
            }
        };

    private static CacheModel<Organisaatio> _nullOrganisaatioCacheModel = new CacheModel<Organisaatio>() {
            @Override
            public Organisaatio toEntityModel() {
                return _nullOrganisaatio;
            }
        };

    public OrganisaatioPersistenceImpl() {
        setModelClass(Organisaatio.class);
    }

    /**
     * Caches the organisaatio in the entity cache if it is enabled.
     *
     * @param organisaatio the organisaatio
     */
    @Override
    public void cacheResult(Organisaatio organisaatio) {
        EntityCacheUtil.putResult(OrganisaatioModelImpl.ENTITY_CACHE_ENABLED,
            OrganisaatioImpl.class, organisaatio.getPrimaryKey(), organisaatio);

        organisaatio.resetOriginalValues();
    }

    /**
     * Caches the organisaatios in the entity cache if it is enabled.
     *
     * @param organisaatios the organisaatios
     */
    @Override
    public void cacheResult(List<Organisaatio> organisaatios) {
        for (Organisaatio organisaatio : organisaatios) {
            if (EntityCacheUtil.getResult(
                        OrganisaatioModelImpl.ENTITY_CACHE_ENABLED,
                        OrganisaatioImpl.class, organisaatio.getPrimaryKey()) == null) {
                cacheResult(organisaatio);
            } else {
                organisaatio.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all organisaatios.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(OrganisaatioImpl.class.getName());
        }

        EntityCacheUtil.clearCache(OrganisaatioImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the organisaatio.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(Organisaatio organisaatio) {
        EntityCacheUtil.removeResult(OrganisaatioModelImpl.ENTITY_CACHE_ENABLED,
            OrganisaatioImpl.class, organisaatio.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<Organisaatio> organisaatios) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (Organisaatio organisaatio : organisaatios) {
            EntityCacheUtil.removeResult(OrganisaatioModelImpl.ENTITY_CACHE_ENABLED,
                OrganisaatioImpl.class, organisaatio.getPrimaryKey());
        }
    }

    /**
     * Creates a new organisaatio with the primary key. Does not add the organisaatio to the database.
     *
     * @param organisaatio_id the primary key for the new organisaatio
     * @return the new organisaatio
     */
    @Override
    public Organisaatio create(int organisaatio_id) {
        Organisaatio organisaatio = new OrganisaatioImpl();

        organisaatio.setNew(true);
        organisaatio.setPrimaryKey(organisaatio_id);

        return organisaatio;
    }

    /**
     * Removes the organisaatio with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param organisaatio_id the primary key of the organisaatio
     * @return the organisaatio that was removed
     * @throws fi.csc.avaa.tupa.db.NoSuchOrganisaatioException if a organisaatio with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Organisaatio remove(int organisaatio_id)
        throws NoSuchOrganisaatioException, SystemException {
        return remove((Serializable) organisaatio_id);
    }

    /**
     * Removes the organisaatio with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the organisaatio
     * @return the organisaatio that was removed
     * @throws fi.csc.avaa.tupa.db.NoSuchOrganisaatioException if a organisaatio with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Organisaatio remove(Serializable primaryKey)
        throws NoSuchOrganisaatioException, SystemException {
        Session session = null;

        try {
            session = openSession();

            Organisaatio organisaatio = (Organisaatio) session.get(OrganisaatioImpl.class,
                    primaryKey);

            if (organisaatio == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchOrganisaatioException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(organisaatio);
        } catch (NoSuchOrganisaatioException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected Organisaatio removeImpl(Organisaatio organisaatio)
        throws SystemException {
        organisaatio = toUnwrappedModel(organisaatio);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(organisaatio)) {
                organisaatio = (Organisaatio) session.get(OrganisaatioImpl.class,
                        organisaatio.getPrimaryKeyObj());
            }

            if (organisaatio != null) {
                session.delete(organisaatio);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (organisaatio != null) {
            clearCache(organisaatio);
        }

        return organisaatio;
    }

    @Override
    public Organisaatio updateImpl(
        fi.csc.avaa.tupa.db.model.Organisaatio organisaatio)
        throws SystemException {
        organisaatio = toUnwrappedModel(organisaatio);

        boolean isNew = organisaatio.isNew();

        Session session = null;

        try {
            session = openSession();

            if (organisaatio.isNew()) {
                session.save(organisaatio);

                organisaatio.setNew(false);
            } else {
                session.merge(organisaatio);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }

        EntityCacheUtil.putResult(OrganisaatioModelImpl.ENTITY_CACHE_ENABLED,
            OrganisaatioImpl.class, organisaatio.getPrimaryKey(), organisaatio);

        return organisaatio;
    }

    protected Organisaatio toUnwrappedModel(Organisaatio organisaatio) {
        if (organisaatio instanceof OrganisaatioImpl) {
            return organisaatio;
        }

        OrganisaatioImpl organisaatioImpl = new OrganisaatioImpl();

        organisaatioImpl.setNew(organisaatio.isNew());
        organisaatioImpl.setPrimaryKey(organisaatio.getPrimaryKey());

        organisaatioImpl.setOrganisaatio_id(organisaatio.getOrganisaatio_id());
        organisaatioImpl.setNimi(organisaatio.getNimi());
        organisaatioImpl.setName(organisaatio.getName());
        organisaatioImpl.setMaa(organisaatio.getMaa());
        organisaatioImpl.setISNI(organisaatio.getISNI());
        organisaatioImpl.setCrmid(organisaatio.getCrmid());
        organisaatioImpl.setEmo_organisaatio(organisaatio.getEmo_organisaatio());
        organisaatioImpl.setKv_isanta(organisaatio.isKv_isanta());

        return organisaatioImpl;
    }

    /**
     * Returns the organisaatio with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the organisaatio
     * @return the organisaatio
     * @throws fi.csc.avaa.tupa.db.NoSuchOrganisaatioException if a organisaatio with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Organisaatio findByPrimaryKey(Serializable primaryKey)
        throws NoSuchOrganisaatioException, SystemException {
        Organisaatio organisaatio = fetchByPrimaryKey(primaryKey);

        if (organisaatio == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchOrganisaatioException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return organisaatio;
    }

    /**
     * Returns the organisaatio with the primary key or throws a {@link fi.csc.avaa.tupa.db.NoSuchOrganisaatioException} if it could not be found.
     *
     * @param organisaatio_id the primary key of the organisaatio
     * @return the organisaatio
     * @throws fi.csc.avaa.tupa.db.NoSuchOrganisaatioException if a organisaatio with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Organisaatio findByPrimaryKey(int organisaatio_id)
        throws NoSuchOrganisaatioException, SystemException {
        return findByPrimaryKey((Serializable) organisaatio_id);
    }

    /**
     * Returns the organisaatio with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the organisaatio
     * @return the organisaatio, or <code>null</code> if a organisaatio with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Organisaatio fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        Organisaatio organisaatio = (Organisaatio) EntityCacheUtil.getResult(OrganisaatioModelImpl.ENTITY_CACHE_ENABLED,
                OrganisaatioImpl.class, primaryKey);

        if (organisaatio == _nullOrganisaatio) {
            return null;
        }

        if (organisaatio == null) {
            Session session = null;

            try {
                session = openSession();

                organisaatio = (Organisaatio) session.get(OrganisaatioImpl.class,
                        primaryKey);

                if (organisaatio != null) {
                    cacheResult(organisaatio);
                } else {
                    EntityCacheUtil.putResult(OrganisaatioModelImpl.ENTITY_CACHE_ENABLED,
                        OrganisaatioImpl.class, primaryKey, _nullOrganisaatio);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(OrganisaatioModelImpl.ENTITY_CACHE_ENABLED,
                    OrganisaatioImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return organisaatio;
    }

    /**
     * Returns the organisaatio with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param organisaatio_id the primary key of the organisaatio
     * @return the organisaatio, or <code>null</code> if a organisaatio with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Organisaatio fetchByPrimaryKey(int organisaatio_id)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) organisaatio_id);
    }

    /**
     * Returns all the organisaatios.
     *
     * @return the organisaatios
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Organisaatio> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the organisaatios.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.OrganisaatioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of organisaatios
     * @param end the upper bound of the range of organisaatios (not inclusive)
     * @return the range of organisaatios
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Organisaatio> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the organisaatios.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.OrganisaatioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of organisaatios
     * @param end the upper bound of the range of organisaatios (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of organisaatios
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Organisaatio> findAll(int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
            finderArgs = FINDER_ARGS_EMPTY;
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
            finderArgs = new Object[] { start, end, orderByComparator };
        }

        List<Organisaatio> list = (List<Organisaatio>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_ORGANISAATIO);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_ORGANISAATIO;

                if (pagination) {
                    sql = sql.concat(OrganisaatioModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<Organisaatio>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Organisaatio>(list);
                } else {
                    list = (List<Organisaatio>) QueryUtil.list(q, getDialect(),
                            start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Removes all the organisaatios from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (Organisaatio organisaatio : findAll()) {
            remove(organisaatio);
        }
    }

    /**
     * Returns the number of organisaatios.
     *
     * @return the number of organisaatios
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countAll() throws SystemException {
        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
                FINDER_ARGS_EMPTY, this);

        if (count == null) {
            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(_SQL_COUNT_ORGANISAATIO);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Initializes the organisaatio persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.fi.csc.avaa.tupa.db.model.Organisaatio")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<Organisaatio>> listenersList = new ArrayList<ModelListener<Organisaatio>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<Organisaatio>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(OrganisaatioImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
