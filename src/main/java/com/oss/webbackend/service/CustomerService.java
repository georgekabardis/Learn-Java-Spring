package com.oss.webbackend.service;

import com.oss.webbackend.dto.CustomerDto;
import com.oss.webbackend.mapper.CustomerMapper;
import com.oss.webbackend.model.Customer;
import com.oss.webbackend.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;


//defining the business logic
@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepo;
    @Autowired
    CustomerMapper customerMapper;

    public List<Customer> getAllCustomers() {
        List<Customer> listCustomers = customerRepo.findAll();
        return listCustomers;
    }

    public Optional<Customer> getCustomerById(Long id){
       return customerRepo.findById(id);

    }

    public List<CustomerDto> getAllCustomerDtos(){
        return customerMapper.toCustomerDtos(customerRepo.findAll());
    }

    @Autowired
    private EntityManager entityManager;

    public Customer customFindMethod(Long id) {
        Customer customer = (Customer) entityManager.createQuery("SELECT c FROM Customer c WHERE c.cmacco = :id")
                .setParameter("id", id)
                .getSingleResult();

        return customer;
    }

//    public Customer customFindMethodConn(CatEjbConnection connection, Long id){
//        EntityManager em = (EntityManager) connection.getConnection();
//        Customer customer = (Customer) em.createQuery("SELECT c FROM Customer c WHERE c.cmacco = :id")
//                .setParameter("id", id)
//                .getSingleResult();
//
//        return customer;
//
//    }

}
