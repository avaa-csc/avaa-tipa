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

import fi.csc.avaa.tupa.db.NoSuchPalveluException;
import fi.csc.avaa.tupa.db.model.Palvelu;
import fi.csc.avaa.tupa.db.model.impl.PalveluImpl;
import fi.csc.avaa.tupa.db.model.impl.PalveluModelImpl;
import fi.csc.avaa.tupa.db.service.persistence.PalveluPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the palvelu service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author pj,jmlehtin
 * @see PalveluPersistence
 * @see PalveluUtil
 * @generated
 */
public class PalveluPersistenceImpl extends BasePersistenceImpl<Palvelu>
    implements PalveluPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link PalveluUtil} to access the palvelu persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = PalveluImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(PalveluModelImpl.ENTITY_CACHE_ENABLED,
            PalveluModelImpl.FINDER_CACHE_ENABLED, PalveluImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(PalveluModelImpl.ENTITY_CACHE_ENABLED,
            PalveluModelImpl.FINDER_CACHE_ENABLED, PalveluImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(PalveluModelImpl.ENTITY_CACHE_ENABLED,
            PalveluModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_PALVELU = "SELECT palvelu FROM Palvelu palvelu";
    private static final String _SQL_COUNT_PALVELU = "SELECT COUNT(palvelu) FROM Palvelu palvelu";
    private static final String _ORDER_BY_ENTITY_ALIAS = "palvelu.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Palvelu exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(PalveluPersistenceImpl.class);
    private static Palvelu _nullPalvelu = new PalveluImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<Palvelu> toCacheModel() {
                return _nullPalveluCacheModel;
            }
        };

    private static CacheModel<Palvelu> _nullPalveluCacheModel = new CacheModel<Palvelu>() {
            @Override
            public Palvelu toEntityModel() {
                return _nullPalvelu;
            }
        };

    public PalveluPersistenceImpl() {
        setModelClass(Palvelu.class);
    }

    /**
     * Caches the palvelu in the entity cache if it is enabled.
     *
     * @param palvelu the palvelu
     */
    @Override
    public void cacheResult(Palvelu palvelu) {
        EntityCacheUtil.putResult(PalveluModelImpl.ENTITY_CACHE_ENABLED,
            PalveluImpl.class, palvelu.getPrimaryKey(), palvelu);

        palvelu.resetOriginalValues();
    }

    /**
     * Caches the palvelus in the entity cache if it is enabled.
     *
     * @param palvelus the palvelus
     */
    @Override
    public void cacheResult(List<Palvelu> palvelus) {
        for (Palvelu palvelu : palvelus) {
            if (EntityCacheUtil.getResult(
                        PalveluModelImpl.ENTITY_CACHE_ENABLED,
                        PalveluImpl.class, palvelu.getPrimaryKey()) == null) {
                cacheResult(palvelu);
            } else {
                palvelu.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all palvelus.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(PalveluImpl.class.getName());
        }

        EntityCacheUtil.clearCache(PalveluImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the palvelu.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(Palvelu palvelu) {
        EntityCacheUtil.removeResult(PalveluModelImpl.ENTITY_CACHE_ENABLED,
            PalveluImpl.class, palvelu.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<Palvelu> palvelus) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (Palvelu palvelu : palvelus) {
            EntityCacheUtil.removeResult(PalveluModelImpl.ENTITY_CACHE_ENABLED,
                PalveluImpl.class, palvelu.getPrimaryKey());
        }
    }

    /**
     * Creates a new palvelu with the primary key. Does not add the palvelu to the database.
     *
     * @param palvelu_id the primary key for the new palvelu
     * @return the new palvelu
     */
    @Override
    public Palvelu create(int palvelu_id) {
        Palvelu palvelu = new PalveluImpl();

        palvelu.setNew(true);
        palvelu.setPrimaryKey(palvelu_id);

        return palvelu;
    }

    /**
     * Removes the palvelu with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param palvelu_id the primary key of the palvelu
     * @return the palvelu that was removed
     * @throws fi.csc.avaa.tupa.db.NoSuchPalveluException if a palvelu with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Palvelu remove(int palvelu_id)
        throws NoSuchPalveluException, SystemException {
        return remove((Serializable) palvelu_id);
    }

    /**
     * Removes the palvelu with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the palvelu
     * @return the palvelu that was removed
     * @throws fi.csc.avaa.tupa.db.NoSuchPalveluException if a palvelu with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Palvelu remove(Serializable primaryKey)
        throws NoSuchPalveluException, SystemException {
        Session session = null;

        try {
            session = openSession();

            Palvelu palvelu = (Palvelu) session.get(PalveluImpl.class,
                    primaryKey);

            if (palvelu == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchPalveluException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(palvelu);
        } catch (NoSuchPalveluException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected Palvelu removeImpl(Palvelu palvelu) throws SystemException {
        palvelu = toUnwrappedModel(palvelu);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(palvelu)) {
                palvelu = (Palvelu) session.get(PalveluImpl.class,
                        palvelu.getPrimaryKeyObj());
            }

            if (palvelu != null) {
                session.delete(palvelu);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (palvelu != null) {
            clearCache(palvelu);
        }

        return palvelu;
    }

    @Override
    public Palvelu updateImpl(fi.csc.avaa.tupa.db.model.Palvelu palvelu)
        throws SystemException {
        palvelu = toUnwrappedModel(palvelu);

        boolean isNew = palvelu.isNew();

        Session session = null;

        try {
            session = openSession();

            if (palvelu.isNew()) {
                session.save(palvelu);

                palvelu.setNew(false);
            } else {
                session.merge(palvelu);
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

        EntityCacheUtil.putResult(PalveluModelImpl.ENTITY_CACHE_ENABLED,
            PalveluImpl.class, palvelu.getPrimaryKey(), palvelu);

        return palvelu;
    }

    protected Palvelu toUnwrappedModel(Palvelu palvelu) {
        if (palvelu instanceof PalveluImpl) {
            return palvelu;
        }

        PalveluImpl palveluImpl = new PalveluImpl();

        palveluImpl.setNew(palvelu.isNew());
        palveluImpl.setPrimaryKey(palvelu.getPrimaryKey());

        palveluImpl.setPalvelu_id(palvelu.getPalvelu_id());
        palveluImpl.setNimi(palvelu.getNimi());
        palveluImpl.setName(palvelu.getName());
        palveluImpl.setKuvaus(palvelu.getKuvaus());
        palveluImpl.setDescription(palvelu.getDescription());
        palveluImpl.setURLen(palvelu.getURLen());
        palveluImpl.setURLfi(palvelu.getURLfi());
        palveluImpl.setPaikkatyyppi(palvelu.getPaikkatyyppi());
        palveluImpl.setKatuosoite(palvelu.getKatuosoite());
        palveluImpl.setKaupunki(palvelu.getKaupunki());
        palveluImpl.setLat(palvelu.getLat());
        palveluImpl.setLon(palvelu.getLon());

        return palveluImpl;
    }

    /**
     * Returns the palvelu with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the palvelu
     * @return the palvelu
     * @throws fi.csc.avaa.tupa.db.NoSuchPalveluException if a palvelu with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Palvelu findByPrimaryKey(Serializable primaryKey)
        throws NoSuchPalveluException, SystemException {
        Palvelu palvelu = fetchByPrimaryKey(primaryKey);

        if (palvelu == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchPalveluException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return palvelu;
    }

    /**
     * Returns the palvelu with the primary key or throws a {@link fi.csc.avaa.tupa.db.NoSuchPalveluException} if it could not be found.
     *
     * @param palvelu_id the primary key of the palvelu
     * @return the palvelu
     * @throws fi.csc.avaa.tupa.db.NoSuchPalveluException if a palvelu with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Palvelu findByPrimaryKey(int palvelu_id)
        throws NoSuchPalveluException, SystemException {
        return findByPrimaryKey((Serializable) palvelu_id);
    }

    /**
     * Returns the palvelu with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the palvelu
     * @return the palvelu, or <code>null</code> if a palvelu with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Palvelu fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        Palvelu palvelu = (Palvelu) EntityCacheUtil.getResult(PalveluModelImpl.ENTITY_CACHE_ENABLED,
                PalveluImpl.class, primaryKey);

        if (palvelu == _nullPalvelu) {
            return null;
        }

        if (palvelu == null) {
            Session session = null;

            try {
                session = openSession();

                palvelu = (Palvelu) session.get(PalveluImpl.class, primaryKey);

                if (palvelu != null) {
                    cacheResult(palvelu);
                } else {
                    EntityCacheUtil.putResult(PalveluModelImpl.ENTITY_CACHE_ENABLED,
                        PalveluImpl.class, primaryKey, _nullPalvelu);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(PalveluModelImpl.ENTITY_CACHE_ENABLED,
                    PalveluImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return palvelu;
    }

    /**
     * Returns the palvelu with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param palvelu_id the primary key of the palvelu
     * @return the palvelu, or <code>null</code> if a palvelu with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Palvelu fetchByPrimaryKey(int palvelu_id) throws SystemException {
        return fetchByPrimaryKey((Serializable) palvelu_id);
    }

    /**
     * Returns all the palvelus.
     *
     * @return the palvelus
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Palvelu> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the palvelus.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.PalveluModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of palvelus
     * @param end the upper bound of the range of palvelus (not inclusive)
     * @return the range of palvelus
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Palvelu> findAll(int start, int end) throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the palvelus.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.PalveluModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of palvelus
     * @param end the upper bound of the range of palvelus (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of palvelus
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Palvelu> findAll(int start, int end,
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

        List<Palvelu> list = (List<Palvelu>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_PALVELU);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_PALVELU;

                if (pagination) {
                    sql = sql.concat(PalveluModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<Palvelu>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Palvelu>(list);
                } else {
                    list = (List<Palvelu>) QueryUtil.list(q, getDialect(),
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
     * Removes all the palvelus from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (Palvelu palvelu : findAll()) {
            remove(palvelu);
        }
    }

    /**
     * Returns the number of palvelus.
     *
     * @return the number of palvelus
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

                Query q = session.createQuery(_SQL_COUNT_PALVELU);

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
     * Initializes the palvelu persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.fi.csc.avaa.tupa.db.model.Palvelu")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<Palvelu>> listenersList = new ArrayList<ModelListener<Palvelu>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<Palvelu>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(PalveluImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
