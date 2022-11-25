package com.oss.webbackend.repository;

import com.oss.webbackend.dto.GkCustomerDto;
import com.oss.webbackend.model.Customer;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

// PROSOXH  AYTH H CLAS PREPEI NA EXEI TO IDIO ONOMA ME TO REPOSITORY KAI STO TELOS AND EXEI Impl
public class CustomerRepositoryImpl implements CustomerRepositoryCustom {

    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public List<Customer> getCust5(String fromcust, String tocust) {

        Query q1 = entityManager.createQuery("SELECT b from Customer b"+
                " where b.cust >= :fromcust and  b.cust <= :tocust"
            ,Customer.class);
    /*
        q.setFirstResult(pager.getFromIndex());
        q.setMaxResults(pager.getPageRows());
    list = (List<Customer>) q.getResultList();
*./

     */
        q1.setParameter("fromcust",fromcust);
        q1.setParameter("tocust", tocust);


        List<Customer> list1 = q1
                .setFirstResult(1)
                 .setMaxResults(4)
                .getResultList();
        return list1;

    }


    @Override
  public   GkCustomerDto   getGkCustomerDto()
    {
        GkCustomerDto  gkCustomerDto = new GkCustomerDto();
        return gkCustomerDto;
    }    ;

}
