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

import fi.csc.avaa.tupa.db.NoSuchTpServizeException;
import fi.csc.avaa.tupa.db.model.TpServize;
import fi.csc.avaa.tupa.db.model.impl.TpServizeImpl;
import fi.csc.avaa.tupa.db.model.impl.TpServizeModelImpl;
import fi.csc.avaa.tupa.db.service.persistence.TpServizePersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the tp servize service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CSC
 * @see TpServizePersistence
 * @see TpServizeUtil
 * @generated
 */
public class TpServizePersistenceImpl extends BasePersistenceImpl<TpServize>
    implements TpServizePersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link TpServizeUtil} to access the tp servize persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = TpServizeImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(TpServizeModelImpl.ENTITY_CACHE_ENABLED,
            TpServizeModelImpl.FINDER_CACHE_ENABLED, TpServizeImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(TpServizeModelImpl.ENTITY_CACHE_ENABLED,
            TpServizeModelImpl.FINDER_CACHE_ENABLED, TpServizeImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TpServizeModelImpl.ENTITY_CACHE_ENABLED,
            TpServizeModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_TPSERVIZE = "SELECT tpServize FROM TpServize tpServize";
    private static final String _SQL_COUNT_TPSERVIZE = "SELECT COUNT(tpServize) FROM TpServize tpServize";
    private static final String _ORDER_BY_ENTITY_ALIAS = "tpServize.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No TpServize exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(TpServizePersistenceImpl.class);
    private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
                "id"
            });
    private static TpServize _nullTpServize = new TpServizeImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<TpServize> toCacheModel() {
                return _nullTpServizeCacheModel;
            }
        };

    private static CacheModel<TpServize> _nullTpServizeCacheModel = new CacheModel<TpServize>() {
            @Override
            public TpServize toEntityModel() {
                return _nullTpServize;
            }
        };

    public TpServizePersistenceImpl() {
        setModelClass(TpServize.class);
    }

    /**
     * Caches the tp servize in the entity cache if it is enabled.
     *
     * @param tpServize the tp servize
     */
    @Override
    public void cacheResult(TpServize tpServize) {
        EntityCacheUtil.putResult(TpServizeModelImpl.ENTITY_CACHE_ENABLED,
            TpServizeImpl.class, tpServize.getPrimaryKey(), tpServize);

        tpServize.resetOriginalValues();
    }

    /**
     * Caches the tp servizes in the entity cache if it is enabled.
     *
     * @param tpServizes the tp servizes
     */
    @Override
    public void cacheResult(List<TpServize> tpServizes) {
        for (TpServize tpServize : tpServizes) {
            if (EntityCacheUtil.getResult(
                        TpServizeModelImpl.ENTITY_CACHE_ENABLED,
                        TpServizeImpl.class, tpServize.getPrimaryKey()) == null) {
                cacheResult(tpServize);
            } else {
                tpServize.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all tp servizes.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(TpServizeImpl.class.getName());
        }

        EntityCacheUtil.clearCache(TpServizeImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the tp servize.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(TpServize tpServize) {
        EntityCacheUtil.removeResult(TpServizeModelImpl.ENTITY_CACHE_ENABLED,
            TpServizeImpl.class, tpServize.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<TpServize> tpServizes) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (TpServize tpServize : tpServizes) {
            EntityCacheUtil.removeResult(TpServizeModelImpl.ENTITY_CACHE_ENABLED,
                TpServizeImpl.class, tpServize.getPrimaryKey());
        }
    }

    /**
     * Creates a new tp servize with the primary key. Does not add the tp servize to the database.
     *
     * @param id the primary key for the new tp servize
     * @return the new tp servize
     */
    @Override
    public TpServize create(int id) {
        TpServize tpServize = new TpServizeImpl();

        tpServize.setNew(true);
        tpServize.setPrimaryKey(id);

        return tpServize;
    }

    /**
     * Removes the tp servize with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param id the primary key of the tp servize
     * @return the tp servize that was removed
     * @throws fi.csc.avaa.tupa.db.NoSuchTpServizeException if a tp servize with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public TpServize remove(int id)
        throws NoSuchTpServizeException, SystemException {
        return remove((Serializable) id);
    }

    /**
     * Removes the tp servize with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the tp servize
     * @return the tp servize that was removed
     * @throws fi.csc.avaa.tupa.db.NoSuchTpServizeException if a tp servize with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public TpServize remove(Serializable primaryKey)
        throws NoSuchTpServizeException, SystemException {
        Session session = null;

        try {
            session = openSession();

            TpServize tpServize = (TpServize) session.get(TpServizeImpl.class,
                    primaryKey);

            if (tpServize == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchTpServizeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(tpServize);
        } catch (NoSuchTpServizeException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected TpServize removeImpl(TpServize tpServize)
        throws SystemException {
        tpServize = toUnwrappedModel(tpServize);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(tpServize)) {
                tpServize = (TpServize) session.get(TpServizeImpl.class,
                        tpServize.getPrimaryKeyObj());
            }

            if (tpServize != null) {
                session.delete(tpServize);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (tpServize != null) {
            clearCache(tpServize);
        }

        return tpServize;
    }

    @Override
    public TpServize updateImpl(fi.csc.avaa.tupa.db.model.TpServize tpServize)
        throws SystemException {
        tpServize = toUnwrappedModel(tpServize);

        boolean isNew = tpServize.isNew();

        Session session = null;

        try {
            session = openSession();

            if (tpServize.isNew()) {
                session.save(tpServize);

                tpServize.setNew(false);
            } else {
                session.merge(tpServize);
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

        EntityCacheUtil.putResult(TpServizeModelImpl.ENTITY_CACHE_ENABLED,
            TpServizeImpl.class, tpServize.getPrimaryKey(), tpServize);

        return tpServize;
    }

    protected TpServize toUnwrappedModel(TpServize tpServize) {
        if (tpServize instanceof TpServizeImpl) {
            return tpServize;
        }

        TpServizeImpl tpServizeImpl = new TpServizeImpl();

        tpServizeImpl.setNew(tpServize.isNew());
        tpServizeImpl.setPrimaryKey(tpServize.getPrimaryKey());

        tpServizeImpl.setId(tpServize.getId());
        tpServizeImpl.setName_EN(tpServize.getName_EN());
        tpServizeImpl.setName_FI(tpServize.getName_FI());
        tpServizeImpl.setDescription_EN(tpServize.getDescription_EN());
        tpServizeImpl.setDescription_FI(tpServize.getDescription_FI());
        tpServizeImpl.setUrl(tpServize.getUrl());
        tpServizeImpl.setAddress(tpServize.getAddress());
        tpServizeImpl.setCity(tpServize.getCity());
        tpServizeImpl.setLat(tpServize.getLat());
        tpServizeImpl.setLon(tpServize.getLon());

        return tpServizeImpl;
    }

    /**
     * Returns the tp servize with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the tp servize
     * @return the tp servize
     * @throws fi.csc.avaa.tupa.db.NoSuchTpServizeException if a tp servize with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public TpServize findByPrimaryKey(Serializable primaryKey)
        throws NoSuchTpServizeException, SystemException {
        TpServize tpServize = fetchByPrimaryKey(primaryKey);

        if (tpServize == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchTpServizeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return tpServize;
    }

    /**
     * Returns the tp servize with the primary key or throws a {@link fi.csc.avaa.tupa.db.NoSuchTpServizeException} if it could not be found.
     *
     * @param id the primary key of the tp servize
     * @return the tp servize
     * @throws fi.csc.avaa.tupa.db.NoSuchTpServizeException if a tp servize with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public TpServize findByPrimaryKey(int id)
        throws NoSuchTpServizeException, SystemException {
        return findByPrimaryKey((Serializable) id);
    }

    /**
     * Returns the tp servize with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the tp servize
     * @return the tp servize, or <code>null</code> if a tp servize with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public TpServize fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        TpServize tpServize = (TpServize) EntityCacheUtil.getResult(TpServizeModelImpl.ENTITY_CACHE_ENABLED,
                TpServizeImpl.class, primaryKey);

        if (tpServize == _nullTpServize) {
            return null;
        }

        if (tpServize == null) {
            Session session = null;

            try {
                session = openSession();

                tpServize = (TpServize) session.get(TpServizeImpl.class,
                        primaryKey);

                if (tpServize != null) {
                    cacheResult(tpServize);
                } else {
                    EntityCacheUtil.putResult(TpServizeModelImpl.ENTITY_CACHE_ENABLED,
                        TpServizeImpl.class, primaryKey, _nullTpServize);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(TpServizeModelImpl.ENTITY_CACHE_ENABLED,
                    TpServizeImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return tpServize;
    }

    /**
     * Returns the tp servize with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param id the primary key of the tp servize
     * @return the tp servize, or <code>null</code> if a tp servize with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public TpServize fetchByPrimaryKey(int id) throws SystemException {
        return fetchByPrimaryKey((Serializable) id);
    }

    /**
     * Returns all the tp servizes.
     *
     * @return the tp servizes
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<TpServize> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the tp servizes.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.TpServizeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of tp servizes
     * @param end the upper bound of the range of tp servizes (not inclusive)
     * @return the range of tp servizes
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<TpServize> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the tp servizes.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.TpServizeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of tp servizes
     * @param end the upper bound of the range of tp servizes (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of tp servizes
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<TpServize> findAll(int start, int end,
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

        List<TpServize> list = (List<TpServize>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_TPSERVIZE);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_TPSERVIZE;

                if (pagination) {
                    sql = sql.concat(TpServizeModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<TpServize>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<TpServize>(list);
                } else {
                    list = (List<TpServize>) QueryUtil.list(q, getDialect(),
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
     * Removes all the tp servizes from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (TpServize tpServize : findAll()) {
            remove(tpServize);
        }
    }

    /**
     * Returns the number of tp servizes.
     *
     * @return the number of tp servizes
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

                Query q = session.createQuery(_SQL_COUNT_TPSERVIZE);

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
     * Initializes the tp servize persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.fi.csc.avaa.tupa.db.model.TpServize")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<TpServize>> listenersList = new ArrayList<ModelListener<TpServize>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<TpServize>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(TpServizeImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
