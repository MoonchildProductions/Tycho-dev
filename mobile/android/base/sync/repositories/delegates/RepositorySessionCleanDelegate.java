/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

package org.mozilla.goanna.sync.repositories.delegates;

import org.mozilla.goanna.sync.repositories.Repository;

public interface RepositorySessionCleanDelegate {
  public void onCleaned(Repository repo);
  public void onCleanFailed(Repository repo, Exception ex);
}
