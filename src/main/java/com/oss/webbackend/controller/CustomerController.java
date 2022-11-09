package com.oss.webbackend.controller;

import com.oss.webbackend.dto.CustomerDto;
import com.oss.webbackend.model.Customer;
import com.oss.webbackend.service.CustomerService;
import com.oss.webbackend.util.CatEjbConnectionBridge;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.Optional;

@RestController
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @PersistenceContext
    private EntityManager em;

    @GetMapping({"/", "index.html"})
    public String index() {
        return "Hello World";
    }

    @GetMapping("/customers")
    @ResponseBody
    public List<Customer> listAll(Model model) {
        List<Customer> listCustomers = customerService.getAllCustomers();
//        model.addAttribute("listCustomers", listCustomers);
        return listCustomers;
    }

    @GetMapping("/customer01/{id}")
    @ResponseBody
    public Customer customerById01(@PathVariable long id) {
        Customer customer = customerService.customFindMethod(id);
//        CatEjbConnectionBridge connectionBridge = new CatEjbConnectionBridge();
//        connectionBridge.setConnection(em);
//        Customer customer = customerService.customFindMethodConn(connectionBridge, id);
        return customer;
    }




    @GetMapping("/customerByCust")
    @ResponseBody
    public List<Customer> customerByCust(@RequestParam  String fromcust,@RequestParam  String tocust) {
        List<Customer> customer = customerService.getCustomerByCust(fromcust,tocust);
//        CatEjbConnectionBridge connectionBridge = new CatEjbConnectionBridge();
//        connectionBridge.setConnection(em);
//        Customer customer = customerService.customFindMethodConn(connectionBridge, id);
        return customer;
    }


    @GetMapping("/customerByCust2")
    @ResponseBody
    public List<Customer> customerByCust2(@RequestParam String fromcust, @RequestParam  String tocust) {
        List<Customer> customer = customerService.getCustomerByCust2(fromcust,tocust);
//        CatEjbConnectionBridge connectionBridge = new CatEjbConnectionBridge();
//        connectionBridge.setConnection(em);
//        Customer customer = customerService.customFindMethodConn(connectionBridge, id);
        return customer;
    }

/*
    @GetMapping("/customerByCust3")
    @ResponseBody
    public List<Customer> customerByCust3(@RequestParam  String fromcust,@RequestParam  String tocust) {
        List<Customer> customer = customerService.getCustcc(fromcust,tocust);
//        CatEjbConnectionBridge connectionBridge = new CatEjbConnectionBridge();
//        connectionBridge.setConnection(em);
//        Customer customer = customerService.customFindMethodConn(connectionBridge, id);
        return customer;
    }
*/


    @GetMapping("/customer")
    @ResponseBody
    public Optional<Customer> customerById() {
        Optional<Customer> customer = customerService.getCustomerById(Long.valueOf(164180));
        return customer;
    }


}
