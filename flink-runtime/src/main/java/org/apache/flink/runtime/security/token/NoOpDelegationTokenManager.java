/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.flink.runtime.security.token;

import org.apache.hadoop.security.Credentials;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** {@link DelegationTokenManager} implementation which does nothing. */
public class NoOpDelegationTokenManager implements DelegationTokenManager {

    private static final Logger LOG = LoggerFactory.getLogger(NoOpDelegationTokenManager.class);

    public NoOpDelegationTokenManager() {
        LOG.debug("NoOpDelegationTokenManager");
    }

    @Override
    public void obtainDelegationTokens(Credentials credentials) {
        LOG.debug("obtainDelegationTokens");
    }

    @Override
    public void start(DelegationTokenListener delegationTokenListener) {
        LOG.debug("start");
    }

    @Override
    public void stop() {
        LOG.debug("stop");
    }
}
