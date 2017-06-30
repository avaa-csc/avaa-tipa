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

import fi.csc.avaa.tupa.db.NoSuchYhteystietoException;
import fi.csc.avaa.tupa.db.model.Yhteystieto;
import fi.csc.avaa.tupa.db.model.impl.YhteystietoImpl;
import fi.csc.avaa.tupa.db.model.impl.YhteystietoModelImpl;
import fi.csc.avaa.tupa.db.service.persistence.YhteystietoPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the yhteystieto service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CSC
 * @see YhteystietoPersistence
 * @see YhteystietoUtil
 * @generated
 */
public class YhteystietoPersistenceImpl extends BasePersistenceImpl<Yhteystieto>
    implements YhteystietoPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link YhteystietoUtil} to access the yhteystieto persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = YhteystietoImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(YhteystietoModelImpl.ENTITY_CACHE_ENABLED,
            YhteystietoModelImpl.FINDER_CACHE_ENABLED, YhteystietoImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(YhteystietoModelImpl.ENTITY_CACHE_ENABLED,
            YhteystietoModelImpl.FINDER_CACHE_ENABLED, YhteystietoImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(YhteystietoModelImpl.ENTITY_CACHE_ENABLED,
            YhteystietoModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_YHTEYSTIETO = "SELECT yhteystieto FROM Yhteystieto yhteystieto";
    private static final String _SQL_COUNT_YHTEYSTIETO = "SELECT COUNT(yhteystieto) FROM Yhteystieto yhteystieto";
    private static final String _ORDER_BY_ENTITY_ALIAS = "yhteystieto.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Yhteystieto exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(YhteystietoPersistenceImpl.class);
    private static Yhteystieto _nullYhteystieto = new YhteystietoImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<Yhteystieto> toCacheModel() {
                return _nullYhteystietoCacheModel;
            }
        };

    private static CacheModel<Yhteystieto> _nullYhteystietoCacheModel = new CacheModel<Yhteystieto>() {
            @Override
            public Yhteystieto toEntityModel() {
                return _nullYhteystieto;
            }
        };

    public YhteystietoPersistenceImpl() {
        setModelClass(Yhteystieto.class);
    }

    /**
     * Caches the yhteystieto in the entity cache if it is enabled.
     *
     * @param yhteystieto the yhteystieto
     */
    @Override
    public void cacheResult(Yhteystieto yhteystieto) {
        EntityCacheUtil.putResult(YhteystietoModelImpl.ENTITY_CACHE_ENABLED,
            YhteystietoImpl.class, yhteystieto.getPrimaryKey(), yhteystieto);

        yhteystieto.resetOriginalValues();
    }

    /**
     * Caches the yhteystietos in the entity cache if it is enabled.
     *
     * @param yhteystietos the yhteystietos
     */
    @Override
    public void cacheResult(List<Yhteystieto> yhteystietos) {
        for (Yhteystieto yhteystieto : yhteystietos) {
            if (EntityCacheUtil.getResult(
                        YhteystietoModelImpl.ENTITY_CACHE_ENABLED,
                        YhteystietoImpl.class, yhteystieto.getPrimaryKey()) == null) {
                cacheResult(yhteystieto);
            } else {
                yhteystieto.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all yhteystietos.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(YhteystietoImpl.class.getName());
        }

        EntityCacheUtil.clearCache(YhteystietoImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the yhteystieto.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(Yhteystieto yhteystieto) {
        EntityCacheUtil.removeResult(YhteystietoModelImpl.ENTITY_CACHE_ENABLED,
            YhteystietoImpl.class, yhteystieto.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<Yhteystieto> yhteystietos) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (Yhteystieto yhteystieto : yhteystietos) {
            EntityCacheUtil.removeResult(YhteystietoModelImpl.ENTITY_CACHE_ENABLED,
                YhteystietoImpl.class, yhteystieto.getPrimaryKey());
        }
    }

    /**
     * Creates a new yhteystieto with the primary key. Does not add the yhteystieto to the database.
     *
     * @param yhteystieto_id the primary key for the new yhteystieto
     * @return the new yhteystieto
     */
    @Override
    public Yhteystieto create(int yhteystieto_id) {
        Yhteystieto yhteystieto = new YhteystietoImpl();

        yhteystieto.setNew(true);
        yhteystieto.setPrimaryKey(yhteystieto_id);

        return yhteystieto;
    }

    /**
     * Removes the yhteystieto with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param yhteystieto_id the primary key of the yhteystieto
     * @return the yhteystieto that was removed
     * @throws fi.csc.avaa.tupa.db.NoSuchYhteystietoException if a yhteystieto with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Yhteystieto remove(int yhteystieto_id)
        throws NoSuchYhteystietoException, SystemException {
        return remove((Serializable) yhteystieto_id);
    }

    /**
     * Removes the yhteystieto with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the yhteystieto
     * @return the yhteystieto that was removed
     * @throws fi.csc.avaa.tupa.db.NoSuchYhteystietoException if a yhteystieto with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Yhteystieto remove(Serializable primaryKey)
        throws NoSuchYhteystietoException, SystemException {
        Session session = null;

        try {
            session = openSession();

            Yhteystieto yhteystieto = (Yhteystieto) session.get(YhteystietoImpl.class,
                    primaryKey);

            if (yhteystieto == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchYhteystietoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(yhteystieto);
        } catch (NoSuchYhteystietoException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected Yhteystieto removeImpl(Yhteystieto yhteystieto)
        throws SystemException {
        yhteystieto = toUnwrappedModel(yhteystieto);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(yhteystieto)) {
                yhteystieto = (Yhteystieto) session.get(YhteystietoImpl.class,
                        yhteystieto.getPrimaryKeyObj());
            }

            if (yhteystieto != null) {
                session.delete(yhteystieto);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (yhteystieto != null) {
            clearCache(yhteystieto);
        }

        return yhteystieto;
    }

    @Override
    public Yhteystieto updateImpl(
        fi.csc.avaa.tupa.db.model.Yhteystieto yhteystieto)
        throws SystemException {
        yhteystieto = toUnwrappedModel(yhteystieto);

        boolean isNew = yhteystieto.isNew();

        Session session = null;

        try {
            session = openSession();

            if (yhteystieto.isNew()) {
                session.save(yhteystieto);

                yhteystieto.setNew(false);
            } else {
                session.merge(yhteystieto);
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

        EntityCacheUtil.putResult(YhteystietoModelImpl.ENTITY_CACHE_ENABLED,
            YhteystietoImpl.class, yhteystieto.getPrimaryKey(), yhteystieto);

        return yhteystieto;
    }

    protected Yhteystieto toUnwrappedModel(Yhteystieto yhteystieto) {
        if (yhteystieto instanceof YhteystietoImpl) {
            return yhteystieto;
        }

        YhteystietoImpl yhteystietoImpl = new YhteystietoImpl();

        yhteystietoImpl.setNew(yhteystieto.isNew());
        yhteystietoImpl.setPrimaryKey(yhteystieto.getPrimaryKey());

        yhteystietoImpl.setYhteystieto_id(yhteystieto.getYhteystieto_id());
        yhteystietoImpl.setSahkoposti(yhteystieto.getSahkoposti());
        yhteystietoImpl.setAffiliaatio(yhteystieto.getAffiliaatio());
        yhteystietoImpl.setPuhelin(yhteystieto.getPuhelin());
        yhteystietoImpl.setTitteli(yhteystieto.getTitteli());
        yhteystietoImpl.setEtunimi(yhteystieto.getEtunimi());
        yhteystietoImpl.setSukunimi(yhteystieto.getSukunimi());
        yhteystietoImpl.setURL(yhteystieto.getURL());
        yhteystietoImpl.setKuvaus(yhteystieto.getKuvaus());
        yhteystietoImpl.setDescription(yhteystieto.getDescription());

        return yhteystietoImpl;
    }

    /**
     * Returns the yhteystieto with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the yhteystieto
     * @return the yhteystieto
     * @throws fi.csc.avaa.tupa.db.NoSuchYhteystietoException if a yhteystieto with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Yhteystieto findByPrimaryKey(Serializable primaryKey)
        throws NoSuchYhteystietoException, SystemException {
        Yhteystieto yhteystieto = fetchByPrimaryKey(primaryKey);

        if (yhteystieto == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchYhteystietoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return yhteystieto;
    }

    /**
     * Returns the yhteystieto with the primary key or throws a {@link fi.csc.avaa.tupa.db.NoSuchYhteystietoException} if it could not be found.
     *
     * @param yhteystieto_id the primary key of the yhteystieto
     * @return the yhteystieto
     * @throws fi.csc.avaa.tupa.db.NoSuchYhteystietoException if a yhteystieto with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Yhteystieto findByPrimaryKey(int yhteystieto_id)
        throws NoSuchYhteystietoException, SystemException {
        return findByPrimaryKey((Serializable) yhteystieto_id);
    }

    /**
     * Returns the yhteystieto with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the yhteystieto
     * @return the yhteystieto, or <code>null</code> if a yhteystieto with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Yhteystieto fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        Yhteystieto yhteystieto = (Yhteystieto) EntityCacheUtil.getResult(YhteystietoModelImpl.ENTITY_CACHE_ENABLED,
                YhteystietoImpl.class, primaryKey);

        if (yhteystieto == _nullYhteystieto) {
            return null;
        }

        if (yhteystieto == null) {
            Session session = null;

            try {
                session = openSession();

                yhteystieto = (Yhteystieto) session.get(YhteystietoImpl.class,
                        primaryKey);

                if (yhteystieto != null) {
                    cacheResult(yhteystieto);
                } else {
                    EntityCacheUtil.putResult(YhteystietoModelImpl.ENTITY_CACHE_ENABLED,
                        YhteystietoImpl.class, primaryKey, _nullYhteystieto);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(YhteystietoModelImpl.ENTITY_CACHE_ENABLED,
                    YhteystietoImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return yhteystieto;
    }

    /**
     * Returns the yhteystieto with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param yhteystieto_id the primary key of the yhteystieto
     * @return the yhteystieto, or <code>null</code> if a yhteystieto with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Yhteystieto fetchByPrimaryKey(int yhteystieto_id)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) yhteystieto_id);
    }

    /**
     * Returns all the yhteystietos.
     *
     * @return the yhteystietos
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Yhteystieto> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the yhteystietos.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.YhteystietoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of yhteystietos
     * @param end the upper bound of the range of yhteystietos (not inclusive)
     * @return the range of yhteystietos
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Yhteystieto> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the yhteystietos.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.YhteystietoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of yhteystietos
     * @param end the upper bound of the range of yhteystietos (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of yhteystietos
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Yhteystieto> findAll(int start, int end,
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

        List<Yhteystieto> list = (List<Yhteystieto>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_YHTEYSTIETO);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_YHTEYSTIETO;

                if (pagination) {
                    sql = sql.concat(YhteystietoModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<Yhteystieto>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Yhteystieto>(list);
                } else {
                    list = (List<Yhteystieto>) QueryUtil.list(q, getDialect(),
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
     * Removes all the yhteystietos from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (Yhteystieto yhteystieto : findAll()) {
            remove(yhteystieto);
        }
    }

    /**
     * Returns the number of yhteystietos.
     *
     * @return the number of yhteystietos
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

                Query q = session.createQuery(_SQL_COUNT_YHTEYSTIETO);

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
     * Initializes the yhteystieto persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.fi.csc.avaa.tupa.db.model.Yhteystieto")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<Yhteystieto>> listenersList = new ArrayList<ModelListener<Yhteystieto>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<Yhteystieto>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(YhteystietoImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
