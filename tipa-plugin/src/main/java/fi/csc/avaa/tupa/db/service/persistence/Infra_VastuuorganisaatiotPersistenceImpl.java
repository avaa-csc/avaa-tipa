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

import fi.csc.avaa.tupa.db.NoSuchInfra_VastuuorganisaatiotException;
import fi.csc.avaa.tupa.db.model.Infra_Vastuuorganisaatiot;
import fi.csc.avaa.tupa.db.model.impl.Infra_VastuuorganisaatiotImpl;
import fi.csc.avaa.tupa.db.model.impl.Infra_VastuuorganisaatiotModelImpl;
import fi.csc.avaa.tupa.db.service.persistence.Infra_VastuuorganisaatiotPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the infra_ vastuuorganisaatiot service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author pj,jmlehtin
 * @see Infra_VastuuorganisaatiotPersistence
 * @see Infra_VastuuorganisaatiotUtil
 * @generated
 */
public class Infra_VastuuorganisaatiotPersistenceImpl
    extends BasePersistenceImpl<Infra_Vastuuorganisaatiot>
    implements Infra_VastuuorganisaatiotPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link Infra_VastuuorganisaatiotUtil} to access the infra_ vastuuorganisaatiot persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = Infra_VastuuorganisaatiotImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(Infra_VastuuorganisaatiotModelImpl.ENTITY_CACHE_ENABLED,
            Infra_VastuuorganisaatiotModelImpl.FINDER_CACHE_ENABLED,
            Infra_VastuuorganisaatiotImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(Infra_VastuuorganisaatiotModelImpl.ENTITY_CACHE_ENABLED,
            Infra_VastuuorganisaatiotModelImpl.FINDER_CACHE_ENABLED,
            Infra_VastuuorganisaatiotImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(Infra_VastuuorganisaatiotModelImpl.ENTITY_CACHE_ENABLED,
            Infra_VastuuorganisaatiotModelImpl.FINDER_CACHE_ENABLED,
            Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
            new String[0]);
    private static final String _SQL_SELECT_INFRA_VASTUUORGANISAATIOT = "SELECT infra_Vastuuorganisaatiot FROM Infra_Vastuuorganisaatiot infra_Vastuuorganisaatiot";
    private static final String _SQL_COUNT_INFRA_VASTUUORGANISAATIOT = "SELECT COUNT(infra_Vastuuorganisaatiot) FROM Infra_Vastuuorganisaatiot infra_Vastuuorganisaatiot";
    private static final String _ORDER_BY_ENTITY_ALIAS = "infra_Vastuuorganisaatiot.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Infra_Vastuuorganisaatiot exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(Infra_VastuuorganisaatiotPersistenceImpl.class);
    private static Infra_Vastuuorganisaatiot _nullInfra_Vastuuorganisaatiot = new Infra_VastuuorganisaatiotImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<Infra_Vastuuorganisaatiot> toCacheModel() {
                return _nullInfra_VastuuorganisaatiotCacheModel;
            }
        };

    private static CacheModel<Infra_Vastuuorganisaatiot> _nullInfra_VastuuorganisaatiotCacheModel =
        new CacheModel<Infra_Vastuuorganisaatiot>() {
            @Override
            public Infra_Vastuuorganisaatiot toEntityModel() {
                return _nullInfra_Vastuuorganisaatiot;
            }
        };

    public Infra_VastuuorganisaatiotPersistenceImpl() {
        setModelClass(Infra_Vastuuorganisaatiot.class);
    }

    /**
     * Caches the infra_ vastuuorganisaatiot in the entity cache if it is enabled.
     *
     * @param infra_Vastuuorganisaatiot the infra_ vastuuorganisaatiot
     */
    @Override
    public void cacheResult(Infra_Vastuuorganisaatiot infra_Vastuuorganisaatiot) {
        EntityCacheUtil.putResult(Infra_VastuuorganisaatiotModelImpl.ENTITY_CACHE_ENABLED,
            Infra_VastuuorganisaatiotImpl.class,
            infra_Vastuuorganisaatiot.getPrimaryKey(), infra_Vastuuorganisaatiot);

        infra_Vastuuorganisaatiot.resetOriginalValues();
    }

    /**
     * Caches the infra_ vastuuorganisaatiots in the entity cache if it is enabled.
     *
     * @param infra_Vastuuorganisaatiots the infra_ vastuuorganisaatiots
     */
    @Override
    public void cacheResult(
        List<Infra_Vastuuorganisaatiot> infra_Vastuuorganisaatiots) {
        for (Infra_Vastuuorganisaatiot infra_Vastuuorganisaatiot : infra_Vastuuorganisaatiots) {
            if (EntityCacheUtil.getResult(
                        Infra_VastuuorganisaatiotModelImpl.ENTITY_CACHE_ENABLED,
                        Infra_VastuuorganisaatiotImpl.class,
                        infra_Vastuuorganisaatiot.getPrimaryKey()) == null) {
                cacheResult(infra_Vastuuorganisaatiot);
            } else {
                infra_Vastuuorganisaatiot.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all infra_ vastuuorganisaatiots.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(Infra_VastuuorganisaatiotImpl.class.getName());
        }

        EntityCacheUtil.clearCache(Infra_VastuuorganisaatiotImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the infra_ vastuuorganisaatiot.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(Infra_Vastuuorganisaatiot infra_Vastuuorganisaatiot) {
        EntityCacheUtil.removeResult(Infra_VastuuorganisaatiotModelImpl.ENTITY_CACHE_ENABLED,
            Infra_VastuuorganisaatiotImpl.class,
            infra_Vastuuorganisaatiot.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(
        List<Infra_Vastuuorganisaatiot> infra_Vastuuorganisaatiots) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (Infra_Vastuuorganisaatiot infra_Vastuuorganisaatiot : infra_Vastuuorganisaatiots) {
            EntityCacheUtil.removeResult(Infra_VastuuorganisaatiotModelImpl.ENTITY_CACHE_ENABLED,
                Infra_VastuuorganisaatiotImpl.class,
                infra_Vastuuorganisaatiot.getPrimaryKey());
        }
    }

    /**
     * Creates a new infra_ vastuuorganisaatiot with the primary key. Does not add the infra_ vastuuorganisaatiot to the database.
     *
     * @param infra_VastuuorganisaatiotPK the primary key for the new infra_ vastuuorganisaatiot
     * @return the new infra_ vastuuorganisaatiot
     */
    @Override
    public Infra_Vastuuorganisaatiot create(
        Infra_VastuuorganisaatiotPK infra_VastuuorganisaatiotPK) {
        Infra_Vastuuorganisaatiot infra_Vastuuorganisaatiot = new Infra_VastuuorganisaatiotImpl();

        infra_Vastuuorganisaatiot.setNew(true);
        infra_Vastuuorganisaatiot.setPrimaryKey(infra_VastuuorganisaatiotPK);

        return infra_Vastuuorganisaatiot;
    }

    /**
     * Removes the infra_ vastuuorganisaatiot with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param infra_VastuuorganisaatiotPK the primary key of the infra_ vastuuorganisaatiot
     * @return the infra_ vastuuorganisaatiot that was removed
     * @throws fi.csc.avaa.tupa.db.NoSuchInfra_VastuuorganisaatiotException if a infra_ vastuuorganisaatiot with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Infra_Vastuuorganisaatiot remove(
        Infra_VastuuorganisaatiotPK infra_VastuuorganisaatiotPK)
        throws NoSuchInfra_VastuuorganisaatiotException, SystemException {
        return remove((Serializable) infra_VastuuorganisaatiotPK);
    }

    /**
     * Removes the infra_ vastuuorganisaatiot with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the infra_ vastuuorganisaatiot
     * @return the infra_ vastuuorganisaatiot that was removed
     * @throws fi.csc.avaa.tupa.db.NoSuchInfra_VastuuorganisaatiotException if a infra_ vastuuorganisaatiot with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Infra_Vastuuorganisaatiot remove(Serializable primaryKey)
        throws NoSuchInfra_VastuuorganisaatiotException, SystemException {
        Session session = null;

        try {
            session = openSession();

            Infra_Vastuuorganisaatiot infra_Vastuuorganisaatiot = (Infra_Vastuuorganisaatiot) session.get(Infra_VastuuorganisaatiotImpl.class,
                    primaryKey);

            if (infra_Vastuuorganisaatiot == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchInfra_VastuuorganisaatiotException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(infra_Vastuuorganisaatiot);
        } catch (NoSuchInfra_VastuuorganisaatiotException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected Infra_Vastuuorganisaatiot removeImpl(
        Infra_Vastuuorganisaatiot infra_Vastuuorganisaatiot)
        throws SystemException {
        infra_Vastuuorganisaatiot = toUnwrappedModel(infra_Vastuuorganisaatiot);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(infra_Vastuuorganisaatiot)) {
                infra_Vastuuorganisaatiot = (Infra_Vastuuorganisaatiot) session.get(Infra_VastuuorganisaatiotImpl.class,
                        infra_Vastuuorganisaatiot.getPrimaryKeyObj());
            }

            if (infra_Vastuuorganisaatiot != null) {
                session.delete(infra_Vastuuorganisaatiot);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (infra_Vastuuorganisaatiot != null) {
            clearCache(infra_Vastuuorganisaatiot);
        }

        return infra_Vastuuorganisaatiot;
    }

    @Override
    public Infra_Vastuuorganisaatiot updateImpl(
        fi.csc.avaa.tupa.db.model.Infra_Vastuuorganisaatiot infra_Vastuuorganisaatiot)
        throws SystemException {
        infra_Vastuuorganisaatiot = toUnwrappedModel(infra_Vastuuorganisaatiot);

        boolean isNew = infra_Vastuuorganisaatiot.isNew();

        Session session = null;

        try {
            session = openSession();

            if (infra_Vastuuorganisaatiot.isNew()) {
                session.save(infra_Vastuuorganisaatiot);

                infra_Vastuuorganisaatiot.setNew(false);
            } else {
                session.merge(infra_Vastuuorganisaatiot);
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

        EntityCacheUtil.putResult(Infra_VastuuorganisaatiotModelImpl.ENTITY_CACHE_ENABLED,
            Infra_VastuuorganisaatiotImpl.class,
            infra_Vastuuorganisaatiot.getPrimaryKey(), infra_Vastuuorganisaatiot);

        return infra_Vastuuorganisaatiot;
    }

    protected Infra_Vastuuorganisaatiot toUnwrappedModel(
        Infra_Vastuuorganisaatiot infra_Vastuuorganisaatiot) {
        if (infra_Vastuuorganisaatiot instanceof Infra_VastuuorganisaatiotImpl) {
            return infra_Vastuuorganisaatiot;
        }

        Infra_VastuuorganisaatiotImpl infra_VastuuorganisaatiotImpl = new Infra_VastuuorganisaatiotImpl();

        infra_VastuuorganisaatiotImpl.setNew(infra_Vastuuorganisaatiot.isNew());
        infra_VastuuorganisaatiotImpl.setPrimaryKey(infra_Vastuuorganisaatiot.getPrimaryKey());

        infra_VastuuorganisaatiotImpl.setInfra_id(infra_Vastuuorganisaatiot.getInfra_id());
        infra_VastuuorganisaatiotImpl.setOrganisaatio_id(infra_Vastuuorganisaatiot.getOrganisaatio_id());

        return infra_VastuuorganisaatiotImpl;
    }

    /**
     * Returns the infra_ vastuuorganisaatiot with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the infra_ vastuuorganisaatiot
     * @return the infra_ vastuuorganisaatiot
     * @throws fi.csc.avaa.tupa.db.NoSuchInfra_VastuuorganisaatiotException if a infra_ vastuuorganisaatiot with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Infra_Vastuuorganisaatiot findByPrimaryKey(Serializable primaryKey)
        throws NoSuchInfra_VastuuorganisaatiotException, SystemException {
        Infra_Vastuuorganisaatiot infra_Vastuuorganisaatiot = fetchByPrimaryKey(primaryKey);

        if (infra_Vastuuorganisaatiot == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchInfra_VastuuorganisaatiotException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return infra_Vastuuorganisaatiot;
    }

    /**
     * Returns the infra_ vastuuorganisaatiot with the primary key or throws a {@link fi.csc.avaa.tupa.db.NoSuchInfra_VastuuorganisaatiotException} if it could not be found.
     *
     * @param infra_VastuuorganisaatiotPK the primary key of the infra_ vastuuorganisaatiot
     * @return the infra_ vastuuorganisaatiot
     * @throws fi.csc.avaa.tupa.db.NoSuchInfra_VastuuorganisaatiotException if a infra_ vastuuorganisaatiot with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Infra_Vastuuorganisaatiot findByPrimaryKey(
        Infra_VastuuorganisaatiotPK infra_VastuuorganisaatiotPK)
        throws NoSuchInfra_VastuuorganisaatiotException, SystemException {
        return findByPrimaryKey((Serializable) infra_VastuuorganisaatiotPK);
    }

    /**
     * Returns the infra_ vastuuorganisaatiot with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the infra_ vastuuorganisaatiot
     * @return the infra_ vastuuorganisaatiot, or <code>null</code> if a infra_ vastuuorganisaatiot with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Infra_Vastuuorganisaatiot fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        Infra_Vastuuorganisaatiot infra_Vastuuorganisaatiot = (Infra_Vastuuorganisaatiot) EntityCacheUtil.getResult(Infra_VastuuorganisaatiotModelImpl.ENTITY_CACHE_ENABLED,
                Infra_VastuuorganisaatiotImpl.class, primaryKey);

        if (infra_Vastuuorganisaatiot == _nullInfra_Vastuuorganisaatiot) {
            return null;
        }

        if (infra_Vastuuorganisaatiot == null) {
            Session session = null;

            try {
                session = openSession();

                infra_Vastuuorganisaatiot = (Infra_Vastuuorganisaatiot) session.get(Infra_VastuuorganisaatiotImpl.class,
                        primaryKey);

                if (infra_Vastuuorganisaatiot != null) {
                    cacheResult(infra_Vastuuorganisaatiot);
                } else {
                    EntityCacheUtil.putResult(Infra_VastuuorganisaatiotModelImpl.ENTITY_CACHE_ENABLED,
                        Infra_VastuuorganisaatiotImpl.class, primaryKey,
                        _nullInfra_Vastuuorganisaatiot);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(Infra_VastuuorganisaatiotModelImpl.ENTITY_CACHE_ENABLED,
                    Infra_VastuuorganisaatiotImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return infra_Vastuuorganisaatiot;
    }

    /**
     * Returns the infra_ vastuuorganisaatiot with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param infra_VastuuorganisaatiotPK the primary key of the infra_ vastuuorganisaatiot
     * @return the infra_ vastuuorganisaatiot, or <code>null</code> if a infra_ vastuuorganisaatiot with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Infra_Vastuuorganisaatiot fetchByPrimaryKey(
        Infra_VastuuorganisaatiotPK infra_VastuuorganisaatiotPK)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) infra_VastuuorganisaatiotPK);
    }

    /**
     * Returns all the infra_ vastuuorganisaatiots.
     *
     * @return the infra_ vastuuorganisaatiots
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Infra_Vastuuorganisaatiot> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the infra_ vastuuorganisaatiots.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.Infra_VastuuorganisaatiotModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of infra_ vastuuorganisaatiots
     * @param end the upper bound of the range of infra_ vastuuorganisaatiots (not inclusive)
     * @return the range of infra_ vastuuorganisaatiots
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Infra_Vastuuorganisaatiot> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the infra_ vastuuorganisaatiots.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.Infra_VastuuorganisaatiotModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of infra_ vastuuorganisaatiots
     * @param end the upper bound of the range of infra_ vastuuorganisaatiots (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of infra_ vastuuorganisaatiots
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Infra_Vastuuorganisaatiot> findAll(int start, int end,
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

        List<Infra_Vastuuorganisaatiot> list = (List<Infra_Vastuuorganisaatiot>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_INFRA_VASTUUORGANISAATIOT);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_INFRA_VASTUUORGANISAATIOT;

                if (pagination) {
                    sql = sql.concat(Infra_VastuuorganisaatiotModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<Infra_Vastuuorganisaatiot>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Infra_Vastuuorganisaatiot>(list);
                } else {
                    list = (List<Infra_Vastuuorganisaatiot>) QueryUtil.list(q,
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
     * Removes all the infra_ vastuuorganisaatiots from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (Infra_Vastuuorganisaatiot infra_Vastuuorganisaatiot : findAll()) {
            remove(infra_Vastuuorganisaatiot);
        }
    }

    /**
     * Returns the number of infra_ vastuuorganisaatiots.
     *
     * @return the number of infra_ vastuuorganisaatiots
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

                Query q = session.createQuery(_SQL_COUNT_INFRA_VASTUUORGANISAATIOT);

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
     * Initializes the infra_ vastuuorganisaatiot persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.fi.csc.avaa.tupa.db.model.Infra_Vastuuorganisaatiot")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<Infra_Vastuuorganisaatiot>> listenersList = new ArrayList<ModelListener<Infra_Vastuuorganisaatiot>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<Infra_Vastuuorganisaatiot>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(Infra_VastuuorganisaatiotImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
