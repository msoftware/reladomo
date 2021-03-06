
/*
 Copyright 2016 Goldman Sachs.
 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing,
 software distributed under the License is distributed on an
 "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 KIND, either express or implied.  See the License for the
 specific language governing permissions and limitations
 under the License.
 */

package com.gs.fw.common.mithra.test;

import com.gs.fw.common.mithra.MithraDatabaseObject;

import java.util.List;

public interface MithraTestConnectionManager
{
    public boolean addConnectionManagerForSource(String source);
    public boolean addConnectionManagerForSource(Object source, String databaseName);
    public String getDefaultSource();
    public String getConnectionManagerIdentifier();
    public void createSchema(String databaseName, String schemaName, Class sourceAttributeType);
    public void addTestDbConfiguration(TestDatabaseConfiguration testDbConfiguration);
    public void setUpDatabases(MithraTestResource testResource, boolean createTables);
    public void tearDownDatabases(MithraTestResource testResource);
    public void addDatabaseObjectsToTestDatabases(List<MithraDatabaseObject> databaseObjects, MithraTestResource mtr);
    boolean hasConnectionManagerForSource(String source);
    public void fullyShutdown();
}
