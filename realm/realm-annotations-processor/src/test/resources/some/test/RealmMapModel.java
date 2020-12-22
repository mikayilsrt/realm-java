/*
 * Copyright 2020 Realm Inc.
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
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package some.test;

import io.realm.Mixed;
import io.realm.RealmMap;
import io.realm.RealmObject;

public class RealmMapModel extends RealmObject {

    private RealmMap<String, Mixed> myMap;      // this fails in phase 1

    public RealmMapModel() {
        // no-op
    }

    public RealmMap<String, Mixed> getMyMap() {
        return myMap;
    }

    public void setMyMap(RealmMap<String, Mixed> map) {
        this.myMap = map;
    }
}