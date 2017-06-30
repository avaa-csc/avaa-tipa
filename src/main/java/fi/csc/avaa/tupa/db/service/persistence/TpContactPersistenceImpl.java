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

import fi.csc.avaa.tupa.db.NoSuchTpContactException;
import fi.csc.avaa.tupa.db.model.TpContact;
import fi.csc.avaa.tupa.db.model.impl.TpContactImpl;
import fi.csc.avaa.tupa.db.model.impl.TpContactModelImpl;
import fi.csc.avaa.tupa.db.service.persistence.TpContactPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the tp contact service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CSC
 * @see TpContactPersistence
 * @see TpContactUtil
 * @generated
 */
public class TpContactPersistenceImpl extends BasePersistenceImpl<TpContact>
    implements TpContactPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link TpContactUtil} to access the tp contact persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = TpContactImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(TpContactModelImpl.ENTITY_CACHE_ENABLED,
            TpContactModelImpl.FINDER_CACHE_ENABLED, TpContactImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(TpContactModelImpl.ENTITY_CACHE_ENABLED,
            TpContactModelImpl.FINDER_CACHE_ENABLED, TpContactImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TpContactModelImpl.ENTITY_CACHE_ENABLED,
            TpContactModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_TPCONTACT = "SELECT tpContact FROM TpContact tpContact";
    private static final String _SQL_COUNT_TPCONTACT = "SELECT COUNT(tpContact) FROM TpContact tpContact";
    private static final String _ORDER_BY_ENTITY_ALIAS = "tpContact.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No TpContact exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(TpContactPersistenceImpl.class);
    private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
                "id"
            });
    private static TpContact _nullTpContact = new TpContactImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<TpContact> toCacheModel() {
                return _nullTpContactCacheModel;
            }
        };

    private static CacheModel<TpContact> _nullTpContactCacheModel = new CacheModel<TpContact>() {
            @Override
            public TpContact toEntityModel() {
                return _nullTpContact;
            }
        };

    public TpContactPersistenceImpl() {
        setModelClass(TpContact.class);
    }

    /**
     * Caches the tp contact in the entity cache if it is enabled.
     *
     * @param tpContact the tp contact
     */
    @Override
    public void cacheResult(TpContact tpContact) {
        EntityCacheUtil.putResult(TpContactModelImpl.ENTITY_CACHE_ENABLED,
            TpContactImpl.class, tpContact.getPrimaryKey(), tpContact);

        tpContact.resetOriginalValues();
    }

    /**
     * Caches the tp contacts in the entity cache if it is enabled.
     *
     * @param tpContacts the tp contacts
     */
    @Override
    public void cacheResult(List<TpContact> tpContacts) {
        for (TpContact tpContact : tpContacts) {
            if (EntityCacheUtil.getResult(
                        TpContactModelImpl.ENTITY_CACHE_ENABLED,
                        TpContactImpl.class, tpContact.getPrimaryKey()) == null) {
                cacheResult(tpContact);
            } else {
                tpContact.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all tp contacts.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(TpContactImpl.class.getName());
        }

        EntityCacheUtil.clearCache(TpContactImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the tp contact.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(TpContact tpContact) {
        EntityCacheUtil.removeResult(TpContactModelImpl.ENTITY_CACHE_ENABLED,
            TpContactImpl.class, tpContact.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<TpContact> tpContacts) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (TpContact tpContact : tpContacts) {
            EntityCacheUtil.removeResult(TpContactModelImpl.ENTITY_CACHE_ENABLED,
                TpContactImpl.class, tpContact.getPrimaryKey());
        }
    }

    /**
     * Creates a new tp contact with the primary key. Does not add the tp contact to the database.
     *
     * @param id the primary key for the new tp contact
     * @return the new tp contact
     */
    @Override
    public TpContact create(int id) {
        TpContact tpContact = new TpContactImpl();

        tpContact.setNew(true);
        tpContact.setPrimaryKey(id);

        return tpContact;
    }

    /**
     * Removes the tp contact with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param id the primary key of the tp contact
     * @return the tp contact that was removed
     * @throws fi.csc.avaa.tupa.db.NoSuchTpContactException if a tp contact with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public TpContact remove(int id)
        throws NoSuchTpContactException, SystemException {
        return remove((Serializable) id);
    }

    /**
     * Removes the tp contact with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the tp contact
     * @return the tp contact that was removed
     * @throws fi.csc.avaa.tupa.db.NoSuchTpContactException if a tp contact with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public TpContact remove(Serializable primaryKey)
        throws NoSuchTpContactException, SystemException {
        Session session = null;

        try {
            session = openSession();

            TpContact tpContact = (TpContact) session.get(TpContactImpl.class,
                    primaryKey);

            if (tpContact == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchTpContactException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(tpContact);
        } catch (NoSuchTpContactException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected TpContact removeImpl(TpContact tpContact)
        throws SystemException {
        tpContact = toUnwrappedModel(tpContact);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(tpContact)) {
                tpContact = (TpContact) session.get(TpContactImpl.class,
                        tpContact.getPrimaryKeyObj());
            }

            if (tpContact != null) {
                session.delete(tpContact);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (tpContact != null) {
            clearCache(tpContact);
        }

        return tpContact;
    }

    @Override
    public TpContact updateImpl(fi.csc.avaa.tupa.db.model.TpContact tpContact)
        throws SystemException {
        tpContact = toUnwrappedModel(tpContact);

        boolean isNew = tpContact.isNew();

        Session session = null;

        try {
            session = openSession();

            if (tpContact.isNew()) {
                session.save(tpContact);

                tpContact.setNew(false);
            } else {
                session.merge(tpContact);
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

        EntityCacheUtil.putResult(TpContactModelImpl.ENTITY_CACHE_ENABLED,
            TpContactImpl.class, tpContact.getPrimaryKey(), tpContact);

        return tpContact;
    }

    protected TpContact toUnwrappedModel(TpContact tpContact) {
        if (tpContact instanceof TpContactImpl) {
            return tpContact;
        }

        TpContactImpl tpContactImpl = new TpContactImpl();

        tpContactImpl.setNew(tpContact.isNew());
        tpContactImpl.setPrimaryKey(tpContact.getPrimaryKey());

        tpContactImpl.setId(tpContact.getId());
        tpContactImpl.setEmail(tpContact.getEmail());
        tpContactImpl.setPhone(tpContact.getPhone());
        tpContactImpl.setTitle(tpContact.getTitle());
        tpContactImpl.setFirstName(tpContact.getFirstName());
        tpContactImpl.setLastName(tpContact.getLastName());
        tpContactImpl.setUrl(tpContact.getUrl());
        tpContactImpl.setDescription_EN(tpContact.getDescription_EN());
        tpContactImpl.setDescription_FI(tpContact.getDescription_FI());

        return tpContactImpl;
    }

    /**
     * Returns the tp contact with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the tp contact
     * @return the tp contact
     * @throws fi.csc.avaa.tupa.db.NoSuchTpContactException if a tp contact with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public TpContact findByPrimaryKey(Serializable primaryKey)
        throws NoSuchTpContactException, SystemException {
        TpContact tpContact = fetchByPrimaryKey(primaryKey);

        if (tpContact == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchTpContactException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return tpContact;
    }

    /**
     * Returns the tp contact with the primary key or throws a {@link fi.csc.avaa.tupa.db.NoSuchTpContactException} if it could not be found.
     *
     * @param id the primary key of the tp contact
     * @return the tp contact
     * @throws fi.csc.avaa.tupa.db.NoSuchTpContactException if a tp contact with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public TpContact findByPrimaryKey(int id)
        throws NoSuchTpContactException, SystemException {
        return findByPrimaryKey((Serializable) id);
    }

    /**
     * Returns the tp contact with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the tp contact
     * @return the tp contact, or <code>null</code> if a tp contact with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public TpContact fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        TpContact tpContact = (TpContact) EntityCacheUtil.getResult(TpContactModelImpl.ENTITY_CACHE_ENABLED,
                TpContactImpl.class, primaryKey);

        if (tpContact == _nullTpContact) {
            return null;
        }

        if (tpContact == null) {
            Session session = null;

            try {
                session = openSession();

                tpContact = (TpContact) session.get(TpContactImpl.class,
                        primaryKey);

                if (tpContact != null) {
                    cacheResult(tpContact);
                } else {
                    EntityCacheUtil.putResult(TpContactModelImpl.ENTITY_CACHE_ENABLED,
                        TpContactImpl.class, primaryKey, _nullTpContact);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(TpContactModelImpl.ENTITY_CACHE_ENABLED,
                    TpContactImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return tpContact;
    }

    /**
     * Returns the tp contact with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param id the primary key of the tp contact
     * @return the tp contact, or <code>null</code> if a tp contact with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public TpContact fetchByPrimaryKey(int id) throws SystemException {
        return fetchByPrimaryKey((Serializable) id);
    }

    /**
     * Returns all the tp contacts.
     *
     * @return the tp contacts
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<TpContact> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the tp contacts.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.TpContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of tp contacts
     * @param end the upper bound of the range of tp contacts (not inclusive)
     * @return the range of tp contacts
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<TpContact> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the tp contacts.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.TpContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of tp contacts
     * @param end the upper bound of the range of tp contacts (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of tp contacts
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<TpContact> findAll(int start, int end,
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

        List<TpContact> list = (List<TpContact>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_TPCONTACT);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_TPCONTACT;

                if (pagination) {
                    sql = sql.concat(TpContactModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<TpContact>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<TpContact>(list);
                } else {
                    list = (List<TpContact>) QueryUtil.list(q, getDialect(),
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
     * Removes all the tp contacts from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (TpContact tpContact : findAll()) {
            remove(tpContact);
        }
    }

    /**
     * Returns the number of tp contacts.
     *
     * @return the number of tp contacts
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

                Query q = session.createQuery(_SQL_COUNT_TPCONTACT);

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
     * Initializes the tp contact persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.fi.csc.avaa.tupa.db.model.TpContact")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<TpContact>> listenersList = new ArrayList<ModelListener<TpContact>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<TpContact>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(TpContactImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
