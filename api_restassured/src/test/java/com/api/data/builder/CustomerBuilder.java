package com.api.data.builder;

import com.api.data.model.Customer;
import com.api.data.secret.Secrets;

public class CustomerBuilder {
    private String email ;
    private String password;

    public CustomerBuilder setCustomer(String name) {
        this.email = name+"@tripstack.test";
        this.password = Secrets.get("PASSWORD");
        return this;
    }

    public Customer build(){
        return new Customer(this.email,this.password);
    }


}
