package com.example.crudrestapi.service;

import com.example.crudrestapi.entity.Customer;

import java.util.List;

public interface CustomerService {


    public List<Customer> findAll();

    public Customer findById(int theId);

    public void save(Customer theEmployee);

    public void deleteById(int theId);

    public List<Customer> searchBy(String theName);

}
