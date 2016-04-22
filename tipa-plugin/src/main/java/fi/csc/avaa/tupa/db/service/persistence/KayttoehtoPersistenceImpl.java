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

import fi.csc.avaa.tupa.db.NoSuchKayttoehtoException;
import fi.csc.avaa.tupa.db.model.Kayttoehto;
import fi.csc.avaa.tupa.db.model.impl.KayttoehtoImpl;
import fi.csc.avaa.tupa.db.model.impl.KayttoehtoModelImpl;
import fi.csc.avaa.tupa.db.service.persistence.KayttoehtoPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the kayttoehto service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author pj,jmlehtin
 * @see KayttoehtoPersistence
 * @see KayttoehtoUtil
 * @generated
 */
public class KayttoehtoPersistenceImpl extends BasePersistenceImpl<Kayttoehto>
    implements KayttoehtoPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link KayttoehtoUtil} to access the kayttoehto persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = KayttoehtoImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(KayttoehtoModelImpl.ENTITY_CACHE_ENABLED,
            KayttoehtoModelImpl.FINDER_CACHE_ENABLED, KayttoehtoImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(KayttoehtoModelImpl.ENTITY_CACHE_ENABLED,
            KayttoehtoModelImpl.FINDER_CACHE_ENABLED, KayttoehtoImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(KayttoehtoModelImpl.ENTITY_CACHE_ENABLED,
            KayttoehtoModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_KAYTTOEHTO = "SELECT kayttoehto FROM Kayttoehto kayttoehto";
    private static final String _SQL_COUNT_KAYTTOEHTO = "SELECT COUNT(kayttoehto) FROM Kayttoehto kayttoehto";
    private static final String _ORDER_BY_ENTITY_ALIAS = "kayttoehto.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Kayttoehto exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(KayttoehtoPersistenceImpl.class);
    private static Kayttoehto _nullKayttoehto = new KayttoehtoImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<Kayttoehto> toCacheModel() {
                return _nullKayttoehtoCacheModel;
            }
        };

    private static CacheModel<Kayttoehto> _nullKayttoehtoCacheModel = new CacheModel<Kayttoehto>() {
            @Override
            public Kayttoehto toEntityModel() {
                return _nullKayttoehto;
            }
        };

    public KayttoehtoPersistenceImpl() {
        setModelClass(Kayttoehto.class);
    }

    /**
     * Caches the kayttoehto in the entity cache if it is enabled.
     *
     * @param kayttoehto the kayttoehto
     */
    @Override
    public void cacheResult(Kayttoehto kayttoehto) {
        EntityCacheUtil.putResult(KayttoehtoModelImpl.ENTITY_CACHE_ENABLED,
            KayttoehtoImpl.class, kayttoehto.getPrimaryKey(), kayttoehto);

        kayttoehto.resetOriginalValues();
    }

    /**
     * Caches the kayttoehtos in the entity cache if it is enabled.
     *
     * @param kayttoehtos the kayttoehtos
     */
    @Override
    public void cacheResult(List<Kayttoehto> kayttoehtos) {
        for (Kayttoehto kayttoehto : kayttoehtos) {
            if (EntityCacheUtil.getResult(
                        KayttoehtoModelImpl.ENTITY_CACHE_ENABLED,
                        KayttoehtoImpl.class, kayttoehto.getPrimaryKey()) == null) {
                cacheResult(kayttoehto);
            } else {
                kayttoehto.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all kayttoehtos.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(KayttoehtoImpl.class.getName());
        }

        EntityCacheUtil.clearCache(KayttoehtoImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the kayttoehto.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(Kayttoehto kayttoehto) {
        EntityCacheUtil.removeResult(KayttoehtoModelImpl.ENTITY_CACHE_ENABLED,
            KayttoehtoImpl.class, kayttoehto.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<Kayttoehto> kayttoehtos) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (Kayttoehto kayttoehto : kayttoehtos) {
            EntityCacheUtil.removeResult(KayttoehtoModelImpl.ENTITY_CACHE_ENABLED,
                KayttoehtoImpl.class, kayttoehto.getPrimaryKey());
        }
    }

    /**
     * Creates a new kayttoehto with the primary key. Does not add the kayttoehto to the database.
     *
     * @param infra_id the primary key for the new kayttoehto
     * @return the new kayttoehto
     */
    @Override
    public Kayttoehto create(int infra_id) {
        Kayttoehto kayttoehto = new KayttoehtoImpl();

        kayttoehto.setNew(true);
        kayttoehto.setPrimaryKey(infra_id);

        return kayttoehto;
    }

    /**
     * Removes the kayttoehto with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param infra_id the primary key of the kayttoehto
     * @return the kayttoehto that was removed
     * @throws fi.csc.avaa.tupa.db.NoSuchKayttoehtoException if a kayttoehto with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Kayttoehto remove(int infra_id)
        throws NoSuchKayttoehtoException, SystemException {
        return remove((Serializable) infra_id);
    }

    /**
     * Removes the kayttoehto with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the kayttoehto
     * @return the kayttoehto that was removed
     * @throws fi.csc.avaa.tupa.db.NoSuchKayttoehtoException if a kayttoehto with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Kayttoehto remove(Serializable primaryKey)
        throws NoSuchKayttoehtoException, SystemException {
        Session session = null;

        try {
            session = openSession();

            Kayttoehto kayttoehto = (Kayttoehto) session.get(KayttoehtoImpl.class,
                    primaryKey);

            if (kayttoehto == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchKayttoehtoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(kayttoehto);
        } catch (NoSuchKayttoehtoException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected Kayttoehto removeImpl(Kayttoehto kayttoehto)
        throws SystemException {
        kayttoehto = toUnwrappedModel(kayttoehto);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(kayttoehto)) {
                kayttoehto = (Kayttoehto) session.get(KayttoehtoImpl.class,
                        kayttoehto.getPrimaryKeyObj());
            }

            if (kayttoehto != null) {
                session.delete(kayttoehto);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (kayttoehto != null) {
            clearCache(kayttoehto);
        }

        return kayttoehto;
    }

    @Override
    public Kayttoehto updateImpl(
        fi.csc.avaa.tupa.db.model.Kayttoehto kayttoehto)
        throws SystemException {
        kayttoehto = toUnwrappedModel(kayttoehto);

        boolean isNew = kayttoehto.isNew();

        Session session = null;

        try {
            session = openSession();

            if (kayttoehto.isNew()) {
                session.save(kayttoehto);

                kayttoehto.setNew(false);
            } else {
                session.merge(kayttoehto);
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

        EntityCacheUtil.putResult(KayttoehtoModelImpl.ENTITY_CACHE_ENABLED,
            KayttoehtoImpl.class, kayttoehto.getPrimaryKey(), kayttoehto);

        return kayttoehto;
    }

    protected Kayttoehto toUnwrappedModel(Kayttoehto kayttoehto) {
        if (kayttoehto instanceof KayttoehtoImpl) {
            return kayttoehto;
        }

        KayttoehtoImpl kayttoehtoImpl = new KayttoehtoImpl();

        kayttoehtoImpl.setNew(kayttoehto.isNew());
        kayttoehtoImpl.setPrimaryKey(kayttoehto.getPrimaryKey());

        kayttoehtoImpl.setInfra_id(kayttoehto.getInfra_id());
        kayttoehtoImpl.setSaavutettavuus(kayttoehto.getSaavutettavuus());
        kayttoehtoImpl.setAnonymiteetti(kayttoehto.getAnonymiteetti());
        kayttoehtoImpl.setMaksullisuus(kayttoehto.getMaksullisuus());
        kayttoehtoImpl.setTulosten_julkaisuvelvoite(kayttoehto.getTulosten_julkaisuvelvoite());
        kayttoehtoImpl.setTuotoksien_julkaisuvelvoite(kayttoehto.getTuotoksien_julkaisuvelvoite());
        kayttoehtoImpl.setOsaamisen_avoimuus(kayttoehto.getOsaamisen_avoimuus());
        kayttoehtoImpl.setSeurantatyokalut(kayttoehto.getSeurantatyokalut());
        kayttoehtoImpl.setTulosten_lisensointi(kayttoehto.getTulosten_lisensointi());
        kayttoehtoImpl.setURLfi(kayttoehto.getURLfi());
        kayttoehtoImpl.setURLen(kayttoehto.getURLen());

        return kayttoehtoImpl;
    }

    /**
     * Returns the kayttoehto with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the kayttoehto
     * @return the kayttoehto
     * @throws fi.csc.avaa.tupa.db.NoSuchKayttoehtoException if a kayttoehto with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Kayttoehto findByPrimaryKey(Serializable primaryKey)
        throws NoSuchKayttoehtoException, SystemException {
        Kayttoehto kayttoehto = fetchByPrimaryKey(primaryKey);

        if (kayttoehto == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchKayttoehtoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return kayttoehto;
    }

    /**
     * Returns the kayttoehto with the primary key or throws a {@link fi.csc.avaa.tupa.db.NoSuchKayttoehtoException} if it could not be found.
     *
     * @param infra_id the primary key of the kayttoehto
     * @return the kayttoehto
     * @throws fi.csc.avaa.tupa.db.NoSuchKayttoehtoException if a kayttoehto with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Kayttoehto findByPrimaryKey(int infra_id)
        throws NoSuchKayttoehtoException, SystemException {
        return findByPrimaryKey((Serializable) infra_id);
    }

    /**
     * Returns the kayttoehto with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the kayttoehto
     * @return the kayttoehto, or <code>null</code> if a kayttoehto with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Kayttoehto fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        Kayttoehto kayttoehto = (Kayttoehto) EntityCacheUtil.getResult(KayttoehtoModelImpl.ENTITY_CACHE_ENABLED,
                KayttoehtoImpl.class, primaryKey);

        if (kayttoehto == _nullKayttoehto) {
            return null;
        }

        if (kayttoehto == null) {
            Session session = null;

            try {
                session = openSession();

                kayttoehto = (Kayttoehto) session.get(KayttoehtoImpl.class,
                        primaryKey);

                if (kayttoehto != null) {
                    cacheResult(kayttoehto);
                } else {
                    EntityCacheUtil.putResult(KayttoehtoModelImpl.ENTITY_CACHE_ENABLED,
                        KayttoehtoImpl.class, primaryKey, _nullKayttoehto);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(KayttoehtoModelImpl.ENTITY_CACHE_ENABLED,
                    KayttoehtoImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return kayttoehto;
    }

    /**
     * Returns the kayttoehto with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param infra_id the primary key of the kayttoehto
     * @return the kayttoehto, or <code>null</code> if a kayttoehto with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Kayttoehto fetchByPrimaryKey(int infra_id) throws SystemException {
        return fetchByPrimaryKey((Serializable) infra_id);
    }

    /**
     * Returns all the kayttoehtos.
     *
     * @return the kayttoehtos
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Kayttoehto> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the kayttoehtos.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.KayttoehtoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of kayttoehtos
     * @param end the upper bound of the range of kayttoehtos (not inclusive)
     * @return the range of kayttoehtos
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Kayttoehto> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the kayttoehtos.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.KayttoehtoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of kayttoehtos
     * @param end the upper bound of the range of kayttoehtos (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of kayttoehtos
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Kayttoehto> findAll(int start, int end,
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

        List<Kayttoehto> list = (List<Kayttoehto>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_KAYTTOEHTO);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_KAYTTOEHTO;

                if (pagination) {
                    sql = sql.concat(KayttoehtoModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<Kayttoehto>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Kayttoehto>(list);
                } else {
                    list = (List<Kayttoehto>) QueryUtil.list(q, getDialect(),
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
     * Removes all the kayttoehtos from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (Kayttoehto kayttoehto : findAll()) {
            remove(kayttoehto);
        }
    }

    /**
     * Returns the number of kayttoehtos.
     *
     * @return the number of kayttoehtos
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

                Query q = session.createQuery(_SQL_COUNT_KAYTTOEHTO);

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
     * Initializes the kayttoehto persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.fi.csc.avaa.tupa.db.model.Kayttoehto")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<Kayttoehto>> listenersList = new ArrayList<ModelListener<Kayttoehto>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<Kayttoehto>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(KayttoehtoImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
