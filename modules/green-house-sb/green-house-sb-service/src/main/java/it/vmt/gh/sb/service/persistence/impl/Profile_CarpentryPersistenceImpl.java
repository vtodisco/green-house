/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package it.vmt.gh.sb.service.persistence.impl;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.dao.orm.ArgumentsResolver;
import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.SessionFactory;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.MapUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;

import it.vmt.gh.sb.exception.NoSuchProfile_CarpentryException;
import it.vmt.gh.sb.model.Profile_Carpentry;
import it.vmt.gh.sb.model.impl.Profile_CarpentryImpl;
import it.vmt.gh.sb.model.impl.Profile_CarpentryModelImpl;
import it.vmt.gh.sb.service.persistence.Profile_CarpentryPK;
import it.vmt.gh.sb.service.persistence.Profile_CarpentryPersistence;
import it.vmt.gh.sb.service.persistence.impl.constants.ghPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import javax.sql.DataSource;

import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the profile_ carpentry service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = Profile_CarpentryPersistence.class)
public class Profile_CarpentryPersistenceImpl
	extends BasePersistenceImpl<Profile_Carpentry>
	implements Profile_CarpentryPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>Profile_CarpentryUtil</code> to access the profile_ carpentry persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		Profile_CarpentryImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindByUuid;
	private FinderPath _finderPathWithoutPaginationFindByUuid;
	private FinderPath _finderPathCountByUuid;

	/**
	 * Returns all the profile_ carpentries where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching profile_ carpentries
	 */
	@Override
	public List<Profile_Carpentry> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the profile_ carpentries where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Profile_CarpentryModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of profile_ carpentries
	 * @param end the upper bound of the range of profile_ carpentries (not inclusive)
	 * @return the range of matching profile_ carpentries
	 */
	@Override
	public List<Profile_Carpentry> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the profile_ carpentries where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Profile_CarpentryModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of profile_ carpentries
	 * @param end the upper bound of the range of profile_ carpentries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching profile_ carpentries
	 */
	@Override
	public List<Profile_Carpentry> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Profile_Carpentry> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the profile_ carpentries where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Profile_CarpentryModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of profile_ carpentries
	 * @param end the upper bound of the range of profile_ carpentries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching profile_ carpentries
	 */
	@Override
	public List<Profile_Carpentry> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Profile_Carpentry> orderByComparator,
		boolean useFinderCache) {

		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByUuid;
				finderArgs = new Object[] {uuid};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByUuid;
			finderArgs = new Object[] {uuid, start, end, orderByComparator};
		}

		List<Profile_Carpentry> list = null;

		if (useFinderCache) {
			list = (List<Profile_Carpentry>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Profile_Carpentry profile_Carpentry : list) {
					if (!uuid.equals(profile_Carpentry.getUuid())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_PROFILE_CARPENTRY_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(Profile_CarpentryModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				list = (List<Profile_Carpentry>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first profile_ carpentry in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching profile_ carpentry
	 * @throws NoSuchProfile_CarpentryException if a matching profile_ carpentry could not be found
	 */
	@Override
	public Profile_Carpentry findByUuid_First(
			String uuid, OrderByComparator<Profile_Carpentry> orderByComparator)
		throws NoSuchProfile_CarpentryException {

		Profile_Carpentry profile_Carpentry = fetchByUuid_First(
			uuid, orderByComparator);

		if (profile_Carpentry != null) {
			return profile_Carpentry;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchProfile_CarpentryException(sb.toString());
	}

	/**
	 * Returns the first profile_ carpentry in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching profile_ carpentry, or <code>null</code> if a matching profile_ carpentry could not be found
	 */
	@Override
	public Profile_Carpentry fetchByUuid_First(
		String uuid, OrderByComparator<Profile_Carpentry> orderByComparator) {

		List<Profile_Carpentry> list = findByUuid(
			uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last profile_ carpentry in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching profile_ carpentry
	 * @throws NoSuchProfile_CarpentryException if a matching profile_ carpentry could not be found
	 */
	@Override
	public Profile_Carpentry findByUuid_Last(
			String uuid, OrderByComparator<Profile_Carpentry> orderByComparator)
		throws NoSuchProfile_CarpentryException {

		Profile_Carpentry profile_Carpentry = fetchByUuid_Last(
			uuid, orderByComparator);

		if (profile_Carpentry != null) {
			return profile_Carpentry;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchProfile_CarpentryException(sb.toString());
	}

	/**
	 * Returns the last profile_ carpentry in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching profile_ carpentry, or <code>null</code> if a matching profile_ carpentry could not be found
	 */
	@Override
	public Profile_Carpentry fetchByUuid_Last(
		String uuid, OrderByComparator<Profile_Carpentry> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<Profile_Carpentry> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the profile_ carpentries before and after the current profile_ carpentry in the ordered set where uuid = &#63;.
	 *
	 * @param profile_CarpentryPK the primary key of the current profile_ carpentry
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next profile_ carpentry
	 * @throws NoSuchProfile_CarpentryException if a profile_ carpentry with the primary key could not be found
	 */
	@Override
	public Profile_Carpentry[] findByUuid_PrevAndNext(
			Profile_CarpentryPK profile_CarpentryPK, String uuid,
			OrderByComparator<Profile_Carpentry> orderByComparator)
		throws NoSuchProfile_CarpentryException {

		uuid = Objects.toString(uuid, "");

		Profile_Carpentry profile_Carpentry = findByPrimaryKey(
			profile_CarpentryPK);

		Session session = null;

		try {
			session = openSession();

			Profile_Carpentry[] array = new Profile_CarpentryImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, profile_Carpentry, uuid, orderByComparator, true);

			array[1] = profile_Carpentry;

			array[2] = getByUuid_PrevAndNext(
				session, profile_Carpentry, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected Profile_Carpentry getByUuid_PrevAndNext(
		Session session, Profile_Carpentry profile_Carpentry, String uuid,
		OrderByComparator<Profile_Carpentry> orderByComparator,
		boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_PROFILE_CARPENTRY_WHERE);

		boolean bindUuid = false;

		if (uuid.isEmpty()) {
			sb.append(_FINDER_COLUMN_UUID_UUID_3);
		}
		else {
			bindUuid = true;

			sb.append(_FINDER_COLUMN_UUID_UUID_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(Profile_CarpentryModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindUuid) {
			queryPos.add(uuid);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						profile_Carpentry)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<Profile_Carpentry> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the profile_ carpentries where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (Profile_Carpentry profile_Carpentry :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(profile_Carpentry);
		}
	}

	/**
	 * Returns the number of profile_ carpentries where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching profile_ carpentries
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_PROFILE_CARPENTRY_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_UUID_2 =
		"profile_Carpentry.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(profile_Carpentry.uuid IS NULL OR profile_Carpentry.uuid = '')";

	private FinderPath _finderPathWithPaginationFindByProfile;
	private FinderPath _finderPathWithoutPaginationFindByProfile;
	private FinderPath _finderPathCountByProfile;

	/**
	 * Returns all the profile_ carpentries where profileId = &#63;.
	 *
	 * @param profileId the profile ID
	 * @return the matching profile_ carpentries
	 */
	@Override
	public List<Profile_Carpentry> findByProfile(long profileId) {
		return findByProfile(
			profileId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the profile_ carpentries where profileId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Profile_CarpentryModelImpl</code>.
	 * </p>
	 *
	 * @param profileId the profile ID
	 * @param start the lower bound of the range of profile_ carpentries
	 * @param end the upper bound of the range of profile_ carpentries (not inclusive)
	 * @return the range of matching profile_ carpentries
	 */
	@Override
	public List<Profile_Carpentry> findByProfile(
		long profileId, int start, int end) {

		return findByProfile(profileId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the profile_ carpentries where profileId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Profile_CarpentryModelImpl</code>.
	 * </p>
	 *
	 * @param profileId the profile ID
	 * @param start the lower bound of the range of profile_ carpentries
	 * @param end the upper bound of the range of profile_ carpentries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching profile_ carpentries
	 */
	@Override
	public List<Profile_Carpentry> findByProfile(
		long profileId, int start, int end,
		OrderByComparator<Profile_Carpentry> orderByComparator) {

		return findByProfile(profileId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the profile_ carpentries where profileId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Profile_CarpentryModelImpl</code>.
	 * </p>
	 *
	 * @param profileId the profile ID
	 * @param start the lower bound of the range of profile_ carpentries
	 * @param end the upper bound of the range of profile_ carpentries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching profile_ carpentries
	 */
	@Override
	public List<Profile_Carpentry> findByProfile(
		long profileId, int start, int end,
		OrderByComparator<Profile_Carpentry> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByProfile;
				finderArgs = new Object[] {profileId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByProfile;
			finderArgs = new Object[] {
				profileId, start, end, orderByComparator
			};
		}

		List<Profile_Carpentry> list = null;

		if (useFinderCache) {
			list = (List<Profile_Carpentry>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Profile_Carpentry profile_Carpentry : list) {
					if (profileId != profile_Carpentry.getProfileId()) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_PROFILE_CARPENTRY_WHERE);

			sb.append(_FINDER_COLUMN_PROFILE_PROFILEID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(Profile_CarpentryModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(profileId);

				list = (List<Profile_Carpentry>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first profile_ carpentry in the ordered set where profileId = &#63;.
	 *
	 * @param profileId the profile ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching profile_ carpentry
	 * @throws NoSuchProfile_CarpentryException if a matching profile_ carpentry could not be found
	 */
	@Override
	public Profile_Carpentry findByProfile_First(
			long profileId,
			OrderByComparator<Profile_Carpentry> orderByComparator)
		throws NoSuchProfile_CarpentryException {

		Profile_Carpentry profile_Carpentry = fetchByProfile_First(
			profileId, orderByComparator);

		if (profile_Carpentry != null) {
			return profile_Carpentry;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("profileId=");
		sb.append(profileId);

		sb.append("}");

		throw new NoSuchProfile_CarpentryException(sb.toString());
	}

	/**
	 * Returns the first profile_ carpentry in the ordered set where profileId = &#63;.
	 *
	 * @param profileId the profile ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching profile_ carpentry, or <code>null</code> if a matching profile_ carpentry could not be found
	 */
	@Override
	public Profile_Carpentry fetchByProfile_First(
		long profileId,
		OrderByComparator<Profile_Carpentry> orderByComparator) {

		List<Profile_Carpentry> list = findByProfile(
			profileId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last profile_ carpentry in the ordered set where profileId = &#63;.
	 *
	 * @param profileId the profile ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching profile_ carpentry
	 * @throws NoSuchProfile_CarpentryException if a matching profile_ carpentry could not be found
	 */
	@Override
	public Profile_Carpentry findByProfile_Last(
			long profileId,
			OrderByComparator<Profile_Carpentry> orderByComparator)
		throws NoSuchProfile_CarpentryException {

		Profile_Carpentry profile_Carpentry = fetchByProfile_Last(
			profileId, orderByComparator);

		if (profile_Carpentry != null) {
			return profile_Carpentry;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("profileId=");
		sb.append(profileId);

		sb.append("}");

		throw new NoSuchProfile_CarpentryException(sb.toString());
	}

	/**
	 * Returns the last profile_ carpentry in the ordered set where profileId = &#63;.
	 *
	 * @param profileId the profile ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching profile_ carpentry, or <code>null</code> if a matching profile_ carpentry could not be found
	 */
	@Override
	public Profile_Carpentry fetchByProfile_Last(
		long profileId,
		OrderByComparator<Profile_Carpentry> orderByComparator) {

		int count = countByProfile(profileId);

		if (count == 0) {
			return null;
		}

		List<Profile_Carpentry> list = findByProfile(
			profileId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the profile_ carpentries before and after the current profile_ carpentry in the ordered set where profileId = &#63;.
	 *
	 * @param profile_CarpentryPK the primary key of the current profile_ carpentry
	 * @param profileId the profile ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next profile_ carpentry
	 * @throws NoSuchProfile_CarpentryException if a profile_ carpentry with the primary key could not be found
	 */
	@Override
	public Profile_Carpentry[] findByProfile_PrevAndNext(
			Profile_CarpentryPK profile_CarpentryPK, long profileId,
			OrderByComparator<Profile_Carpentry> orderByComparator)
		throws NoSuchProfile_CarpentryException {

		Profile_Carpentry profile_Carpentry = findByPrimaryKey(
			profile_CarpentryPK);

		Session session = null;

		try {
			session = openSession();

			Profile_Carpentry[] array = new Profile_CarpentryImpl[3];

			array[0] = getByProfile_PrevAndNext(
				session, profile_Carpentry, profileId, orderByComparator, true);

			array[1] = profile_Carpentry;

			array[2] = getByProfile_PrevAndNext(
				session, profile_Carpentry, profileId, orderByComparator,
				false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected Profile_Carpentry getByProfile_PrevAndNext(
		Session session, Profile_Carpentry profile_Carpentry, long profileId,
		OrderByComparator<Profile_Carpentry> orderByComparator,
		boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_PROFILE_CARPENTRY_WHERE);

		sb.append(_FINDER_COLUMN_PROFILE_PROFILEID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(Profile_CarpentryModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(profileId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						profile_Carpentry)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<Profile_Carpentry> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the profile_ carpentries where profileId = &#63; from the database.
	 *
	 * @param profileId the profile ID
	 */
	@Override
	public void removeByProfile(long profileId) {
		for (Profile_Carpentry profile_Carpentry :
				findByProfile(
					profileId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(profile_Carpentry);
		}
	}

	/**
	 * Returns the number of profile_ carpentries where profileId = &#63;.
	 *
	 * @param profileId the profile ID
	 * @return the number of matching profile_ carpentries
	 */
	@Override
	public int countByProfile(long profileId) {
		FinderPath finderPath = _finderPathCountByProfile;

		Object[] finderArgs = new Object[] {profileId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_PROFILE_CARPENTRY_WHERE);

			sb.append(_FINDER_COLUMN_PROFILE_PROFILEID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(profileId);

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_PROFILE_PROFILEID_2 =
		"profile_Carpentry.id.profileId = ?";

	private FinderPath _finderPathWithPaginationFindByCarpentry;
	private FinderPath _finderPathWithoutPaginationFindByCarpentry;
	private FinderPath _finderPathCountByCarpentry;

	/**
	 * Returns all the profile_ carpentries where carpentryId = &#63;.
	 *
	 * @param carpentryId the carpentry ID
	 * @return the matching profile_ carpentries
	 */
	@Override
	public List<Profile_Carpentry> findByCarpentry(long carpentryId) {
		return findByCarpentry(
			carpentryId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the profile_ carpentries where carpentryId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Profile_CarpentryModelImpl</code>.
	 * </p>
	 *
	 * @param carpentryId the carpentry ID
	 * @param start the lower bound of the range of profile_ carpentries
	 * @param end the upper bound of the range of profile_ carpentries (not inclusive)
	 * @return the range of matching profile_ carpentries
	 */
	@Override
	public List<Profile_Carpentry> findByCarpentry(
		long carpentryId, int start, int end) {

		return findByCarpentry(carpentryId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the profile_ carpentries where carpentryId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Profile_CarpentryModelImpl</code>.
	 * </p>
	 *
	 * @param carpentryId the carpentry ID
	 * @param start the lower bound of the range of profile_ carpentries
	 * @param end the upper bound of the range of profile_ carpentries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching profile_ carpentries
	 */
	@Override
	public List<Profile_Carpentry> findByCarpentry(
		long carpentryId, int start, int end,
		OrderByComparator<Profile_Carpentry> orderByComparator) {

		return findByCarpentry(
			carpentryId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the profile_ carpentries where carpentryId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Profile_CarpentryModelImpl</code>.
	 * </p>
	 *
	 * @param carpentryId the carpentry ID
	 * @param start the lower bound of the range of profile_ carpentries
	 * @param end the upper bound of the range of profile_ carpentries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching profile_ carpentries
	 */
	@Override
	public List<Profile_Carpentry> findByCarpentry(
		long carpentryId, int start, int end,
		OrderByComparator<Profile_Carpentry> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByCarpentry;
				finderArgs = new Object[] {carpentryId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByCarpentry;
			finderArgs = new Object[] {
				carpentryId, start, end, orderByComparator
			};
		}

		List<Profile_Carpentry> list = null;

		if (useFinderCache) {
			list = (List<Profile_Carpentry>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Profile_Carpentry profile_Carpentry : list) {
					if (carpentryId != profile_Carpentry.getCarpentryId()) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_PROFILE_CARPENTRY_WHERE);

			sb.append(_FINDER_COLUMN_CARPENTRY_CARPENTRYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(Profile_CarpentryModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(carpentryId);

				list = (List<Profile_Carpentry>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first profile_ carpentry in the ordered set where carpentryId = &#63;.
	 *
	 * @param carpentryId the carpentry ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching profile_ carpentry
	 * @throws NoSuchProfile_CarpentryException if a matching profile_ carpentry could not be found
	 */
	@Override
	public Profile_Carpentry findByCarpentry_First(
			long carpentryId,
			OrderByComparator<Profile_Carpentry> orderByComparator)
		throws NoSuchProfile_CarpentryException {

		Profile_Carpentry profile_Carpentry = fetchByCarpentry_First(
			carpentryId, orderByComparator);

		if (profile_Carpentry != null) {
			return profile_Carpentry;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("carpentryId=");
		sb.append(carpentryId);

		sb.append("}");

		throw new NoSuchProfile_CarpentryException(sb.toString());
	}

	/**
	 * Returns the first profile_ carpentry in the ordered set where carpentryId = &#63;.
	 *
	 * @param carpentryId the carpentry ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching profile_ carpentry, or <code>null</code> if a matching profile_ carpentry could not be found
	 */
	@Override
	public Profile_Carpentry fetchByCarpentry_First(
		long carpentryId,
		OrderByComparator<Profile_Carpentry> orderByComparator) {

		List<Profile_Carpentry> list = findByCarpentry(
			carpentryId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last profile_ carpentry in the ordered set where carpentryId = &#63;.
	 *
	 * @param carpentryId the carpentry ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching profile_ carpentry
	 * @throws NoSuchProfile_CarpentryException if a matching profile_ carpentry could not be found
	 */
	@Override
	public Profile_Carpentry findByCarpentry_Last(
			long carpentryId,
			OrderByComparator<Profile_Carpentry> orderByComparator)
		throws NoSuchProfile_CarpentryException {

		Profile_Carpentry profile_Carpentry = fetchByCarpentry_Last(
			carpentryId, orderByComparator);

		if (profile_Carpentry != null) {
			return profile_Carpentry;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("carpentryId=");
		sb.append(carpentryId);

		sb.append("}");

		throw new NoSuchProfile_CarpentryException(sb.toString());
	}

	/**
	 * Returns the last profile_ carpentry in the ordered set where carpentryId = &#63;.
	 *
	 * @param carpentryId the carpentry ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching profile_ carpentry, or <code>null</code> if a matching profile_ carpentry could not be found
	 */
	@Override
	public Profile_Carpentry fetchByCarpentry_Last(
		long carpentryId,
		OrderByComparator<Profile_Carpentry> orderByComparator) {

		int count = countByCarpentry(carpentryId);

		if (count == 0) {
			return null;
		}

		List<Profile_Carpentry> list = findByCarpentry(
			carpentryId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the profile_ carpentries before and after the current profile_ carpentry in the ordered set where carpentryId = &#63;.
	 *
	 * @param profile_CarpentryPK the primary key of the current profile_ carpentry
	 * @param carpentryId the carpentry ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next profile_ carpentry
	 * @throws NoSuchProfile_CarpentryException if a profile_ carpentry with the primary key could not be found
	 */
	@Override
	public Profile_Carpentry[] findByCarpentry_PrevAndNext(
			Profile_CarpentryPK profile_CarpentryPK, long carpentryId,
			OrderByComparator<Profile_Carpentry> orderByComparator)
		throws NoSuchProfile_CarpentryException {

		Profile_Carpentry profile_Carpentry = findByPrimaryKey(
			profile_CarpentryPK);

		Session session = null;

		try {
			session = openSession();

			Profile_Carpentry[] array = new Profile_CarpentryImpl[3];

			array[0] = getByCarpentry_PrevAndNext(
				session, profile_Carpentry, carpentryId, orderByComparator,
				true);

			array[1] = profile_Carpentry;

			array[2] = getByCarpentry_PrevAndNext(
				session, profile_Carpentry, carpentryId, orderByComparator,
				false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected Profile_Carpentry getByCarpentry_PrevAndNext(
		Session session, Profile_Carpentry profile_Carpentry, long carpentryId,
		OrderByComparator<Profile_Carpentry> orderByComparator,
		boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_PROFILE_CARPENTRY_WHERE);

		sb.append(_FINDER_COLUMN_CARPENTRY_CARPENTRYID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(Profile_CarpentryModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(carpentryId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						profile_Carpentry)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<Profile_Carpentry> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the profile_ carpentries where carpentryId = &#63; from the database.
	 *
	 * @param carpentryId the carpentry ID
	 */
	@Override
	public void removeByCarpentry(long carpentryId) {
		for (Profile_Carpentry profile_Carpentry :
				findByCarpentry(
					carpentryId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(profile_Carpentry);
		}
	}

	/**
	 * Returns the number of profile_ carpentries where carpentryId = &#63;.
	 *
	 * @param carpentryId the carpentry ID
	 * @return the number of matching profile_ carpentries
	 */
	@Override
	public int countByCarpentry(long carpentryId) {
		FinderPath finderPath = _finderPathCountByCarpentry;

		Object[] finderArgs = new Object[] {carpentryId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_PROFILE_CARPENTRY_WHERE);

			sb.append(_FINDER_COLUMN_CARPENTRY_CARPENTRYID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(carpentryId);

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_CARPENTRY_CARPENTRYID_2 =
		"profile_Carpentry.id.carpentryId = ?";

	public Profile_CarpentryPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(Profile_Carpentry.class);

		setModelImplClass(Profile_CarpentryImpl.class);
		setModelPKClass(Profile_CarpentryPK.class);
	}

	/**
	 * Caches the profile_ carpentry in the entity cache if it is enabled.
	 *
	 * @param profile_Carpentry the profile_ carpentry
	 */
	@Override
	public void cacheResult(Profile_Carpentry profile_Carpentry) {
		entityCache.putResult(
			Profile_CarpentryImpl.class, profile_Carpentry.getPrimaryKey(),
			profile_Carpentry);
	}

	/**
	 * Caches the profile_ carpentries in the entity cache if it is enabled.
	 *
	 * @param profile_Carpentries the profile_ carpentries
	 */
	@Override
	public void cacheResult(List<Profile_Carpentry> profile_Carpentries) {
		for (Profile_Carpentry profile_Carpentry : profile_Carpentries) {
			if (entityCache.getResult(
					Profile_CarpentryImpl.class,
					profile_Carpentry.getPrimaryKey()) == null) {

				cacheResult(profile_Carpentry);
			}
		}
	}

	/**
	 * Clears the cache for all profile_ carpentries.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(Profile_CarpentryImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the profile_ carpentry.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Profile_Carpentry profile_Carpentry) {
		entityCache.removeResult(
			Profile_CarpentryImpl.class, profile_Carpentry);
	}

	@Override
	public void clearCache(List<Profile_Carpentry> profile_Carpentries) {
		for (Profile_Carpentry profile_Carpentry : profile_Carpentries) {
			entityCache.removeResult(
				Profile_CarpentryImpl.class, profile_Carpentry);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(Profile_CarpentryImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new profile_ carpentry with the primary key. Does not add the profile_ carpentry to the database.
	 *
	 * @param profile_CarpentryPK the primary key for the new profile_ carpentry
	 * @return the new profile_ carpentry
	 */
	@Override
	public Profile_Carpentry create(Profile_CarpentryPK profile_CarpentryPK) {
		Profile_Carpentry profile_Carpentry = new Profile_CarpentryImpl();

		profile_Carpentry.setNew(true);
		profile_Carpentry.setPrimaryKey(profile_CarpentryPK);

		String uuid = PortalUUIDUtil.generate();

		profile_Carpentry.setUuid(uuid);

		return profile_Carpentry;
	}

	/**
	 * Removes the profile_ carpentry with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param profile_CarpentryPK the primary key of the profile_ carpentry
	 * @return the profile_ carpentry that was removed
	 * @throws NoSuchProfile_CarpentryException if a profile_ carpentry with the primary key could not be found
	 */
	@Override
	public Profile_Carpentry remove(Profile_CarpentryPK profile_CarpentryPK)
		throws NoSuchProfile_CarpentryException {

		return remove((Serializable)profile_CarpentryPK);
	}

	/**
	 * Removes the profile_ carpentry with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the profile_ carpentry
	 * @return the profile_ carpentry that was removed
	 * @throws NoSuchProfile_CarpentryException if a profile_ carpentry with the primary key could not be found
	 */
	@Override
	public Profile_Carpentry remove(Serializable primaryKey)
		throws NoSuchProfile_CarpentryException {

		Session session = null;

		try {
			session = openSession();

			Profile_Carpentry profile_Carpentry =
				(Profile_Carpentry)session.get(
					Profile_CarpentryImpl.class, primaryKey);

			if (profile_Carpentry == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchProfile_CarpentryException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(profile_Carpentry);
		}
		catch (NoSuchProfile_CarpentryException noSuchEntityException) {
			throw noSuchEntityException;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected Profile_Carpentry removeImpl(
		Profile_Carpentry profile_Carpentry) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(profile_Carpentry)) {
				profile_Carpentry = (Profile_Carpentry)session.get(
					Profile_CarpentryImpl.class,
					profile_Carpentry.getPrimaryKeyObj());
			}

			if (profile_Carpentry != null) {
				session.delete(profile_Carpentry);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (profile_Carpentry != null) {
			clearCache(profile_Carpentry);
		}

		return profile_Carpentry;
	}

	@Override
	public Profile_Carpentry updateImpl(Profile_Carpentry profile_Carpentry) {
		boolean isNew = profile_Carpentry.isNew();

		if (!(profile_Carpentry instanceof Profile_CarpentryModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(profile_Carpentry.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					profile_Carpentry);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in profile_Carpentry proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom Profile_Carpentry implementation " +
					profile_Carpentry.getClass());
		}

		Profile_CarpentryModelImpl profile_CarpentryModelImpl =
			(Profile_CarpentryModelImpl)profile_Carpentry;

		if (Validator.isNull(profile_Carpentry.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			profile_Carpentry.setUuid(uuid);
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(profile_Carpentry);
			}
			else {
				profile_Carpentry = (Profile_Carpentry)session.merge(
					profile_Carpentry);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			Profile_CarpentryImpl.class, profile_CarpentryModelImpl, false,
			true);

		if (isNew) {
			profile_Carpentry.setNew(false);
		}

		profile_Carpentry.resetOriginalValues();

		return profile_Carpentry;
	}

	/**
	 * Returns the profile_ carpentry with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the profile_ carpentry
	 * @return the profile_ carpentry
	 * @throws NoSuchProfile_CarpentryException if a profile_ carpentry with the primary key could not be found
	 */
	@Override
	public Profile_Carpentry findByPrimaryKey(Serializable primaryKey)
		throws NoSuchProfile_CarpentryException {

		Profile_Carpentry profile_Carpentry = fetchByPrimaryKey(primaryKey);

		if (profile_Carpentry == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchProfile_CarpentryException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return profile_Carpentry;
	}

	/**
	 * Returns the profile_ carpentry with the primary key or throws a <code>NoSuchProfile_CarpentryException</code> if it could not be found.
	 *
	 * @param profile_CarpentryPK the primary key of the profile_ carpentry
	 * @return the profile_ carpentry
	 * @throws NoSuchProfile_CarpentryException if a profile_ carpentry with the primary key could not be found
	 */
	@Override
	public Profile_Carpentry findByPrimaryKey(
			Profile_CarpentryPK profile_CarpentryPK)
		throws NoSuchProfile_CarpentryException {

		return findByPrimaryKey((Serializable)profile_CarpentryPK);
	}

	/**
	 * Returns the profile_ carpentry with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param profile_CarpentryPK the primary key of the profile_ carpentry
	 * @return the profile_ carpentry, or <code>null</code> if a profile_ carpentry with the primary key could not be found
	 */
	@Override
	public Profile_Carpentry fetchByPrimaryKey(
		Profile_CarpentryPK profile_CarpentryPK) {

		return fetchByPrimaryKey((Serializable)profile_CarpentryPK);
	}

	/**
	 * Returns all the profile_ carpentries.
	 *
	 * @return the profile_ carpentries
	 */
	@Override
	public List<Profile_Carpentry> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the profile_ carpentries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Profile_CarpentryModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of profile_ carpentries
	 * @param end the upper bound of the range of profile_ carpentries (not inclusive)
	 * @return the range of profile_ carpentries
	 */
	@Override
	public List<Profile_Carpentry> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the profile_ carpentries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Profile_CarpentryModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of profile_ carpentries
	 * @param end the upper bound of the range of profile_ carpentries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of profile_ carpentries
	 */
	@Override
	public List<Profile_Carpentry> findAll(
		int start, int end,
		OrderByComparator<Profile_Carpentry> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the profile_ carpentries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>Profile_CarpentryModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of profile_ carpentries
	 * @param end the upper bound of the range of profile_ carpentries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of profile_ carpentries
	 */
	@Override
	public List<Profile_Carpentry> findAll(
		int start, int end,
		OrderByComparator<Profile_Carpentry> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindAll;
				finderArgs = FINDER_ARGS_EMPTY;
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindAll;
			finderArgs = new Object[] {start, end, orderByComparator};
		}

		List<Profile_Carpentry> list = null;

		if (useFinderCache) {
			list = (List<Profile_Carpentry>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_PROFILE_CARPENTRY);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_PROFILE_CARPENTRY;

				sql = sql.concat(Profile_CarpentryModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<Profile_Carpentry>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the profile_ carpentries from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Profile_Carpentry profile_Carpentry : findAll()) {
			remove(profile_Carpentry);
		}
	}

	/**
	 * Returns the number of profile_ carpentries.
	 *
	 * @return the number of profile_ carpentries
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_PROFILE_CARPENTRY);

				count = (Long)query.uniqueResult();

				finderCache.putResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	public Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	@Override
	public Set<String> getCompoundPKColumnNames() {
		return _compoundPKColumnNames;
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "profile_CarpentryPK";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_PROFILE_CARPENTRY;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return Profile_CarpentryModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the profile_ carpentry persistence.
	 */
	@Activate
	public void activate(BundleContext bundleContext) {
		_bundleContext = bundleContext;

		_argumentsResolverServiceRegistration = _bundleContext.registerService(
			ArgumentsResolver.class,
			new Profile_CarpentryModelArgumentsResolver(),
			MapUtil.singletonDictionary(
				"model.class.name", Profile_Carpentry.class.getName()));

		_finderPathWithPaginationFindAll = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathWithoutPaginationFindAll = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathCountAll = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0], new String[0], false);

		_finderPathWithPaginationFindByUuid = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"uuid_"}, true);

		_finderPathWithoutPaginationFindByUuid = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] {String.class.getName()}, new String[] {"uuid_"},
			true);

		_finderPathCountByUuid = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] {String.class.getName()}, new String[] {"uuid_"},
			false);

		_finderPathWithPaginationFindByProfile = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByProfile",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"profileId"}, true);

		_finderPathWithoutPaginationFindByProfile = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByProfile",
			new String[] {Long.class.getName()}, new String[] {"profileId"},
			true);

		_finderPathCountByProfile = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByProfile",
			new String[] {Long.class.getName()}, new String[] {"profileId"},
			false);

		_finderPathWithPaginationFindByCarpentry = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByCarpentry",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"carpentryId"}, true);

		_finderPathWithoutPaginationFindByCarpentry = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByCarpentry",
			new String[] {Long.class.getName()}, new String[] {"carpentryId"},
			true);

		_finderPathCountByCarpentry = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCarpentry",
			new String[] {Long.class.getName()}, new String[] {"carpentryId"},
			false);
	}

	@Deactivate
	public void deactivate() {
		entityCache.removeCache(Profile_CarpentryImpl.class.getName());

		_argumentsResolverServiceRegistration.unregister();

		for (ServiceRegistration<FinderPath> serviceRegistration :
				_serviceRegistrations) {

			serviceRegistration.unregister();
		}
	}

	@Override
	@Reference(
		target = ghPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = ghPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = ghPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	private BundleContext _bundleContext;

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_PROFILE_CARPENTRY =
		"SELECT profile_Carpentry FROM Profile_Carpentry profile_Carpentry";

	private static final String _SQL_SELECT_PROFILE_CARPENTRY_WHERE =
		"SELECT profile_Carpentry FROM Profile_Carpentry profile_Carpentry WHERE ";

	private static final String _SQL_COUNT_PROFILE_CARPENTRY =
		"SELECT COUNT(profile_Carpentry) FROM Profile_Carpentry profile_Carpentry";

	private static final String _SQL_COUNT_PROFILE_CARPENTRY_WHERE =
		"SELECT COUNT(profile_Carpentry) FROM Profile_Carpentry profile_Carpentry WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "profile_Carpentry.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No Profile_Carpentry exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No Profile_Carpentry exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		Profile_CarpentryPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});
	private static final Set<String> _compoundPKColumnNames = SetUtil.fromArray(
		new String[] {"profileId", "carpentryId"});

	private FinderPath _createFinderPath(
		String cacheName, String methodName, String[] params,
		String[] columnNames, boolean baseModelResult) {

		FinderPath finderPath = new FinderPath(
			cacheName, methodName, params, columnNames, baseModelResult);

		if (!cacheName.equals(FINDER_CLASS_NAME_LIST_WITH_PAGINATION)) {
			_serviceRegistrations.add(
				_bundleContext.registerService(
					FinderPath.class, finderPath,
					MapUtil.singletonDictionary("cache.name", cacheName)));
		}

		return finderPath;
	}

	private Set<ServiceRegistration<FinderPath>> _serviceRegistrations =
		new HashSet<>();
	private ServiceRegistration<ArgumentsResolver>
		_argumentsResolverServiceRegistration;

	private static class Profile_CarpentryModelArgumentsResolver
		implements ArgumentsResolver {

		@Override
		public Object[] getArguments(
			FinderPath finderPath, BaseModel<?> baseModel, boolean checkColumn,
			boolean original) {

			String[] columnNames = finderPath.getColumnNames();

			if ((columnNames == null) || (columnNames.length == 0)) {
				if (baseModel.isNew()) {
					return FINDER_ARGS_EMPTY;
				}

				return null;
			}

			Profile_CarpentryModelImpl profile_CarpentryModelImpl =
				(Profile_CarpentryModelImpl)baseModel;

			long columnBitmask = profile_CarpentryModelImpl.getColumnBitmask();

			if (!checkColumn || (columnBitmask == 0)) {
				return _getValue(
					profile_CarpentryModelImpl, columnNames, original);
			}

			Long finderPathColumnBitmask = _finderPathColumnBitmasksCache.get(
				finderPath);

			if (finderPathColumnBitmask == null) {
				finderPathColumnBitmask = 0L;

				for (String columnName : columnNames) {
					finderPathColumnBitmask |=
						profile_CarpentryModelImpl.getColumnBitmask(columnName);
				}

				_finderPathColumnBitmasksCache.put(
					finderPath, finderPathColumnBitmask);
			}

			if ((columnBitmask & finderPathColumnBitmask) != 0) {
				return _getValue(
					profile_CarpentryModelImpl, columnNames, original);
			}

			return null;
		}

		private Object[] _getValue(
			Profile_CarpentryModelImpl profile_CarpentryModelImpl,
			String[] columnNames, boolean original) {

			Object[] arguments = new Object[columnNames.length];

			for (int i = 0; i < arguments.length; i++) {
				String columnName = columnNames[i];

				if (original) {
					arguments[i] =
						profile_CarpentryModelImpl.getColumnOriginalValue(
							columnName);
				}
				else {
					arguments[i] = profile_CarpentryModelImpl.getColumnValue(
						columnName);
				}
			}

			return arguments;
		}

		private static Map<FinderPath, Long> _finderPathColumnBitmasksCache =
			new ConcurrentHashMap<>();

	}

}