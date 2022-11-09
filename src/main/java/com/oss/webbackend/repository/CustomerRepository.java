package com.oss.webbackend.repository;

import com.oss.webbackend.model.Customer;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Slice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;



public interface CustomerRepository  extends JpaRepository<Customer, Long>
    //    , CustomerRepositoryCustom
{


    @Query(value = "select b from Customer b where b.cust >= :fromcust and  b.cust <= :tocust   ")
    Slice<Customer> findByCust2(@Param("fromcust") String fromcust, @Param("tocust") String tocust, Pageable pageable);

/*

    countQuery = "SELECT count(*) FROM USERS WHERE LASTNAME = ?1",
    nativeQuery = true)
 */


    @Query(value = "select b from Customer b where b.cust >= :fromcust or b.cust <= :tocust ")
    List<Customer> findByCust(@Param("fromcust") String fromcust, @Param("tocust") String tocust);



}