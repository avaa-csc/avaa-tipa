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
import com.liferay.portal.kernel.util.CalendarUtil;
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

import fi.csc.avaa.tupa.db.NoSuchInfraException;
import fi.csc.avaa.tupa.db.model.Infra;
import fi.csc.avaa.tupa.db.model.impl.InfraImpl;
import fi.csc.avaa.tupa.db.model.impl.InfraModelImpl;
import fi.csc.avaa.tupa.db.service.persistence.InfraPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 * The persistence implementation for the infra service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CSC
 * @see InfraPersistence
 * @see InfraUtil
 * @generated
 */
public class InfraPersistenceImpl extends BasePersistenceImpl<Infra>
    implements InfraPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link InfraUtil} to access the infra persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = InfraImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(InfraModelImpl.ENTITY_CACHE_ENABLED,
            InfraModelImpl.FINDER_CACHE_ENABLED, InfraImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(InfraModelImpl.ENTITY_CACHE_ENABLED,
            InfraModelImpl.FINDER_CACHE_ENABLED, InfraImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(InfraModelImpl.ENTITY_CACHE_ENABLED,
            InfraModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PREVIOUSID =
        new FinderPath(InfraModelImpl.ENTITY_CACHE_ENABLED,
            InfraModelImpl.FINDER_CACHE_ENABLED, InfraImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBypreviousId",
            new String[] {
                Integer.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PREVIOUSID =
        new FinderPath(InfraModelImpl.ENTITY_CACHE_ENABLED,
            InfraModelImpl.FINDER_CACHE_ENABLED, InfraImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBypreviousId",
            new String[] { Integer.class.getName() },
            InfraModelImpl.EDELLINEN_INFRA_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_PREVIOUSID = new FinderPath(InfraModelImpl.ENTITY_CACHE_ENABLED,
            InfraModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBypreviousId",
            new String[] { Integer.class.getName() });
    private static final String _FINDER_COLUMN_PREVIOUSID_EDELLINEN_INFRA_2 = "infra.edellinen_infra = ?";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_APIDATE = new FinderPath(InfraModelImpl.ENTITY_CACHE_ENABLED,
            InfraModelImpl.FINDER_CACHE_ENABLED, InfraImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByapiDate",
            new String[] {
                Date.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APIDATE =
        new FinderPath(InfraModelImpl.ENTITY_CACHE_ENABLED,
            InfraModelImpl.FINDER_CACHE_ENABLED, InfraImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByapiDate",
            new String[] { Date.class.getName() },
            InfraModelImpl.API_DATE_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_APIDATE = new FinderPath(InfraModelImpl.ENTITY_CACHE_ENABLED,
            InfraModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByapiDate",
            new String[] { Date.class.getName() });
    private static final String _FINDER_COLUMN_APIDATE_API_DATE_1 = "infra.api_date IS NULL";
    private static final String _FINDER_COLUMN_APIDATE_API_DATE_2 = "infra.api_date = ?";
    private static final String _SQL_SELECT_INFRA = "SELECT infra FROM Infra infra";
    private static final String _SQL_SELECT_INFRA_WHERE = "SELECT infra FROM Infra infra WHERE ";
    private static final String _SQL_COUNT_INFRA = "SELECT COUNT(infra) FROM Infra infra";
    private static final String _SQL_COUNT_INFRA_WHERE = "SELECT COUNT(infra) FROM Infra infra WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "infra.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Infra exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Infra exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(InfraPersistenceImpl.class);
    private static Infra _nullInfra = new InfraImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<Infra> toCacheModel() {
                return _nullInfraCacheModel;
            }
        };

    private static CacheModel<Infra> _nullInfraCacheModel = new CacheModel<Infra>() {
            @Override
            public Infra toEntityModel() {
                return _nullInfra;
            }
        };

    public InfraPersistenceImpl() {
        setModelClass(Infra.class);
    }

    /**
     * Returns all the infras where edellinen_infra = &#63;.
     *
     * @param edellinen_infra the edellinen_infra
     * @return the matching infras
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Infra> findBypreviousId(int edellinen_infra)
        throws SystemException {
        return findBypreviousId(edellinen_infra, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the infras where edellinen_infra = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.InfraModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param edellinen_infra the edellinen_infra
     * @param start the lower bound of the range of infras
     * @param end the upper bound of the range of infras (not inclusive)
     * @return the range of matching infras
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Infra> findBypreviousId(int edellinen_infra, int start, int end)
        throws SystemException {
        return findBypreviousId(edellinen_infra, start, end, null);
    }

    /**
     * Returns an ordered range of all the infras where edellinen_infra = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.InfraModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param edellinen_infra the edellinen_infra
     * @param start the lower bound of the range of infras
     * @param end the upper bound of the range of infras (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching infras
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Infra> findBypreviousId(int edellinen_infra, int start,
        int end, OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PREVIOUSID;
            finderArgs = new Object[] { edellinen_infra };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_PREVIOUSID;
            finderArgs = new Object[] {
                    edellinen_infra,
                    
                    start, end, orderByComparator
                };
        }

        List<Infra> list = (List<Infra>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Infra infra : list) {
                if ((edellinen_infra != infra.getEdellinen_infra())) {
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

            query.append(_SQL_SELECT_INFRA_WHERE);

            query.append(_FINDER_COLUMN_PREVIOUSID_EDELLINEN_INFRA_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(InfraModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(edellinen_infra);

                if (!pagination) {
                    list = (List<Infra>) QueryUtil.list(q, getDialect(), start,
                            end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Infra>(list);
                } else {
                    list = (List<Infra>) QueryUtil.list(q, getDialect(), start,
                            end);
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
     * Returns the first infra in the ordered set where edellinen_infra = &#63;.
     *
     * @param edellinen_infra the edellinen_infra
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching infra
     * @throws fi.csc.avaa.tupa.db.NoSuchInfraException if a matching infra could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Infra findBypreviousId_First(int edellinen_infra,
        OrderByComparator orderByComparator)
        throws NoSuchInfraException, SystemException {
        Infra infra = fetchBypreviousId_First(edellinen_infra, orderByComparator);

        if (infra != null) {
            return infra;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("edellinen_infra=");
        msg.append(edellinen_infra);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchInfraException(msg.toString());
    }

    /**
     * Returns the first infra in the ordered set where edellinen_infra = &#63;.
     *
     * @param edellinen_infra the edellinen_infra
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching infra, or <code>null</code> if a matching infra could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Infra fetchBypreviousId_First(int edellinen_infra,
        OrderByComparator orderByComparator) throws SystemException {
        List<Infra> list = findBypreviousId(edellinen_infra, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last infra in the ordered set where edellinen_infra = &#63;.
     *
     * @param edellinen_infra the edellinen_infra
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching infra
     * @throws fi.csc.avaa.tupa.db.NoSuchInfraException if a matching infra could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Infra findBypreviousId_Last(int edellinen_infra,
        OrderByComparator orderByComparator)
        throws NoSuchInfraException, SystemException {
        Infra infra = fetchBypreviousId_Last(edellinen_infra, orderByComparator);

        if (infra != null) {
            return infra;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("edellinen_infra=");
        msg.append(edellinen_infra);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchInfraException(msg.toString());
    }

    /**
     * Returns the last infra in the ordered set where edellinen_infra = &#63;.
     *
     * @param edellinen_infra the edellinen_infra
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching infra, or <code>null</code> if a matching infra could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Infra fetchBypreviousId_Last(int edellinen_infra,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countBypreviousId(edellinen_infra);

        if (count == 0) {
            return null;
        }

        List<Infra> list = findBypreviousId(edellinen_infra, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the infras before and after the current infra in the ordered set where edellinen_infra = &#63;.
     *
     * @param infra_id the primary key of the current infra
     * @param edellinen_infra the edellinen_infra
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next infra
     * @throws fi.csc.avaa.tupa.db.NoSuchInfraException if a infra with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Infra[] findBypreviousId_PrevAndNext(int infra_id,
        int edellinen_infra, OrderByComparator orderByComparator)
        throws NoSuchInfraException, SystemException {
        Infra infra = findByPrimaryKey(infra_id);

        Session session = null;

        try {
            session = openSession();

            Infra[] array = new InfraImpl[3];

            array[0] = getBypreviousId_PrevAndNext(session, infra,
                    edellinen_infra, orderByComparator, true);

            array[1] = infra;

            array[2] = getBypreviousId_PrevAndNext(session, infra,
                    edellinen_infra, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Infra getBypreviousId_PrevAndNext(Session session, Infra infra,
        int edellinen_infra, OrderByComparator orderByComparator,
        boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_INFRA_WHERE);

        query.append(_FINDER_COLUMN_PREVIOUSID_EDELLINEN_INFRA_2);

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
            query.append(InfraModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(edellinen_infra);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(infra);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Infra> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the infras where edellinen_infra = &#63; from the database.
     *
     * @param edellinen_infra the edellinen_infra
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeBypreviousId(int edellinen_infra)
        throws SystemException {
        for (Infra infra : findBypreviousId(edellinen_infra, QueryUtil.ALL_POS,
                QueryUtil.ALL_POS, null)) {
            remove(infra);
        }
    }

    /**
     * Returns the number of infras where edellinen_infra = &#63;.
     *
     * @param edellinen_infra the edellinen_infra
     * @return the number of matching infras
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countBypreviousId(int edellinen_infra) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_PREVIOUSID;

        Object[] finderArgs = new Object[] { edellinen_infra };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_INFRA_WHERE);

            query.append(_FINDER_COLUMN_PREVIOUSID_EDELLINEN_INFRA_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(edellinen_infra);

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
     * Returns all the infras where api_date = &#63;.
     *
     * @param api_date the api_date
     * @return the matching infras
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Infra> findByapiDate(Date api_date) throws SystemException {
        return findByapiDate(api_date, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
            null);
    }

    /**
     * Returns a range of all the infras where api_date = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.InfraModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param api_date the api_date
     * @param start the lower bound of the range of infras
     * @param end the upper bound of the range of infras (not inclusive)
     * @return the range of matching infras
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Infra> findByapiDate(Date api_date, int start, int end)
        throws SystemException {
        return findByapiDate(api_date, start, end, null);
    }

    /**
     * Returns an ordered range of all the infras where api_date = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.InfraModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param api_date the api_date
     * @param start the lower bound of the range of infras
     * @param end the upper bound of the range of infras (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching infras
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Infra> findByapiDate(Date api_date, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APIDATE;
            finderArgs = new Object[] { api_date };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_APIDATE;
            finderArgs = new Object[] { api_date, start, end, orderByComparator };
        }

        List<Infra> list = (List<Infra>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Infra infra : list) {
                if (!Validator.equals(api_date, infra.getApi_date())) {
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

            query.append(_SQL_SELECT_INFRA_WHERE);

            boolean bindApi_date = false;

            if (api_date == null) {
                query.append(_FINDER_COLUMN_APIDATE_API_DATE_1);
            } else {
                bindApi_date = true;

                query.append(_FINDER_COLUMN_APIDATE_API_DATE_2);
            }

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(InfraModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindApi_date) {
                    qPos.add(CalendarUtil.getTimestamp(api_date));
                }

                if (!pagination) {
                    list = (List<Infra>) QueryUtil.list(q, getDialect(), start,
                            end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Infra>(list);
                } else {
                    list = (List<Infra>) QueryUtil.list(q, getDialect(), start,
                            end);
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
     * Returns the first infra in the ordered set where api_date = &#63;.
     *
     * @param api_date the api_date
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching infra
     * @throws fi.csc.avaa.tupa.db.NoSuchInfraException if a matching infra could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Infra findByapiDate_First(Date api_date,
        OrderByComparator orderByComparator)
        throws NoSuchInfraException, SystemException {
        Infra infra = fetchByapiDate_First(api_date, orderByComparator);

        if (infra != null) {
            return infra;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("api_date=");
        msg.append(api_date);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchInfraException(msg.toString());
    }

    /**
     * Returns the first infra in the ordered set where api_date = &#63;.
     *
     * @param api_date the api_date
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching infra, or <code>null</code> if a matching infra could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Infra fetchByapiDate_First(Date api_date,
        OrderByComparator orderByComparator) throws SystemException {
        List<Infra> list = findByapiDate(api_date, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last infra in the ordered set where api_date = &#63;.
     *
     * @param api_date the api_date
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching infra
     * @throws fi.csc.avaa.tupa.db.NoSuchInfraException if a matching infra could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Infra findByapiDate_Last(Date api_date,
        OrderByComparator orderByComparator)
        throws NoSuchInfraException, SystemException {
        Infra infra = fetchByapiDate_Last(api_date, orderByComparator);

        if (infra != null) {
            return infra;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("api_date=");
        msg.append(api_date);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchInfraException(msg.toString());
    }

    /**
     * Returns the last infra in the ordered set where api_date = &#63;.
     *
     * @param api_date the api_date
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching infra, or <code>null</code> if a matching infra could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Infra fetchByapiDate_Last(Date api_date,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByapiDate(api_date);

        if (count == 0) {
            return null;
        }

        List<Infra> list = findByapiDate(api_date, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the infras before and after the current infra in the ordered set where api_date = &#63;.
     *
     * @param infra_id the primary key of the current infra
     * @param api_date the api_date
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next infra
     * @throws fi.csc.avaa.tupa.db.NoSuchInfraException if a infra with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Infra[] findByapiDate_PrevAndNext(int infra_id, Date api_date,
        OrderByComparator orderByComparator)
        throws NoSuchInfraException, SystemException {
        Infra infra = findByPrimaryKey(infra_id);

        Session session = null;

        try {
            session = openSession();

            Infra[] array = new InfraImpl[3];

            array[0] = getByapiDate_PrevAndNext(session, infra, api_date,
                    orderByComparator, true);

            array[1] = infra;

            array[2] = getByapiDate_PrevAndNext(session, infra, api_date,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Infra getByapiDate_PrevAndNext(Session session, Infra infra,
        Date api_date, OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_INFRA_WHERE);

        boolean bindApi_date = false;

        if (api_date == null) {
            query.append(_FINDER_COLUMN_APIDATE_API_DATE_1);
        } else {
            bindApi_date = true;

            query.append(_FINDER_COLUMN_APIDATE_API_DATE_2);
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
            query.append(InfraModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        if (bindApi_date) {
            qPos.add(CalendarUtil.getTimestamp(api_date));
        }

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(infra);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Infra> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the infras where api_date = &#63; from the database.
     *
     * @param api_date the api_date
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByapiDate(Date api_date) throws SystemException {
        for (Infra infra : findByapiDate(api_date, QueryUtil.ALL_POS,
                QueryUtil.ALL_POS, null)) {
            remove(infra);
        }
    }

    /**
     * Returns the number of infras where api_date = &#63;.
     *
     * @param api_date the api_date
     * @return the number of matching infras
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByapiDate(Date api_date) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_APIDATE;

        Object[] finderArgs = new Object[] { api_date };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_INFRA_WHERE);

            boolean bindApi_date = false;

            if (api_date == null) {
                query.append(_FINDER_COLUMN_APIDATE_API_DATE_1);
            } else {
                bindApi_date = true;

                query.append(_FINDER_COLUMN_APIDATE_API_DATE_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindApi_date) {
                    qPos.add(CalendarUtil.getTimestamp(api_date));
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
     * Caches the infra in the entity cache if it is enabled.
     *
     * @param infra the infra
     */
    @Override
    public void cacheResult(Infra infra) {
        EntityCacheUtil.putResult(InfraModelImpl.ENTITY_CACHE_ENABLED,
            InfraImpl.class, infra.getPrimaryKey(), infra);

        infra.resetOriginalValues();
    }

    /**
     * Caches the infras in the entity cache if it is enabled.
     *
     * @param infras the infras
     */
    @Override
    public void cacheResult(List<Infra> infras) {
        for (Infra infra : infras) {
            if (EntityCacheUtil.getResult(InfraModelImpl.ENTITY_CACHE_ENABLED,
                        InfraImpl.class, infra.getPrimaryKey()) == null) {
                cacheResult(infra);
            } else {
                infra.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all infras.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(InfraImpl.class.getName());
        }

        EntityCacheUtil.clearCache(InfraImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the infra.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(Infra infra) {
        EntityCacheUtil.removeResult(InfraModelImpl.ENTITY_CACHE_ENABLED,
            InfraImpl.class, infra.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<Infra> infras) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (Infra infra : infras) {
            EntityCacheUtil.removeResult(InfraModelImpl.ENTITY_CACHE_ENABLED,
                InfraImpl.class, infra.getPrimaryKey());
        }
    }

    /**
     * Creates a new infra with the primary key. Does not add the infra to the database.
     *
     * @param infra_id the primary key for the new infra
     * @return the new infra
     */
    @Override
    public Infra create(int infra_id) {
        Infra infra = new InfraImpl();

        infra.setNew(true);
        infra.setPrimaryKey(infra_id);

        return infra;
    }

    /**
     * Removes the infra with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param infra_id the primary key of the infra
     * @return the infra that was removed
     * @throws fi.csc.avaa.tupa.db.NoSuchInfraException if a infra with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Infra remove(int infra_id)
        throws NoSuchInfraException, SystemException {
        return remove((Serializable) infra_id);
    }

    /**
     * Removes the infra with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the infra
     * @return the infra that was removed
     * @throws fi.csc.avaa.tupa.db.NoSuchInfraException if a infra with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Infra remove(Serializable primaryKey)
        throws NoSuchInfraException, SystemException {
        Session session = null;

        try {
            session = openSession();

            Infra infra = (Infra) session.get(InfraImpl.class, primaryKey);

            if (infra == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchInfraException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(infra);
        } catch (NoSuchInfraException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected Infra removeImpl(Infra infra) throws SystemException {
        infra = toUnwrappedModel(infra);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(infra)) {
                infra = (Infra) session.get(InfraImpl.class,
                        infra.getPrimaryKeyObj());
            }

            if (infra != null) {
                session.delete(infra);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (infra != null) {
            clearCache(infra);
        }

        return infra;
    }

    @Override
    public Infra updateImpl(fi.csc.avaa.tupa.db.model.Infra infra)
        throws SystemException {
        infra = toUnwrappedModel(infra);

        boolean isNew = infra.isNew();

        InfraModelImpl infraModelImpl = (InfraModelImpl) infra;

        Session session = null;

        try {
            session = openSession();

            if (infra.isNew()) {
                session.save(infra);

                infra.setNew(false);
            } else {
                session.merge(infra);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !InfraModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((infraModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PREVIOUSID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        infraModelImpl.getOriginalEdellinen_infra()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PREVIOUSID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PREVIOUSID,
                    args);

                args = new Object[] { infraModelImpl.getEdellinen_infra() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PREVIOUSID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PREVIOUSID,
                    args);
            }

            if ((infraModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APIDATE.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        infraModelImpl.getOriginalApi_date()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_APIDATE, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APIDATE,
                    args);

                args = new Object[] { infraModelImpl.getApi_date() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_APIDATE, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APIDATE,
                    args);
            }
        }

        EntityCacheUtil.putResult(InfraModelImpl.ENTITY_CACHE_ENABLED,
            InfraImpl.class, infra.getPrimaryKey(), infra);

        return infra;
    }

    protected Infra toUnwrappedModel(Infra infra) {
        if (infra instanceof InfraImpl) {
            return infra;
        }

        InfraImpl infraImpl = new InfraImpl();

        infraImpl.setNew(infra.isNew());
        infraImpl.setPrimaryKey(infra.getPrimaryKey());

        infraImpl.setInfra_id(infra.getInfra_id());
        infraImpl.setISNI(infra.getISNI());
        infraImpl.setAktiivinen(infra.isAktiivinen());
        infraImpl.setValmistelu_aloitusvuosi(infra.getValmistelu_aloitusvuosi());
        infraImpl.setRakennus_aloitusvuosi(infra.getRakennus_aloitusvuosi());
        infraImpl.setToiminta_aloitusvuosi(infra.getToiminta_aloitusvuosi());
        infraImpl.setToiminta_lopetusvuosi(infra.getToiminta_lopetusvuosi());
        infraImpl.setNimi(infra.getNimi());
        infraImpl.setName(infra.getName());
        infraImpl.setLyhenne(infra.getLyhenne());
        infraImpl.setAcronym(infra.getAcronym());
        infraImpl.setEdellinen_infra(infra.getEdellinen_infra());
        infraImpl.setKuvaus(infra.getKuvaus());
        infraImpl.setDescription(infra.getDescription());
        infraImpl.setLogo_url(infra.getLogo_url());
        infraImpl.setImage_url(infra.getImage_url());
        infraImpl.setApi_date(infra.getApi_date());

        return infraImpl;
    }

    /**
     * Returns the infra with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the infra
     * @return the infra
     * @throws fi.csc.avaa.tupa.db.NoSuchInfraException if a infra with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Infra findByPrimaryKey(Serializable primaryKey)
        throws NoSuchInfraException, SystemException {
        Infra infra = fetchByPrimaryKey(primaryKey);

        if (infra == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchInfraException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return infra;
    }

    /**
     * Returns the infra with the primary key or throws a {@link fi.csc.avaa.tupa.db.NoSuchInfraException} if it could not be found.
     *
     * @param infra_id the primary key of the infra
     * @return the infra
     * @throws fi.csc.avaa.tupa.db.NoSuchInfraException if a infra with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Infra findByPrimaryKey(int infra_id)
        throws NoSuchInfraException, SystemException {
        return findByPrimaryKey((Serializable) infra_id);
    }

    /**
     * Returns the infra with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the infra
     * @return the infra, or <code>null</code> if a infra with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Infra fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        Infra infra = (Infra) EntityCacheUtil.getResult(InfraModelImpl.ENTITY_CACHE_ENABLED,
                InfraImpl.class, primaryKey);

        if (infra == _nullInfra) {
            return null;
        }

        if (infra == null) {
            Session session = null;

            try {
                session = openSession();

                infra = (Infra) session.get(InfraImpl.class, primaryKey);

                if (infra != null) {
                    cacheResult(infra);
                } else {
                    EntityCacheUtil.putResult(InfraModelImpl.ENTITY_CACHE_ENABLED,
                        InfraImpl.class, primaryKey, _nullInfra);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(InfraModelImpl.ENTITY_CACHE_ENABLED,
                    InfraImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return infra;
    }

    /**
     * Returns the infra with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param infra_id the primary key of the infra
     * @return the infra, or <code>null</code> if a infra with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Infra fetchByPrimaryKey(int infra_id) throws SystemException {
        return fetchByPrimaryKey((Serializable) infra_id);
    }

    /**
     * Returns all the infras.
     *
     * @return the infras
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Infra> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the infras.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.InfraModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of infras
     * @param end the upper bound of the range of infras (not inclusive)
     * @return the range of infras
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Infra> findAll(int start, int end) throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the infras.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.InfraModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of infras
     * @param end the upper bound of the range of infras (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of infras
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Infra> findAll(int start, int end,
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

        List<Infra> list = (List<Infra>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_INFRA);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_INFRA;

                if (pagination) {
                    sql = sql.concat(InfraModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<Infra>) QueryUtil.list(q, getDialect(), start,
                            end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Infra>(list);
                } else {
                    list = (List<Infra>) QueryUtil.list(q, getDialect(), start,
                            end);
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
     * Removes all the infras from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (Infra infra : findAll()) {
            remove(infra);
        }
    }

    /**
     * Returns the number of infras.
     *
     * @return the number of infras
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

                Query q = session.createQuery(_SQL_COUNT_INFRA);

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
     * Initializes the infra persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.fi.csc.avaa.tupa.db.model.Infra")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<Infra>> listenersList = new ArrayList<ModelListener<Infra>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<Infra>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(InfraImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
