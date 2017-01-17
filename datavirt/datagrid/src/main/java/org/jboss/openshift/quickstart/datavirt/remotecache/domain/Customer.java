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
 * Customer
 */
@ProtoDoc("@Indexed")
@ProtoMessage(name = "CUSTOMER")
public class Customer {

    private String ssn;
    private String firstName;
    private String lastName;
    private String streetAddress;
    private String apartmentNumber;
    private String city;
    private String state;
    private String zipcode;
    private String phone;

    @ProtoDoc("@IndexedField")
    @ProtoField(number = 1, required = true, name = "SSN")
    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    @ProtoDoc("@IndexedField(index=false, store=false)")
    @ProtoField(number = 2, required = true, name = "FIRSTNAME")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @ProtoDoc("@IndexedField(index=false, store=false)")
    @ProtoField(number = 3, required = true, name = "LASTNAME")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @ProtoDoc("@IndexedField(index=false, store=false)")
    @ProtoField(number = 4, required = true, name = "ST_ADDRESS")
    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    @ProtoDoc("@IndexedField(index=false, store=false)")
    @ProtoField(number = 5, required = true, name = "APT_NUMBER")
    public String getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(String apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    @ProtoDoc("@IndexedField(index=false, store=false)")
    @ProtoField(number = 6, required = true, name = "CITY")
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @ProtoDoc("@IndexedField(index=false, store=false)")
    @ProtoField(number = 7, required = true, name = "STATE")
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @ProtoDoc("@IndexedField(index=false, store=false)")
    @ProtoField(number = 8, required = true, name = "ZIPCODE")
    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    @ProtoDoc("@IndexedField(index=false, store=false)")
    @ProtoField(number = 9, required = true, name = "PHONE")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

}
