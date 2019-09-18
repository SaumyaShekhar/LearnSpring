package com.pluralsight.repository;

import com.pluralsight.model.Customer;

import java.util.ArrayList;
import java.util.List;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {

    public String getDbUserName() {
        return dbUserName;
    }

    public void setDbUserName(String dbUserName) {
        this.dbUserName = dbUserName;
    }

    private String dbUserName;
    @Override
    public List<Customer> findAll() {
        System.out.println(dbUserName);
        List<Customer> customerList = new ArrayList<>();

        Customer cust = new Customer();
        cust.setFirstName("Saumya");
        cust.setLastName("Shekhar");
        customerList.add(cust);
        return customerList;
    }
}
