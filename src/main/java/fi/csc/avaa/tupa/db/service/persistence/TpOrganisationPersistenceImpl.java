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

import fi.csc.avaa.tupa.db.NoSuchTpOrganisationException;
import fi.csc.avaa.tupa.db.model.TpOrganisation;
import fi.csc.avaa.tupa.db.model.impl.TpOrganisationImpl;
import fi.csc.avaa.tupa.db.model.impl.TpOrganisationModelImpl;
import fi.csc.avaa.tupa.db.service.persistence.TpOrganisationPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the tp organisation service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CSC
 * @see TpOrganisationPersistence
 * @see TpOrganisationUtil
 * @generated
 */
public class TpOrganisationPersistenceImpl extends BasePersistenceImpl<TpOrganisation>
    implements TpOrganisationPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link TpOrganisationUtil} to access the tp organisation persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = TpOrganisationImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(TpOrganisationModelImpl.ENTITY_CACHE_ENABLED,
            TpOrganisationModelImpl.FINDER_CACHE_ENABLED,
            TpOrganisationImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(TpOrganisationModelImpl.ENTITY_CACHE_ENABLED,
            TpOrganisationModelImpl.FINDER_CACHE_ENABLED,
            TpOrganisationImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TpOrganisationModelImpl.ENTITY_CACHE_ENABLED,
            TpOrganisationModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_TPORGANISATION = "SELECT tpOrganisation FROM TpOrganisation tpOrganisation";
    private static final String _SQL_COUNT_TPORGANISATION = "SELECT COUNT(tpOrganisation) FROM TpOrganisation tpOrganisation";
    private static final String _ORDER_BY_ENTITY_ALIAS = "tpOrganisation.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No TpOrganisation exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(TpOrganisationPersistenceImpl.class);
    private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
                "id"
            });
    private static TpOrganisation _nullTpOrganisation = new TpOrganisationImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<TpOrganisation> toCacheModel() {
                return _nullTpOrganisationCacheModel;
            }
        };

    private static CacheModel<TpOrganisation> _nullTpOrganisationCacheModel = new CacheModel<TpOrganisation>() {
            @Override
            public TpOrganisation toEntityModel() {
                return _nullTpOrganisation;
            }
        };

    public TpOrganisationPersistenceImpl() {
        setModelClass(TpOrganisation.class);
    }

    /**
     * Caches the tp organisation in the entity cache if it is enabled.
     *
     * @param tpOrganisation the tp organisation
     */
    @Override
    public void cacheResult(TpOrganisation tpOrganisation) {
        EntityCacheUtil.putResult(TpOrganisationModelImpl.ENTITY_CACHE_ENABLED,
            TpOrganisationImpl.class, tpOrganisation.getPrimaryKey(),
            tpOrganisation);

        tpOrganisation.resetOriginalValues();
    }

    /**
     * Caches the tp organisations in the entity cache if it is enabled.
     *
     * @param tpOrganisations the tp organisations
     */
    @Override
    public void cacheResult(List<TpOrganisation> tpOrganisations) {
        for (TpOrganisation tpOrganisation : tpOrganisations) {
            if (EntityCacheUtil.getResult(
                        TpOrganisationModelImpl.ENTITY_CACHE_ENABLED,
                        TpOrganisationImpl.class, tpOrganisation.getPrimaryKey()) == null) {
                cacheResult(tpOrganisation);
            } else {
                tpOrganisation.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all tp organisations.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(TpOrganisationImpl.class.getName());
        }

        EntityCacheUtil.clearCache(TpOrganisationImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the tp organisation.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(TpOrganisation tpOrganisation) {
        EntityCacheUtil.removeResult(TpOrganisationModelImpl.ENTITY_CACHE_ENABLED,
            TpOrganisationImpl.class, tpOrganisation.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<TpOrganisation> tpOrganisations) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (TpOrganisation tpOrganisation : tpOrganisations) {
            EntityCacheUtil.removeResult(TpOrganisationModelImpl.ENTITY_CACHE_ENABLED,
                TpOrganisationImpl.class, tpOrganisation.getPrimaryKey());
        }
    }

    /**
     * Creates a new tp organisation with the primary key. Does not add the tp organisation to the database.
     *
     * @param id the primary key for the new tp organisation
     * @return the new tp organisation
     */
    @Override
    public TpOrganisation create(int id) {
        TpOrganisation tpOrganisation = new TpOrganisationImpl();

        tpOrganisation.setNew(true);
        tpOrganisation.setPrimaryKey(id);

        return tpOrganisation;
    }

    /**
     * Removes the tp organisation with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param id the primary key of the tp organisation
     * @return the tp organisation that was removed
     * @throws fi.csc.avaa.tupa.db.NoSuchTpOrganisationException if a tp organisation with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public TpOrganisation remove(int id)
        throws NoSuchTpOrganisationException, SystemException {
        return remove((Serializable) id);
    }

    /**
     * Removes the tp organisation with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the tp organisation
     * @return the tp organisation that was removed
     * @throws fi.csc.avaa.tupa.db.NoSuchTpOrganisationException if a tp organisation with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public TpOrganisation remove(Serializable primaryKey)
        throws NoSuchTpOrganisationException, SystemException {
        Session session = null;

        try {
            session = openSession();

            TpOrganisation tpOrganisation = (TpOrganisation) session.get(TpOrganisationImpl.class,
                    primaryKey);

            if (tpOrganisation == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchTpOrganisationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(tpOrganisation);
        } catch (NoSuchTpOrganisationException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected TpOrganisation removeImpl(TpOrganisation tpOrganisation)
        throws SystemException {
        tpOrganisation = toUnwrappedModel(tpOrganisation);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(tpOrganisation)) {
                tpOrganisation = (TpOrganisation) session.get(TpOrganisationImpl.class,
                        tpOrganisation.getPrimaryKeyObj());
            }

            if (tpOrganisation != null) {
                session.delete(tpOrganisation);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (tpOrganisation != null) {
            clearCache(tpOrganisation);
        }

        return tpOrganisation;
    }

    @Override
    public TpOrganisation updateImpl(
        fi.csc.avaa.tupa.db.model.TpOrganisation tpOrganisation)
        throws SystemException {
        tpOrganisation = toUnwrappedModel(tpOrganisation);

        boolean isNew = tpOrganisation.isNew();

        Session session = null;

        try {
            session = openSession();

            if (tpOrganisation.isNew()) {
                session.save(tpOrganisation);

                tpOrganisation.setNew(false);
            } else {
                session.merge(tpOrganisation);
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

        EntityCacheUtil.putResult(TpOrganisationModelImpl.ENTITY_CACHE_ENABLED,
            TpOrganisationImpl.class, tpOrganisation.getPrimaryKey(),
            tpOrganisation);

        return tpOrganisation;
    }

    protected TpOrganisation toUnwrappedModel(TpOrganisation tpOrganisation) {
        if (tpOrganisation instanceof TpOrganisationImpl) {
            return tpOrganisation;
        }

        TpOrganisationImpl tpOrganisationImpl = new TpOrganisationImpl();

        tpOrganisationImpl.setNew(tpOrganisation.isNew());
        tpOrganisationImpl.setPrimaryKey(tpOrganisation.getPrimaryKey());

        tpOrganisationImpl.setId(tpOrganisation.getId());
        tpOrganisationImpl.setName_EN(tpOrganisation.getName_EN());
        tpOrganisationImpl.setName_FI(tpOrganisation.getName_FI());
        tpOrganisationImpl.setIsni(tpOrganisation.getIsni());
        tpOrganisationImpl.setMotherOrganisationsIds(tpOrganisation.getMotherOrganisationsIds());
        tpOrganisationImpl.setCountry(tpOrganisation.getCountry());

        return tpOrganisationImpl;
    }

    /**
     * Returns the tp organisation with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the tp organisation
     * @return the tp organisation
     * @throws fi.csc.avaa.tupa.db.NoSuchTpOrganisationException if a tp organisation with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public TpOrganisation findByPrimaryKey(Serializable primaryKey)
        throws NoSuchTpOrganisationException, SystemException {
        TpOrganisation tpOrganisation = fetchByPrimaryKey(primaryKey);

        if (tpOrganisation == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchTpOrganisationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return tpOrganisation;
    }

    /**
     * Returns the tp organisation with the primary key or throws a {@link fi.csc.avaa.tupa.db.NoSuchTpOrganisationException} if it could not be found.
     *
     * @param id the primary key of the tp organisation
     * @return the tp organisation
     * @throws fi.csc.avaa.tupa.db.NoSuchTpOrganisationException if a tp organisation with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public TpOrganisation findByPrimaryKey(int id)
        throws NoSuchTpOrganisationException, SystemException {
        return findByPrimaryKey((Serializable) id);
    }

    /**
     * Returns the tp organisation with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the tp organisation
     * @return the tp organisation, or <code>null</code> if a tp organisation with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public TpOrganisation fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        TpOrganisation tpOrganisation = (TpOrganisation) EntityCacheUtil.getResult(TpOrganisationModelImpl.ENTITY_CACHE_ENABLED,
                TpOrganisationImpl.class, primaryKey);

        if (tpOrganisation == _nullTpOrganisation) {
            return null;
        }

        if (tpOrganisation == null) {
            Session session = null;

            try {
                session = openSession();

                tpOrganisation = (TpOrganisation) session.get(TpOrganisationImpl.class,
                        primaryKey);

                if (tpOrganisation != null) {
                    cacheResult(tpOrganisation);
                } else {
                    EntityCacheUtil.putResult(TpOrganisationModelImpl.ENTITY_CACHE_ENABLED,
                        TpOrganisationImpl.class, primaryKey,
                        _nullTpOrganisation);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(TpOrganisationModelImpl.ENTITY_CACHE_ENABLED,
                    TpOrganisationImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return tpOrganisation;
    }

    /**
     * Returns the tp organisation with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param id the primary key of the tp organisation
     * @return the tp organisation, or <code>null</code> if a tp organisation with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public TpOrganisation fetchByPrimaryKey(int id) throws SystemException {
        return fetchByPrimaryKey((Serializable) id);
    }

    /**
     * Returns all the tp organisations.
     *
     * @return the tp organisations
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<TpOrganisation> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the tp organisations.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.TpOrganisationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of tp organisations
     * @param end the upper bound of the range of tp organisations (not inclusive)
     * @return the range of tp organisations
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<TpOrganisation> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the tp organisations.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.TpOrganisationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of tp organisations
     * @param end the upper bound of the range of tp organisations (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of tp organisations
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<TpOrganisation> findAll(int start, int end,
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

        List<TpOrganisation> list = (List<TpOrganisation>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_TPORGANISATION);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_TPORGANISATION;

                if (pagination) {
                    sql = sql.concat(TpOrganisationModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<TpOrganisation>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<TpOrganisation>(list);
                } else {
                    list = (List<TpOrganisation>) QueryUtil.list(q,
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
     * Removes all the tp organisations from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (TpOrganisation tpOrganisation : findAll()) {
            remove(tpOrganisation);
        }
    }

    /**
     * Returns the number of tp organisations.
     *
     * @return the number of tp organisations
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

                Query q = session.createQuery(_SQL_COUNT_TPORGANISATION);

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
     * Initializes the tp organisation persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.fi.csc.avaa.tupa.db.model.TpOrganisation")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<TpOrganisation>> listenersList = new ArrayList<ModelListener<TpOrganisation>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<TpOrganisation>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(TpOrganisationImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
