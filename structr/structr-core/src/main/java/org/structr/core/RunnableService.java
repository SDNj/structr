/*
 *  Copyright (C) 2010-2012 Axel Morgner, structr <structr@structr.org>
 *
 *  This file is part of structr <http://structr.org>.
 *
 *  structr is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  structr is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with structr.  If not, see <http://www.gnu.org/licenses/>.
 */



package org.structr.core;

/**
 * A service that can be run in a separate thread. It is a good practice to
 * let your RunnableService implementation extend java.lang.Thread and map
 * the startService() and stopService() methods appropriately.
 *
 * @author Christian Morgner
 */
public interface RunnableService extends Service {

	public void startService();

	public void stopService();

	/**
	 * Return true if the service should be started automatically
	 * on container startup
	 *
	 * @return
	 */
	public boolean runOnStartup();

	//~--- get methods ----------------------------------------------------

	@Override
	public boolean isRunning();
}
