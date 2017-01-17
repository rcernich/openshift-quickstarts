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

import java.util.Date;

import org.infinispan.protostream.annotations.ProtoDoc;
import org.infinispan.protostream.annotations.ProtoField;
import org.infinispan.protostream.annotations.ProtoMessage;
import org.infinispan.protostream.descriptors.Type;

/**
 * Account
 */
@ProtoDoc("@Indexed")
@ProtoMessage(name = "ACCOUNT")
public class Account {

    private int id;
    private String ssn;
    private String status;
    private String type;
    private Date dateOpened;
    private Date dateClosed;

    @ProtoDoc("@IndexedField")
    @ProtoField(number = 1, required = true, name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @ProtoDoc("@IndexedField")
    @ProtoField(number = 2, required = true, name = "SSN")
    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    @ProtoDoc("@IndexedField(index=false, store=false)")
    @ProtoField(number = 3, required = true, name = "STATUS")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @ProtoDoc("@IndexedField(index=false, store=false)")
    @ProtoField(number = 4, required = true, name = "TYPE")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @ProtoDoc("@IndexedField(index=false, store=false)")
    @ProtoField(number = 5, required = true, name = "DATEOPENED", type = Type.INT64)
    public Date getDateOpened() {
        return dateOpened;
    }

    public void setDateOpened(Date dateOpened) {
        this.dateOpened = dateOpened;
    }

    @ProtoDoc("@IndexedField(index=false, store=false)")
    @ProtoField(number = 6, required = false, name = "DATECLOSED", type = Type.INT64)
    public Date getDateClosed() {
        return dateClosed;
    }

    public void setDateClosed(Date dateClosed) {
        this.dateClosed = dateClosed;
    }

}
