/*
 *  Copyright (c) 2017 Otávio Santana and others
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v1.0
 *   and Apache License v2.0 which accompanies this distribution.
 *   The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 *   and the Apache License v2.0 is available at http://www.opensource.org/licenses/apache2.0.php.
 *
 *   You may elect to redistribute this code under either of these licenses.
 *
 *   Contributors:
 *
 *   Otavio Santana
 */

package org.jnosql.diana.riak.key;

import org.jnosql.diana.api.key.BucketManagerFactory;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;


public class RiakKeyValueConfigurationTest {

    private RiakKeyValueConfiguration configuration;

    @Before
    public void setUp() {
        configuration = new RiakKeyValueConfiguration();
    }

    @Test(expected = NullPointerException.class)
    public void shouldReturnErroWhenNodeIsNull() {
        configuration.add((String) null);
    }

    @Test
    public void shouldCreateKeyValueFactoryFromFile() {
        BucketManagerFactory managerFactory = configuration.get();
        assertNotNull(managerFactory);
    }
}