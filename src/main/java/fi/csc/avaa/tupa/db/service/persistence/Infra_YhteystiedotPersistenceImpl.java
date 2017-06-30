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

import fi.csc.avaa.tupa.db.NoSuchInfra_YhteystiedotException;
import fi.csc.avaa.tupa.db.model.Infra_Yhteystiedot;
import fi.csc.avaa.tupa.db.model.impl.Infra_YhteystiedotImpl;
import fi.csc.avaa.tupa.db.model.impl.Infra_YhteystiedotModelImpl;
import fi.csc.avaa.tupa.db.service.persistence.Infra_YhteystiedotPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the infra_ yhteystiedot service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CSC
 * @see Infra_YhteystiedotPersistence
 * @see Infra_YhteystiedotUtil
 * @generated
 */
public class Infra_YhteystiedotPersistenceImpl extends BasePersistenceImpl<Infra_Yhteystiedot>
    implements Infra_YhteystiedotPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link Infra_YhteystiedotUtil} to access the infra_ yhteystiedot persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = Infra_YhteystiedotImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(Infra_YhteystiedotModelImpl.ENTITY_CACHE_ENABLED,
            Infra_YhteystiedotModelImpl.FINDER_CACHE_ENABLED,
            Infra_YhteystiedotImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(Infra_YhteystiedotModelImpl.ENTITY_CACHE_ENABLED,
            Infra_YhteystiedotModelImpl.FINDER_CACHE_ENABLED,
            Infra_YhteystiedotImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(Infra_YhteystiedotModelImpl.ENTITY_CACHE_ENABLED,
            Infra_YhteystiedotModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_INFRA_YHTEYSTIEDOT = "SELECT infra_Yhteystiedot FROM Infra_Yhteystiedot infra_Yhteystiedot";
    private static final String _SQL_COUNT_INFRA_YHTEYSTIEDOT = "SELECT COUNT(infra_Yhteystiedot) FROM Infra_Yhteystiedot infra_Yhteystiedot";
    private static final String _ORDER_BY_ENTITY_ALIAS = "infra_Yhteystiedot.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Infra_Yhteystiedot exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(Infra_YhteystiedotPersistenceImpl.class);
    private static Infra_Yhteystiedot _nullInfra_Yhteystiedot = new Infra_YhteystiedotImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<Infra_Yhteystiedot> toCacheModel() {
                return _nullInfra_YhteystiedotCacheModel;
            }
        };

    private static CacheModel<Infra_Yhteystiedot> _nullInfra_YhteystiedotCacheModel =
        new CacheModel<Infra_Yhteystiedot>() {
            @Override
            public Infra_Yhteystiedot toEntityModel() {
                return _nullInfra_Yhteystiedot;
            }
        };

    public Infra_YhteystiedotPersistenceImpl() {
        setModelClass(Infra_Yhteystiedot.class);
    }

    /**
     * Caches the infra_ yhteystiedot in the entity cache if it is enabled.
     *
     * @param infra_Yhteystiedot the infra_ yhteystiedot
     */
    @Override
    public void cacheResult(Infra_Yhteystiedot infra_Yhteystiedot) {
        EntityCacheUtil.putResult(Infra_YhteystiedotModelImpl.ENTITY_CACHE_ENABLED,
            Infra_YhteystiedotImpl.class, infra_Yhteystiedot.getPrimaryKey(),
            infra_Yhteystiedot);

        infra_Yhteystiedot.resetOriginalValues();
    }

    /**
     * Caches the infra_ yhteystiedots in the entity cache if it is enabled.
     *
     * @param infra_Yhteystiedots the infra_ yhteystiedots
     */
    @Override
    public void cacheResult(List<Infra_Yhteystiedot> infra_Yhteystiedots) {
        for (Infra_Yhteystiedot infra_Yhteystiedot : infra_Yhteystiedots) {
            if (EntityCacheUtil.getResult(
                        Infra_YhteystiedotModelImpl.ENTITY_CACHE_ENABLED,
                        Infra_YhteystiedotImpl.class,
                        infra_Yhteystiedot.getPrimaryKey()) == null) {
                cacheResult(infra_Yhteystiedot);
            } else {
                infra_Yhteystiedot.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all infra_ yhteystiedots.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(Infra_YhteystiedotImpl.class.getName());
        }

        EntityCacheUtil.clearCache(Infra_YhteystiedotImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the infra_ yhteystiedot.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(Infra_Yhteystiedot infra_Yhteystiedot) {
        EntityCacheUtil.removeResult(Infra_YhteystiedotModelImpl.ENTITY_CACHE_ENABLED,
            Infra_YhteystiedotImpl.class, infra_Yhteystiedot.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<Infra_Yhteystiedot> infra_Yhteystiedots) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (Infra_Yhteystiedot infra_Yhteystiedot : infra_Yhteystiedots) {
            EntityCacheUtil.removeResult(Infra_YhteystiedotModelImpl.ENTITY_CACHE_ENABLED,
                Infra_YhteystiedotImpl.class, infra_Yhteystiedot.getPrimaryKey());
        }
    }

    /**
     * Creates a new infra_ yhteystiedot with the primary key. Does not add the infra_ yhteystiedot to the database.
     *
     * @param infra_YhteystiedotPK the primary key for the new infra_ yhteystiedot
     * @return the new infra_ yhteystiedot
     */
    @Override
    public Infra_Yhteystiedot create(Infra_YhteystiedotPK infra_YhteystiedotPK) {
        Infra_Yhteystiedot infra_Yhteystiedot = new Infra_YhteystiedotImpl();

        infra_Yhteystiedot.setNew(true);
        infra_Yhteystiedot.setPrimaryKey(infra_YhteystiedotPK);

        return infra_Yhteystiedot;
    }

    /**
     * Removes the infra_ yhteystiedot with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param infra_YhteystiedotPK the primary key of the infra_ yhteystiedot
     * @return the infra_ yhteystiedot that was removed
     * @throws fi.csc.avaa.tupa.db.NoSuchInfra_YhteystiedotException if a infra_ yhteystiedot with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Infra_Yhteystiedot remove(Infra_YhteystiedotPK infra_YhteystiedotPK)
        throws NoSuchInfra_YhteystiedotException, SystemException {
        return remove((Serializable) infra_YhteystiedotPK);
    }

    /**
     * Removes the infra_ yhteystiedot with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the infra_ yhteystiedot
     * @return the infra_ yhteystiedot that was removed
     * @throws fi.csc.avaa.tupa.db.NoSuchInfra_YhteystiedotException if a infra_ yhteystiedot with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Infra_Yhteystiedot remove(Serializable primaryKey)
        throws NoSuchInfra_YhteystiedotException, SystemException {
        Session session = null;

        try {
            session = openSession();

            Infra_Yhteystiedot infra_Yhteystiedot = (Infra_Yhteystiedot) session.get(Infra_YhteystiedotImpl.class,
                    primaryKey);

            if (infra_Yhteystiedot == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchInfra_YhteystiedotException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(infra_Yhteystiedot);
        } catch (NoSuchInfra_YhteystiedotException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected Infra_Yhteystiedot removeImpl(
        Infra_Yhteystiedot infra_Yhteystiedot) throws SystemException {
        infra_Yhteystiedot = toUnwrappedModel(infra_Yhteystiedot);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(infra_Yhteystiedot)) {
                infra_Yhteystiedot = (Infra_Yhteystiedot) session.get(Infra_YhteystiedotImpl.class,
                        infra_Yhteystiedot.getPrimaryKeyObj());
            }

            if (infra_Yhteystiedot != null) {
                session.delete(infra_Yhteystiedot);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (infra_Yhteystiedot != null) {
            clearCache(infra_Yhteystiedot);
        }

        return infra_Yhteystiedot;
    }

    @Override
    public Infra_Yhteystiedot updateImpl(
        fi.csc.avaa.tupa.db.model.Infra_Yhteystiedot infra_Yhteystiedot)
        throws SystemException {
        infra_Yhteystiedot = toUnwrappedModel(infra_Yhteystiedot);

        boolean isNew = infra_Yhteystiedot.isNew();

        Session session = null;

        try {
            session = openSession();

            if (infra_Yhteystiedot.isNew()) {
                session.save(infra_Yhteystiedot);

                infra_Yhteystiedot.setNew(false);
            } else {
                session.merge(infra_Yhteystiedot);
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

        EntityCacheUtil.putResult(Infra_YhteystiedotModelImpl.ENTITY_CACHE_ENABLED,
            Infra_YhteystiedotImpl.class, infra_Yhteystiedot.getPrimaryKey(),
            infra_Yhteystiedot);

        return infra_Yhteystiedot;
    }

    protected Infra_Yhteystiedot toUnwrappedModel(
        Infra_Yhteystiedot infra_Yhteystiedot) {
        if (infra_Yhteystiedot instanceof Infra_YhteystiedotImpl) {
            return infra_Yhteystiedot;
        }

        Infra_YhteystiedotImpl infra_YhteystiedotImpl = new Infra_YhteystiedotImpl();

        infra_YhteystiedotImpl.setNew(infra_Yhteystiedot.isNew());
        infra_YhteystiedotImpl.setPrimaryKey(infra_Yhteystiedot.getPrimaryKey());

        infra_YhteystiedotImpl.setInfra_id(infra_Yhteystiedot.getInfra_id());
        infra_YhteystiedotImpl.setYhteystieto_id(infra_Yhteystiedot.getYhteystieto_id());

        return infra_YhteystiedotImpl;
    }

    /**
     * Returns the infra_ yhteystiedot with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the infra_ yhteystiedot
     * @return the infra_ yhteystiedot
     * @throws fi.csc.avaa.tupa.db.NoSuchInfra_YhteystiedotException if a infra_ yhteystiedot with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Infra_Yhteystiedot findByPrimaryKey(Serializable primaryKey)
        throws NoSuchInfra_YhteystiedotException, SystemException {
        Infra_Yhteystiedot infra_Yhteystiedot = fetchByPrimaryKey(primaryKey);

        if (infra_Yhteystiedot == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchInfra_YhteystiedotException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return infra_Yhteystiedot;
    }

    /**
     * Returns the infra_ yhteystiedot with the primary key or throws a {@link fi.csc.avaa.tupa.db.NoSuchInfra_YhteystiedotException} if it could not be found.
     *
     * @param infra_YhteystiedotPK the primary key of the infra_ yhteystiedot
     * @return the infra_ yhteystiedot
     * @throws fi.csc.avaa.tupa.db.NoSuchInfra_YhteystiedotException if a infra_ yhteystiedot with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Infra_Yhteystiedot findByPrimaryKey(
        Infra_YhteystiedotPK infra_YhteystiedotPK)
        throws NoSuchInfra_YhteystiedotException, SystemException {
        return findByPrimaryKey((Serializable) infra_YhteystiedotPK);
    }

    /**
     * Returns the infra_ yhteystiedot with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the infra_ yhteystiedot
     * @return the infra_ yhteystiedot, or <code>null</code> if a infra_ yhteystiedot with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Infra_Yhteystiedot fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        Infra_Yhteystiedot infra_Yhteystiedot = (Infra_Yhteystiedot) EntityCacheUtil.getResult(Infra_YhteystiedotModelImpl.ENTITY_CACHE_ENABLED,
                Infra_YhteystiedotImpl.class, primaryKey);

        if (infra_Yhteystiedot == _nullInfra_Yhteystiedot) {
            return null;
        }

        if (infra_Yhteystiedot == null) {
            Session session = null;

            try {
                session = openSession();

                infra_Yhteystiedot = (Infra_Yhteystiedot) session.get(Infra_YhteystiedotImpl.class,
                        primaryKey);

                if (infra_Yhteystiedot != null) {
                    cacheResult(infra_Yhteystiedot);
                } else {
                    EntityCacheUtil.putResult(Infra_YhteystiedotModelImpl.ENTITY_CACHE_ENABLED,
                        Infra_YhteystiedotImpl.class, primaryKey,
                        _nullInfra_Yhteystiedot);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(Infra_YhteystiedotModelImpl.ENTITY_CACHE_ENABLED,
                    Infra_YhteystiedotImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return infra_Yhteystiedot;
    }

    /**
     * Returns the infra_ yhteystiedot with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param infra_YhteystiedotPK the primary key of the infra_ yhteystiedot
     * @return the infra_ yhteystiedot, or <code>null</code> if a infra_ yhteystiedot with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Infra_Yhteystiedot fetchByPrimaryKey(
        Infra_YhteystiedotPK infra_YhteystiedotPK) throws SystemException {
        return fetchByPrimaryKey((Serializable) infra_YhteystiedotPK);
    }

    /**
     * Returns all the infra_ yhteystiedots.
     *
     * @return the infra_ yhteystiedots
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Infra_Yhteystiedot> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the infra_ yhteystiedots.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.Infra_YhteystiedotModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of infra_ yhteystiedots
     * @param end the upper bound of the range of infra_ yhteystiedots (not inclusive)
     * @return the range of infra_ yhteystiedots
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Infra_Yhteystiedot> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the infra_ yhteystiedots.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.Infra_YhteystiedotModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of infra_ yhteystiedots
     * @param end the upper bound of the range of infra_ yhteystiedots (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of infra_ yhteystiedots
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Infra_Yhteystiedot> findAll(int start, int end,
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

        List<Infra_Yhteystiedot> list = (List<Infra_Yhteystiedot>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_INFRA_YHTEYSTIEDOT);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_INFRA_YHTEYSTIEDOT;

                if (pagination) {
                    sql = sql.concat(Infra_YhteystiedotModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<Infra_Yhteystiedot>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Infra_Yhteystiedot>(list);
                } else {
                    list = (List<Infra_Yhteystiedot>) QueryUtil.list(q,
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
     * Removes all the infra_ yhteystiedots from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (Infra_Yhteystiedot infra_Yhteystiedot : findAll()) {
            remove(infra_Yhteystiedot);
        }
    }

    /**
     * Returns the number of infra_ yhteystiedots.
     *
     * @return the number of infra_ yhteystiedots
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

                Query q = session.createQuery(_SQL_COUNT_INFRA_YHTEYSTIEDOT);

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
     * Initializes the infra_ yhteystiedot persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.fi.csc.avaa.tupa.db.model.Infra_Yhteystiedot")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<Infra_Yhteystiedot>> listenersList = new ArrayList<ModelListener<Infra_Yhteystiedot>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<Infra_Yhteystiedot>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(Infra_YhteystiedotImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
