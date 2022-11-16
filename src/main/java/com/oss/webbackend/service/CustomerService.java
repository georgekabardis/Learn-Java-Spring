package com.oss.webbackend.service;

import com.oss.webbackend.config.OpswTransManager;
import com.oss.webbackend.mapper.CustomerMapper;
import com.oss.webbackend.model.Customer;
import com.oss.webbackend.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import org.springframework.dao.DataAccessException;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

//defining the business logic
@Service
public class CustomerService
{

  @Autowired
  CustomerRepository customerRepo;
  @Autowired
  CustomerMapper customerMapper;


  @Autowired
  OpswTransManager opswTransManager;
  
  
  @Autowired
  private PlatformTransactionManager transactionManager;

  public List<Customer> getAllCustomers()
  {
    List<Customer> listCustomers = customerRepo.findAll();
    return listCustomers;
  }

  public Optional<Customer> getCustomerById(Long id)
  {
    return customerRepo.findById(id);

  }

  public List<Customer> getCustomerByCust(String fromcust, String tocust)
  {

    List<Customer> cust1 = customerRepo.findByCust(fromcust, tocust);

    return cust1;

  }

  public Page<Customer> getCustomerByCust2(String fromcust, String tocust)
  {
// https://www.baeldung.com/spring-data-jpa-iterate-large-result-sets

    /*
        Slice is a sized chunk of data with an indication of whether there is more data available.
        Spring supports Slice as a return type of the query method.
         Pageable parameter must be specified by the same query method.
         Slice avoids triggering a count query to calculate the overall number of pages as that might be expensive.

     */
    int pageNo = 1;
    int pageSize = 12;
    Pageable pageable = PageRequest.of(pageNo, pageSize);
    Page<Customer> list1 = customerRepo.findByCust2(fromcust, tocust, pageable);

    //Slice<Customer> slice = customerRepo.findByCust2(fromcust, tocust, pageable);
    //List<Customer> list1 = slice.getContent();

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

  public List<Customer> getCust5(String fromcust, String tocust)
  {

    List<Customer> list1 = customerRepo.getCust5(fromcust, tocust);

    return list1;

  }

  //public List<CustomerDto> getAllCustomerDtos(){
  //     return customerMapper.toCustomerDtos(customerRepo.findAll());
  // }


  public Customer customFindMethod(Long id)
  {
   // Customer customer = null;
    
    Customer customer = (Customer) opswTransManager.getEntityManager().createQuery("SELECT c FROM Customer c WHERE c.cmacco = :id")
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
  public void UpdateCyst01()
  {

    TransactionDefinition def = new DefaultTransactionDefinition();
   
    TransactionStatus status = transactionManager.getTransaction(def);
    try
    {

      transactionManager.commit(status);
    }
    catch (DataAccessException e)
    {
      System.out.println("Error in creating record, rolling back");
      transactionManager.rollback(status);
      throw e;
    }

  }

}
