package com.pluralsight.repository;

import com.pluralsight.model.Customer;

import java.util.ArrayList;
import java.util.List;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {

    @Override
    public List<Customer> findAll() {
        List<Customer> customerList = new ArrayList<>();

        Customer cust = new Customer();
        cust.setFirstName("Saumya");
        cust.setLastName("Shekhar");
        customerList.add(cust);
        return customerList;
    }
}
