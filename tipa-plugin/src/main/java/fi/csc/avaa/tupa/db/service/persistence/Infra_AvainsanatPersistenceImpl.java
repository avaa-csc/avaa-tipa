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

import fi.csc.avaa.tupa.db.NoSuchInfra_AvainsanatException;
import fi.csc.avaa.tupa.db.model.Infra_Avainsanat;
import fi.csc.avaa.tupa.db.model.impl.Infra_AvainsanatImpl;
import fi.csc.avaa.tupa.db.model.impl.Infra_AvainsanatModelImpl;
import fi.csc.avaa.tupa.db.service.persistence.Infra_AvainsanatPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the infra_ avainsanat service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author pj,jmlehtin
 * @see Infra_AvainsanatPersistence
 * @see Infra_AvainsanatUtil
 * @generated
 */
public class Infra_AvainsanatPersistenceImpl extends BasePersistenceImpl<Infra_Avainsanat>
    implements Infra_AvainsanatPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link Infra_AvainsanatUtil} to access the infra_ avainsanat persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = Infra_AvainsanatImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(Infra_AvainsanatModelImpl.ENTITY_CACHE_ENABLED,
            Infra_AvainsanatModelImpl.FINDER_CACHE_ENABLED,
            Infra_AvainsanatImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(Infra_AvainsanatModelImpl.ENTITY_CACHE_ENABLED,
            Infra_AvainsanatModelImpl.FINDER_CACHE_ENABLED,
            Infra_AvainsanatImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(Infra_AvainsanatModelImpl.ENTITY_CACHE_ENABLED,
            Infra_AvainsanatModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_INFRA_AVAINSANAT = "SELECT infra_Avainsanat FROM Infra_Avainsanat infra_Avainsanat";
    private static final String _SQL_COUNT_INFRA_AVAINSANAT = "SELECT COUNT(infra_Avainsanat) FROM Infra_Avainsanat infra_Avainsanat";
    private static final String _ORDER_BY_ENTITY_ALIAS = "infra_Avainsanat.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Infra_Avainsanat exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(Infra_AvainsanatPersistenceImpl.class);
    private static Infra_Avainsanat _nullInfra_Avainsanat = new Infra_AvainsanatImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<Infra_Avainsanat> toCacheModel() {
                return _nullInfra_AvainsanatCacheModel;
            }
        };

    private static CacheModel<Infra_Avainsanat> _nullInfra_AvainsanatCacheModel = new CacheModel<Infra_Avainsanat>() {
            @Override
            public Infra_Avainsanat toEntityModel() {
                return _nullInfra_Avainsanat;
            }
        };

    public Infra_AvainsanatPersistenceImpl() {
        setModelClass(Infra_Avainsanat.class);
    }

    /**
     * Caches the infra_ avainsanat in the entity cache if it is enabled.
     *
     * @param infra_Avainsanat the infra_ avainsanat
     */
    @Override
    public void cacheResult(Infra_Avainsanat infra_Avainsanat) {
        EntityCacheUtil.putResult(Infra_AvainsanatModelImpl.ENTITY_CACHE_ENABLED,
            Infra_AvainsanatImpl.class, infra_Avainsanat.getPrimaryKey(),
            infra_Avainsanat);

        infra_Avainsanat.resetOriginalValues();
    }

    /**
     * Caches the infra_ avainsanats in the entity cache if it is enabled.
     *
     * @param infra_Avainsanats the infra_ avainsanats
     */
    @Override
    public void cacheResult(List<Infra_Avainsanat> infra_Avainsanats) {
        for (Infra_Avainsanat infra_Avainsanat : infra_Avainsanats) {
            if (EntityCacheUtil.getResult(
                        Infra_AvainsanatModelImpl.ENTITY_CACHE_ENABLED,
                        Infra_AvainsanatImpl.class,
                        infra_Avainsanat.getPrimaryKey()) == null) {
                cacheResult(infra_Avainsanat);
            } else {
                infra_Avainsanat.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all infra_ avainsanats.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(Infra_AvainsanatImpl.class.getName());
        }

        EntityCacheUtil.clearCache(Infra_AvainsanatImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the infra_ avainsanat.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(Infra_Avainsanat infra_Avainsanat) {
        EntityCacheUtil.removeResult(Infra_AvainsanatModelImpl.ENTITY_CACHE_ENABLED,
            Infra_AvainsanatImpl.class, infra_Avainsanat.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<Infra_Avainsanat> infra_Avainsanats) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (Infra_Avainsanat infra_Avainsanat : infra_Avainsanats) {
            EntityCacheUtil.removeResult(Infra_AvainsanatModelImpl.ENTITY_CACHE_ENABLED,
                Infra_AvainsanatImpl.class, infra_Avainsanat.getPrimaryKey());
        }
    }

    /**
     * Creates a new infra_ avainsanat with the primary key. Does not add the infra_ avainsanat to the database.
     *
     * @param infra_AvainsanatPK the primary key for the new infra_ avainsanat
     * @return the new infra_ avainsanat
     */
    @Override
    public Infra_Avainsanat create(Infra_AvainsanatPK infra_AvainsanatPK) {
        Infra_Avainsanat infra_Avainsanat = new Infra_AvainsanatImpl();

        infra_Avainsanat.setNew(true);
        infra_Avainsanat.setPrimaryKey(infra_AvainsanatPK);

        return infra_Avainsanat;
    }

    /**
     * Removes the infra_ avainsanat with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param infra_AvainsanatPK the primary key of the infra_ avainsanat
     * @return the infra_ avainsanat that was removed
     * @throws fi.csc.avaa.tupa.db.NoSuchInfra_AvainsanatException if a infra_ avainsanat with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Infra_Avainsanat remove(Infra_AvainsanatPK infra_AvainsanatPK)
        throws NoSuchInfra_AvainsanatException, SystemException {
        return remove((Serializable) infra_AvainsanatPK);
    }

    /**
     * Removes the infra_ avainsanat with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the infra_ avainsanat
     * @return the infra_ avainsanat that was removed
     * @throws fi.csc.avaa.tupa.db.NoSuchInfra_AvainsanatException if a infra_ avainsanat with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Infra_Avainsanat remove(Serializable primaryKey)
        throws NoSuchInfra_AvainsanatException, SystemException {
        Session session = null;

        try {
            session = openSession();

            Infra_Avainsanat infra_Avainsanat = (Infra_Avainsanat) session.get(Infra_AvainsanatImpl.class,
                    primaryKey);

            if (infra_Avainsanat == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchInfra_AvainsanatException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(infra_Avainsanat);
        } catch (NoSuchInfra_AvainsanatException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected Infra_Avainsanat removeImpl(Infra_Avainsanat infra_Avainsanat)
        throws SystemException {
        infra_Avainsanat = toUnwrappedModel(infra_Avainsanat);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(infra_Avainsanat)) {
                infra_Avainsanat = (Infra_Avainsanat) session.get(Infra_AvainsanatImpl.class,
                        infra_Avainsanat.getPrimaryKeyObj());
            }

            if (infra_Avainsanat != null) {
                session.delete(infra_Avainsanat);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (infra_Avainsanat != null) {
            clearCache(infra_Avainsanat);
        }

        return infra_Avainsanat;
    }

    @Override
    public Infra_Avainsanat updateImpl(
        fi.csc.avaa.tupa.db.model.Infra_Avainsanat infra_Avainsanat)
        throws SystemException {
        infra_Avainsanat = toUnwrappedModel(infra_Avainsanat);

        boolean isNew = infra_Avainsanat.isNew();

        Session session = null;

        try {
            session = openSession();

            if (infra_Avainsanat.isNew()) {
                session.save(infra_Avainsanat);

                infra_Avainsanat.setNew(false);
            } else {
                session.merge(infra_Avainsanat);
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

        EntityCacheUtil.putResult(Infra_AvainsanatModelImpl.ENTITY_CACHE_ENABLED,
            Infra_AvainsanatImpl.class, infra_Avainsanat.getPrimaryKey(),
            infra_Avainsanat);

        return infra_Avainsanat;
    }

    protected Infra_Avainsanat toUnwrappedModel(
        Infra_Avainsanat infra_Avainsanat) {
        if (infra_Avainsanat instanceof Infra_AvainsanatImpl) {
            return infra_Avainsanat;
        }

        Infra_AvainsanatImpl infra_AvainsanatImpl = new Infra_AvainsanatImpl();

        infra_AvainsanatImpl.setNew(infra_Avainsanat.isNew());
        infra_AvainsanatImpl.setPrimaryKey(infra_Avainsanat.getPrimaryKey());

        infra_AvainsanatImpl.setInfra_id(infra_Avainsanat.getInfra_id());
        infra_AvainsanatImpl.setAvainsana_id(infra_Avainsanat.getAvainsana_id());

        return infra_AvainsanatImpl;
    }

    /**
     * Returns the infra_ avainsanat with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the infra_ avainsanat
     * @return the infra_ avainsanat
     * @throws fi.csc.avaa.tupa.db.NoSuchInfra_AvainsanatException if a infra_ avainsanat with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Infra_Avainsanat findByPrimaryKey(Serializable primaryKey)
        throws NoSuchInfra_AvainsanatException, SystemException {
        Infra_Avainsanat infra_Avainsanat = fetchByPrimaryKey(primaryKey);

        if (infra_Avainsanat == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchInfra_AvainsanatException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return infra_Avainsanat;
    }

    /**
     * Returns the infra_ avainsanat with the primary key or throws a {@link fi.csc.avaa.tupa.db.NoSuchInfra_AvainsanatException} if it could not be found.
     *
     * @param infra_AvainsanatPK the primary key of the infra_ avainsanat
     * @return the infra_ avainsanat
     * @throws fi.csc.avaa.tupa.db.NoSuchInfra_AvainsanatException if a infra_ avainsanat with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Infra_Avainsanat findByPrimaryKey(
        Infra_AvainsanatPK infra_AvainsanatPK)
        throws NoSuchInfra_AvainsanatException, SystemException {
        return findByPrimaryKey((Serializable) infra_AvainsanatPK);
    }

    /**
     * Returns the infra_ avainsanat with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the infra_ avainsanat
     * @return the infra_ avainsanat, or <code>null</code> if a infra_ avainsanat with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Infra_Avainsanat fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        Infra_Avainsanat infra_Avainsanat = (Infra_Avainsanat) EntityCacheUtil.getResult(Infra_AvainsanatModelImpl.ENTITY_CACHE_ENABLED,
                Infra_AvainsanatImpl.class, primaryKey);

        if (infra_Avainsanat == _nullInfra_Avainsanat) {
            return null;
        }

        if (infra_Avainsanat == null) {
            Session session = null;

            try {
                session = openSession();

                infra_Avainsanat = (Infra_Avainsanat) session.get(Infra_AvainsanatImpl.class,
                        primaryKey);

                if (infra_Avainsanat != null) {
                    cacheResult(infra_Avainsanat);
                } else {
                    EntityCacheUtil.putResult(Infra_AvainsanatModelImpl.ENTITY_CACHE_ENABLED,
                        Infra_AvainsanatImpl.class, primaryKey,
                        _nullInfra_Avainsanat);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(Infra_AvainsanatModelImpl.ENTITY_CACHE_ENABLED,
                    Infra_AvainsanatImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return infra_Avainsanat;
    }

    /**
     * Returns the infra_ avainsanat with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param infra_AvainsanatPK the primary key of the infra_ avainsanat
     * @return the infra_ avainsanat, or <code>null</code> if a infra_ avainsanat with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Infra_Avainsanat fetchByPrimaryKey(
        Infra_AvainsanatPK infra_AvainsanatPK) throws SystemException {
        return fetchByPrimaryKey((Serializable) infra_AvainsanatPK);
    }

    /**
     * Returns all the infra_ avainsanats.
     *
     * @return the infra_ avainsanats
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Infra_Avainsanat> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the infra_ avainsanats.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.Infra_AvainsanatModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of infra_ avainsanats
     * @param end the upper bound of the range of infra_ avainsanats (not inclusive)
     * @return the range of infra_ avainsanats
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Infra_Avainsanat> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the infra_ avainsanats.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.Infra_AvainsanatModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of infra_ avainsanats
     * @param end the upper bound of the range of infra_ avainsanats (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of infra_ avainsanats
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Infra_Avainsanat> findAll(int start, int end,
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

        List<Infra_Avainsanat> list = (List<Infra_Avainsanat>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_INFRA_AVAINSANAT);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_INFRA_AVAINSANAT;

                if (pagination) {
                    sql = sql.concat(Infra_AvainsanatModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<Infra_Avainsanat>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Infra_Avainsanat>(list);
                } else {
                    list = (List<Infra_Avainsanat>) QueryUtil.list(q,
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
     * Removes all the infra_ avainsanats from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (Infra_Avainsanat infra_Avainsanat : findAll()) {
            remove(infra_Avainsanat);
        }
    }

    /**
     * Returns the number of infra_ avainsanats.
     *
     * @return the number of infra_ avainsanats
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

                Query q = session.createQuery(_SQL_COUNT_INFRA_AVAINSANAT);

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
     * Initializes the infra_ avainsanat persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.fi.csc.avaa.tupa.db.model.Infra_Avainsanat")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<Infra_Avainsanat>> listenersList = new ArrayList<ModelListener<Infra_Avainsanat>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<Infra_Avainsanat>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(Infra_AvainsanatImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
