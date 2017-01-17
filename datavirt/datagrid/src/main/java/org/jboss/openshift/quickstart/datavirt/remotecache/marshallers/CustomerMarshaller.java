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
import org.jboss.openshift.quickstart.datavirt.remotecache.domain.Customer;

/**
 * CustomerMarshaller
 */
public class CustomerMarshaller implements MessageMarshaller<Customer> {

    @Override
    public Class<? extends Customer> getJavaClass() {
        return Customer.class;
    }

    @Override
    public String getTypeName() {
        return "quickstart.CUSTOMER";
    }

    @Override
    public Customer readFrom(ProtoStreamReader reader) throws IOException {
        final Customer retval = new Customer();
        retval.setSsn(reader.readString("SSN"));
        retval.setFirstName(reader.readString("FIRSTNAME"));
        retval.setLastName(reader.readString("LASTNAME"));
        retval.setStreetAddress(reader.readString("ST_ADDRESS"));
        retval.setApartmentNumber(reader.readString("APT_NUMBER"));
        retval.setCity(reader.readString("CITY"));
        retval.setState(reader.readString("STATE"));
        retval.setZipcode(reader.readString("ZIPCODE"));
        retval.setPhone(reader.readString("PHONE"));
        return retval;
    }

    @Override
    public void writeTo(ProtoStreamWriter writer, Customer customer) throws IOException {
        writer.writeString("SSN", customer.getSsn());
        writer.writeString("FIRSTNAME", customer.getFirstName());
        writer.writeString("LASTNAME", customer.getLastName());
        writer.writeString("ST_ADDRESS", customer.getStreetAddress());
        writer.writeString("APT_NUMBER", customer.getApartmentNumber());
        writer.writeString("CITY", customer.getCity());
        writer.writeString("STATE", customer.getState());
        writer.writeString("ZIPCODE", customer.getZipcode());
        writer.writeString("PHONE", customer.getPhone());
    }

}
