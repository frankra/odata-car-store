package com.frank.odatacarstore.annotation.model;

import org.apache.olingo.odata2.api.annotation.edm.EdmComplexType;
import org.apache.olingo.odata2.api.annotation.edm.EdmProperty;

/**
 *
 */
@EdmComplexType(name = "Address", namespace = "OData")
public class Address {

  @EdmProperty
  private String street;
  @EdmProperty
  private String city;
  @EdmProperty
  private String zipCode;
  @EdmProperty
  private String country;

  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getZipCode() {
    return zipCode;
  }

  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  @Override
  public String toString() {
    return "Address{" + "street=" + street + ", city=" + city + ", zipCode=" + zipCode + ", country=" + country + '}';
  }

}
