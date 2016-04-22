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

import fi.csc.avaa.tupa.db.NoSuchPalvelu_PalvelutyypitException;
import fi.csc.avaa.tupa.db.model.Palvelu_Palvelutyypit;
import fi.csc.avaa.tupa.db.model.impl.Palvelu_PalvelutyypitImpl;
import fi.csc.avaa.tupa.db.model.impl.Palvelu_PalvelutyypitModelImpl;
import fi.csc.avaa.tupa.db.service.persistence.Palvelu_PalvelutyypitPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the palvelu_ palvelutyypit service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author pj,jmlehtin
 * @see Palvelu_PalvelutyypitPersistence
 * @see Palvelu_PalvelutyypitUtil
 * @generated
 */
public class Palvelu_PalvelutyypitPersistenceImpl extends BasePersistenceImpl<Palvelu_Palvelutyypit>
    implements Palvelu_PalvelutyypitPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link Palvelu_PalvelutyypitUtil} to access the palvelu_ palvelutyypit persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = Palvelu_PalvelutyypitImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(Palvelu_PalvelutyypitModelImpl.ENTITY_CACHE_ENABLED,
            Palvelu_PalvelutyypitModelImpl.FINDER_CACHE_ENABLED,
            Palvelu_PalvelutyypitImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(Palvelu_PalvelutyypitModelImpl.ENTITY_CACHE_ENABLED,
            Palvelu_PalvelutyypitModelImpl.FINDER_CACHE_ENABLED,
            Palvelu_PalvelutyypitImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(Palvelu_PalvelutyypitModelImpl.ENTITY_CACHE_ENABLED,
            Palvelu_PalvelutyypitModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_PALVELU_PALVELUTYYPIT = "SELECT palvelu_Palvelutyypit FROM Palvelu_Palvelutyypit palvelu_Palvelutyypit";
    private static final String _SQL_COUNT_PALVELU_PALVELUTYYPIT = "SELECT COUNT(palvelu_Palvelutyypit) FROM Palvelu_Palvelutyypit palvelu_Palvelutyypit";
    private static final String _ORDER_BY_ENTITY_ALIAS = "palvelu_Palvelutyypit.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Palvelu_Palvelutyypit exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(Palvelu_PalvelutyypitPersistenceImpl.class);
    private static Palvelu_Palvelutyypit _nullPalvelu_Palvelutyypit = new Palvelu_PalvelutyypitImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<Palvelu_Palvelutyypit> toCacheModel() {
                return _nullPalvelu_PalvelutyypitCacheModel;
            }
        };

    private static CacheModel<Palvelu_Palvelutyypit> _nullPalvelu_PalvelutyypitCacheModel =
        new CacheModel<Palvelu_Palvelutyypit>() {
            @Override
            public Palvelu_Palvelutyypit toEntityModel() {
                return _nullPalvelu_Palvelutyypit;
            }
        };

    public Palvelu_PalvelutyypitPersistenceImpl() {
        setModelClass(Palvelu_Palvelutyypit.class);
    }

    /**
     * Caches the palvelu_ palvelutyypit in the entity cache if it is enabled.
     *
     * @param palvelu_Palvelutyypit the palvelu_ palvelutyypit
     */
    @Override
    public void cacheResult(Palvelu_Palvelutyypit palvelu_Palvelutyypit) {
        EntityCacheUtil.putResult(Palvelu_PalvelutyypitModelImpl.ENTITY_CACHE_ENABLED,
            Palvelu_PalvelutyypitImpl.class,
            palvelu_Palvelutyypit.getPrimaryKey(), palvelu_Palvelutyypit);

        palvelu_Palvelutyypit.resetOriginalValues();
    }

    /**
     * Caches the palvelu_ palvelutyypits in the entity cache if it is enabled.
     *
     * @param palvelu_Palvelutyypits the palvelu_ palvelutyypits
     */
    @Override
    public void cacheResult(List<Palvelu_Palvelutyypit> palvelu_Palvelutyypits) {
        for (Palvelu_Palvelutyypit palvelu_Palvelutyypit : palvelu_Palvelutyypits) {
            if (EntityCacheUtil.getResult(
                        Palvelu_PalvelutyypitModelImpl.ENTITY_CACHE_ENABLED,
                        Palvelu_PalvelutyypitImpl.class,
                        palvelu_Palvelutyypit.getPrimaryKey()) == null) {
                cacheResult(palvelu_Palvelutyypit);
            } else {
                palvelu_Palvelutyypit.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all palvelu_ palvelutyypits.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(Palvelu_PalvelutyypitImpl.class.getName());
        }

        EntityCacheUtil.clearCache(Palvelu_PalvelutyypitImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the palvelu_ palvelutyypit.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(Palvelu_Palvelutyypit palvelu_Palvelutyypit) {
        EntityCacheUtil.removeResult(Palvelu_PalvelutyypitModelImpl.ENTITY_CACHE_ENABLED,
            Palvelu_PalvelutyypitImpl.class,
            palvelu_Palvelutyypit.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<Palvelu_Palvelutyypit> palvelu_Palvelutyypits) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (Palvelu_Palvelutyypit palvelu_Palvelutyypit : palvelu_Palvelutyypits) {
            EntityCacheUtil.removeResult(Palvelu_PalvelutyypitModelImpl.ENTITY_CACHE_ENABLED,
                Palvelu_PalvelutyypitImpl.class,
                palvelu_Palvelutyypit.getPrimaryKey());
        }
    }

    /**
     * Creates a new palvelu_ palvelutyypit with the primary key. Does not add the palvelu_ palvelutyypit to the database.
     *
     * @param palvelu_PalvelutyypitPK the primary key for the new palvelu_ palvelutyypit
     * @return the new palvelu_ palvelutyypit
     */
    @Override
    public Palvelu_Palvelutyypit create(
        Palvelu_PalvelutyypitPK palvelu_PalvelutyypitPK) {
        Palvelu_Palvelutyypit palvelu_Palvelutyypit = new Palvelu_PalvelutyypitImpl();

        palvelu_Palvelutyypit.setNew(true);
        palvelu_Palvelutyypit.setPrimaryKey(palvelu_PalvelutyypitPK);

        return palvelu_Palvelutyypit;
    }

    /**
     * Removes the palvelu_ palvelutyypit with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param palvelu_PalvelutyypitPK the primary key of the palvelu_ palvelutyypit
     * @return the palvelu_ palvelutyypit that was removed
     * @throws fi.csc.avaa.tupa.db.NoSuchPalvelu_PalvelutyypitException if a palvelu_ palvelutyypit with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Palvelu_Palvelutyypit remove(
        Palvelu_PalvelutyypitPK palvelu_PalvelutyypitPK)
        throws NoSuchPalvelu_PalvelutyypitException, SystemException {
        return remove((Serializable) palvelu_PalvelutyypitPK);
    }

    /**
     * Removes the palvelu_ palvelutyypit with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the palvelu_ palvelutyypit
     * @return the palvelu_ palvelutyypit that was removed
     * @throws fi.csc.avaa.tupa.db.NoSuchPalvelu_PalvelutyypitException if a palvelu_ palvelutyypit with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Palvelu_Palvelutyypit remove(Serializable primaryKey)
        throws NoSuchPalvelu_PalvelutyypitException, SystemException {
        Session session = null;

        try {
            session = openSession();

            Palvelu_Palvelutyypit palvelu_Palvelutyypit = (Palvelu_Palvelutyypit) session.get(Palvelu_PalvelutyypitImpl.class,
                    primaryKey);

            if (palvelu_Palvelutyypit == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchPalvelu_PalvelutyypitException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(palvelu_Palvelutyypit);
        } catch (NoSuchPalvelu_PalvelutyypitException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected Palvelu_Palvelutyypit removeImpl(
        Palvelu_Palvelutyypit palvelu_Palvelutyypit) throws SystemException {
        palvelu_Palvelutyypit = toUnwrappedModel(palvelu_Palvelutyypit);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(palvelu_Palvelutyypit)) {
                palvelu_Palvelutyypit = (Palvelu_Palvelutyypit) session.get(Palvelu_PalvelutyypitImpl.class,
                        palvelu_Palvelutyypit.getPrimaryKeyObj());
            }

            if (palvelu_Palvelutyypit != null) {
                session.delete(palvelu_Palvelutyypit);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (palvelu_Palvelutyypit != null) {
            clearCache(palvelu_Palvelutyypit);
        }

        return palvelu_Palvelutyypit;
    }

    @Override
    public Palvelu_Palvelutyypit updateImpl(
        fi.csc.avaa.tupa.db.model.Palvelu_Palvelutyypit palvelu_Palvelutyypit)
        throws SystemException {
        palvelu_Palvelutyypit = toUnwrappedModel(palvelu_Palvelutyypit);

        boolean isNew = palvelu_Palvelutyypit.isNew();

        Session session = null;

        try {
            session = openSession();

            if (palvelu_Palvelutyypit.isNew()) {
                session.save(palvelu_Palvelutyypit);

                palvelu_Palvelutyypit.setNew(false);
            } else {
                session.merge(palvelu_Palvelutyypit);
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

        EntityCacheUtil.putResult(Palvelu_PalvelutyypitModelImpl.ENTITY_CACHE_ENABLED,
            Palvelu_PalvelutyypitImpl.class,
            palvelu_Palvelutyypit.getPrimaryKey(), palvelu_Palvelutyypit);

        return palvelu_Palvelutyypit;
    }

    protected Palvelu_Palvelutyypit toUnwrappedModel(
        Palvelu_Palvelutyypit palvelu_Palvelutyypit) {
        if (palvelu_Palvelutyypit instanceof Palvelu_PalvelutyypitImpl) {
            return palvelu_Palvelutyypit;
        }

        Palvelu_PalvelutyypitImpl palvelu_PalvelutyypitImpl = new Palvelu_PalvelutyypitImpl();

        palvelu_PalvelutyypitImpl.setNew(palvelu_Palvelutyypit.isNew());
        palvelu_PalvelutyypitImpl.setPrimaryKey(palvelu_Palvelutyypit.getPrimaryKey());

        palvelu_PalvelutyypitImpl.setPalvelu_id(palvelu_Palvelutyypit.getPalvelu_id());
        palvelu_PalvelutyypitImpl.setPalvelutyyppi_id(palvelu_Palvelutyypit.getPalvelutyyppi_id());

        return palvelu_PalvelutyypitImpl;
    }

    /**
     * Returns the palvelu_ palvelutyypit with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the palvelu_ palvelutyypit
     * @return the palvelu_ palvelutyypit
     * @throws fi.csc.avaa.tupa.db.NoSuchPalvelu_PalvelutyypitException if a palvelu_ palvelutyypit with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Palvelu_Palvelutyypit findByPrimaryKey(Serializable primaryKey)
        throws NoSuchPalvelu_PalvelutyypitException, SystemException {
        Palvelu_Palvelutyypit palvelu_Palvelutyypit = fetchByPrimaryKey(primaryKey);

        if (palvelu_Palvelutyypit == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchPalvelu_PalvelutyypitException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return palvelu_Palvelutyypit;
    }

    /**
     * Returns the palvelu_ palvelutyypit with the primary key or throws a {@link fi.csc.avaa.tupa.db.NoSuchPalvelu_PalvelutyypitException} if it could not be found.
     *
     * @param palvelu_PalvelutyypitPK the primary key of the palvelu_ palvelutyypit
     * @return the palvelu_ palvelutyypit
     * @throws fi.csc.avaa.tupa.db.NoSuchPalvelu_PalvelutyypitException if a palvelu_ palvelutyypit with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Palvelu_Palvelutyypit findByPrimaryKey(
        Palvelu_PalvelutyypitPK palvelu_PalvelutyypitPK)
        throws NoSuchPalvelu_PalvelutyypitException, SystemException {
        return findByPrimaryKey((Serializable) palvelu_PalvelutyypitPK);
    }

    /**
     * Returns the palvelu_ palvelutyypit with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the palvelu_ palvelutyypit
     * @return the palvelu_ palvelutyypit, or <code>null</code> if a palvelu_ palvelutyypit with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Palvelu_Palvelutyypit fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        Palvelu_Palvelutyypit palvelu_Palvelutyypit = (Palvelu_Palvelutyypit) EntityCacheUtil.getResult(Palvelu_PalvelutyypitModelImpl.ENTITY_CACHE_ENABLED,
                Palvelu_PalvelutyypitImpl.class, primaryKey);

        if (palvelu_Palvelutyypit == _nullPalvelu_Palvelutyypit) {
            return null;
        }

        if (palvelu_Palvelutyypit == null) {
            Session session = null;

            try {
                session = openSession();

                palvelu_Palvelutyypit = (Palvelu_Palvelutyypit) session.get(Palvelu_PalvelutyypitImpl.class,
                        primaryKey);

                if (palvelu_Palvelutyypit != null) {
                    cacheResult(palvelu_Palvelutyypit);
                } else {
                    EntityCacheUtil.putResult(Palvelu_PalvelutyypitModelImpl.ENTITY_CACHE_ENABLED,
                        Palvelu_PalvelutyypitImpl.class, primaryKey,
                        _nullPalvelu_Palvelutyypit);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(Palvelu_PalvelutyypitModelImpl.ENTITY_CACHE_ENABLED,
                    Palvelu_PalvelutyypitImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return palvelu_Palvelutyypit;
    }

    /**
     * Returns the palvelu_ palvelutyypit with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param palvelu_PalvelutyypitPK the primary key of the palvelu_ palvelutyypit
     * @return the palvelu_ palvelutyypit, or <code>null</code> if a palvelu_ palvelutyypit with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Palvelu_Palvelutyypit fetchByPrimaryKey(
        Palvelu_PalvelutyypitPK palvelu_PalvelutyypitPK)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) palvelu_PalvelutyypitPK);
    }

    /**
     * Returns all the palvelu_ palvelutyypits.
     *
     * @return the palvelu_ palvelutyypits
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Palvelu_Palvelutyypit> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the palvelu_ palvelutyypits.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.Palvelu_PalvelutyypitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of palvelu_ palvelutyypits
     * @param end the upper bound of the range of palvelu_ palvelutyypits (not inclusive)
     * @return the range of palvelu_ palvelutyypits
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Palvelu_Palvelutyypit> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the palvelu_ palvelutyypits.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.Palvelu_PalvelutyypitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of palvelu_ palvelutyypits
     * @param end the upper bound of the range of palvelu_ palvelutyypits (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of palvelu_ palvelutyypits
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Palvelu_Palvelutyypit> findAll(int start, int end,
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

        List<Palvelu_Palvelutyypit> list = (List<Palvelu_Palvelutyypit>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_PALVELU_PALVELUTYYPIT);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_PALVELU_PALVELUTYYPIT;

                if (pagination) {
                    sql = sql.concat(Palvelu_PalvelutyypitModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<Palvelu_Palvelutyypit>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Palvelu_Palvelutyypit>(list);
                } else {
                    list = (List<Palvelu_Palvelutyypit>) QueryUtil.list(q,
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
     * Removes all the palvelu_ palvelutyypits from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (Palvelu_Palvelutyypit palvelu_Palvelutyypit : findAll()) {
            remove(palvelu_Palvelutyypit);
        }
    }

    /**
     * Returns the number of palvelu_ palvelutyypits.
     *
     * @return the number of palvelu_ palvelutyypits
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

                Query q = session.createQuery(_SQL_COUNT_PALVELU_PALVELUTYYPIT);

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
     * Initializes the palvelu_ palvelutyypit persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.fi.csc.avaa.tupa.db.model.Palvelu_Palvelutyypit")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<Palvelu_Palvelutyypit>> listenersList = new ArrayList<ModelListener<Palvelu_Palvelutyypit>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<Palvelu_Palvelutyypit>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(Palvelu_PalvelutyypitImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
