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
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import fi.csc.avaa.tupa.db.NoSuchTpInfrastructureException;
import fi.csc.avaa.tupa.db.model.TpInfrastructure;
import fi.csc.avaa.tupa.db.model.impl.TpInfrastructureImpl;
import fi.csc.avaa.tupa.db.model.impl.TpInfrastructureModelImpl;
import fi.csc.avaa.tupa.db.service.persistence.TpInfrastructurePersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the tp infrastructure service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CSC
 * @see TpInfrastructurePersistence
 * @see TpInfrastructureUtil
 * @generated
 */
public class TpInfrastructurePersistenceImpl extends BasePersistenceImpl<TpInfrastructure>
    implements TpInfrastructurePersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link TpInfrastructureUtil} to access the tp infrastructure persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = TpInfrastructureImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(TpInfrastructureModelImpl.ENTITY_CACHE_ENABLED,
            TpInfrastructureModelImpl.FINDER_CACHE_ENABLED,
            TpInfrastructureImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(TpInfrastructureModelImpl.ENTITY_CACHE_ENABLED,
            TpInfrastructureModelImpl.FINDER_CACHE_ENABLED,
            TpInfrastructureImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TpInfrastructureModelImpl.ENTITY_CACHE_ENABLED,
            TpInfrastructureModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_TPINFRASTRUCTURE = "SELECT tpInfrastructure FROM TpInfrastructure tpInfrastructure";
    private static final String _SQL_COUNT_TPINFRASTRUCTURE = "SELECT COUNT(tpInfrastructure) FROM TpInfrastructure tpInfrastructure";
    private static final String _ORDER_BY_ENTITY_ALIAS = "tpInfrastructure.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No TpInfrastructure exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(TpInfrastructurePersistenceImpl.class);
    private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
                "id", "active"
            });
    private static TpInfrastructure _nullTpInfrastructure = new TpInfrastructureImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<TpInfrastructure> toCacheModel() {
                return _nullTpInfrastructureCacheModel;
            }
        };

    private static CacheModel<TpInfrastructure> _nullTpInfrastructureCacheModel = new CacheModel<TpInfrastructure>() {
            @Override
            public TpInfrastructure toEntityModel() {
                return _nullTpInfrastructure;
            }
        };

    public TpInfrastructurePersistenceImpl() {
        setModelClass(TpInfrastructure.class);
    }

    /**
     * Caches the tp infrastructure in the entity cache if it is enabled.
     *
     * @param tpInfrastructure the tp infrastructure
     */
    @Override
    public void cacheResult(TpInfrastructure tpInfrastructure) {
        EntityCacheUtil.putResult(TpInfrastructureModelImpl.ENTITY_CACHE_ENABLED,
            TpInfrastructureImpl.class, tpInfrastructure.getPrimaryKey(),
            tpInfrastructure);

        tpInfrastructure.resetOriginalValues();
    }

    /**
     * Caches the tp infrastructures in the entity cache if it is enabled.
     *
     * @param tpInfrastructures the tp infrastructures
     */
    @Override
    public void cacheResult(List<TpInfrastructure> tpInfrastructures) {
        for (TpInfrastructure tpInfrastructure : tpInfrastructures) {
            if (EntityCacheUtil.getResult(
                        TpInfrastructureModelImpl.ENTITY_CACHE_ENABLED,
                        TpInfrastructureImpl.class,
                        tpInfrastructure.getPrimaryKey()) == null) {
                cacheResult(tpInfrastructure);
            } else {
                tpInfrastructure.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all tp infrastructures.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(TpInfrastructureImpl.class.getName());
        }

        EntityCacheUtil.clearCache(TpInfrastructureImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the tp infrastructure.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(TpInfrastructure tpInfrastructure) {
        EntityCacheUtil.removeResult(TpInfrastructureModelImpl.ENTITY_CACHE_ENABLED,
            TpInfrastructureImpl.class, tpInfrastructure.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<TpInfrastructure> tpInfrastructures) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (TpInfrastructure tpInfrastructure : tpInfrastructures) {
            EntityCacheUtil.removeResult(TpInfrastructureModelImpl.ENTITY_CACHE_ENABLED,
                TpInfrastructureImpl.class, tpInfrastructure.getPrimaryKey());
        }
    }

    /**
     * Creates a new tp infrastructure with the primary key. Does not add the tp infrastructure to the database.
     *
     * @param id the primary key for the new tp infrastructure
     * @return the new tp infrastructure
     */
    @Override
    public TpInfrastructure create(int id) {
        TpInfrastructure tpInfrastructure = new TpInfrastructureImpl();

        tpInfrastructure.setNew(true);
        tpInfrastructure.setPrimaryKey(id);

        return tpInfrastructure;
    }

    /**
     * Removes the tp infrastructure with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param id the primary key of the tp infrastructure
     * @return the tp infrastructure that was removed
     * @throws fi.csc.avaa.tupa.db.NoSuchTpInfrastructureException if a tp infrastructure with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public TpInfrastructure remove(int id)
        throws NoSuchTpInfrastructureException, SystemException {
        return remove((Serializable) id);
    }

    /**
     * Removes the tp infrastructure with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the tp infrastructure
     * @return the tp infrastructure that was removed
     * @throws fi.csc.avaa.tupa.db.NoSuchTpInfrastructureException if a tp infrastructure with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public TpInfrastructure remove(Serializable primaryKey)
        throws NoSuchTpInfrastructureException, SystemException {
        Session session = null;

        try {
            session = openSession();

            TpInfrastructure tpInfrastructure = (TpInfrastructure) session.get(TpInfrastructureImpl.class,
                    primaryKey);

            if (tpInfrastructure == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchTpInfrastructureException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(tpInfrastructure);
        } catch (NoSuchTpInfrastructureException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected TpInfrastructure removeImpl(TpInfrastructure tpInfrastructure)
        throws SystemException {
        tpInfrastructure = toUnwrappedModel(tpInfrastructure);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(tpInfrastructure)) {
                tpInfrastructure = (TpInfrastructure) session.get(TpInfrastructureImpl.class,
                        tpInfrastructure.getPrimaryKeyObj());
            }

            if (tpInfrastructure != null) {
                session.delete(tpInfrastructure);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (tpInfrastructure != null) {
            clearCache(tpInfrastructure);
        }

        return tpInfrastructure;
    }

    @Override
    public TpInfrastructure updateImpl(
        fi.csc.avaa.tupa.db.model.TpInfrastructure tpInfrastructure)
        throws SystemException {
        tpInfrastructure = toUnwrappedModel(tpInfrastructure);

        boolean isNew = tpInfrastructure.isNew();

        Session session = null;

        try {
            session = openSession();

            if (tpInfrastructure.isNew()) {
                session.save(tpInfrastructure);

                tpInfrastructure.setNew(false);
            } else {
                session.merge(tpInfrastructure);
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

        EntityCacheUtil.putResult(TpInfrastructureModelImpl.ENTITY_CACHE_ENABLED,
            TpInfrastructureImpl.class, tpInfrastructure.getPrimaryKey(),
            tpInfrastructure);

        return tpInfrastructure;
    }

    protected TpInfrastructure toUnwrappedModel(
        TpInfrastructure tpInfrastructure) {
        if (tpInfrastructure instanceof TpInfrastructureImpl) {
            return tpInfrastructure;
        }

        TpInfrastructureImpl tpInfrastructureImpl = new TpInfrastructureImpl();

        tpInfrastructureImpl.setNew(tpInfrastructure.isNew());
        tpInfrastructureImpl.setPrimaryKey(tpInfrastructure.getPrimaryKey());

        tpInfrastructureImpl.setId(tpInfrastructure.getId());
        tpInfrastructureImpl.setUrn(tpInfrastructure.getUrn());
        tpInfrastructureImpl.setName_EN(tpInfrastructure.getName_EN());
        tpInfrastructureImpl.setName_FI(tpInfrastructure.getName_FI());
        tpInfrastructureImpl.setAcronym_EN(tpInfrastructure.getAcronym_EN());
        tpInfrastructureImpl.setAcronym_FI(tpInfrastructure.getAcronym_FI());
        tpInfrastructureImpl.setDescription_EN(tpInfrastructure.getDescription_EN());
        tpInfrastructureImpl.setDescription_FI(tpInfrastructure.getDescription_FI());
        tpInfrastructureImpl.setActive(tpInfrastructure.isActive());
        tpInfrastructureImpl.setPreparationsStarted(tpInfrastructure.getPreparationsStarted());
        tpInfrastructureImpl.setBuildingStarted(tpInfrastructure.getBuildingStarted());
        tpInfrastructureImpl.setOperationsStarted(tpInfrastructure.getOperationsStarted());
        tpInfrastructureImpl.setOperationsFinished(tpInfrastructure.getOperationsFinished());
        tpInfrastructureImpl.setFormerIds(tpInfrastructure.getFormerIds());
        tpInfrastructureImpl.setFormerUrns(tpInfrastructure.getFormerUrns());

        return tpInfrastructureImpl;
    }

    /**
     * Returns the tp infrastructure with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the tp infrastructure
     * @return the tp infrastructure
     * @throws fi.csc.avaa.tupa.db.NoSuchTpInfrastructureException if a tp infrastructure with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public TpInfrastructure findByPrimaryKey(Serializable primaryKey)
        throws NoSuchTpInfrastructureException, SystemException {
        TpInfrastructure tpInfrastructure = fetchByPrimaryKey(primaryKey);

        if (tpInfrastructure == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchTpInfrastructureException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return tpInfrastructure;
    }

    /**
     * Returns the tp infrastructure with the primary key or throws a {@link fi.csc.avaa.tupa.db.NoSuchTpInfrastructureException} if it could not be found.
     *
     * @param id the primary key of the tp infrastructure
     * @return the tp infrastructure
     * @throws fi.csc.avaa.tupa.db.NoSuchTpInfrastructureException if a tp infrastructure with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public TpInfrastructure findByPrimaryKey(int id)
        throws NoSuchTpInfrastructureException, SystemException {
        return findByPrimaryKey((Serializable) id);
    }

    /**
     * Returns the tp infrastructure with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the tp infrastructure
     * @return the tp infrastructure, or <code>null</code> if a tp infrastructure with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public TpInfrastructure fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        TpInfrastructure tpInfrastructure = (TpInfrastructure) EntityCacheUtil.getResult(TpInfrastructureModelImpl.ENTITY_CACHE_ENABLED,
                TpInfrastructureImpl.class, primaryKey);

        if (tpInfrastructure == _nullTpInfrastructure) {
            return null;
        }

        if (tpInfrastructure == null) {
            Session session = null;

            try {
                session = openSession();

                tpInfrastructure = (TpInfrastructure) session.get(TpInfrastructureImpl.class,
                        primaryKey);

                if (tpInfrastructure != null) {
                    cacheResult(tpInfrastructure);
                } else {
                    EntityCacheUtil.putResult(TpInfrastructureModelImpl.ENTITY_CACHE_ENABLED,
                        TpInfrastructureImpl.class, primaryKey,
                        _nullTpInfrastructure);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(TpInfrastructureModelImpl.ENTITY_CACHE_ENABLED,
                    TpInfrastructureImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return tpInfrastructure;
    }

    /**
     * Returns the tp infrastructure with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param id the primary key of the tp infrastructure
     * @return the tp infrastructure, or <code>null</code> if a tp infrastructure with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public TpInfrastructure fetchByPrimaryKey(int id) throws SystemException {
        return fetchByPrimaryKey((Serializable) id);
    }

    /**
     * Returns all the tp infrastructures.
     *
     * @return the tp infrastructures
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<TpInfrastructure> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

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
    @Override
    public List<TpInfrastructure> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the tp infrastructures.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.TpInfrastructureModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of tp infrastructures
     * @param end the upper bound of the range of tp infrastructures (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of tp infrastructures
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<TpInfrastructure> findAll(int start, int end,
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

        List<TpInfrastructure> list = (List<TpInfrastructure>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_TPINFRASTRUCTURE);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_TPINFRASTRUCTURE;

                if (pagination) {
                    sql = sql.concat(TpInfrastructureModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<TpInfrastructure>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<TpInfrastructure>(list);
                } else {
                    list = (List<TpInfrastructure>) QueryUtil.list(q,
                            getDialect(), start, end);
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
     * Removes all the tp infrastructures from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (TpInfrastructure tpInfrastructure : findAll()) {
            remove(tpInfrastructure);
        }
    }

    /**
     * Returns the number of tp infrastructures.
     *
     * @return the number of tp infrastructures
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

                Query q = session.createQuery(_SQL_COUNT_TPINFRASTRUCTURE);

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

    @Override
    protected Set<String> getBadColumnNames() {
        return _badColumnNames;
    }

    /**
     * Initializes the tp infrastructure persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.fi.csc.avaa.tupa.db.model.TpInfrastructure")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<TpInfrastructure>> listenersList = new ArrayList<ModelListener<TpInfrastructure>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<TpInfrastructure>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(TpInfrastructureImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
