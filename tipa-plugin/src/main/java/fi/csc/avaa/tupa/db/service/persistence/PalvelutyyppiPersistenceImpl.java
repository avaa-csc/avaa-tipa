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

import fi.csc.avaa.tupa.db.NoSuchPalvelutyyppiException;
import fi.csc.avaa.tupa.db.model.Palvelutyyppi;
import fi.csc.avaa.tupa.db.model.impl.PalvelutyyppiImpl;
import fi.csc.avaa.tupa.db.model.impl.PalvelutyyppiModelImpl;
import fi.csc.avaa.tupa.db.service.persistence.PalvelutyyppiPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the palvelutyyppi service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author pj,jmlehtin
 * @see PalvelutyyppiPersistence
 * @see PalvelutyyppiUtil
 * @generated
 */
public class PalvelutyyppiPersistenceImpl extends BasePersistenceImpl<Palvelutyyppi>
    implements PalvelutyyppiPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link PalvelutyyppiUtil} to access the palvelutyyppi persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = PalvelutyyppiImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(PalvelutyyppiModelImpl.ENTITY_CACHE_ENABLED,
            PalvelutyyppiModelImpl.FINDER_CACHE_ENABLED,
            PalvelutyyppiImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(PalvelutyyppiModelImpl.ENTITY_CACHE_ENABLED,
            PalvelutyyppiModelImpl.FINDER_CACHE_ENABLED,
            PalvelutyyppiImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(PalvelutyyppiModelImpl.ENTITY_CACHE_ENABLED,
            PalvelutyyppiModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_PALVELUTYYPPI = "SELECT palvelutyyppi FROM Palvelutyyppi palvelutyyppi";
    private static final String _SQL_COUNT_PALVELUTYYPPI = "SELECT COUNT(palvelutyyppi) FROM Palvelutyyppi palvelutyyppi";
    private static final String _ORDER_BY_ENTITY_ALIAS = "palvelutyyppi.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Palvelutyyppi exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(PalvelutyyppiPersistenceImpl.class);
    private static Palvelutyyppi _nullPalvelutyyppi = new PalvelutyyppiImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<Palvelutyyppi> toCacheModel() {
                return _nullPalvelutyyppiCacheModel;
            }
        };

    private static CacheModel<Palvelutyyppi> _nullPalvelutyyppiCacheModel = new CacheModel<Palvelutyyppi>() {
            @Override
            public Palvelutyyppi toEntityModel() {
                return _nullPalvelutyyppi;
            }
        };

    public PalvelutyyppiPersistenceImpl() {
        setModelClass(Palvelutyyppi.class);
    }

    /**
     * Caches the palvelutyyppi in the entity cache if it is enabled.
     *
     * @param palvelutyyppi the palvelutyyppi
     */
    @Override
    public void cacheResult(Palvelutyyppi palvelutyyppi) {
        EntityCacheUtil.putResult(PalvelutyyppiModelImpl.ENTITY_CACHE_ENABLED,
            PalvelutyyppiImpl.class, palvelutyyppi.getPrimaryKey(),
            palvelutyyppi);

        palvelutyyppi.resetOriginalValues();
    }

    /**
     * Caches the palvelutyyppis in the entity cache if it is enabled.
     *
     * @param palvelutyyppis the palvelutyyppis
     */
    @Override
    public void cacheResult(List<Palvelutyyppi> palvelutyyppis) {
        for (Palvelutyyppi palvelutyyppi : palvelutyyppis) {
            if (EntityCacheUtil.getResult(
                        PalvelutyyppiModelImpl.ENTITY_CACHE_ENABLED,
                        PalvelutyyppiImpl.class, palvelutyyppi.getPrimaryKey()) == null) {
                cacheResult(palvelutyyppi);
            } else {
                palvelutyyppi.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all palvelutyyppis.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(PalvelutyyppiImpl.class.getName());
        }

        EntityCacheUtil.clearCache(PalvelutyyppiImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the palvelutyyppi.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(Palvelutyyppi palvelutyyppi) {
        EntityCacheUtil.removeResult(PalvelutyyppiModelImpl.ENTITY_CACHE_ENABLED,
            PalvelutyyppiImpl.class, palvelutyyppi.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<Palvelutyyppi> palvelutyyppis) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (Palvelutyyppi palvelutyyppi : palvelutyyppis) {
            EntityCacheUtil.removeResult(PalvelutyyppiModelImpl.ENTITY_CACHE_ENABLED,
                PalvelutyyppiImpl.class, palvelutyyppi.getPrimaryKey());
        }
    }

    /**
     * Creates a new palvelutyyppi with the primary key. Does not add the palvelutyyppi to the database.
     *
     * @param palvelutyyppi_id the primary key for the new palvelutyyppi
     * @return the new palvelutyyppi
     */
    @Override
    public Palvelutyyppi create(int palvelutyyppi_id) {
        Palvelutyyppi palvelutyyppi = new PalvelutyyppiImpl();

        palvelutyyppi.setNew(true);
        palvelutyyppi.setPrimaryKey(palvelutyyppi_id);

        return palvelutyyppi;
    }

    /**
     * Removes the palvelutyyppi with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param palvelutyyppi_id the primary key of the palvelutyyppi
     * @return the palvelutyyppi that was removed
     * @throws fi.csc.avaa.tupa.db.NoSuchPalvelutyyppiException if a palvelutyyppi with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Palvelutyyppi remove(int palvelutyyppi_id)
        throws NoSuchPalvelutyyppiException, SystemException {
        return remove((Serializable) palvelutyyppi_id);
    }

    /**
     * Removes the palvelutyyppi with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the palvelutyyppi
     * @return the palvelutyyppi that was removed
     * @throws fi.csc.avaa.tupa.db.NoSuchPalvelutyyppiException if a palvelutyyppi with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Palvelutyyppi remove(Serializable primaryKey)
        throws NoSuchPalvelutyyppiException, SystemException {
        Session session = null;

        try {
            session = openSession();

            Palvelutyyppi palvelutyyppi = (Palvelutyyppi) session.get(PalvelutyyppiImpl.class,
                    primaryKey);

            if (palvelutyyppi == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchPalvelutyyppiException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(palvelutyyppi);
        } catch (NoSuchPalvelutyyppiException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected Palvelutyyppi removeImpl(Palvelutyyppi palvelutyyppi)
        throws SystemException {
        palvelutyyppi = toUnwrappedModel(palvelutyyppi);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(palvelutyyppi)) {
                palvelutyyppi = (Palvelutyyppi) session.get(PalvelutyyppiImpl.class,
                        palvelutyyppi.getPrimaryKeyObj());
            }

            if (palvelutyyppi != null) {
                session.delete(palvelutyyppi);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (palvelutyyppi != null) {
            clearCache(palvelutyyppi);
        }

        return palvelutyyppi;
    }

    @Override
    public Palvelutyyppi updateImpl(
        fi.csc.avaa.tupa.db.model.Palvelutyyppi palvelutyyppi)
        throws SystemException {
        palvelutyyppi = toUnwrappedModel(palvelutyyppi);

        boolean isNew = palvelutyyppi.isNew();

        Session session = null;

        try {
            session = openSession();

            if (palvelutyyppi.isNew()) {
                session.save(palvelutyyppi);

                palvelutyyppi.setNew(false);
            } else {
                session.merge(palvelutyyppi);
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

        EntityCacheUtil.putResult(PalvelutyyppiModelImpl.ENTITY_CACHE_ENABLED,
            PalvelutyyppiImpl.class, palvelutyyppi.getPrimaryKey(),
            palvelutyyppi);

        return palvelutyyppi;
    }

    protected Palvelutyyppi toUnwrappedModel(Palvelutyyppi palvelutyyppi) {
        if (palvelutyyppi instanceof PalvelutyyppiImpl) {
            return palvelutyyppi;
        }

        PalvelutyyppiImpl palvelutyyppiImpl = new PalvelutyyppiImpl();

        palvelutyyppiImpl.setNew(palvelutyyppi.isNew());
        palvelutyyppiImpl.setPrimaryKey(palvelutyyppi.getPrimaryKey());

        palvelutyyppiImpl.setPalvelutyyppi_id(palvelutyyppi.getPalvelutyyppi_id());
        palvelutyyppiImpl.setTyyppi(palvelutyyppi.getTyyppi());

        return palvelutyyppiImpl;
    }

    /**
     * Returns the palvelutyyppi with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the palvelutyyppi
     * @return the palvelutyyppi
     * @throws fi.csc.avaa.tupa.db.NoSuchPalvelutyyppiException if a palvelutyyppi with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Palvelutyyppi findByPrimaryKey(Serializable primaryKey)
        throws NoSuchPalvelutyyppiException, SystemException {
        Palvelutyyppi palvelutyyppi = fetchByPrimaryKey(primaryKey);

        if (palvelutyyppi == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchPalvelutyyppiException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return palvelutyyppi;
    }

    /**
     * Returns the palvelutyyppi with the primary key or throws a {@link fi.csc.avaa.tupa.db.NoSuchPalvelutyyppiException} if it could not be found.
     *
     * @param palvelutyyppi_id the primary key of the palvelutyyppi
     * @return the palvelutyyppi
     * @throws fi.csc.avaa.tupa.db.NoSuchPalvelutyyppiException if a palvelutyyppi with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Palvelutyyppi findByPrimaryKey(int palvelutyyppi_id)
        throws NoSuchPalvelutyyppiException, SystemException {
        return findByPrimaryKey((Serializable) palvelutyyppi_id);
    }

    /**
     * Returns the palvelutyyppi with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the palvelutyyppi
     * @return the palvelutyyppi, or <code>null</code> if a palvelutyyppi with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Palvelutyyppi fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        Palvelutyyppi palvelutyyppi = (Palvelutyyppi) EntityCacheUtil.getResult(PalvelutyyppiModelImpl.ENTITY_CACHE_ENABLED,
                PalvelutyyppiImpl.class, primaryKey);

        if (palvelutyyppi == _nullPalvelutyyppi) {
            return null;
        }

        if (palvelutyyppi == null) {
            Session session = null;

            try {
                session = openSession();

                palvelutyyppi = (Palvelutyyppi) session.get(PalvelutyyppiImpl.class,
                        primaryKey);

                if (palvelutyyppi != null) {
                    cacheResult(palvelutyyppi);
                } else {
                    EntityCacheUtil.putResult(PalvelutyyppiModelImpl.ENTITY_CACHE_ENABLED,
                        PalvelutyyppiImpl.class, primaryKey, _nullPalvelutyyppi);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(PalvelutyyppiModelImpl.ENTITY_CACHE_ENABLED,
                    PalvelutyyppiImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return palvelutyyppi;
    }

    /**
     * Returns the palvelutyyppi with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param palvelutyyppi_id the primary key of the palvelutyyppi
     * @return the palvelutyyppi, or <code>null</code> if a palvelutyyppi with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Palvelutyyppi fetchByPrimaryKey(int palvelutyyppi_id)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) palvelutyyppi_id);
    }

    /**
     * Returns all the palvelutyyppis.
     *
     * @return the palvelutyyppis
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Palvelutyyppi> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the palvelutyyppis.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.PalvelutyyppiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of palvelutyyppis
     * @param end the upper bound of the range of palvelutyyppis (not inclusive)
     * @return the range of palvelutyyppis
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Palvelutyyppi> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the palvelutyyppis.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.PalvelutyyppiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of palvelutyyppis
     * @param end the upper bound of the range of palvelutyyppis (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of palvelutyyppis
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Palvelutyyppi> findAll(int start, int end,
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

        List<Palvelutyyppi> list = (List<Palvelutyyppi>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_PALVELUTYYPPI);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_PALVELUTYYPPI;

                if (pagination) {
                    sql = sql.concat(PalvelutyyppiModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<Palvelutyyppi>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Palvelutyyppi>(list);
                } else {
                    list = (List<Palvelutyyppi>) QueryUtil.list(q,
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
     * Removes all the palvelutyyppis from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (Palvelutyyppi palvelutyyppi : findAll()) {
            remove(palvelutyyppi);
        }
    }

    /**
     * Returns the number of palvelutyyppis.
     *
     * @return the number of palvelutyyppis
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

                Query q = session.createQuery(_SQL_COUNT_PALVELUTYYPPI);

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
     * Initializes the palvelutyyppi persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.fi.csc.avaa.tupa.db.model.Palvelutyyppi")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<Palvelutyyppi>> listenersList = new ArrayList<ModelListener<Palvelutyyppi>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<Palvelutyyppi>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(PalvelutyyppiImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
