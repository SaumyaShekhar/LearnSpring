package com.pluralsight.repository;

import com.pluralsight.model.Customer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {

    @Value("${dbUserName}")
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
