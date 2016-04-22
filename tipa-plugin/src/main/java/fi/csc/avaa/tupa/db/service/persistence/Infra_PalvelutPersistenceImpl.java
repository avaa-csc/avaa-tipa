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

import fi.csc.avaa.tupa.db.NoSuchInfra_PalvelutException;
import fi.csc.avaa.tupa.db.model.Infra_Palvelut;
import fi.csc.avaa.tupa.db.model.impl.Infra_PalvelutImpl;
import fi.csc.avaa.tupa.db.model.impl.Infra_PalvelutModelImpl;
import fi.csc.avaa.tupa.db.service.persistence.Infra_PalvelutPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the infra_ palvelut service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author pj,jmlehtin
 * @see Infra_PalvelutPersistence
 * @see Infra_PalvelutUtil
 * @generated
 */
public class Infra_PalvelutPersistenceImpl extends BasePersistenceImpl<Infra_Palvelut>
    implements Infra_PalvelutPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link Infra_PalvelutUtil} to access the infra_ palvelut persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = Infra_PalvelutImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(Infra_PalvelutModelImpl.ENTITY_CACHE_ENABLED,
            Infra_PalvelutModelImpl.FINDER_CACHE_ENABLED,
            Infra_PalvelutImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(Infra_PalvelutModelImpl.ENTITY_CACHE_ENABLED,
            Infra_PalvelutModelImpl.FINDER_CACHE_ENABLED,
            Infra_PalvelutImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(Infra_PalvelutModelImpl.ENTITY_CACHE_ENABLED,
            Infra_PalvelutModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_INFRA_PALVELUT = "SELECT infra_Palvelut FROM Infra_Palvelut infra_Palvelut";
    private static final String _SQL_COUNT_INFRA_PALVELUT = "SELECT COUNT(infra_Palvelut) FROM Infra_Palvelut infra_Palvelut";
    private static final String _ORDER_BY_ENTITY_ALIAS = "infra_Palvelut.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Infra_Palvelut exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(Infra_PalvelutPersistenceImpl.class);
    private static Infra_Palvelut _nullInfra_Palvelut = new Infra_PalvelutImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<Infra_Palvelut> toCacheModel() {
                return _nullInfra_PalvelutCacheModel;
            }
        };

    private static CacheModel<Infra_Palvelut> _nullInfra_PalvelutCacheModel = new CacheModel<Infra_Palvelut>() {
            @Override
            public Infra_Palvelut toEntityModel() {
                return _nullInfra_Palvelut;
            }
        };

    public Infra_PalvelutPersistenceImpl() {
        setModelClass(Infra_Palvelut.class);
    }

    /**
     * Caches the infra_ palvelut in the entity cache if it is enabled.
     *
     * @param infra_Palvelut the infra_ palvelut
     */
    @Override
    public void cacheResult(Infra_Palvelut infra_Palvelut) {
        EntityCacheUtil.putResult(Infra_PalvelutModelImpl.ENTITY_CACHE_ENABLED,
            Infra_PalvelutImpl.class, infra_Palvelut.getPrimaryKey(),
            infra_Palvelut);

        infra_Palvelut.resetOriginalValues();
    }

    /**
     * Caches the infra_ palveluts in the entity cache if it is enabled.
     *
     * @param infra_Palveluts the infra_ palveluts
     */
    @Override
    public void cacheResult(List<Infra_Palvelut> infra_Palveluts) {
        for (Infra_Palvelut infra_Palvelut : infra_Palveluts) {
            if (EntityCacheUtil.getResult(
                        Infra_PalvelutModelImpl.ENTITY_CACHE_ENABLED,
                        Infra_PalvelutImpl.class, infra_Palvelut.getPrimaryKey()) == null) {
                cacheResult(infra_Palvelut);
            } else {
                infra_Palvelut.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all infra_ palveluts.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(Infra_PalvelutImpl.class.getName());
        }

        EntityCacheUtil.clearCache(Infra_PalvelutImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the infra_ palvelut.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(Infra_Palvelut infra_Palvelut) {
        EntityCacheUtil.removeResult(Infra_PalvelutModelImpl.ENTITY_CACHE_ENABLED,
            Infra_PalvelutImpl.class, infra_Palvelut.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<Infra_Palvelut> infra_Palveluts) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (Infra_Palvelut infra_Palvelut : infra_Palveluts) {
            EntityCacheUtil.removeResult(Infra_PalvelutModelImpl.ENTITY_CACHE_ENABLED,
                Infra_PalvelutImpl.class, infra_Palvelut.getPrimaryKey());
        }
    }

    /**
     * Creates a new infra_ palvelut with the primary key. Does not add the infra_ palvelut to the database.
     *
     * @param infra_PalvelutPK the primary key for the new infra_ palvelut
     * @return the new infra_ palvelut
     */
    @Override
    public Infra_Palvelut create(Infra_PalvelutPK infra_PalvelutPK) {
        Infra_Palvelut infra_Palvelut = new Infra_PalvelutImpl();

        infra_Palvelut.setNew(true);
        infra_Palvelut.setPrimaryKey(infra_PalvelutPK);

        return infra_Palvelut;
    }

    /**
     * Removes the infra_ palvelut with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param infra_PalvelutPK the primary key of the infra_ palvelut
     * @return the infra_ palvelut that was removed
     * @throws fi.csc.avaa.tupa.db.NoSuchInfra_PalvelutException if a infra_ palvelut with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Infra_Palvelut remove(Infra_PalvelutPK infra_PalvelutPK)
        throws NoSuchInfra_PalvelutException, SystemException {
        return remove((Serializable) infra_PalvelutPK);
    }

    /**
     * Removes the infra_ palvelut with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the infra_ palvelut
     * @return the infra_ palvelut that was removed
     * @throws fi.csc.avaa.tupa.db.NoSuchInfra_PalvelutException if a infra_ palvelut with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Infra_Palvelut remove(Serializable primaryKey)
        throws NoSuchInfra_PalvelutException, SystemException {
        Session session = null;

        try {
            session = openSession();

            Infra_Palvelut infra_Palvelut = (Infra_Palvelut) session.get(Infra_PalvelutImpl.class,
                    primaryKey);

            if (infra_Palvelut == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchInfra_PalvelutException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(infra_Palvelut);
        } catch (NoSuchInfra_PalvelutException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected Infra_Palvelut removeImpl(Infra_Palvelut infra_Palvelut)
        throws SystemException {
        infra_Palvelut = toUnwrappedModel(infra_Palvelut);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(infra_Palvelut)) {
                infra_Palvelut = (Infra_Palvelut) session.get(Infra_PalvelutImpl.class,
                        infra_Palvelut.getPrimaryKeyObj());
            }

            if (infra_Palvelut != null) {
                session.delete(infra_Palvelut);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (infra_Palvelut != null) {
            clearCache(infra_Palvelut);
        }

        return infra_Palvelut;
    }

    @Override
    public Infra_Palvelut updateImpl(
        fi.csc.avaa.tupa.db.model.Infra_Palvelut infra_Palvelut)
        throws SystemException {
        infra_Palvelut = toUnwrappedModel(infra_Palvelut);

        boolean isNew = infra_Palvelut.isNew();

        Session session = null;

        try {
            session = openSession();

            if (infra_Palvelut.isNew()) {
                session.save(infra_Palvelut);

                infra_Palvelut.setNew(false);
            } else {
                session.merge(infra_Palvelut);
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

        EntityCacheUtil.putResult(Infra_PalvelutModelImpl.ENTITY_CACHE_ENABLED,
            Infra_PalvelutImpl.class, infra_Palvelut.getPrimaryKey(),
            infra_Palvelut);

        return infra_Palvelut;
    }

    protected Infra_Palvelut toUnwrappedModel(Infra_Palvelut infra_Palvelut) {
        if (infra_Palvelut instanceof Infra_PalvelutImpl) {
            return infra_Palvelut;
        }

        Infra_PalvelutImpl infra_PalvelutImpl = new Infra_PalvelutImpl();

        infra_PalvelutImpl.setNew(infra_Palvelut.isNew());
        infra_PalvelutImpl.setPrimaryKey(infra_Palvelut.getPrimaryKey());

        infra_PalvelutImpl.setInfra_id(infra_Palvelut.getInfra_id());
        infra_PalvelutImpl.setPalvelu_id(infra_Palvelut.getPalvelu_id());

        return infra_PalvelutImpl;
    }

    /**
     * Returns the infra_ palvelut with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the infra_ palvelut
     * @return the infra_ palvelut
     * @throws fi.csc.avaa.tupa.db.NoSuchInfra_PalvelutException if a infra_ palvelut with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Infra_Palvelut findByPrimaryKey(Serializable primaryKey)
        throws NoSuchInfra_PalvelutException, SystemException {
        Infra_Palvelut infra_Palvelut = fetchByPrimaryKey(primaryKey);

        if (infra_Palvelut == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchInfra_PalvelutException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return infra_Palvelut;
    }

    /**
     * Returns the infra_ palvelut with the primary key or throws a {@link fi.csc.avaa.tupa.db.NoSuchInfra_PalvelutException} if it could not be found.
     *
     * @param infra_PalvelutPK the primary key of the infra_ palvelut
     * @return the infra_ palvelut
     * @throws fi.csc.avaa.tupa.db.NoSuchInfra_PalvelutException if a infra_ palvelut with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Infra_Palvelut findByPrimaryKey(Infra_PalvelutPK infra_PalvelutPK)
        throws NoSuchInfra_PalvelutException, SystemException {
        return findByPrimaryKey((Serializable) infra_PalvelutPK);
    }

    /**
     * Returns the infra_ palvelut with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the infra_ palvelut
     * @return the infra_ palvelut, or <code>null</code> if a infra_ palvelut with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Infra_Palvelut fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        Infra_Palvelut infra_Palvelut = (Infra_Palvelut) EntityCacheUtil.getResult(Infra_PalvelutModelImpl.ENTITY_CACHE_ENABLED,
                Infra_PalvelutImpl.class, primaryKey);

        if (infra_Palvelut == _nullInfra_Palvelut) {
            return null;
        }

        if (infra_Palvelut == null) {
            Session session = null;

            try {
                session = openSession();

                infra_Palvelut = (Infra_Palvelut) session.get(Infra_PalvelutImpl.class,
                        primaryKey);

                if (infra_Palvelut != null) {
                    cacheResult(infra_Palvelut);
                } else {
                    EntityCacheUtil.putResult(Infra_PalvelutModelImpl.ENTITY_CACHE_ENABLED,
                        Infra_PalvelutImpl.class, primaryKey,
                        _nullInfra_Palvelut);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(Infra_PalvelutModelImpl.ENTITY_CACHE_ENABLED,
                    Infra_PalvelutImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return infra_Palvelut;
    }

    /**
     * Returns the infra_ palvelut with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param infra_PalvelutPK the primary key of the infra_ palvelut
     * @return the infra_ palvelut, or <code>null</code> if a infra_ palvelut with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Infra_Palvelut fetchByPrimaryKey(Infra_PalvelutPK infra_PalvelutPK)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) infra_PalvelutPK);
    }

    /**
     * Returns all the infra_ palveluts.
     *
     * @return the infra_ palveluts
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Infra_Palvelut> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the infra_ palveluts.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.Infra_PalvelutModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of infra_ palveluts
     * @param end the upper bound of the range of infra_ palveluts (not inclusive)
     * @return the range of infra_ palveluts
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Infra_Palvelut> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the infra_ palveluts.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.Infra_PalvelutModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of infra_ palveluts
     * @param end the upper bound of the range of infra_ palveluts (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of infra_ palveluts
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Infra_Palvelut> findAll(int start, int end,
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

        List<Infra_Palvelut> list = (List<Infra_Palvelut>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_INFRA_PALVELUT);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_INFRA_PALVELUT;

                if (pagination) {
                    sql = sql.concat(Infra_PalvelutModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<Infra_Palvelut>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Infra_Palvelut>(list);
                } else {
                    list = (List<Infra_Palvelut>) QueryUtil.list(q,
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
     * Removes all the infra_ palveluts from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (Infra_Palvelut infra_Palvelut : findAll()) {
            remove(infra_Palvelut);
        }
    }

    /**
     * Returns the number of infra_ palveluts.
     *
     * @return the number of infra_ palveluts
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

                Query q = session.createQuery(_SQL_COUNT_INFRA_PALVELUT);

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
     * Initializes the infra_ palvelut persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.fi.csc.avaa.tupa.db.model.Infra_Palvelut")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<Infra_Palvelut>> listenersList = new ArrayList<ModelListener<Infra_Palvelut>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<Infra_Palvelut>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(Infra_PalvelutImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
