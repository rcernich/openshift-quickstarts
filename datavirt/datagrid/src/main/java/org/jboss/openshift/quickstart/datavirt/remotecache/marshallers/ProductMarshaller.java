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
import org.jboss.openshift.quickstart.datavirt.remotecache.domain.Product;

/**
 * ProductMarshaller
 */
public class ProductMarshaller implements MessageMarshaller<Product> {

    @Override
    public Class<? extends Product> getJavaClass() {
        return Product.class;
    }

    @Override
    public String getTypeName() {
        return "quickstart.PRODUCT";
    }

    @Override
    public Product readFrom(ProtoStreamReader reader) throws IOException {
        final Product retval = new Product();
        retval.setId(reader.readInt("ID"));
        retval.setSymbol(reader.readString("SYMBOL"));
        retval.setCompanyName(reader.readString("COMPANY_NAME"));
        return retval;
    }

    @Override
    public void writeTo(ProtoStreamWriter writer, Product product) throws IOException {
        writer.writeInt("ID", product.getId());
        writer.writeString("SYMBOL", product.getSymbol());
        writer.writeString("COMPANY_NAME", product.getCompanyName());
    }

}
