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
import org.jboss.openshift.quickstart.datavirt.remotecache.domain.Holdings;

/**
 * HoldingsMarshaller
 */
public class HoldingsMarshaller implements MessageMarshaller<Holdings> {

    @Override
    public Class<? extends Holdings> getJavaClass() {
        return Holdings.class;
    }

    @Override
    public String getTypeName() {
        return "quickstart.HOLDINGS";
    }

    @Override
    public Holdings readFrom(ProtoStreamReader reader) throws IOException {
        final Holdings retval = new Holdings();
        retval.setTransactionId(reader.readInt("TRANSACTION_ID"));
        retval.setAccountId(reader.readInt("ACCOUNT_ID"));
        retval.setProductId(reader.readInt("PRODUCT_ID"));
        retval.setPurchaseDate(reader.readDate("PURCHASE_DATE"));
        retval.setSharesCount(reader.readInt("SHARES_COUNT"));
        return retval;
    }

    @Override
    public void writeTo(ProtoStreamWriter writer, Holdings holding) throws IOException {
        writer.writeInt("TRANSACTION_ID", holding.getTransactionId());
        writer.writeInt("ACCOUNT_ID", holding.getAccountId());
        writer.writeInt("PRODUCT_ID", holding.getProductId());
        writer.writeDate("PURCHASE_DATE", holding.getPurchaseDate());
        writer.writeInt("SHARES_COUNT", holding.getSharesCount());
    }

}
