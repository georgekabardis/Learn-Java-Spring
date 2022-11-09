package com.oss.webbackend.service;

import com.oss.webbackend.dto.CustomerDto;
import com.oss.webbackend.mapper.CustomerMapper;
import com.oss.webbackend.model.Customer;
import com.oss.webbackend.repository.CustomerRepository;
import oracle.net.aso.b;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.*;
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

    public Optional<Customer> getCustomerById(Long id) {
        return customerRepo.findById(id);

    }


    public List<Customer> getCustomerByCust(String fromcust, String tocust) {

        List<Customer> cust1 = customerRepo.findByCust(fromcust, tocust);

        return cust1;

    }

    public List<Customer> getCustomerByCust2(String fromcust, String tocust) {

        int pageNo = 0;
        int pageSize = 5;
        Pageable pageable = PageRequest.of(pageNo, pageSize);
        Slice<Customer> slice = customerRepo.findByCust2(fromcust, tocust, pageable);

        List<Customer> list1 = slice.getContent();

        /*
        while(slice.hasNext()) {
            slice = customerRepo.findByCust2(fromcust, tocust,  slice.nextPageable());

        }

         */



        return list1;
       /*
         List<Student> studentsInBatch = slice.getContent();
    studentsInBatch.forEach(emailService::sendEmailToStudent);

    while(slice.hasNext()) {
        slice = repository.findAllByFirstName(firstName, slice.nextPageable());
        slice.get().forEach(emailService::sendEmailToStudent);
    }
        */



    }

    public List<Customer> getCust5(String fromcust, String tocust) {

        List<Customer> list1 =    customerRepo.getCust5(fromcust, tocust);

        return list1;


    }


    //public List<CustomerDto> getAllCustomerDtos(){
    //     return customerMapper.toCustomerDtos(customerRepo.findAll());
    // }

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
