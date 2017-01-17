/**
 *  Copyright 2017 Red Hat, Inc.
 *
 *  Red Hat licenses this file to you under the Apache License, version
 *  2.0 (the "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 *  implied.  See the License for the specific language governing
 *  permissions and limitations under the License.
 */
package org.jboss.openshift.quickstart.datavirt.remotecache.domain;

import org.infinispan.protostream.annotations.ProtoDoc;
import org.infinispan.protostream.annotations.ProtoField;
import org.infinispan.protostream.annotations.ProtoMessage;

/**
 * Product
 */
@ProtoDoc("@Indexed")
@ProtoMessage(name = "PRODUCT")
public class Product {

    private int id;
    private String symbol;
    private String companyName;

    @ProtoDoc("@IndexedField")
    @ProtoField(number = 1, required = true, name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @ProtoDoc("@IndexedField")
    @ProtoField(number = 2, required = true, name = "SYMBOL")
    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    @ProtoDoc("@IndexedField(index=false, store=false)")
    @ProtoField(number = 3, required = true, name = "COMPANY_NAME")
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

}
