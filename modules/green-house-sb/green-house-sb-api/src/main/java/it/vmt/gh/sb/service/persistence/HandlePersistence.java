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

package it.vmt.gh.sb.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import it.vmt.gh.sb.exception.NoSuchHandleException;
import it.vmt.gh.sb.model.Handle;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the handle service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see HandleUtil
 * @generated
 */
@ProviderType
public interface HandlePersistence extends BasePersistence<Handle> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link HandleUtil} to access the handle persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the handles where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching handles
	 */
	public java.util.List<Handle> findByUuid(String uuid);

	/**
	 * Returns a range of all the handles where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HandleModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of handles
	 * @param end the upper bound of the range of handles (not inclusive)
	 * @return the range of matching handles
	 */
	public java.util.List<Handle> findByUuid(String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the handles where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HandleModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of handles
	 * @param end the upper bound of the range of handles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching handles
	 */
	public java.util.List<Handle> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Handle>
			orderByComparator);

	/**
	 * Returns an ordered range of all the handles where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HandleModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of handles
	 * @param end the upper bound of the range of handles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching handles
	 */
	public java.util.List<Handle> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Handle>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first handle in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching handle
	 * @throws NoSuchHandleException if a matching handle could not be found
	 */
	public Handle findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Handle>
				orderByComparator)
		throws NoSuchHandleException;

	/**
	 * Returns the first handle in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching handle, or <code>null</code> if a matching handle could not be found
	 */
	public Handle fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Handle>
			orderByComparator);

	/**
	 * Returns the last handle in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching handle
	 * @throws NoSuchHandleException if a matching handle could not be found
	 */
	public Handle findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Handle>
				orderByComparator)
		throws NoSuchHandleException;

	/**
	 * Returns the last handle in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching handle, or <code>null</code> if a matching handle could not be found
	 */
	public Handle fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Handle>
			orderByComparator);

	/**
	 * Returns the handles before and after the current handle in the ordered set where uuid = &#63;.
	 *
	 * @param handleId the primary key of the current handle
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next handle
	 * @throws NoSuchHandleException if a handle with the primary key could not be found
	 */
	public Handle[] findByUuid_PrevAndNext(
			long handleId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Handle>
				orderByComparator)
		throws NoSuchHandleException;

	/**
	 * Removes all the handles where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of handles where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching handles
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the handle where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchHandleException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching handle
	 * @throws NoSuchHandleException if a matching handle could not be found
	 */
	public Handle findByUUID_G(String uuid, long groupId)
		throws NoSuchHandleException;

	/**
	 * Returns the handle where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching handle, or <code>null</code> if a matching handle could not be found
	 */
	public Handle fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the handle where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching handle, or <code>null</code> if a matching handle could not be found
	 */
	public Handle fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the handle where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the handle that was removed
	 */
	public Handle removeByUUID_G(String uuid, long groupId)
		throws NoSuchHandleException;

	/**
	 * Returns the number of handles where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching handles
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the handles where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching handles
	 */
	public java.util.List<Handle> findByUuid_C(String uuid, long companyId);

	/**
	 * Returns a range of all the handles where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HandleModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of handles
	 * @param end the upper bound of the range of handles (not inclusive)
	 * @return the range of matching handles
	 */
	public java.util.List<Handle> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the handles where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HandleModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of handles
	 * @param end the upper bound of the range of handles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching handles
	 */
	public java.util.List<Handle> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Handle>
			orderByComparator);

	/**
	 * Returns an ordered range of all the handles where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HandleModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of handles
	 * @param end the upper bound of the range of handles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching handles
	 */
	public java.util.List<Handle> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Handle>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first handle in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching handle
	 * @throws NoSuchHandleException if a matching handle could not be found
	 */
	public Handle findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Handle>
				orderByComparator)
		throws NoSuchHandleException;

	/**
	 * Returns the first handle in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching handle, or <code>null</code> if a matching handle could not be found
	 */
	public Handle fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Handle>
			orderByComparator);

	/**
	 * Returns the last handle in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching handle
	 * @throws NoSuchHandleException if a matching handle could not be found
	 */
	public Handle findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Handle>
				orderByComparator)
		throws NoSuchHandleException;

	/**
	 * Returns the last handle in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching handle, or <code>null</code> if a matching handle could not be found
	 */
	public Handle fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Handle>
			orderByComparator);

	/**
	 * Returns the handles before and after the current handle in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param handleId the primary key of the current handle
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next handle
	 * @throws NoSuchHandleException if a handle with the primary key could not be found
	 */
	public Handle[] findByUuid_C_PrevAndNext(
			long handleId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Handle>
				orderByComparator)
		throws NoSuchHandleException;

	/**
	 * Removes all the handles where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of handles where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching handles
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns the handle where name = &#63; or throws a <code>NoSuchHandleException</code> if it could not be found.
	 *
	 * @param name the name
	 * @return the matching handle
	 * @throws NoSuchHandleException if a matching handle could not be found
	 */
	public Handle findByName(String name) throws NoSuchHandleException;

	/**
	 * Returns the handle where name = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param name the name
	 * @return the matching handle, or <code>null</code> if a matching handle could not be found
	 */
	public Handle fetchByName(String name);

	/**
	 * Returns the handle where name = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param name the name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching handle, or <code>null</code> if a matching handle could not be found
	 */
	public Handle fetchByName(String name, boolean useFinderCache);

	/**
	 * Removes the handle where name = &#63; from the database.
	 *
	 * @param name the name
	 * @return the handle that was removed
	 */
	public Handle removeByName(String name) throws NoSuchHandleException;

	/**
	 * Returns the number of handles where name = &#63;.
	 *
	 * @param name the name
	 * @return the number of matching handles
	 */
	public int countByName(String name);

	/**
	 * Returns the handle where name = &#63; or throws a <code>NoSuchHandleException</code> if it could not be found.
	 *
	 * @param name the name
	 * @return the matching handle
	 * @throws NoSuchHandleException if a matching handle could not be found
	 */
	public Handle findByCode(String name) throws NoSuchHandleException;

	/**
	 * Returns the handle where name = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param name the name
	 * @return the matching handle, or <code>null</code> if a matching handle could not be found
	 */
	public Handle fetchByCode(String name);

	/**
	 * Returns the handle where name = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param name the name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching handle, or <code>null</code> if a matching handle could not be found
	 */
	public Handle fetchByCode(String name, boolean useFinderCache);

	/**
	 * Removes the handle where name = &#63; from the database.
	 *
	 * @param name the name
	 * @return the handle that was removed
	 */
	public Handle removeByCode(String name) throws NoSuchHandleException;

	/**
	 * Returns the number of handles where name = &#63;.
	 *
	 * @param name the name
	 * @return the number of matching handles
	 */
	public int countByCode(String name);

	/**
	 * Caches the handle in the entity cache if it is enabled.
	 *
	 * @param handle the handle
	 */
	public void cacheResult(Handle handle);

	/**
	 * Caches the handles in the entity cache if it is enabled.
	 *
	 * @param handles the handles
	 */
	public void cacheResult(java.util.List<Handle> handles);

	/**
	 * Creates a new handle with the primary key. Does not add the handle to the database.
	 *
	 * @param handleId the primary key for the new handle
	 * @return the new handle
	 */
	public Handle create(long handleId);

	/**
	 * Removes the handle with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param handleId the primary key of the handle
	 * @return the handle that was removed
	 * @throws NoSuchHandleException if a handle with the primary key could not be found
	 */
	public Handle remove(long handleId) throws NoSuchHandleException;

	public Handle updateImpl(Handle handle);

	/**
	 * Returns the handle with the primary key or throws a <code>NoSuchHandleException</code> if it could not be found.
	 *
	 * @param handleId the primary key of the handle
	 * @return the handle
	 * @throws NoSuchHandleException if a handle with the primary key could not be found
	 */
	public Handle findByPrimaryKey(long handleId) throws NoSuchHandleException;

	/**
	 * Returns the handle with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param handleId the primary key of the handle
	 * @return the handle, or <code>null</code> if a handle with the primary key could not be found
	 */
	public Handle fetchByPrimaryKey(long handleId);

	/**
	 * Returns all the handles.
	 *
	 * @return the handles
	 */
	public java.util.List<Handle> findAll();

	/**
	 * Returns a range of all the handles.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HandleModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of handles
	 * @param end the upper bound of the range of handles (not inclusive)
	 * @return the range of handles
	 */
	public java.util.List<Handle> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the handles.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HandleModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of handles
	 * @param end the upper bound of the range of handles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of handles
	 */
	public java.util.List<Handle> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Handle>
			orderByComparator);

	/**
	 * Returns an ordered range of all the handles.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HandleModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of handles
	 * @param end the upper bound of the range of handles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of handles
	 */
	public java.util.List<Handle> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Handle>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the handles from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of handles.
	 *
	 * @return the number of handles
	 */
	public int countAll();

}