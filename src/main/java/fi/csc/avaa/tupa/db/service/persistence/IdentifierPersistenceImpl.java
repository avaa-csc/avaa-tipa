package fi.csc.avaa.tupa.db.service.persistence;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
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
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import fi.csc.avaa.tupa.db.NoSuchIdentifierException;
import fi.csc.avaa.tupa.db.model.Identifier;
import fi.csc.avaa.tupa.db.model.impl.IdentifierImpl;
import fi.csc.avaa.tupa.db.model.impl.IdentifierModelImpl;
import fi.csc.avaa.tupa.db.service.persistence.IdentifierPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the identifier service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CSC
 * @see IdentifierPersistence
 * @see IdentifierUtil
 * @generated
 */
public class IdentifierPersistenceImpl extends BasePersistenceImpl<Identifier>
    implements IdentifierPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link IdentifierUtil} to access the identifier persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = IdentifierImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(IdentifierModelImpl.ENTITY_CACHE_ENABLED,
            IdentifierModelImpl.FINDER_CACHE_ENABLED, IdentifierImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(IdentifierModelImpl.ENTITY_CACHE_ENABLED,
            IdentifierModelImpl.FINDER_CACHE_ENABLED, IdentifierImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(IdentifierModelImpl.ENTITY_CACHE_ENABLED,
            IdentifierModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_IDENTIFIERNAME =
        new FinderPath(IdentifierModelImpl.ENTITY_CACHE_ENABLED,
            IdentifierModelImpl.FINDER_CACHE_ENABLED, IdentifierImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByidentifierName",
            new String[] {
                String.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IDENTIFIERNAME =
        new FinderPath(IdentifierModelImpl.ENTITY_CACHE_ENABLED,
            IdentifierModelImpl.FINDER_CACHE_ENABLED, IdentifierImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByidentifierName",
            new String[] { String.class.getName() },
            IdentifierModelImpl.IDENTIFIER_NAME_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_IDENTIFIERNAME = new FinderPath(IdentifierModelImpl.ENTITY_CACHE_ENABLED,
            IdentifierModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByidentifierName",
            new String[] { String.class.getName() });
    private static final String _FINDER_COLUMN_IDENTIFIERNAME_IDENTIFIER_NAME_1 = "identifier.identifier_name IS NULL";
    private static final String _FINDER_COLUMN_IDENTIFIERNAME_IDENTIFIER_NAME_2 = "identifier.identifier_name = ?";
    private static final String _FINDER_COLUMN_IDENTIFIERNAME_IDENTIFIER_NAME_3 = "(identifier.identifier_name IS NULL OR identifier.identifier_name = '')";
    private static final String _SQL_SELECT_IDENTIFIER = "SELECT identifier FROM Identifier identifier";
    private static final String _SQL_SELECT_IDENTIFIER_WHERE = "SELECT identifier FROM Identifier identifier WHERE ";
    private static final String _SQL_COUNT_IDENTIFIER = "SELECT COUNT(identifier) FROM Identifier identifier";
    private static final String _SQL_COUNT_IDENTIFIER_WHERE = "SELECT COUNT(identifier) FROM Identifier identifier WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "identifier.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Identifier exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Identifier exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(IdentifierPersistenceImpl.class);
    private static Identifier _nullIdentifier = new IdentifierImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<Identifier> toCacheModel() {
                return _nullIdentifierCacheModel;
            }
        };

    private static CacheModel<Identifier> _nullIdentifierCacheModel = new CacheModel<Identifier>() {
            @Override
            public Identifier toEntityModel() {
                return _nullIdentifier;
            }
        };

    public IdentifierPersistenceImpl() {
        setModelClass(Identifier.class);
    }

    /**
     * Returns all the identifiers where identifier_name = &#63;.
     *
     * @param identifier_name the identifier_name
     * @return the matching identifiers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Identifier> findByidentifierName(String identifier_name)
        throws SystemException {
        return findByidentifierName(identifier_name, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the identifiers where identifier_name = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.IdentifierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param identifier_name the identifier_name
     * @param start the lower bound of the range of identifiers
     * @param end the upper bound of the range of identifiers (not inclusive)
     * @return the range of matching identifiers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Identifier> findByidentifierName(String identifier_name,
        int start, int end) throws SystemException {
        return findByidentifierName(identifier_name, start, end, null);
    }

    /**
     * Returns an ordered range of all the identifiers where identifier_name = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.IdentifierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param identifier_name the identifier_name
     * @param start the lower bound of the range of identifiers
     * @param end the upper bound of the range of identifiers (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching identifiers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Identifier> findByidentifierName(String identifier_name,
        int start, int end, OrderByComparator orderByComparator)
        throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IDENTIFIERNAME;
            finderArgs = new Object[] { identifier_name };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_IDENTIFIERNAME;
            finderArgs = new Object[] {
                    identifier_name,
                    
                    start, end, orderByComparator
                };
        }

        List<Identifier> list = (List<Identifier>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Identifier identifier : list) {
                if (!Validator.equals(identifier_name,
                            identifier.getIdentifier_name())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(3 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(3);
            }

            query.append(_SQL_SELECT_IDENTIFIER_WHERE);

            boolean bindIdentifier_name = false;

            if (identifier_name == null) {
                query.append(_FINDER_COLUMN_IDENTIFIERNAME_IDENTIFIER_NAME_1);
            } else if (identifier_name.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_IDENTIFIERNAME_IDENTIFIER_NAME_3);
            } else {
                bindIdentifier_name = true;

                query.append(_FINDER_COLUMN_IDENTIFIERNAME_IDENTIFIER_NAME_2);
            }

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(IdentifierModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindIdentifier_name) {
                    qPos.add(identifier_name);
                }

                if (!pagination) {
                    list = (List<Identifier>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Identifier>(list);
                } else {
                    list = (List<Identifier>) QueryUtil.list(q, getDialect(),
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
     * Returns the first identifier in the ordered set where identifier_name = &#63;.
     *
     * @param identifier_name the identifier_name
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching identifier
     * @throws fi.csc.avaa.tupa.db.NoSuchIdentifierException if a matching identifier could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Identifier findByidentifierName_First(String identifier_name,
        OrderByComparator orderByComparator)
        throws NoSuchIdentifierException, SystemException {
        Identifier identifier = fetchByidentifierName_First(identifier_name,
                orderByComparator);

        if (identifier != null) {
            return identifier;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("identifier_name=");
        msg.append(identifier_name);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchIdentifierException(msg.toString());
    }

    /**
     * Returns the first identifier in the ordered set where identifier_name = &#63;.
     *
     * @param identifier_name the identifier_name
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching identifier, or <code>null</code> if a matching identifier could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Identifier fetchByidentifierName_First(String identifier_name,
        OrderByComparator orderByComparator) throws SystemException {
        List<Identifier> list = findByidentifierName(identifier_name, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last identifier in the ordered set where identifier_name = &#63;.
     *
     * @param identifier_name the identifier_name
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching identifier
     * @throws fi.csc.avaa.tupa.db.NoSuchIdentifierException if a matching identifier could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Identifier findByidentifierName_Last(String identifier_name,
        OrderByComparator orderByComparator)
        throws NoSuchIdentifierException, SystemException {
        Identifier identifier = fetchByidentifierName_Last(identifier_name,
                orderByComparator);

        if (identifier != null) {
            return identifier;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("identifier_name=");
        msg.append(identifier_name);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchIdentifierException(msg.toString());
    }

    /**
     * Returns the last identifier in the ordered set where identifier_name = &#63;.
     *
     * @param identifier_name the identifier_name
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching identifier, or <code>null</code> if a matching identifier could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Identifier fetchByidentifierName_Last(String identifier_name,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByidentifierName(identifier_name);

        if (count == 0) {
            return null;
        }

        List<Identifier> list = findByidentifierName(identifier_name,
                count - 1, count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the identifiers before and after the current identifier in the ordered set where identifier_name = &#63;.
     *
     * @param identifier_type the primary key of the current identifier
     * @param identifier_name the identifier_name
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next identifier
     * @throws fi.csc.avaa.tupa.db.NoSuchIdentifierException if a identifier with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Identifier[] findByidentifierName_PrevAndNext(int identifier_type,
        String identifier_name, OrderByComparator orderByComparator)
        throws NoSuchIdentifierException, SystemException {
        Identifier identifier = findByPrimaryKey(identifier_type);

        Session session = null;

        try {
            session = openSession();

            Identifier[] array = new IdentifierImpl[3];

            array[0] = getByidentifierName_PrevAndNext(session, identifier,
                    identifier_name, orderByComparator, true);

            array[1] = identifier;

            array[2] = getByidentifierName_PrevAndNext(session, identifier,
                    identifier_name, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Identifier getByidentifierName_PrevAndNext(Session session,
        Identifier identifier, String identifier_name,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_IDENTIFIER_WHERE);

        boolean bindIdentifier_name = false;

        if (identifier_name == null) {
            query.append(_FINDER_COLUMN_IDENTIFIERNAME_IDENTIFIER_NAME_1);
        } else if (identifier_name.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_IDENTIFIERNAME_IDENTIFIER_NAME_3);
        } else {
            bindIdentifier_name = true;

            query.append(_FINDER_COLUMN_IDENTIFIERNAME_IDENTIFIER_NAME_2);
        }

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        } else {
            query.append(IdentifierModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        if (bindIdentifier_name) {
            qPos.add(identifier_name);
        }

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(identifier);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Identifier> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the identifiers where identifier_name = &#63; from the database.
     *
     * @param identifier_name the identifier_name
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByidentifierName(String identifier_name)
        throws SystemException {
        for (Identifier identifier : findByidentifierName(identifier_name,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(identifier);
        }
    }

    /**
     * Returns the number of identifiers where identifier_name = &#63;.
     *
     * @param identifier_name the identifier_name
     * @return the number of matching identifiers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByidentifierName(String identifier_name)
        throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_IDENTIFIERNAME;

        Object[] finderArgs = new Object[] { identifier_name };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_IDENTIFIER_WHERE);

            boolean bindIdentifier_name = false;

            if (identifier_name == null) {
                query.append(_FINDER_COLUMN_IDENTIFIERNAME_IDENTIFIER_NAME_1);
            } else if (identifier_name.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_IDENTIFIERNAME_IDENTIFIER_NAME_3);
            } else {
                bindIdentifier_name = true;

                query.append(_FINDER_COLUMN_IDENTIFIERNAME_IDENTIFIER_NAME_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindIdentifier_name) {
                    qPos.add(identifier_name);
                }

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Caches the identifier in the entity cache if it is enabled.
     *
     * @param identifier the identifier
     */
    @Override
    public void cacheResult(Identifier identifier) {
        EntityCacheUtil.putResult(IdentifierModelImpl.ENTITY_CACHE_ENABLED,
            IdentifierImpl.class, identifier.getPrimaryKey(), identifier);

        identifier.resetOriginalValues();
    }

    /**
     * Caches the identifiers in the entity cache if it is enabled.
     *
     * @param identifiers the identifiers
     */
    @Override
    public void cacheResult(List<Identifier> identifiers) {
        for (Identifier identifier : identifiers) {
            if (EntityCacheUtil.getResult(
                        IdentifierModelImpl.ENTITY_CACHE_ENABLED,
                        IdentifierImpl.class, identifier.getPrimaryKey()) == null) {
                cacheResult(identifier);
            } else {
                identifier.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all identifiers.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(IdentifierImpl.class.getName());
        }

        EntityCacheUtil.clearCache(IdentifierImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the identifier.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(Identifier identifier) {
        EntityCacheUtil.removeResult(IdentifierModelImpl.ENTITY_CACHE_ENABLED,
            IdentifierImpl.class, identifier.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<Identifier> identifiers) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (Identifier identifier : identifiers) {
            EntityCacheUtil.removeResult(IdentifierModelImpl.ENTITY_CACHE_ENABLED,
                IdentifierImpl.class, identifier.getPrimaryKey());
        }
    }

    /**
     * Creates a new identifier with the primary key. Does not add the identifier to the database.
     *
     * @param identifier_type the primary key for the new identifier
     * @return the new identifier
     */
    @Override
    public Identifier create(int identifier_type) {
        Identifier identifier = new IdentifierImpl();

        identifier.setNew(true);
        identifier.setPrimaryKey(identifier_type);

        return identifier;
    }

    /**
     * Removes the identifier with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param identifier_type the primary key of the identifier
     * @return the identifier that was removed
     * @throws fi.csc.avaa.tupa.db.NoSuchIdentifierException if a identifier with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Identifier remove(int identifier_type)
        throws NoSuchIdentifierException, SystemException {
        return remove((Serializable) identifier_type);
    }

    /**
     * Removes the identifier with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the identifier
     * @return the identifier that was removed
     * @throws fi.csc.avaa.tupa.db.NoSuchIdentifierException if a identifier with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Identifier remove(Serializable primaryKey)
        throws NoSuchIdentifierException, SystemException {
        Session session = null;

        try {
            session = openSession();

            Identifier identifier = (Identifier) session.get(IdentifierImpl.class,
                    primaryKey);

            if (identifier == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchIdentifierException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(identifier);
        } catch (NoSuchIdentifierException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected Identifier removeImpl(Identifier identifier)
        throws SystemException {
        identifier = toUnwrappedModel(identifier);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(identifier)) {
                identifier = (Identifier) session.get(IdentifierImpl.class,
                        identifier.getPrimaryKeyObj());
            }

            if (identifier != null) {
                session.delete(identifier);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (identifier != null) {
            clearCache(identifier);
        }

        return identifier;
    }

    @Override
    public Identifier updateImpl(
        fi.csc.avaa.tupa.db.model.Identifier identifier)
        throws SystemException {
        identifier = toUnwrappedModel(identifier);

        boolean isNew = identifier.isNew();

        IdentifierModelImpl identifierModelImpl = (IdentifierModelImpl) identifier;

        Session session = null;

        try {
            session = openSession();

            if (identifier.isNew()) {
                session.save(identifier);

                identifier.setNew(false);
            } else {
                session.merge(identifier);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !IdentifierModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((identifierModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IDENTIFIERNAME.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        identifierModelImpl.getOriginalIdentifier_name()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_IDENTIFIERNAME,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IDENTIFIERNAME,
                    args);

                args = new Object[] { identifierModelImpl.getIdentifier_name() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_IDENTIFIERNAME,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IDENTIFIERNAME,
                    args);
            }
        }

        EntityCacheUtil.putResult(IdentifierModelImpl.ENTITY_CACHE_ENABLED,
            IdentifierImpl.class, identifier.getPrimaryKey(), identifier);

        return identifier;
    }

    protected Identifier toUnwrappedModel(Identifier identifier) {
        if (identifier instanceof IdentifierImpl) {
            return identifier;
        }

        IdentifierImpl identifierImpl = new IdentifierImpl();

        identifierImpl.setNew(identifier.isNew());
        identifierImpl.setPrimaryKey(identifier.getPrimaryKey());

        identifierImpl.setIdentifier_type(identifier.getIdentifier_type());
        identifierImpl.setIdentifier_name(identifier.getIdentifier_name());
        identifierImpl.setIdentifier_description_translation_key(identifier.getIdentifier_description_translation_key());
        identifierImpl.setResolution_url(identifier.getResolution_url());
        identifierImpl.setDefinition_url(identifier.getDefinition_url());

        return identifierImpl;
    }

    /**
     * Returns the identifier with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the identifier
     * @return the identifier
     * @throws fi.csc.avaa.tupa.db.NoSuchIdentifierException if a identifier with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Identifier findByPrimaryKey(Serializable primaryKey)
        throws NoSuchIdentifierException, SystemException {
        Identifier identifier = fetchByPrimaryKey(primaryKey);

        if (identifier == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchIdentifierException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return identifier;
    }

    /**
     * Returns the identifier with the primary key or throws a {@link fi.csc.avaa.tupa.db.NoSuchIdentifierException} if it could not be found.
     *
     * @param identifier_type the primary key of the identifier
     * @return the identifier
     * @throws fi.csc.avaa.tupa.db.NoSuchIdentifierException if a identifier with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Identifier findByPrimaryKey(int identifier_type)
        throws NoSuchIdentifierException, SystemException {
        return findByPrimaryKey((Serializable) identifier_type);
    }

    /**
     * Returns the identifier with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the identifier
     * @return the identifier, or <code>null</code> if a identifier with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Identifier fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        Identifier identifier = (Identifier) EntityCacheUtil.getResult(IdentifierModelImpl.ENTITY_CACHE_ENABLED,
                IdentifierImpl.class, primaryKey);

        if (identifier == _nullIdentifier) {
            return null;
        }

        if (identifier == null) {
            Session session = null;

            try {
                session = openSession();

                identifier = (Identifier) session.get(IdentifierImpl.class,
                        primaryKey);

                if (identifier != null) {
                    cacheResult(identifier);
                } else {
                    EntityCacheUtil.putResult(IdentifierModelImpl.ENTITY_CACHE_ENABLED,
                        IdentifierImpl.class, primaryKey, _nullIdentifier);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(IdentifierModelImpl.ENTITY_CACHE_ENABLED,
                    IdentifierImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return identifier;
    }

    /**
     * Returns the identifier with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param identifier_type the primary key of the identifier
     * @return the identifier, or <code>null</code> if a identifier with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Identifier fetchByPrimaryKey(int identifier_type)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) identifier_type);
    }

    /**
     * Returns all the identifiers.
     *
     * @return the identifiers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Identifier> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the identifiers.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.IdentifierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of identifiers
     * @param end the upper bound of the range of identifiers (not inclusive)
     * @return the range of identifiers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Identifier> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the identifiers.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.IdentifierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of identifiers
     * @param end the upper bound of the range of identifiers (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of identifiers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Identifier> findAll(int start, int end,
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

        List<Identifier> list = (List<Identifier>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_IDENTIFIER);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_IDENTIFIER;

                if (pagination) {
                    sql = sql.concat(IdentifierModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<Identifier>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Identifier>(list);
                } else {
                    list = (List<Identifier>) QueryUtil.list(q, getDialect(),
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
     * Removes all the identifiers from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (Identifier identifier : findAll()) {
            remove(identifier);
        }
    }

    /**
     * Returns the number of identifiers.
     *
     * @return the number of identifiers
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

                Query q = session.createQuery(_SQL_COUNT_IDENTIFIER);

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
     * Initializes the identifier persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.fi.csc.avaa.tupa.db.model.Identifier")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<Identifier>> listenersList = new ArrayList<ModelListener<Identifier>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<Identifier>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(IdentifierImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
