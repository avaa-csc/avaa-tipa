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

import fi.csc.avaa.tupa.db.NoSuchTpAPIException;
import fi.csc.avaa.tupa.db.model.TpAPI;
import fi.csc.avaa.tupa.db.model.impl.TpAPIImpl;
import fi.csc.avaa.tupa.db.model.impl.TpAPIModelImpl;
import fi.csc.avaa.tupa.db.service.persistence.TpAPIPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the tp a p i service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CSC
 * @see TpAPIPersistence
 * @see TpAPIUtil
 * @generated
 */
public class TpAPIPersistenceImpl extends BasePersistenceImpl<TpAPI>
    implements TpAPIPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link TpAPIUtil} to access the tp a p i persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = TpAPIImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(TpAPIModelImpl.ENTITY_CACHE_ENABLED,
            TpAPIModelImpl.FINDER_CACHE_ENABLED, TpAPIImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(TpAPIModelImpl.ENTITY_CACHE_ENABLED,
            TpAPIModelImpl.FINDER_CACHE_ENABLED, TpAPIImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TpAPIModelImpl.ENTITY_CACHE_ENABLED,
            TpAPIModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_TPAPI = "SELECT tpAPI FROM TpAPI tpAPI";
    private static final String _SQL_COUNT_TPAPI = "SELECT COUNT(tpAPI) FROM TpAPI tpAPI";
    private static final String _ORDER_BY_ENTITY_ALIAS = "tpAPI.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No TpAPI exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(TpAPIPersistenceImpl.class);
    private static TpAPI _nullTpAPI = new TpAPIImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<TpAPI> toCacheModel() {
                return _nullTpAPICacheModel;
            }
        };

    private static CacheModel<TpAPI> _nullTpAPICacheModel = new CacheModel<TpAPI>() {
            @Override
            public TpAPI toEntityModel() {
                return _nullTpAPI;
            }
        };

    public TpAPIPersistenceImpl() {
        setModelClass(TpAPI.class);
    }

    /**
     * Caches the tp a p i in the entity cache if it is enabled.
     *
     * @param tpAPI the tp a p i
     */
    @Override
    public void cacheResult(TpAPI tpAPI) {
        EntityCacheUtil.putResult(TpAPIModelImpl.ENTITY_CACHE_ENABLED,
            TpAPIImpl.class, tpAPI.getPrimaryKey(), tpAPI);

        tpAPI.resetOriginalValues();
    }

    /**
     * Caches the tp a p is in the entity cache if it is enabled.
     *
     * @param tpAPIs the tp a p is
     */
    @Override
    public void cacheResult(List<TpAPI> tpAPIs) {
        for (TpAPI tpAPI : tpAPIs) {
            if (EntityCacheUtil.getResult(TpAPIModelImpl.ENTITY_CACHE_ENABLED,
                        TpAPIImpl.class, tpAPI.getPrimaryKey()) == null) {
                cacheResult(tpAPI);
            } else {
                tpAPI.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all tp a p is.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(TpAPIImpl.class.getName());
        }

        EntityCacheUtil.clearCache(TpAPIImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the tp a p i.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(TpAPI tpAPI) {
        EntityCacheUtil.removeResult(TpAPIModelImpl.ENTITY_CACHE_ENABLED,
            TpAPIImpl.class, tpAPI.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<TpAPI> tpAPIs) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (TpAPI tpAPI : tpAPIs) {
            EntityCacheUtil.removeResult(TpAPIModelImpl.ENTITY_CACHE_ENABLED,
                TpAPIImpl.class, tpAPI.getPrimaryKey());
        }
    }

    /**
     * Creates a new tp a p i with the primary key. Does not add the tp a p i to the database.
     *
     * @param methodsDescription the primary key for the new tp a p i
     * @return the new tp a p i
     */
    @Override
    public TpAPI create(String methodsDescription) {
        TpAPI tpAPI = new TpAPIImpl();

        tpAPI.setNew(true);
        tpAPI.setPrimaryKey(methodsDescription);

        return tpAPI;
    }

    /**
     * Removes the tp a p i with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param methodsDescription the primary key of the tp a p i
     * @return the tp a p i that was removed
     * @throws fi.csc.avaa.tupa.db.NoSuchTpAPIException if a tp a p i with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public TpAPI remove(String methodsDescription)
        throws NoSuchTpAPIException, SystemException {
        return remove((Serializable) methodsDescription);
    }

    /**
     * Removes the tp a p i with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the tp a p i
     * @return the tp a p i that was removed
     * @throws fi.csc.avaa.tupa.db.NoSuchTpAPIException if a tp a p i with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public TpAPI remove(Serializable primaryKey)
        throws NoSuchTpAPIException, SystemException {
        Session session = null;

        try {
            session = openSession();

            TpAPI tpAPI = (TpAPI) session.get(TpAPIImpl.class, primaryKey);

            if (tpAPI == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchTpAPIException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(tpAPI);
        } catch (NoSuchTpAPIException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected TpAPI removeImpl(TpAPI tpAPI) throws SystemException {
        tpAPI = toUnwrappedModel(tpAPI);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(tpAPI)) {
                tpAPI = (TpAPI) session.get(TpAPIImpl.class,
                        tpAPI.getPrimaryKeyObj());
            }

            if (tpAPI != null) {
                session.delete(tpAPI);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (tpAPI != null) {
            clearCache(tpAPI);
        }

        return tpAPI;
    }

    @Override
    public TpAPI updateImpl(fi.csc.avaa.tupa.db.model.TpAPI tpAPI)
        throws SystemException {
        tpAPI = toUnwrappedModel(tpAPI);

        boolean isNew = tpAPI.isNew();

        Session session = null;

        try {
            session = openSession();

            if (tpAPI.isNew()) {
                session.save(tpAPI);

                tpAPI.setNew(false);
            } else {
                session.merge(tpAPI);
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

        EntityCacheUtil.putResult(TpAPIModelImpl.ENTITY_CACHE_ENABLED,
            TpAPIImpl.class, tpAPI.getPrimaryKey(), tpAPI);

        return tpAPI;
    }

    protected TpAPI toUnwrappedModel(TpAPI tpAPI) {
        if (tpAPI instanceof TpAPIImpl) {
            return tpAPI;
        }

        TpAPIImpl tpAPIImpl = new TpAPIImpl();

        tpAPIImpl.setNew(tpAPI.isNew());
        tpAPIImpl.setPrimaryKey(tpAPI.getPrimaryKey());

        tpAPIImpl.setMethodsDescription(tpAPI.getMethodsDescription());

        return tpAPIImpl;
    }

    /**
     * Returns the tp a p i with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the tp a p i
     * @return the tp a p i
     * @throws fi.csc.avaa.tupa.db.NoSuchTpAPIException if a tp a p i with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public TpAPI findByPrimaryKey(Serializable primaryKey)
        throws NoSuchTpAPIException, SystemException {
        TpAPI tpAPI = fetchByPrimaryKey(primaryKey);

        if (tpAPI == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchTpAPIException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return tpAPI;
    }

    /**
     * Returns the tp a p i with the primary key or throws a {@link fi.csc.avaa.tupa.db.NoSuchTpAPIException} if it could not be found.
     *
     * @param methodsDescription the primary key of the tp a p i
     * @return the tp a p i
     * @throws fi.csc.avaa.tupa.db.NoSuchTpAPIException if a tp a p i with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public TpAPI findByPrimaryKey(String methodsDescription)
        throws NoSuchTpAPIException, SystemException {
        return findByPrimaryKey((Serializable) methodsDescription);
    }

    /**
     * Returns the tp a p i with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the tp a p i
     * @return the tp a p i, or <code>null</code> if a tp a p i with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public TpAPI fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        TpAPI tpAPI = (TpAPI) EntityCacheUtil.getResult(TpAPIModelImpl.ENTITY_CACHE_ENABLED,
                TpAPIImpl.class, primaryKey);

        if (tpAPI == _nullTpAPI) {
            return null;
        }

        if (tpAPI == null) {
            Session session = null;

            try {
                session = openSession();

                tpAPI = (TpAPI) session.get(TpAPIImpl.class, primaryKey);

                if (tpAPI != null) {
                    cacheResult(tpAPI);
                } else {
                    EntityCacheUtil.putResult(TpAPIModelImpl.ENTITY_CACHE_ENABLED,
                        TpAPIImpl.class, primaryKey, _nullTpAPI);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(TpAPIModelImpl.ENTITY_CACHE_ENABLED,
                    TpAPIImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return tpAPI;
    }

    /**
     * Returns the tp a p i with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param methodsDescription the primary key of the tp a p i
     * @return the tp a p i, or <code>null</code> if a tp a p i with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public TpAPI fetchByPrimaryKey(String methodsDescription)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) methodsDescription);
    }

    /**
     * Returns all the tp a p is.
     *
     * @return the tp a p is
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<TpAPI> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the tp a p is.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.TpAPIModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of tp a p is
     * @param end the upper bound of the range of tp a p is (not inclusive)
     * @return the range of tp a p is
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<TpAPI> findAll(int start, int end) throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the tp a p is.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.TpAPIModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of tp a p is
     * @param end the upper bound of the range of tp a p is (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of tp a p is
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<TpAPI> findAll(int start, int end,
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

        List<TpAPI> list = (List<TpAPI>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_TPAPI);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_TPAPI;

                if (pagination) {
                    sql = sql.concat(TpAPIModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<TpAPI>) QueryUtil.list(q, getDialect(), start,
                            end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<TpAPI>(list);
                } else {
                    list = (List<TpAPI>) QueryUtil.list(q, getDialect(), start,
                            end);
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
     * Removes all the tp a p is from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (TpAPI tpAPI : findAll()) {
            remove(tpAPI);
        }
    }

    /**
     * Returns the number of tp a p is.
     *
     * @return the number of tp a p is
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

                Query q = session.createQuery(_SQL_COUNT_TPAPI);

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
     * Initializes the tp a p i persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.fi.csc.avaa.tupa.db.model.TpAPI")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<TpAPI>> listenersList = new ArrayList<ModelListener<TpAPI>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<TpAPI>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(TpAPIImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
