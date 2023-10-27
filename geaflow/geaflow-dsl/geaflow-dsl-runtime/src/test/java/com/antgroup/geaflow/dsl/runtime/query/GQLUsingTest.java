/*
 * Copyright 2023 AntGroup CO., Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 */

package com.antgroup.geaflow.dsl.runtime.query;

import com.antgroup.geaflow.common.config.keys.FrameworkConfigKeys;
import org.testng.annotations.Test;

public class GQLUsingTest {

    @Test
    public void testUsing_001() throws Exception {
        QueryTester
            .build()
            .withConfig(FrameworkConfigKeys.BATCH_NUMBER_PER_CHECKPOINT.getKey(), 1)
            .withQueryPath("/query/gql_using_001_ddl.sql")
            .execute()
            .withQueryPath("/query/gql_using_001.sql")
            .execute()
            .checkSinkResult();
    }

    @Test
    public void testUsing_002() throws Exception {
        QueryTester
            .build()
            .withQueryPath("/query/gql_using_002.sql")
            .execute()
            .checkSinkResult();
    }

    @Test
    public void testUsingTemporary_001() throws Exception {
        QueryTester
            .build()
            .withQueryPath("/query/gql_temporary_001.sql")
            .execute()
            .checkSinkResult();
    }

    @Test
    public void testUsingTemporary_002() throws Exception {
        QueryTester
            .build()
            .withQueryPath("/query/gql_temporary_002.sql")
            .execute()
            .checkSinkResult();
    }
}
