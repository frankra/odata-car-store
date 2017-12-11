package com.frank.odatacarstore.annotation.model;

import com.frank.odatacarstore.annotation.model.User;
import org.apache.olingo.odata2.api.annotation.edm.EdmEntitySet;
import org.apache.olingo.odata2.api.annotation.edm.EdmEntityType;
import org.apache.olingo.odata2.api.annotation.edm.EdmKey;
import org.apache.olingo.odata2.api.annotation.edm.EdmNavigationProperty;
import org.apache.olingo.odata2.api.annotation.edm.EdmNavigationProperty.Multiplicity;
import org.apache.olingo.odata2.api.annotation.edm.EdmProperty;

@EdmEntityType(namespace = "OData")
@EdmEntitySet(name = "Admins")
public class Admin extends User{

    public Admin(){
        super();
    }

    public Admin(String username, String password, String email) {
        super(username, password, email);
    }
}