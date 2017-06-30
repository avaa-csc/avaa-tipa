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

import fi.csc.avaa.tupa.db.NoSuchSeliteException;
import fi.csc.avaa.tupa.db.model.Selite;
import fi.csc.avaa.tupa.db.model.impl.SeliteImpl;
import fi.csc.avaa.tupa.db.model.impl.SeliteModelImpl;
import fi.csc.avaa.tupa.db.service.persistence.SelitePersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the selite service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CSC
 * @see SelitePersistence
 * @see SeliteUtil
 * @generated
 */
public class SelitePersistenceImpl extends BasePersistenceImpl<Selite>
    implements SelitePersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link SeliteUtil} to access the selite persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = SeliteImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(SeliteModelImpl.ENTITY_CACHE_ENABLED,
            SeliteModelImpl.FINDER_CACHE_ENABLED, SeliteImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(SeliteModelImpl.ENTITY_CACHE_ENABLED,
            SeliteModelImpl.FINDER_CACHE_ENABLED, SeliteImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(SeliteModelImpl.ENTITY_CACHE_ENABLED,
            SeliteModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_SELITE = "SELECT selite FROM Selite selite";
    private static final String _SQL_COUNT_SELITE = "SELECT COUNT(selite) FROM Selite selite";
    private static final String _ORDER_BY_ENTITY_ALIAS = "selite.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Selite exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(SelitePersistenceImpl.class);
    private static Selite _nullSelite = new SeliteImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<Selite> toCacheModel() {
                return _nullSeliteCacheModel;
            }
        };

    private static CacheModel<Selite> _nullSeliteCacheModel = new CacheModel<Selite>() {
            @Override
            public Selite toEntityModel() {
                return _nullSelite;
            }
        };

    public SelitePersistenceImpl() {
        setModelClass(Selite.class);
    }

    /**
     * Caches the selite in the entity cache if it is enabled.
     *
     * @param selite the selite
     */
    @Override
    public void cacheResult(Selite selite) {
        EntityCacheUtil.putResult(SeliteModelImpl.ENTITY_CACHE_ENABLED,
            SeliteImpl.class, selite.getPrimaryKey(), selite);

        selite.resetOriginalValues();
    }

    /**
     * Caches the selites in the entity cache if it is enabled.
     *
     * @param selites the selites
     */
    @Override
    public void cacheResult(List<Selite> selites) {
        for (Selite selite : selites) {
            if (EntityCacheUtil.getResult(
                        SeliteModelImpl.ENTITY_CACHE_ENABLED, SeliteImpl.class,
                        selite.getPrimaryKey()) == null) {
                cacheResult(selite);
            } else {
                selite.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all selites.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(SeliteImpl.class.getName());
        }

        EntityCacheUtil.clearCache(SeliteImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the selite.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(Selite selite) {
        EntityCacheUtil.removeResult(SeliteModelImpl.ENTITY_CACHE_ENABLED,
            SeliteImpl.class, selite.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<Selite> selites) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (Selite selite : selites) {
            EntityCacheUtil.removeResult(SeliteModelImpl.ENTITY_CACHE_ENABLED,
                SeliteImpl.class, selite.getPrimaryKey());
        }
    }

    /**
     * Creates a new selite with the primary key. Does not add the selite to the database.
     *
     * @param selite_id the primary key for the new selite
     * @return the new selite
     */
    @Override
    public Selite create(int selite_id) {
        Selite selite = new SeliteImpl();

        selite.setNew(true);
        selite.setPrimaryKey(selite_id);

        return selite;
    }

    /**
     * Removes the selite with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param selite_id the primary key of the selite
     * @return the selite that was removed
     * @throws fi.csc.avaa.tupa.db.NoSuchSeliteException if a selite with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Selite remove(int selite_id)
        throws NoSuchSeliteException, SystemException {
        return remove((Serializable) selite_id);
    }

    /**
     * Removes the selite with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the selite
     * @return the selite that was removed
     * @throws fi.csc.avaa.tupa.db.NoSuchSeliteException if a selite with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Selite remove(Serializable primaryKey)
        throws NoSuchSeliteException, SystemException {
        Session session = null;

        try {
            session = openSession();

            Selite selite = (Selite) session.get(SeliteImpl.class, primaryKey);

            if (selite == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchSeliteException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(selite);
        } catch (NoSuchSeliteException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected Selite removeImpl(Selite selite) throws SystemException {
        selite = toUnwrappedModel(selite);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(selite)) {
                selite = (Selite) session.get(SeliteImpl.class,
                        selite.getPrimaryKeyObj());
            }

            if (selite != null) {
                session.delete(selite);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (selite != null) {
            clearCache(selite);
        }

        return selite;
    }

    @Override
    public Selite updateImpl(fi.csc.avaa.tupa.db.model.Selite selite)
        throws SystemException {
        selite = toUnwrappedModel(selite);

        boolean isNew = selite.isNew();

        Session session = null;

        try {
            session = openSession();

            if (selite.isNew()) {
                session.save(selite);

                selite.setNew(false);
            } else {
                session.merge(selite);
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

        EntityCacheUtil.putResult(SeliteModelImpl.ENTITY_CACHE_ENABLED,
            SeliteImpl.class, selite.getPrimaryKey(), selite);

        return selite;
    }

    protected Selite toUnwrappedModel(Selite selite) {
        if (selite instanceof SeliteImpl) {
            return selite;
        }

        SeliteImpl seliteImpl = new SeliteImpl();

        seliteImpl.setNew(selite.isNew());
        seliteImpl.setPrimaryKey(selite.getPrimaryKey());

        seliteImpl.setSelite_id(selite.getSelite_id());
        seliteImpl.setNimi(selite.getNimi());
        seliteImpl.setName(selite.getName());
        seliteImpl.setKuvaus(selite.getKuvaus());
        seliteImpl.setDescription(selite.getDescription());
        seliteImpl.setClassificator(selite.getClassificator());

        return seliteImpl;
    }

    /**
     * Returns the selite with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the selite
     * @return the selite
     * @throws fi.csc.avaa.tupa.db.NoSuchSeliteException if a selite with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Selite findByPrimaryKey(Serializable primaryKey)
        throws NoSuchSeliteException, SystemException {
        Selite selite = fetchByPrimaryKey(primaryKey);

        if (selite == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchSeliteException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return selite;
    }

    /**
     * Returns the selite with the primary key or throws a {@link fi.csc.avaa.tupa.db.NoSuchSeliteException} if it could not be found.
     *
     * @param selite_id the primary key of the selite
     * @return the selite
     * @throws fi.csc.avaa.tupa.db.NoSuchSeliteException if a selite with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Selite findByPrimaryKey(int selite_id)
        throws NoSuchSeliteException, SystemException {
        return findByPrimaryKey((Serializable) selite_id);
    }

    /**
     * Returns the selite with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the selite
     * @return the selite, or <code>null</code> if a selite with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Selite fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        Selite selite = (Selite) EntityCacheUtil.getResult(SeliteModelImpl.ENTITY_CACHE_ENABLED,
                SeliteImpl.class, primaryKey);

        if (selite == _nullSelite) {
            return null;
        }

        if (selite == null) {
            Session session = null;

            try {
                session = openSession();

                selite = (Selite) session.get(SeliteImpl.class, primaryKey);

                if (selite != null) {
                    cacheResult(selite);
                } else {
                    EntityCacheUtil.putResult(SeliteModelImpl.ENTITY_CACHE_ENABLED,
                        SeliteImpl.class, primaryKey, _nullSelite);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(SeliteModelImpl.ENTITY_CACHE_ENABLED,
                    SeliteImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return selite;
    }

    /**
     * Returns the selite with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param selite_id the primary key of the selite
     * @return the selite, or <code>null</code> if a selite with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Selite fetchByPrimaryKey(int selite_id) throws SystemException {
        return fetchByPrimaryKey((Serializable) selite_id);
    }

    /**
     * Returns all the selites.
     *
     * @return the selites
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Selite> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the selites.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.SeliteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of selites
     * @param end the upper bound of the range of selites (not inclusive)
     * @return the range of selites
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Selite> findAll(int start, int end) throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the selites.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.SeliteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of selites
     * @param end the upper bound of the range of selites (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of selites
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Selite> findAll(int start, int end,
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

        List<Selite> list = (List<Selite>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_SELITE);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_SELITE;

                if (pagination) {
                    sql = sql.concat(SeliteModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<Selite>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Selite>(list);
                } else {
                    list = (List<Selite>) QueryUtil.list(q, getDialect(),
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
     * Removes all the selites from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (Selite selite : findAll()) {
            remove(selite);
        }
    }

    /**
     * Returns the number of selites.
     *
     * @return the number of selites
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

                Query q = session.createQuery(_SQL_COUNT_SELITE);

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
     * Initializes the selite persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.fi.csc.avaa.tupa.db.model.Selite")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<Selite>> listenersList = new ArrayList<ModelListener<Selite>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<Selite>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(SeliteImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
