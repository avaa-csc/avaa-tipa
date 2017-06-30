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

import fi.csc.avaa.tupa.db.NoSuchInfra_IdentifierException;
import fi.csc.avaa.tupa.db.model.Infra_Identifier;
import fi.csc.avaa.tupa.db.model.impl.Infra_IdentifierImpl;
import fi.csc.avaa.tupa.db.model.impl.Infra_IdentifierModelImpl;
import fi.csc.avaa.tupa.db.service.persistence.Infra_IdentifierPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the infra_ identifier service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CSC
 * @see Infra_IdentifierPersistence
 * @see Infra_IdentifierUtil
 * @generated
 */
public class Infra_IdentifierPersistenceImpl extends BasePersistenceImpl<Infra_Identifier>
    implements Infra_IdentifierPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link Infra_IdentifierUtil} to access the infra_ identifier persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = Infra_IdentifierImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(Infra_IdentifierModelImpl.ENTITY_CACHE_ENABLED,
            Infra_IdentifierModelImpl.FINDER_CACHE_ENABLED,
            Infra_IdentifierImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(Infra_IdentifierModelImpl.ENTITY_CACHE_ENABLED,
            Infra_IdentifierModelImpl.FINDER_CACHE_ENABLED,
            Infra_IdentifierImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(Infra_IdentifierModelImpl.ENTITY_CACHE_ENABLED,
            Infra_IdentifierModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_INFRAID = new FinderPath(Infra_IdentifierModelImpl.ENTITY_CACHE_ENABLED,
            Infra_IdentifierModelImpl.FINDER_CACHE_ENABLED,
            Infra_IdentifierImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findByinfraId",
            new String[] {
                Integer.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INFRAID =
        new FinderPath(Infra_IdentifierModelImpl.ENTITY_CACHE_ENABLED,
            Infra_IdentifierModelImpl.FINDER_CACHE_ENABLED,
            Infra_IdentifierImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByinfraId",
            new String[] { Integer.class.getName() },
            Infra_IdentifierModelImpl.INFRA_ID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_INFRAID = new FinderPath(Infra_IdentifierModelImpl.ENTITY_CACHE_ENABLED,
            Infra_IdentifierModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByinfraId",
            new String[] { Integer.class.getName() });
    private static final String _FINDER_COLUMN_INFRAID_INFRA_ID_2 = "infra_Identifier.id.infra_id = ?";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_IDENTIFIERTYPE =
        new FinderPath(Infra_IdentifierModelImpl.ENTITY_CACHE_ENABLED,
            Infra_IdentifierModelImpl.FINDER_CACHE_ENABLED,
            Infra_IdentifierImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findByidentifierType",
            new String[] {
                Integer.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IDENTIFIERTYPE =
        new FinderPath(Infra_IdentifierModelImpl.ENTITY_CACHE_ENABLED,
            Infra_IdentifierModelImpl.FINDER_CACHE_ENABLED,
            Infra_IdentifierImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByidentifierType",
            new String[] { Integer.class.getName() },
            Infra_IdentifierModelImpl.IDENTIFIER_TYPE_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_IDENTIFIERTYPE = new FinderPath(Infra_IdentifierModelImpl.ENTITY_CACHE_ENABLED,
            Infra_IdentifierModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByidentifierType",
            new String[] { Integer.class.getName() });
    private static final String _FINDER_COLUMN_IDENTIFIERTYPE_IDENTIFIER_TYPE_2 = "infra_Identifier.id.identifier_type = ?";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_IDENTIFIERVALUE =
        new FinderPath(Infra_IdentifierModelImpl.ENTITY_CACHE_ENABLED,
            Infra_IdentifierModelImpl.FINDER_CACHE_ENABLED,
            Infra_IdentifierImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findByidentifierValue",
            new String[] {
                String.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IDENTIFIERVALUE =
        new FinderPath(Infra_IdentifierModelImpl.ENTITY_CACHE_ENABLED,
            Infra_IdentifierModelImpl.FINDER_CACHE_ENABLED,
            Infra_IdentifierImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByidentifierValue",
            new String[] { String.class.getName() },
            Infra_IdentifierModelImpl.IDENTIFIER_VALUE_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_IDENTIFIERVALUE = new FinderPath(Infra_IdentifierModelImpl.ENTITY_CACHE_ENABLED,
            Infra_IdentifierModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "countByidentifierValue", new String[] { String.class.getName() });
    private static final String _FINDER_COLUMN_IDENTIFIERVALUE_IDENTIFIER_VALUE_1 =
        "infra_Identifier.id.identifier_value IS NULL";
    private static final String _FINDER_COLUMN_IDENTIFIERVALUE_IDENTIFIER_VALUE_2 =
        "infra_Identifier.id.identifier_value = ?";
    private static final String _FINDER_COLUMN_IDENTIFIERVALUE_IDENTIFIER_VALUE_3 =
        "(infra_Identifier.id.identifier_value IS NULL OR infra_Identifier.id.identifier_value = '')";
    private static final String _SQL_SELECT_INFRA_IDENTIFIER = "SELECT infra_Identifier FROM Infra_Identifier infra_Identifier";
    private static final String _SQL_SELECT_INFRA_IDENTIFIER_WHERE = "SELECT infra_Identifier FROM Infra_Identifier infra_Identifier WHERE ";
    private static final String _SQL_COUNT_INFRA_IDENTIFIER = "SELECT COUNT(infra_Identifier) FROM Infra_Identifier infra_Identifier";
    private static final String _SQL_COUNT_INFRA_IDENTIFIER_WHERE = "SELECT COUNT(infra_Identifier) FROM Infra_Identifier infra_Identifier WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "infra_Identifier.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Infra_Identifier exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Infra_Identifier exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(Infra_IdentifierPersistenceImpl.class);
    private static Infra_Identifier _nullInfra_Identifier = new Infra_IdentifierImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<Infra_Identifier> toCacheModel() {
                return _nullInfra_IdentifierCacheModel;
            }
        };

    private static CacheModel<Infra_Identifier> _nullInfra_IdentifierCacheModel = new CacheModel<Infra_Identifier>() {
            @Override
            public Infra_Identifier toEntityModel() {
                return _nullInfra_Identifier;
            }
        };

    public Infra_IdentifierPersistenceImpl() {
        setModelClass(Infra_Identifier.class);
    }

    /**
     * Returns all the infra_ identifiers where infra_id = &#63;.
     *
     * @param infra_id the infra_id
     * @return the matching infra_ identifiers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Infra_Identifier> findByinfraId(int infra_id)
        throws SystemException {
        return findByinfraId(infra_id, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
            null);
    }

    /**
     * Returns a range of all the infra_ identifiers where infra_id = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.Infra_IdentifierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param infra_id the infra_id
     * @param start the lower bound of the range of infra_ identifiers
     * @param end the upper bound of the range of infra_ identifiers (not inclusive)
     * @return the range of matching infra_ identifiers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Infra_Identifier> findByinfraId(int infra_id, int start, int end)
        throws SystemException {
        return findByinfraId(infra_id, start, end, null);
    }

    /**
     * Returns an ordered range of all the infra_ identifiers where infra_id = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.Infra_IdentifierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param infra_id the infra_id
     * @param start the lower bound of the range of infra_ identifiers
     * @param end the upper bound of the range of infra_ identifiers (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching infra_ identifiers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Infra_Identifier> findByinfraId(int infra_id, int start,
        int end, OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INFRAID;
            finderArgs = new Object[] { infra_id };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_INFRAID;
            finderArgs = new Object[] { infra_id, start, end, orderByComparator };
        }

        List<Infra_Identifier> list = (List<Infra_Identifier>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Infra_Identifier infra_Identifier : list) {
                if ((infra_id != infra_Identifier.getInfra_id())) {
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

            query.append(_SQL_SELECT_INFRA_IDENTIFIER_WHERE);

            query.append(_FINDER_COLUMN_INFRAID_INFRA_ID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(Infra_IdentifierModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(infra_id);

                if (!pagination) {
                    list = (List<Infra_Identifier>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Infra_Identifier>(list);
                } else {
                    list = (List<Infra_Identifier>) QueryUtil.list(q,
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
     * Returns the first infra_ identifier in the ordered set where infra_id = &#63;.
     *
     * @param infra_id the infra_id
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching infra_ identifier
     * @throws fi.csc.avaa.tupa.db.NoSuchInfra_IdentifierException if a matching infra_ identifier could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Infra_Identifier findByinfraId_First(int infra_id,
        OrderByComparator orderByComparator)
        throws NoSuchInfra_IdentifierException, SystemException {
        Infra_Identifier infra_Identifier = fetchByinfraId_First(infra_id,
                orderByComparator);

        if (infra_Identifier != null) {
            return infra_Identifier;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("infra_id=");
        msg.append(infra_id);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchInfra_IdentifierException(msg.toString());
    }

    /**
     * Returns the first infra_ identifier in the ordered set where infra_id = &#63;.
     *
     * @param infra_id the infra_id
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching infra_ identifier, or <code>null</code> if a matching infra_ identifier could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Infra_Identifier fetchByinfraId_First(int infra_id,
        OrderByComparator orderByComparator) throws SystemException {
        List<Infra_Identifier> list = findByinfraId(infra_id, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last infra_ identifier in the ordered set where infra_id = &#63;.
     *
     * @param infra_id the infra_id
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching infra_ identifier
     * @throws fi.csc.avaa.tupa.db.NoSuchInfra_IdentifierException if a matching infra_ identifier could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Infra_Identifier findByinfraId_Last(int infra_id,
        OrderByComparator orderByComparator)
        throws NoSuchInfra_IdentifierException, SystemException {
        Infra_Identifier infra_Identifier = fetchByinfraId_Last(infra_id,
                orderByComparator);

        if (infra_Identifier != null) {
            return infra_Identifier;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("infra_id=");
        msg.append(infra_id);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchInfra_IdentifierException(msg.toString());
    }

    /**
     * Returns the last infra_ identifier in the ordered set where infra_id = &#63;.
     *
     * @param infra_id the infra_id
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching infra_ identifier, or <code>null</code> if a matching infra_ identifier could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Infra_Identifier fetchByinfraId_Last(int infra_id,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByinfraId(infra_id);

        if (count == 0) {
            return null;
        }

        List<Infra_Identifier> list = findByinfraId(infra_id, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the infra_ identifiers before and after the current infra_ identifier in the ordered set where infra_id = &#63;.
     *
     * @param infra_IdentifierPK the primary key of the current infra_ identifier
     * @param infra_id the infra_id
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next infra_ identifier
     * @throws fi.csc.avaa.tupa.db.NoSuchInfra_IdentifierException if a infra_ identifier with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Infra_Identifier[] findByinfraId_PrevAndNext(
        Infra_IdentifierPK infra_IdentifierPK, int infra_id,
        OrderByComparator orderByComparator)
        throws NoSuchInfra_IdentifierException, SystemException {
        Infra_Identifier infra_Identifier = findByPrimaryKey(infra_IdentifierPK);

        Session session = null;

        try {
            session = openSession();

            Infra_Identifier[] array = new Infra_IdentifierImpl[3];

            array[0] = getByinfraId_PrevAndNext(session, infra_Identifier,
                    infra_id, orderByComparator, true);

            array[1] = infra_Identifier;

            array[2] = getByinfraId_PrevAndNext(session, infra_Identifier,
                    infra_id, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Infra_Identifier getByinfraId_PrevAndNext(Session session,
        Infra_Identifier infra_Identifier, int infra_id,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_INFRA_IDENTIFIER_WHERE);

        query.append(_FINDER_COLUMN_INFRAID_INFRA_ID_2);

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
            query.append(Infra_IdentifierModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(infra_id);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(infra_Identifier);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Infra_Identifier> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the infra_ identifiers where infra_id = &#63; from the database.
     *
     * @param infra_id the infra_id
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByinfraId(int infra_id) throws SystemException {
        for (Infra_Identifier infra_Identifier : findByinfraId(infra_id,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(infra_Identifier);
        }
    }

    /**
     * Returns the number of infra_ identifiers where infra_id = &#63;.
     *
     * @param infra_id the infra_id
     * @return the number of matching infra_ identifiers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByinfraId(int infra_id) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_INFRAID;

        Object[] finderArgs = new Object[] { infra_id };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_INFRA_IDENTIFIER_WHERE);

            query.append(_FINDER_COLUMN_INFRAID_INFRA_ID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(infra_id);

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
     * Returns all the infra_ identifiers where identifier_type = &#63;.
     *
     * @param identifier_type the identifier_type
     * @return the matching infra_ identifiers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Infra_Identifier> findByidentifierType(int identifier_type)
        throws SystemException {
        return findByidentifierType(identifier_type, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the infra_ identifiers where identifier_type = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.Infra_IdentifierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param identifier_type the identifier_type
     * @param start the lower bound of the range of infra_ identifiers
     * @param end the upper bound of the range of infra_ identifiers (not inclusive)
     * @return the range of matching infra_ identifiers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Infra_Identifier> findByidentifierType(int identifier_type,
        int start, int end) throws SystemException {
        return findByidentifierType(identifier_type, start, end, null);
    }

    /**
     * Returns an ordered range of all the infra_ identifiers where identifier_type = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.Infra_IdentifierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param identifier_type the identifier_type
     * @param start the lower bound of the range of infra_ identifiers
     * @param end the upper bound of the range of infra_ identifiers (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching infra_ identifiers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Infra_Identifier> findByidentifierType(int identifier_type,
        int start, int end, OrderByComparator orderByComparator)
        throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IDENTIFIERTYPE;
            finderArgs = new Object[] { identifier_type };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_IDENTIFIERTYPE;
            finderArgs = new Object[] {
                    identifier_type,
                    
                    start, end, orderByComparator
                };
        }

        List<Infra_Identifier> list = (List<Infra_Identifier>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Infra_Identifier infra_Identifier : list) {
                if ((identifier_type != infra_Identifier.getIdentifier_type())) {
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

            query.append(_SQL_SELECT_INFRA_IDENTIFIER_WHERE);

            query.append(_FINDER_COLUMN_IDENTIFIERTYPE_IDENTIFIER_TYPE_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(Infra_IdentifierModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(identifier_type);

                if (!pagination) {
                    list = (List<Infra_Identifier>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Infra_Identifier>(list);
                } else {
                    list = (List<Infra_Identifier>) QueryUtil.list(q,
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
     * Returns the first infra_ identifier in the ordered set where identifier_type = &#63;.
     *
     * @param identifier_type the identifier_type
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching infra_ identifier
     * @throws fi.csc.avaa.tupa.db.NoSuchInfra_IdentifierException if a matching infra_ identifier could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Infra_Identifier findByidentifierType_First(int identifier_type,
        OrderByComparator orderByComparator)
        throws NoSuchInfra_IdentifierException, SystemException {
        Infra_Identifier infra_Identifier = fetchByidentifierType_First(identifier_type,
                orderByComparator);

        if (infra_Identifier != null) {
            return infra_Identifier;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("identifier_type=");
        msg.append(identifier_type);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchInfra_IdentifierException(msg.toString());
    }

    /**
     * Returns the first infra_ identifier in the ordered set where identifier_type = &#63;.
     *
     * @param identifier_type the identifier_type
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching infra_ identifier, or <code>null</code> if a matching infra_ identifier could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Infra_Identifier fetchByidentifierType_First(int identifier_type,
        OrderByComparator orderByComparator) throws SystemException {
        List<Infra_Identifier> list = findByidentifierType(identifier_type, 0,
                1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last infra_ identifier in the ordered set where identifier_type = &#63;.
     *
     * @param identifier_type the identifier_type
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching infra_ identifier
     * @throws fi.csc.avaa.tupa.db.NoSuchInfra_IdentifierException if a matching infra_ identifier could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Infra_Identifier findByidentifierType_Last(int identifier_type,
        OrderByComparator orderByComparator)
        throws NoSuchInfra_IdentifierException, SystemException {
        Infra_Identifier infra_Identifier = fetchByidentifierType_Last(identifier_type,
                orderByComparator);

        if (infra_Identifier != null) {
            return infra_Identifier;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("identifier_type=");
        msg.append(identifier_type);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchInfra_IdentifierException(msg.toString());
    }

    /**
     * Returns the last infra_ identifier in the ordered set where identifier_type = &#63;.
     *
     * @param identifier_type the identifier_type
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching infra_ identifier, or <code>null</code> if a matching infra_ identifier could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Infra_Identifier fetchByidentifierType_Last(int identifier_type,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByidentifierType(identifier_type);

        if (count == 0) {
            return null;
        }

        List<Infra_Identifier> list = findByidentifierType(identifier_type,
                count - 1, count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the infra_ identifiers before and after the current infra_ identifier in the ordered set where identifier_type = &#63;.
     *
     * @param infra_IdentifierPK the primary key of the current infra_ identifier
     * @param identifier_type the identifier_type
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next infra_ identifier
     * @throws fi.csc.avaa.tupa.db.NoSuchInfra_IdentifierException if a infra_ identifier with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Infra_Identifier[] findByidentifierType_PrevAndNext(
        Infra_IdentifierPK infra_IdentifierPK, int identifier_type,
        OrderByComparator orderByComparator)
        throws NoSuchInfra_IdentifierException, SystemException {
        Infra_Identifier infra_Identifier = findByPrimaryKey(infra_IdentifierPK);

        Session session = null;

        try {
            session = openSession();

            Infra_Identifier[] array = new Infra_IdentifierImpl[3];

            array[0] = getByidentifierType_PrevAndNext(session,
                    infra_Identifier, identifier_type, orderByComparator, true);

            array[1] = infra_Identifier;

            array[2] = getByidentifierType_PrevAndNext(session,
                    infra_Identifier, identifier_type, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Infra_Identifier getByidentifierType_PrevAndNext(
        Session session, Infra_Identifier infra_Identifier,
        int identifier_type, OrderByComparator orderByComparator,
        boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_INFRA_IDENTIFIER_WHERE);

        query.append(_FINDER_COLUMN_IDENTIFIERTYPE_IDENTIFIER_TYPE_2);

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
            query.append(Infra_IdentifierModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(identifier_type);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(infra_Identifier);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Infra_Identifier> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the infra_ identifiers where identifier_type = &#63; from the database.
     *
     * @param identifier_type the identifier_type
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByidentifierType(int identifier_type)
        throws SystemException {
        for (Infra_Identifier infra_Identifier : findByidentifierType(
                identifier_type, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(infra_Identifier);
        }
    }

    /**
     * Returns the number of infra_ identifiers where identifier_type = &#63;.
     *
     * @param identifier_type the identifier_type
     * @return the number of matching infra_ identifiers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByidentifierType(int identifier_type)
        throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_IDENTIFIERTYPE;

        Object[] finderArgs = new Object[] { identifier_type };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_INFRA_IDENTIFIER_WHERE);

            query.append(_FINDER_COLUMN_IDENTIFIERTYPE_IDENTIFIER_TYPE_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(identifier_type);

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
     * Returns all the infra_ identifiers where identifier_value = &#63;.
     *
     * @param identifier_value the identifier_value
     * @return the matching infra_ identifiers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Infra_Identifier> findByidentifierValue(String identifier_value)
        throws SystemException {
        return findByidentifierValue(identifier_value, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the infra_ identifiers where identifier_value = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.Infra_IdentifierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param identifier_value the identifier_value
     * @param start the lower bound of the range of infra_ identifiers
     * @param end the upper bound of the range of infra_ identifiers (not inclusive)
     * @return the range of matching infra_ identifiers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Infra_Identifier> findByidentifierValue(
        String identifier_value, int start, int end) throws SystemException {
        return findByidentifierValue(identifier_value, start, end, null);
    }

    /**
     * Returns an ordered range of all the infra_ identifiers where identifier_value = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.Infra_IdentifierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param identifier_value the identifier_value
     * @param start the lower bound of the range of infra_ identifiers
     * @param end the upper bound of the range of infra_ identifiers (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching infra_ identifiers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Infra_Identifier> findByidentifierValue(
        String identifier_value, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IDENTIFIERVALUE;
            finderArgs = new Object[] { identifier_value };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_IDENTIFIERVALUE;
            finderArgs = new Object[] {
                    identifier_value,
                    
                    start, end, orderByComparator
                };
        }

        List<Infra_Identifier> list = (List<Infra_Identifier>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Infra_Identifier infra_Identifier : list) {
                if (!Validator.equals(identifier_value,
                            infra_Identifier.getIdentifier_value())) {
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

            query.append(_SQL_SELECT_INFRA_IDENTIFIER_WHERE);

            boolean bindIdentifier_value = false;

            if (identifier_value == null) {
                query.append(_FINDER_COLUMN_IDENTIFIERVALUE_IDENTIFIER_VALUE_1);
            } else if (identifier_value.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_IDENTIFIERVALUE_IDENTIFIER_VALUE_3);
            } else {
                bindIdentifier_value = true;

                query.append(_FINDER_COLUMN_IDENTIFIERVALUE_IDENTIFIER_VALUE_2);
            }

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(Infra_IdentifierModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindIdentifier_value) {
                    qPos.add(identifier_value);
                }

                if (!pagination) {
                    list = (List<Infra_Identifier>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Infra_Identifier>(list);
                } else {
                    list = (List<Infra_Identifier>) QueryUtil.list(q,
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
     * Returns the first infra_ identifier in the ordered set where identifier_value = &#63;.
     *
     * @param identifier_value the identifier_value
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching infra_ identifier
     * @throws fi.csc.avaa.tupa.db.NoSuchInfra_IdentifierException if a matching infra_ identifier could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Infra_Identifier findByidentifierValue_First(
        String identifier_value, OrderByComparator orderByComparator)
        throws NoSuchInfra_IdentifierException, SystemException {
        Infra_Identifier infra_Identifier = fetchByidentifierValue_First(identifier_value,
                orderByComparator);

        if (infra_Identifier != null) {
            return infra_Identifier;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("identifier_value=");
        msg.append(identifier_value);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchInfra_IdentifierException(msg.toString());
    }

    /**
     * Returns the first infra_ identifier in the ordered set where identifier_value = &#63;.
     *
     * @param identifier_value the identifier_value
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching infra_ identifier, or <code>null</code> if a matching infra_ identifier could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Infra_Identifier fetchByidentifierValue_First(
        String identifier_value, OrderByComparator orderByComparator)
        throws SystemException {
        List<Infra_Identifier> list = findByidentifierValue(identifier_value,
                0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last infra_ identifier in the ordered set where identifier_value = &#63;.
     *
     * @param identifier_value the identifier_value
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching infra_ identifier
     * @throws fi.csc.avaa.tupa.db.NoSuchInfra_IdentifierException if a matching infra_ identifier could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Infra_Identifier findByidentifierValue_Last(
        String identifier_value, OrderByComparator orderByComparator)
        throws NoSuchInfra_IdentifierException, SystemException {
        Infra_Identifier infra_Identifier = fetchByidentifierValue_Last(identifier_value,
                orderByComparator);

        if (infra_Identifier != null) {
            return infra_Identifier;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("identifier_value=");
        msg.append(identifier_value);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchInfra_IdentifierException(msg.toString());
    }

    /**
     * Returns the last infra_ identifier in the ordered set where identifier_value = &#63;.
     *
     * @param identifier_value the identifier_value
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching infra_ identifier, or <code>null</code> if a matching infra_ identifier could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Infra_Identifier fetchByidentifierValue_Last(
        String identifier_value, OrderByComparator orderByComparator)
        throws SystemException {
        int count = countByidentifierValue(identifier_value);

        if (count == 0) {
            return null;
        }

        List<Infra_Identifier> list = findByidentifierValue(identifier_value,
                count - 1, count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the infra_ identifiers before and after the current infra_ identifier in the ordered set where identifier_value = &#63;.
     *
     * @param infra_IdentifierPK the primary key of the current infra_ identifier
     * @param identifier_value the identifier_value
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next infra_ identifier
     * @throws fi.csc.avaa.tupa.db.NoSuchInfra_IdentifierException if a infra_ identifier with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Infra_Identifier[] findByidentifierValue_PrevAndNext(
        Infra_IdentifierPK infra_IdentifierPK, String identifier_value,
        OrderByComparator orderByComparator)
        throws NoSuchInfra_IdentifierException, SystemException {
        Infra_Identifier infra_Identifier = findByPrimaryKey(infra_IdentifierPK);

        Session session = null;

        try {
            session = openSession();

            Infra_Identifier[] array = new Infra_IdentifierImpl[3];

            array[0] = getByidentifierValue_PrevAndNext(session,
                    infra_Identifier, identifier_value, orderByComparator, true);

            array[1] = infra_Identifier;

            array[2] = getByidentifierValue_PrevAndNext(session,
                    infra_Identifier, identifier_value, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Infra_Identifier getByidentifierValue_PrevAndNext(
        Session session, Infra_Identifier infra_Identifier,
        String identifier_value, OrderByComparator orderByComparator,
        boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_INFRA_IDENTIFIER_WHERE);

        boolean bindIdentifier_value = false;

        if (identifier_value == null) {
            query.append(_FINDER_COLUMN_IDENTIFIERVALUE_IDENTIFIER_VALUE_1);
        } else if (identifier_value.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_IDENTIFIERVALUE_IDENTIFIER_VALUE_3);
        } else {
            bindIdentifier_value = true;

            query.append(_FINDER_COLUMN_IDENTIFIERVALUE_IDENTIFIER_VALUE_2);
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
            query.append(Infra_IdentifierModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        if (bindIdentifier_value) {
            qPos.add(identifier_value);
        }

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(infra_Identifier);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Infra_Identifier> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the infra_ identifiers where identifier_value = &#63; from the database.
     *
     * @param identifier_value the identifier_value
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByidentifierValue(String identifier_value)
        throws SystemException {
        for (Infra_Identifier infra_Identifier : findByidentifierValue(
                identifier_value, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(infra_Identifier);
        }
    }

    /**
     * Returns the number of infra_ identifiers where identifier_value = &#63;.
     *
     * @param identifier_value the identifier_value
     * @return the number of matching infra_ identifiers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByidentifierValue(String identifier_value)
        throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_IDENTIFIERVALUE;

        Object[] finderArgs = new Object[] { identifier_value };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_INFRA_IDENTIFIER_WHERE);

            boolean bindIdentifier_value = false;

            if (identifier_value == null) {
                query.append(_FINDER_COLUMN_IDENTIFIERVALUE_IDENTIFIER_VALUE_1);
            } else if (identifier_value.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_IDENTIFIERVALUE_IDENTIFIER_VALUE_3);
            } else {
                bindIdentifier_value = true;

                query.append(_FINDER_COLUMN_IDENTIFIERVALUE_IDENTIFIER_VALUE_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindIdentifier_value) {
                    qPos.add(identifier_value);
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
     * Caches the infra_ identifier in the entity cache if it is enabled.
     *
     * @param infra_Identifier the infra_ identifier
     */
    @Override
    public void cacheResult(Infra_Identifier infra_Identifier) {
        EntityCacheUtil.putResult(Infra_IdentifierModelImpl.ENTITY_CACHE_ENABLED,
            Infra_IdentifierImpl.class, infra_Identifier.getPrimaryKey(),
            infra_Identifier);

        infra_Identifier.resetOriginalValues();
    }

    /**
     * Caches the infra_ identifiers in the entity cache if it is enabled.
     *
     * @param infra_Identifiers the infra_ identifiers
     */
    @Override
    public void cacheResult(List<Infra_Identifier> infra_Identifiers) {
        for (Infra_Identifier infra_Identifier : infra_Identifiers) {
            if (EntityCacheUtil.getResult(
                        Infra_IdentifierModelImpl.ENTITY_CACHE_ENABLED,
                        Infra_IdentifierImpl.class,
                        infra_Identifier.getPrimaryKey()) == null) {
                cacheResult(infra_Identifier);
            } else {
                infra_Identifier.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all infra_ identifiers.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(Infra_IdentifierImpl.class.getName());
        }

        EntityCacheUtil.clearCache(Infra_IdentifierImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the infra_ identifier.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(Infra_Identifier infra_Identifier) {
        EntityCacheUtil.removeResult(Infra_IdentifierModelImpl.ENTITY_CACHE_ENABLED,
            Infra_IdentifierImpl.class, infra_Identifier.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<Infra_Identifier> infra_Identifiers) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (Infra_Identifier infra_Identifier : infra_Identifiers) {
            EntityCacheUtil.removeResult(Infra_IdentifierModelImpl.ENTITY_CACHE_ENABLED,
                Infra_IdentifierImpl.class, infra_Identifier.getPrimaryKey());
        }
    }

    /**
     * Creates a new infra_ identifier with the primary key. Does not add the infra_ identifier to the database.
     *
     * @param infra_IdentifierPK the primary key for the new infra_ identifier
     * @return the new infra_ identifier
     */
    @Override
    public Infra_Identifier create(Infra_IdentifierPK infra_IdentifierPK) {
        Infra_Identifier infra_Identifier = new Infra_IdentifierImpl();

        infra_Identifier.setNew(true);
        infra_Identifier.setPrimaryKey(infra_IdentifierPK);

        return infra_Identifier;
    }

    /**
     * Removes the infra_ identifier with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param infra_IdentifierPK the primary key of the infra_ identifier
     * @return the infra_ identifier that was removed
     * @throws fi.csc.avaa.tupa.db.NoSuchInfra_IdentifierException if a infra_ identifier with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Infra_Identifier remove(Infra_IdentifierPK infra_IdentifierPK)
        throws NoSuchInfra_IdentifierException, SystemException {
        return remove((Serializable) infra_IdentifierPK);
    }

    /**
     * Removes the infra_ identifier with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the infra_ identifier
     * @return the infra_ identifier that was removed
     * @throws fi.csc.avaa.tupa.db.NoSuchInfra_IdentifierException if a infra_ identifier with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Infra_Identifier remove(Serializable primaryKey)
        throws NoSuchInfra_IdentifierException, SystemException {
        Session session = null;

        try {
            session = openSession();

            Infra_Identifier infra_Identifier = (Infra_Identifier) session.get(Infra_IdentifierImpl.class,
                    primaryKey);

            if (infra_Identifier == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchInfra_IdentifierException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(infra_Identifier);
        } catch (NoSuchInfra_IdentifierException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected Infra_Identifier removeImpl(Infra_Identifier infra_Identifier)
        throws SystemException {
        infra_Identifier = toUnwrappedModel(infra_Identifier);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(infra_Identifier)) {
                infra_Identifier = (Infra_Identifier) session.get(Infra_IdentifierImpl.class,
                        infra_Identifier.getPrimaryKeyObj());
            }

            if (infra_Identifier != null) {
                session.delete(infra_Identifier);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (infra_Identifier != null) {
            clearCache(infra_Identifier);
        }

        return infra_Identifier;
    }

    @Override
    public Infra_Identifier updateImpl(
        fi.csc.avaa.tupa.db.model.Infra_Identifier infra_Identifier)
        throws SystemException {
        infra_Identifier = toUnwrappedModel(infra_Identifier);

        boolean isNew = infra_Identifier.isNew();

        Infra_IdentifierModelImpl infra_IdentifierModelImpl = (Infra_IdentifierModelImpl) infra_Identifier;

        Session session = null;

        try {
            session = openSession();

            if (infra_Identifier.isNew()) {
                session.save(infra_Identifier);

                infra_Identifier.setNew(false);
            } else {
                session.merge(infra_Identifier);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !Infra_IdentifierModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((infra_IdentifierModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INFRAID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        infra_IdentifierModelImpl.getOriginalInfra_id()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_INFRAID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INFRAID,
                    args);

                args = new Object[] { infra_IdentifierModelImpl.getInfra_id() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_INFRAID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INFRAID,
                    args);
            }

            if ((infra_IdentifierModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IDENTIFIERTYPE.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        infra_IdentifierModelImpl.getOriginalIdentifier_type()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_IDENTIFIERTYPE,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IDENTIFIERTYPE,
                    args);

                args = new Object[] {
                        infra_IdentifierModelImpl.getIdentifier_type()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_IDENTIFIERTYPE,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IDENTIFIERTYPE,
                    args);
            }

            if ((infra_IdentifierModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IDENTIFIERVALUE.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        infra_IdentifierModelImpl.getOriginalIdentifier_value()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_IDENTIFIERVALUE,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IDENTIFIERVALUE,
                    args);

                args = new Object[] {
                        infra_IdentifierModelImpl.getIdentifier_value()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_IDENTIFIERVALUE,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IDENTIFIERVALUE,
                    args);
            }
        }

        EntityCacheUtil.putResult(Infra_IdentifierModelImpl.ENTITY_CACHE_ENABLED,
            Infra_IdentifierImpl.class, infra_Identifier.getPrimaryKey(),
            infra_Identifier);

        return infra_Identifier;
    }

    protected Infra_Identifier toUnwrappedModel(
        Infra_Identifier infra_Identifier) {
        if (infra_Identifier instanceof Infra_IdentifierImpl) {
            return infra_Identifier;
        }

        Infra_IdentifierImpl infra_IdentifierImpl = new Infra_IdentifierImpl();

        infra_IdentifierImpl.setNew(infra_Identifier.isNew());
        infra_IdentifierImpl.setPrimaryKey(infra_Identifier.getPrimaryKey());

        infra_IdentifierImpl.setIdentifier_type(infra_Identifier.getIdentifier_type());
        infra_IdentifierImpl.setInfra_id(infra_Identifier.getInfra_id());
        infra_IdentifierImpl.setIdentifier_value(infra_Identifier.getIdentifier_value());

        return infra_IdentifierImpl;
    }

    /**
     * Returns the infra_ identifier with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the infra_ identifier
     * @return the infra_ identifier
     * @throws fi.csc.avaa.tupa.db.NoSuchInfra_IdentifierException if a infra_ identifier with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Infra_Identifier findByPrimaryKey(Serializable primaryKey)
        throws NoSuchInfra_IdentifierException, SystemException {
        Infra_Identifier infra_Identifier = fetchByPrimaryKey(primaryKey);

        if (infra_Identifier == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchInfra_IdentifierException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return infra_Identifier;
    }

    /**
     * Returns the infra_ identifier with the primary key or throws a {@link fi.csc.avaa.tupa.db.NoSuchInfra_IdentifierException} if it could not be found.
     *
     * @param infra_IdentifierPK the primary key of the infra_ identifier
     * @return the infra_ identifier
     * @throws fi.csc.avaa.tupa.db.NoSuchInfra_IdentifierException if a infra_ identifier with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Infra_Identifier findByPrimaryKey(
        Infra_IdentifierPK infra_IdentifierPK)
        throws NoSuchInfra_IdentifierException, SystemException {
        return findByPrimaryKey((Serializable) infra_IdentifierPK);
    }

    /**
     * Returns the infra_ identifier with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the infra_ identifier
     * @return the infra_ identifier, or <code>null</code> if a infra_ identifier with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Infra_Identifier fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        Infra_Identifier infra_Identifier = (Infra_Identifier) EntityCacheUtil.getResult(Infra_IdentifierModelImpl.ENTITY_CACHE_ENABLED,
                Infra_IdentifierImpl.class, primaryKey);

        if (infra_Identifier == _nullInfra_Identifier) {
            return null;
        }

        if (infra_Identifier == null) {
            Session session = null;

            try {
                session = openSession();

                infra_Identifier = (Infra_Identifier) session.get(Infra_IdentifierImpl.class,
                        primaryKey);

                if (infra_Identifier != null) {
                    cacheResult(infra_Identifier);
                } else {
                    EntityCacheUtil.putResult(Infra_IdentifierModelImpl.ENTITY_CACHE_ENABLED,
                        Infra_IdentifierImpl.class, primaryKey,
                        _nullInfra_Identifier);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(Infra_IdentifierModelImpl.ENTITY_CACHE_ENABLED,
                    Infra_IdentifierImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return infra_Identifier;
    }

    /**
     * Returns the infra_ identifier with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param infra_IdentifierPK the primary key of the infra_ identifier
     * @return the infra_ identifier, or <code>null</code> if a infra_ identifier with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Infra_Identifier fetchByPrimaryKey(
        Infra_IdentifierPK infra_IdentifierPK) throws SystemException {
        return fetchByPrimaryKey((Serializable) infra_IdentifierPK);
    }

    /**
     * Returns all the infra_ identifiers.
     *
     * @return the infra_ identifiers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Infra_Identifier> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the infra_ identifiers.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.Infra_IdentifierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of infra_ identifiers
     * @param end the upper bound of the range of infra_ identifiers (not inclusive)
     * @return the range of infra_ identifiers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Infra_Identifier> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the infra_ identifiers.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.Infra_IdentifierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of infra_ identifiers
     * @param end the upper bound of the range of infra_ identifiers (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of infra_ identifiers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Infra_Identifier> findAll(int start, int end,
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

        List<Infra_Identifier> list = (List<Infra_Identifier>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_INFRA_IDENTIFIER);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_INFRA_IDENTIFIER;

                if (pagination) {
                    sql = sql.concat(Infra_IdentifierModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<Infra_Identifier>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Infra_Identifier>(list);
                } else {
                    list = (List<Infra_Identifier>) QueryUtil.list(q,
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
     * Removes all the infra_ identifiers from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (Infra_Identifier infra_Identifier : findAll()) {
            remove(infra_Identifier);
        }
    }

    /**
     * Returns the number of infra_ identifiers.
     *
     * @return the number of infra_ identifiers
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

                Query q = session.createQuery(_SQL_COUNT_INFRA_IDENTIFIER);

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
     * Initializes the infra_ identifier persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.fi.csc.avaa.tupa.db.model.Infra_Identifier")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<Infra_Identifier>> listenersList = new ArrayList<ModelListener<Infra_Identifier>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<Infra_Identifier>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(Infra_IdentifierImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
