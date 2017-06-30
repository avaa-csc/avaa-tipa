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

import fi.csc.avaa.tupa.db.NoSuchOrganisaatioException;
import fi.csc.avaa.tupa.db.model.Organisaatio;
import fi.csc.avaa.tupa.db.model.impl.OrganisaatioImpl;
import fi.csc.avaa.tupa.db.model.impl.OrganisaatioModelImpl;
import fi.csc.avaa.tupa.db.service.persistence.OrganisaatioPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the organisaatio service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CSC
 * @see OrganisaatioPersistence
 * @see OrganisaatioUtil
 * @generated
 */
public class OrganisaatioPersistenceImpl extends BasePersistenceImpl<Organisaatio>
    implements OrganisaatioPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link OrganisaatioUtil} to access the organisaatio persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = OrganisaatioImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(OrganisaatioModelImpl.ENTITY_CACHE_ENABLED,
            OrganisaatioModelImpl.FINDER_CACHE_ENABLED, OrganisaatioImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(OrganisaatioModelImpl.ENTITY_CACHE_ENABLED,
            OrganisaatioModelImpl.FINDER_CACHE_ENABLED, OrganisaatioImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(OrganisaatioModelImpl.ENTITY_CACHE_ENABLED,
            OrganisaatioModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ISNI = new FinderPath(OrganisaatioModelImpl.ENTITY_CACHE_ENABLED,
            OrganisaatioModelImpl.FINDER_CACHE_ENABLED, OrganisaatioImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByisni",
            new String[] {
                String.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ISNI = new FinderPath(OrganisaatioModelImpl.ENTITY_CACHE_ENABLED,
            OrganisaatioModelImpl.FINDER_CACHE_ENABLED, OrganisaatioImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByisni",
            new String[] { String.class.getName() },
            OrganisaatioModelImpl.ISNI_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_ISNI = new FinderPath(OrganisaatioModelImpl.ENTITY_CACHE_ENABLED,
            OrganisaatioModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByisni",
            new String[] { String.class.getName() });
    private static final String _FINDER_COLUMN_ISNI_ISNI_1 = "organisaatio.ISNI IS NULL";
    private static final String _FINDER_COLUMN_ISNI_ISNI_2 = "organisaatio.ISNI = ?";
    private static final String _FINDER_COLUMN_ISNI_ISNI_3 = "(organisaatio.ISNI IS NULL OR organisaatio.ISNI = '')";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_COUNTRY = new FinderPath(OrganisaatioModelImpl.ENTITY_CACHE_ENABLED,
            OrganisaatioModelImpl.FINDER_CACHE_ENABLED, OrganisaatioImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBycountry",
            new String[] {
                String.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COUNTRY =
        new FinderPath(OrganisaatioModelImpl.ENTITY_CACHE_ENABLED,
            OrganisaatioModelImpl.FINDER_CACHE_ENABLED, OrganisaatioImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBycountry",
            new String[] { String.class.getName() },
            OrganisaatioModelImpl.MAA_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_COUNTRY = new FinderPath(OrganisaatioModelImpl.ENTITY_CACHE_ENABLED,
            OrganisaatioModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBycountry",
            new String[] { String.class.getName() });
    private static final String _FINDER_COLUMN_COUNTRY_MAA_1 = "organisaatio.maa IS NULL";
    private static final String _FINDER_COLUMN_COUNTRY_MAA_2 = "organisaatio.maa = ?";
    private static final String _FINDER_COLUMN_COUNTRY_MAA_3 = "(organisaatio.maa IS NULL OR organisaatio.maa = '')";
    private static final String _SQL_SELECT_ORGANISAATIO = "SELECT organisaatio FROM Organisaatio organisaatio";
    private static final String _SQL_SELECT_ORGANISAATIO_WHERE = "SELECT organisaatio FROM Organisaatio organisaatio WHERE ";
    private static final String _SQL_COUNT_ORGANISAATIO = "SELECT COUNT(organisaatio) FROM Organisaatio organisaatio";
    private static final String _SQL_COUNT_ORGANISAATIO_WHERE = "SELECT COUNT(organisaatio) FROM Organisaatio organisaatio WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "organisaatio.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Organisaatio exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Organisaatio exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(OrganisaatioPersistenceImpl.class);
    private static Organisaatio _nullOrganisaatio = new OrganisaatioImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<Organisaatio> toCacheModel() {
                return _nullOrganisaatioCacheModel;
            }
        };

    private static CacheModel<Organisaatio> _nullOrganisaatioCacheModel = new CacheModel<Organisaatio>() {
            @Override
            public Organisaatio toEntityModel() {
                return _nullOrganisaatio;
            }
        };

    public OrganisaatioPersistenceImpl() {
        setModelClass(Organisaatio.class);
    }

    /**
     * Returns all the organisaatios where ISNI = &#63;.
     *
     * @param ISNI the i s n i
     * @return the matching organisaatios
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Organisaatio> findByisni(String ISNI) throws SystemException {
        return findByisni(ISNI, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the organisaatios where ISNI = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.OrganisaatioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param ISNI the i s n i
     * @param start the lower bound of the range of organisaatios
     * @param end the upper bound of the range of organisaatios (not inclusive)
     * @return the range of matching organisaatios
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Organisaatio> findByisni(String ISNI, int start, int end)
        throws SystemException {
        return findByisni(ISNI, start, end, null);
    }

    /**
     * Returns an ordered range of all the organisaatios where ISNI = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.OrganisaatioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param ISNI the i s n i
     * @param start the lower bound of the range of organisaatios
     * @param end the upper bound of the range of organisaatios (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching organisaatios
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Organisaatio> findByisni(String ISNI, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ISNI;
            finderArgs = new Object[] { ISNI };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_ISNI;
            finderArgs = new Object[] { ISNI, start, end, orderByComparator };
        }

        List<Organisaatio> list = (List<Organisaatio>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Organisaatio organisaatio : list) {
                if (!Validator.equals(ISNI, organisaatio.getISNI())) {
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

            query.append(_SQL_SELECT_ORGANISAATIO_WHERE);

            boolean bindISNI = false;

            if (ISNI == null) {
                query.append(_FINDER_COLUMN_ISNI_ISNI_1);
            } else if (ISNI.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_ISNI_ISNI_3);
            } else {
                bindISNI = true;

                query.append(_FINDER_COLUMN_ISNI_ISNI_2);
            }

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(OrganisaatioModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindISNI) {
                    qPos.add(ISNI);
                }

                if (!pagination) {
                    list = (List<Organisaatio>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Organisaatio>(list);
                } else {
                    list = (List<Organisaatio>) QueryUtil.list(q, getDialect(),
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
     * Returns the first organisaatio in the ordered set where ISNI = &#63;.
     *
     * @param ISNI the i s n i
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching organisaatio
     * @throws fi.csc.avaa.tupa.db.NoSuchOrganisaatioException if a matching organisaatio could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Organisaatio findByisni_First(String ISNI,
        OrderByComparator orderByComparator)
        throws NoSuchOrganisaatioException, SystemException {
        Organisaatio organisaatio = fetchByisni_First(ISNI, orderByComparator);

        if (organisaatio != null) {
            return organisaatio;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("ISNI=");
        msg.append(ISNI);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchOrganisaatioException(msg.toString());
    }

    /**
     * Returns the first organisaatio in the ordered set where ISNI = &#63;.
     *
     * @param ISNI the i s n i
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching organisaatio, or <code>null</code> if a matching organisaatio could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Organisaatio fetchByisni_First(String ISNI,
        OrderByComparator orderByComparator) throws SystemException {
        List<Organisaatio> list = findByisni(ISNI, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last organisaatio in the ordered set where ISNI = &#63;.
     *
     * @param ISNI the i s n i
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching organisaatio
     * @throws fi.csc.avaa.tupa.db.NoSuchOrganisaatioException if a matching organisaatio could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Organisaatio findByisni_Last(String ISNI,
        OrderByComparator orderByComparator)
        throws NoSuchOrganisaatioException, SystemException {
        Organisaatio organisaatio = fetchByisni_Last(ISNI, orderByComparator);

        if (organisaatio != null) {
            return organisaatio;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("ISNI=");
        msg.append(ISNI);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchOrganisaatioException(msg.toString());
    }

    /**
     * Returns the last organisaatio in the ordered set where ISNI = &#63;.
     *
     * @param ISNI the i s n i
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching organisaatio, or <code>null</code> if a matching organisaatio could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Organisaatio fetchByisni_Last(String ISNI,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByisni(ISNI);

        if (count == 0) {
            return null;
        }

        List<Organisaatio> list = findByisni(ISNI, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the organisaatios before and after the current organisaatio in the ordered set where ISNI = &#63;.
     *
     * @param organisaatio_id the primary key of the current organisaatio
     * @param ISNI the i s n i
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next organisaatio
     * @throws fi.csc.avaa.tupa.db.NoSuchOrganisaatioException if a organisaatio with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Organisaatio[] findByisni_PrevAndNext(int organisaatio_id,
        String ISNI, OrderByComparator orderByComparator)
        throws NoSuchOrganisaatioException, SystemException {
        Organisaatio organisaatio = findByPrimaryKey(organisaatio_id);

        Session session = null;

        try {
            session = openSession();

            Organisaatio[] array = new OrganisaatioImpl[3];

            array[0] = getByisni_PrevAndNext(session, organisaatio, ISNI,
                    orderByComparator, true);

            array[1] = organisaatio;

            array[2] = getByisni_PrevAndNext(session, organisaatio, ISNI,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Organisaatio getByisni_PrevAndNext(Session session,
        Organisaatio organisaatio, String ISNI,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_ORGANISAATIO_WHERE);

        boolean bindISNI = false;

        if (ISNI == null) {
            query.append(_FINDER_COLUMN_ISNI_ISNI_1);
        } else if (ISNI.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_ISNI_ISNI_3);
        } else {
            bindISNI = true;

            query.append(_FINDER_COLUMN_ISNI_ISNI_2);
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
            query.append(OrganisaatioModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        if (bindISNI) {
            qPos.add(ISNI);
        }

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(organisaatio);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Organisaatio> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the organisaatios where ISNI = &#63; from the database.
     *
     * @param ISNI the i s n i
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByisni(String ISNI) throws SystemException {
        for (Organisaatio organisaatio : findByisni(ISNI, QueryUtil.ALL_POS,
                QueryUtil.ALL_POS, null)) {
            remove(organisaatio);
        }
    }

    /**
     * Returns the number of organisaatios where ISNI = &#63;.
     *
     * @param ISNI the i s n i
     * @return the number of matching organisaatios
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByisni(String ISNI) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_ISNI;

        Object[] finderArgs = new Object[] { ISNI };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_ORGANISAATIO_WHERE);

            boolean bindISNI = false;

            if (ISNI == null) {
                query.append(_FINDER_COLUMN_ISNI_ISNI_1);
            } else if (ISNI.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_ISNI_ISNI_3);
            } else {
                bindISNI = true;

                query.append(_FINDER_COLUMN_ISNI_ISNI_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindISNI) {
                    qPos.add(ISNI);
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
     * Returns all the organisaatios where maa = &#63;.
     *
     * @param maa the maa
     * @return the matching organisaatios
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Organisaatio> findBycountry(String maa)
        throws SystemException {
        return findBycountry(maa, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the organisaatios where maa = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.OrganisaatioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param maa the maa
     * @param start the lower bound of the range of organisaatios
     * @param end the upper bound of the range of organisaatios (not inclusive)
     * @return the range of matching organisaatios
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Organisaatio> findBycountry(String maa, int start, int end)
        throws SystemException {
        return findBycountry(maa, start, end, null);
    }

    /**
     * Returns an ordered range of all the organisaatios where maa = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.OrganisaatioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param maa the maa
     * @param start the lower bound of the range of organisaatios
     * @param end the upper bound of the range of organisaatios (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching organisaatios
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Organisaatio> findBycountry(String maa, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COUNTRY;
            finderArgs = new Object[] { maa };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_COUNTRY;
            finderArgs = new Object[] { maa, start, end, orderByComparator };
        }

        List<Organisaatio> list = (List<Organisaatio>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Organisaatio organisaatio : list) {
                if (!Validator.equals(maa, organisaatio.getMaa())) {
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

            query.append(_SQL_SELECT_ORGANISAATIO_WHERE);

            boolean bindMaa = false;

            if (maa == null) {
                query.append(_FINDER_COLUMN_COUNTRY_MAA_1);
            } else if (maa.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_COUNTRY_MAA_3);
            } else {
                bindMaa = true;

                query.append(_FINDER_COLUMN_COUNTRY_MAA_2);
            }

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(OrganisaatioModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindMaa) {
                    qPos.add(maa);
                }

                if (!pagination) {
                    list = (List<Organisaatio>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Organisaatio>(list);
                } else {
                    list = (List<Organisaatio>) QueryUtil.list(q, getDialect(),
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
     * Returns the first organisaatio in the ordered set where maa = &#63;.
     *
     * @param maa the maa
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching organisaatio
     * @throws fi.csc.avaa.tupa.db.NoSuchOrganisaatioException if a matching organisaatio could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Organisaatio findBycountry_First(String maa,
        OrderByComparator orderByComparator)
        throws NoSuchOrganisaatioException, SystemException {
        Organisaatio organisaatio = fetchBycountry_First(maa, orderByComparator);

        if (organisaatio != null) {
            return organisaatio;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("maa=");
        msg.append(maa);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchOrganisaatioException(msg.toString());
    }

    /**
     * Returns the first organisaatio in the ordered set where maa = &#63;.
     *
     * @param maa the maa
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching organisaatio, or <code>null</code> if a matching organisaatio could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Organisaatio fetchBycountry_First(String maa,
        OrderByComparator orderByComparator) throws SystemException {
        List<Organisaatio> list = findBycountry(maa, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last organisaatio in the ordered set where maa = &#63;.
     *
     * @param maa the maa
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching organisaatio
     * @throws fi.csc.avaa.tupa.db.NoSuchOrganisaatioException if a matching organisaatio could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Organisaatio findBycountry_Last(String maa,
        OrderByComparator orderByComparator)
        throws NoSuchOrganisaatioException, SystemException {
        Organisaatio organisaatio = fetchBycountry_Last(maa, orderByComparator);

        if (organisaatio != null) {
            return organisaatio;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("maa=");
        msg.append(maa);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchOrganisaatioException(msg.toString());
    }

    /**
     * Returns the last organisaatio in the ordered set where maa = &#63;.
     *
     * @param maa the maa
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching organisaatio, or <code>null</code> if a matching organisaatio could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Organisaatio fetchBycountry_Last(String maa,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countBycountry(maa);

        if (count == 0) {
            return null;
        }

        List<Organisaatio> list = findBycountry(maa, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the organisaatios before and after the current organisaatio in the ordered set where maa = &#63;.
     *
     * @param organisaatio_id the primary key of the current organisaatio
     * @param maa the maa
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next organisaatio
     * @throws fi.csc.avaa.tupa.db.NoSuchOrganisaatioException if a organisaatio with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Organisaatio[] findBycountry_PrevAndNext(int organisaatio_id,
        String maa, OrderByComparator orderByComparator)
        throws NoSuchOrganisaatioException, SystemException {
        Organisaatio organisaatio = findByPrimaryKey(organisaatio_id);

        Session session = null;

        try {
            session = openSession();

            Organisaatio[] array = new OrganisaatioImpl[3];

            array[0] = getBycountry_PrevAndNext(session, organisaatio, maa,
                    orderByComparator, true);

            array[1] = organisaatio;

            array[2] = getBycountry_PrevAndNext(session, organisaatio, maa,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Organisaatio getBycountry_PrevAndNext(Session session,
        Organisaatio organisaatio, String maa,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_ORGANISAATIO_WHERE);

        boolean bindMaa = false;

        if (maa == null) {
            query.append(_FINDER_COLUMN_COUNTRY_MAA_1);
        } else if (maa.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_COUNTRY_MAA_3);
        } else {
            bindMaa = true;

            query.append(_FINDER_COLUMN_COUNTRY_MAA_2);
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
            query.append(OrganisaatioModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        if (bindMaa) {
            qPos.add(maa);
        }

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(organisaatio);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Organisaatio> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the organisaatios where maa = &#63; from the database.
     *
     * @param maa the maa
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeBycountry(String maa) throws SystemException {
        for (Organisaatio organisaatio : findBycountry(maa, QueryUtil.ALL_POS,
                QueryUtil.ALL_POS, null)) {
            remove(organisaatio);
        }
    }

    /**
     * Returns the number of organisaatios where maa = &#63;.
     *
     * @param maa the maa
     * @return the number of matching organisaatios
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countBycountry(String maa) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_COUNTRY;

        Object[] finderArgs = new Object[] { maa };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_ORGANISAATIO_WHERE);

            boolean bindMaa = false;

            if (maa == null) {
                query.append(_FINDER_COLUMN_COUNTRY_MAA_1);
            } else if (maa.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_COUNTRY_MAA_3);
            } else {
                bindMaa = true;

                query.append(_FINDER_COLUMN_COUNTRY_MAA_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindMaa) {
                    qPos.add(maa);
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
     * Caches the organisaatio in the entity cache if it is enabled.
     *
     * @param organisaatio the organisaatio
     */
    @Override
    public void cacheResult(Organisaatio organisaatio) {
        EntityCacheUtil.putResult(OrganisaatioModelImpl.ENTITY_CACHE_ENABLED,
            OrganisaatioImpl.class, organisaatio.getPrimaryKey(), organisaatio);

        organisaatio.resetOriginalValues();
    }

    /**
     * Caches the organisaatios in the entity cache if it is enabled.
     *
     * @param organisaatios the organisaatios
     */
    @Override
    public void cacheResult(List<Organisaatio> organisaatios) {
        for (Organisaatio organisaatio : organisaatios) {
            if (EntityCacheUtil.getResult(
                        OrganisaatioModelImpl.ENTITY_CACHE_ENABLED,
                        OrganisaatioImpl.class, organisaatio.getPrimaryKey()) == null) {
                cacheResult(organisaatio);
            } else {
                organisaatio.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all organisaatios.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(OrganisaatioImpl.class.getName());
        }

        EntityCacheUtil.clearCache(OrganisaatioImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the organisaatio.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(Organisaatio organisaatio) {
        EntityCacheUtil.removeResult(OrganisaatioModelImpl.ENTITY_CACHE_ENABLED,
            OrganisaatioImpl.class, organisaatio.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<Organisaatio> organisaatios) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (Organisaatio organisaatio : organisaatios) {
            EntityCacheUtil.removeResult(OrganisaatioModelImpl.ENTITY_CACHE_ENABLED,
                OrganisaatioImpl.class, organisaatio.getPrimaryKey());
        }
    }

    /**
     * Creates a new organisaatio with the primary key. Does not add the organisaatio to the database.
     *
     * @param organisaatio_id the primary key for the new organisaatio
     * @return the new organisaatio
     */
    @Override
    public Organisaatio create(int organisaatio_id) {
        Organisaatio organisaatio = new OrganisaatioImpl();

        organisaatio.setNew(true);
        organisaatio.setPrimaryKey(organisaatio_id);

        return organisaatio;
    }

    /**
     * Removes the organisaatio with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param organisaatio_id the primary key of the organisaatio
     * @return the organisaatio that was removed
     * @throws fi.csc.avaa.tupa.db.NoSuchOrganisaatioException if a organisaatio with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Organisaatio remove(int organisaatio_id)
        throws NoSuchOrganisaatioException, SystemException {
        return remove((Serializable) organisaatio_id);
    }

    /**
     * Removes the organisaatio with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the organisaatio
     * @return the organisaatio that was removed
     * @throws fi.csc.avaa.tupa.db.NoSuchOrganisaatioException if a organisaatio with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Organisaatio remove(Serializable primaryKey)
        throws NoSuchOrganisaatioException, SystemException {
        Session session = null;

        try {
            session = openSession();

            Organisaatio organisaatio = (Organisaatio) session.get(OrganisaatioImpl.class,
                    primaryKey);

            if (organisaatio == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchOrganisaatioException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(organisaatio);
        } catch (NoSuchOrganisaatioException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected Organisaatio removeImpl(Organisaatio organisaatio)
        throws SystemException {
        organisaatio = toUnwrappedModel(organisaatio);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(organisaatio)) {
                organisaatio = (Organisaatio) session.get(OrganisaatioImpl.class,
                        organisaatio.getPrimaryKeyObj());
            }

            if (organisaatio != null) {
                session.delete(organisaatio);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (organisaatio != null) {
            clearCache(organisaatio);
        }

        return organisaatio;
    }

    @Override
    public Organisaatio updateImpl(
        fi.csc.avaa.tupa.db.model.Organisaatio organisaatio)
        throws SystemException {
        organisaatio = toUnwrappedModel(organisaatio);

        boolean isNew = organisaatio.isNew();

        OrganisaatioModelImpl organisaatioModelImpl = (OrganisaatioModelImpl) organisaatio;

        Session session = null;

        try {
            session = openSession();

            if (organisaatio.isNew()) {
                session.save(organisaatio);

                organisaatio.setNew(false);
            } else {
                session.merge(organisaatio);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !OrganisaatioModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((organisaatioModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ISNI.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        organisaatioModelImpl.getOriginalISNI()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ISNI, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ISNI,
                    args);

                args = new Object[] { organisaatioModelImpl.getISNI() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ISNI, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ISNI,
                    args);
            }

            if ((organisaatioModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COUNTRY.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        organisaatioModelImpl.getOriginalMaa()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_COUNTRY, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COUNTRY,
                    args);

                args = new Object[] { organisaatioModelImpl.getMaa() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_COUNTRY, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COUNTRY,
                    args);
            }
        }

        EntityCacheUtil.putResult(OrganisaatioModelImpl.ENTITY_CACHE_ENABLED,
            OrganisaatioImpl.class, organisaatio.getPrimaryKey(), organisaatio);

        return organisaatio;
    }

    protected Organisaatio toUnwrappedModel(Organisaatio organisaatio) {
        if (organisaatio instanceof OrganisaatioImpl) {
            return organisaatio;
        }

        OrganisaatioImpl organisaatioImpl = new OrganisaatioImpl();

        organisaatioImpl.setNew(organisaatio.isNew());
        organisaatioImpl.setPrimaryKey(organisaatio.getPrimaryKey());

        organisaatioImpl.setOrganisaatio_id(organisaatio.getOrganisaatio_id());
        organisaatioImpl.setNimi(organisaatio.getNimi());
        organisaatioImpl.setName(organisaatio.getName());
        organisaatioImpl.setMaa(organisaatio.getMaa());
        organisaatioImpl.setISNI(organisaatio.getISNI());
        organisaatioImpl.setCrmid(organisaatio.getCrmid());
        organisaatioImpl.setEmo_organisaatio(organisaatio.getEmo_organisaatio());
        organisaatioImpl.setKv_isanta(organisaatio.isKv_isanta());

        return organisaatioImpl;
    }

    /**
     * Returns the organisaatio with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the organisaatio
     * @return the organisaatio
     * @throws fi.csc.avaa.tupa.db.NoSuchOrganisaatioException if a organisaatio with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Organisaatio findByPrimaryKey(Serializable primaryKey)
        throws NoSuchOrganisaatioException, SystemException {
        Organisaatio organisaatio = fetchByPrimaryKey(primaryKey);

        if (organisaatio == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchOrganisaatioException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return organisaatio;
    }

    /**
     * Returns the organisaatio with the primary key or throws a {@link fi.csc.avaa.tupa.db.NoSuchOrganisaatioException} if it could not be found.
     *
     * @param organisaatio_id the primary key of the organisaatio
     * @return the organisaatio
     * @throws fi.csc.avaa.tupa.db.NoSuchOrganisaatioException if a organisaatio with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Organisaatio findByPrimaryKey(int organisaatio_id)
        throws NoSuchOrganisaatioException, SystemException {
        return findByPrimaryKey((Serializable) organisaatio_id);
    }

    /**
     * Returns the organisaatio with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the organisaatio
     * @return the organisaatio, or <code>null</code> if a organisaatio with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Organisaatio fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        Organisaatio organisaatio = (Organisaatio) EntityCacheUtil.getResult(OrganisaatioModelImpl.ENTITY_CACHE_ENABLED,
                OrganisaatioImpl.class, primaryKey);

        if (organisaatio == _nullOrganisaatio) {
            return null;
        }

        if (organisaatio == null) {
            Session session = null;

            try {
                session = openSession();

                organisaatio = (Organisaatio) session.get(OrganisaatioImpl.class,
                        primaryKey);

                if (organisaatio != null) {
                    cacheResult(organisaatio);
                } else {
                    EntityCacheUtil.putResult(OrganisaatioModelImpl.ENTITY_CACHE_ENABLED,
                        OrganisaatioImpl.class, primaryKey, _nullOrganisaatio);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(OrganisaatioModelImpl.ENTITY_CACHE_ENABLED,
                    OrganisaatioImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return organisaatio;
    }

    /**
     * Returns the organisaatio with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param organisaatio_id the primary key of the organisaatio
     * @return the organisaatio, or <code>null</code> if a organisaatio with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Organisaatio fetchByPrimaryKey(int organisaatio_id)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) organisaatio_id);
    }

    /**
     * Returns all the organisaatios.
     *
     * @return the organisaatios
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Organisaatio> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the organisaatios.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.OrganisaatioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of organisaatios
     * @param end the upper bound of the range of organisaatios (not inclusive)
     * @return the range of organisaatios
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Organisaatio> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the organisaatios.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.tupa.db.model.impl.OrganisaatioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of organisaatios
     * @param end the upper bound of the range of organisaatios (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of organisaatios
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Organisaatio> findAll(int start, int end,
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

        List<Organisaatio> list = (List<Organisaatio>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_ORGANISAATIO);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_ORGANISAATIO;

                if (pagination) {
                    sql = sql.concat(OrganisaatioModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<Organisaatio>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Organisaatio>(list);
                } else {
                    list = (List<Organisaatio>) QueryUtil.list(q, getDialect(),
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
     * Removes all the organisaatios from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (Organisaatio organisaatio : findAll()) {
            remove(organisaatio);
        }
    }

    /**
     * Returns the number of organisaatios.
     *
     * @return the number of organisaatios
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

                Query q = session.createQuery(_SQL_COUNT_ORGANISAATIO);

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
     * Initializes the organisaatio persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.fi.csc.avaa.tupa.db.model.Organisaatio")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<Organisaatio>> listenersList = new ArrayList<ModelListener<Organisaatio>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<Organisaatio>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(OrganisaatioImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
