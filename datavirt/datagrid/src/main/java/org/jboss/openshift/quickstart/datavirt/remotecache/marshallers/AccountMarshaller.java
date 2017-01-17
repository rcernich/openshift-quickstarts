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
package org.jboss.openshift.quickstart.datavirt.remotecache.marshallers;

import java.io.IOException;

import org.infinispan.protostream.MessageMarshaller;
import org.jboss.openshift.quickstart.datavirt.remotecache.domain.Account;

/**
 * AccountMarshaller
 */
public class AccountMarshaller implements MessageMarshaller<Account> {

    @Override
    public Class<? extends Account> getJavaClass() {
        return Account.class;
    }

    @Override
    public String getTypeName() {
        return "quickstart.ACCOUNT";
    }

    @Override
    public Account readFrom(ProtoStreamReader reader) throws IOException {
        final Account retval = new Account();
        retval.setId(reader.readInt("ID"));
        retval.setSsn(reader.readString("SSN"));
        retval.setStatus(reader.readString("STATUS"));
        retval.setType(reader.readString("TYPE"));
        retval.setDateOpened(reader.readDate("DATEOPENED"));
        retval.setDateClosed(reader.readDate("DATECLOSED"));
        return retval;
    }

    @Override
    public void writeTo(ProtoStreamWriter writer, Account account) throws IOException {
        writer.writeInt("ID", account.getId());
        writer.writeString("SSN", account.getSsn());
        writer.writeString("STATUS", account.getStatus());
        writer.writeString("TYPE", account.getType());
        writer.writeDate("DATEOPENED", account.getDateOpened());
        writer.writeDate("DATECLOSED", account.getDateClosed());
    }

}
