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
 * Holding
 */
@ProtoDoc("@Indexed")
@ProtoMessage(name = "HOLDINGS")
public class Holdings {

    private int transactionId;
    private int accountId;
    private int productId;
    private Date purchaseDate;
    private int sharesCount;

    @ProtoDoc("@IndexedField")
    @ProtoField(number = 1, required = true, name = "TRANSACTION_ID")
    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    @ProtoDoc("@IndexedField")
    @ProtoField(number = 2, required = true, name = "ACCOUNT_ID")
    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    @ProtoDoc("@IndexedField")
    @ProtoField(number = 3, required = true, name = "PRODUCT_ID")
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    @ProtoDoc("@IndexedField(index=false, store=false)")
    @ProtoField(number = 4, required = true, name = "PURCHASE_DATE", type = Type.INT64)
    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    @ProtoDoc("@IndexedField(index=false, store=false)")
    @ProtoField(number = 5, required = true, name = "SHARES_COUNT")
    public int getSharesCount() {
        return sharesCount;
    }

    public void setSharesCount(int sharesCount) {
        this.sharesCount = sharesCount;
    }

}
