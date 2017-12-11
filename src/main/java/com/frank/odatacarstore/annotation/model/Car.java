package com.frank.odatacarstore.annotation.model;

import java.util.Date;
import org.apache.olingo.odata2.api.annotation.edm.EdmEntitySet;
import org.apache.olingo.odata2.api.annotation.edm.EdmEntityType;
import org.apache.olingo.odata2.api.annotation.edm.EdmKey;
import org.apache.olingo.odata2.api.annotation.edm.EdmNavigationProperty;
import org.apache.olingo.odata2.api.annotation.edm.EdmProperty;

/**
 *
 */
@EdmEntityType(namespace = "OData")
@EdmEntitySet(name = "Cars")
public class Car {

  @EdmKey
  @EdmProperty
  private String id;
  @EdmProperty
  private String model;
  @EdmNavigationProperty
  private Manufacturer manufacturer;
  @EdmNavigationProperty
  private User owner;
  @EdmProperty
  private Double price;
  @EdmProperty
  private Integer modelYear;
  @EdmProperty
  private Date updated;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public Manufacturer getManufacturer() {
    return manufacturer;
  }

  public void setManufacturer(Manufacturer manufacturer) {
    this.manufacturer = manufacturer;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public int getModelYear() {
    return modelYear;
  }

  public void setModelYear(int modelYear) {
    this.modelYear = modelYear;
  }

  public Date getUpdated() {
    return updated;
  }

  public void setUpdated(Date updated) {
    this.updated = updated;
  }

  public User getOwner() {
    return owner;
  }

  public void setOwner(User user) {
    this.owner = user;
  }

  @Override
  public String toString() {
    return "Car{" + "id=" + id + ", model=" + model + ", manufacturer id=" + manufacturer.getId() +
            ", price=" + price + ", modelYear=" + modelYear + ", updated=" + updated + '}';
  }
}
