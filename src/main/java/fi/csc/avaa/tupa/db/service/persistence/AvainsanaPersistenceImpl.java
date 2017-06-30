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

import fi.csc.avaa.tupa.db.NoSuchAvainsanaException;
import fi.csc.avaa.tupa.db.model.Avainsana;
import fi.csc.avaa.tupa.db.model.impl.AvainsanaImpl;
import fi.csc.avaa.tupa.db.model.impl.AvainsanaModelImpl;
import fi.csc.avaa.tupa.db.service.persistence.AvainsanaPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the avainsana service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CSC
 * @see AvainsanaPersistence
 * @see AvainsanaUtil
 * @generated
 */
public class AvainsanaPersistenceImpl extends BasePersistenceImpl<Avainsana>
    implements AvainsanaPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link AvainsanaUtil} to access the avainsana persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = AvainsanaImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(AvainsanaModelImpl.ENTITY_CACHE_ENABLED,
            AvainsanaModelImpl.FINDER_CACHE_ENABLED, AvainsanaImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(AvainsanaModelImpl.ENTITY_CACHE_ENABLED,
            AvainsanaModelImpl.FINDER_CACHE_ENABLED, AvainsanaImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(AvainsanaModelImpl.ENTITY_CACHE_ENABLED,
            AvainsanaModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_AVAINSANA = "SELECT avainsana FROM Avainsana avainsana";
    private static final String _SQL_COUNT_AVAINSANA = "SELECT COUNT(avainsana) FROM Avainsana avainsana";
    private static final String _ORDER_BY_ENTITY_ALIAS = "avainsana.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Avainsana exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(AvainsanaPersistenceImpl.class);
    private static Avainsana _nullAvainsana = new AvainsanaImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<Avainsana> toCacheModel() {
                return _nullAvainsanaCacheModel;
            }
        };

    private static CacheModel<Avainsana> _nullAvainsanaCacheModel = new CacheModel<Avainsana>() {
            @Override
            public Avainsana toEntityModel() {
                return _nullAvainsana;
            }
        };

    public AvainsanaPersistenceImpl() {
        setModelClass(Avainsana.class);
    }

    /**
     * Caches the avainsana in the entity cache if it is enabled.
     *
     * @param avainsana the avainsana
     */
    @Override
    public void cacheResult(Avainsana avainsana) {
        EntityCacheUtil.putResult(AvainsanaModelImpl.ENTITY_CACHE_ENABLED,
            AvainsanaImpl.class, avainsana.getPrimaryKey(), avainsana);

        avainsana.resetOriginalValues();
    }

    /**
     * Caches the avainsanas in the entity cache if it is enabled.
     *
     * @param avainsanas the avainsanas
     */
    @Override
    public void cacheResult(List<Avainsana> avainsanas) {
        for (Avainsana avainsana : avainsanas) {
            if (EntityCacheUtil.getResult(
                        AvainsanaModelImpl.ENTITY_CACHE_ENABLED,
                        AvainsanaImpl.class, avainsana.getPrimaryKey()) == null) {
                cacheResult(avainsana);
            } else {
                avainsana.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all avainsanas.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(AvainsanaImpl.class.getName());
        }

        EntityCacheUtil.clearCache(AvainsanaImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the avainsana.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(Avainsana avainsana) {
        EntityCacheUtil.removeResult(AvainsanaModelImpl.ENTITY_CACHE_ENABLED,
            AvainsanaImpl.class, avainsana.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<Avainsana> avainsanas) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (Avainsana avainsana : avainsanas) {
            EntityCacheUtil.removeResult(AvainsanaModelImpl.ENTITY_CACHE_ENABLED,
                AvainsanaImpl.class, avainsana.getPrimaryKey());
        }
    }

    /**
     * Creates a new avainsana with the primary key. Does not add the avainsana to the database.
     *
     * @param avainsana_id the primary key for the new avainsana
     * @return the new avainsana
     */
    @Override
    public Avainsana create(int avainsana_id) {
        Avainsana avainsana = new AvainsanaImpl();

        avainsana.setNew(true);
        avainsana.setPrimaryKey(avainsana_id);

        return avainsana;
    }

    /**
     * Removes the avainsana with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param avainsana_id the primary key of the avainsana
     * @return the avainsana that was removed
     * @throws fi.csc.avaa.tupa.db.NoSuchAvainsanaException if a avainsana with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Avainsana remove(int avainsana_id)
        throws NoSuchAvainsanaException, SystemException {
        return remove((Serializable) avainsana_id);
    }

    /**
     * Removes the avainsana with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the avainsana
     * @return the avainsana that was removed
     * @throws fi.csc.avaa.tupa.db.NoSuchAvainsanaException if a avainsana with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Avainsana remove(Serializable primaryKey)
        throws NoSuchAvainsanaException, SystemException {
        Session session = null;

        try {
            session = openSession();

            Avainsana avainsana = (Avainsana) session.get(AvainsanaImpl.class,
                    primaryKey);

            if (avainsana == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchAvainsanaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(avainsana);
        } catch (NoSuchAvainsanaException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected Avainsana removeImpl(Avainsana avainsana)
        throws SystemException {
        avainsana = toUnwrappedModel(avainsana);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(avainsana)) {
                avainsana = (Avainsana) session.get(AvainsanaImpl.class,
                        avainsana.getPrimaryKeyObj());
            }

            if (avainsana != null) {
                session.delete(avainsana);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (avainsana != null) {
            clearCache(avainsana);
        }

        return avainsana;
    }

    @Override
    public Avainsana updateImpl(fi.csc.avaa.tupa.db.model.Avainsana avainsana)
        throws SystemException {
        avainsana = toUnwrappedModel(avainsana);

        boolean isNew = avainsana.isNew();

        Session session = null;

        try {
            session = openSession();

            if (avainsana.isNew()) {
                session.save(avainsana);

                avainsana.setNew(false);
            } else {
                session.merge(avainsana);
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

        EntityCacheUtil.putResult(AvainsanaModelImpl.ENTITY_CACHE_ENABLED,
            AvainsanaImpl.class, avainsana.getPrimaryKey(), avainsana);

        return avainsana;
    }

    protected Avainsana toUnwrappedModel(Avainsana avainsana) {
        if (avainsana instanceof AvainsanaImpl) {
            return avainsana;
        }

        AvainsanaImpl avainsanaImpl = new AvainsanaImpl();

        avainsanaImpl.setNew(avainsana.isNew());
        avainsanaImpl.setPrimaryKey(avainsana.getPrimaryKey());

        avainsanaImpl.setAvainsana_id(avainsana.getAvainsana_id());
        avainsanaImpl.setAvainsana(avainsana.getAvainsana());
        avainsanaImpl.setKeyword(avainsana.getKeyword());

        return avainsanaImpl;
    }

    /**
     * Returns the avainsana with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the avainsana
     * @return the avainsana
     * @throws fi.csc.avaa.tupa.db.NoSuchAvainsanaException if a avainsana with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Avainsana findByPrimaryKey(Serializable primaryKey)
        throws NoSuchAvainsanaException, SystemException {
        Avainsana avainsana = fetchByPrimaryKey(primaryKey);

        if (avainsana == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchAvainsanaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return avainsana;
    }

    /**
     * Returns the avainsana with the primary key or throws a {@link fi.csc.avaa.tupa.db.NoSuchAvainsanaException} if it could not be found.
     *
     * @param avainsana_id the primary key of the avainsana
     * @return the avainsana
     * @throws fi.csc.avaa.tupa.db.NoSuchAvainsanaException if a avainsana with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Avainsana findByPrimaryKey(int avainsana_id)
        throws NoSuchAvainsanaException, SystemException {
        return findByPrimaryKey((Serializable) avainsana_id);
    }

    /**
     * Returns the avainsana with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the avainsana
     * @return the avainsana, or <code>null</code> if a avainsana with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Avainsana fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        Avainsana avainsana = (Avainsana) EntityCacheUtil.getResult(AvainsanaModelImpl.ENTITY_CACHE_ENABLED,
                AvainsanaImpl.class, primaryKey);

        if (avainsana == _nullAvainsana) {
            return null;
        }

        if (avainsana == null) {
            Session session = null;

            try {
                session = openSession();

                avainsana = (Avainsana) session.get(AvainsanaImpl.class,
                        primaryKey);

                if (avainsana != null) {
                    cacheResult(avainsana);
                } else {
                    EntityCacheUtil.putResult(AvainsanaModelImpl.ENTITY_CACHE_ENABLED,
                        AvainsanaImpl.class, primaryKey, _nullAvainsana);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(AvainsanaModelImpl.ENTITY_CACHE_ENABLED,
                    AvainsanaImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return avainsana;
    }

    /**
     * Returns the avainsana with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param avainsana_id the primary key of the avainsana
     * @return the avainsana, or <code>null</code> if a avainsana with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Avainsana fetchByPrimaryKey(int avainsana_id)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) avainsana_id);
    }

    /**
     * Returns all the avainsanas.
     *
     * @return the avainsanas
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Avainsana> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the avainsanas.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.AvainsanaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of avainsanas
     * @param end the upper bound of the range of avainsanas (not inclusive)
     * @return the range of avainsanas
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Avainsana> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the avainsanas.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.AvainsanaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of avainsanas
     * @param end the upper bound of the range of avainsanas (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of avainsanas
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Avainsana> findAll(int start, int end,
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

        List<Avainsana> list = (List<Avainsana>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_AVAINSANA);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_AVAINSANA;

                if (pagination) {
                    sql = sql.concat(AvainsanaModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<Avainsana>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Avainsana>(list);
                } else {
                    list = (List<Avainsana>) QueryUtil.list(q, getDialect(),
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
     * Removes all the avainsanas from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (Avainsana avainsana : findAll()) {
            remove(avainsana);
        }
    }

    /**
     * Returns the number of avainsanas.
     *
     * @return the number of avainsanas
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

                Query q = session.createQuery(_SQL_COUNT_AVAINSANA);

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
     * Initializes the avainsana persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.fi.csc.avaa.tupa.db.model.Avainsana")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<Avainsana>> listenersList = new ArrayList<ModelListener<Avainsana>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<Avainsana>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(AvainsanaImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
