package com.oss.webbackend.controller;

import com.oss.webbackend.dto.CustomerDto;
import com.oss.webbackend.dto.GkCustomerDto;
import com.oss.webbackend.model.Customer;
import com.oss.webbackend.service.CustomerService;
import com.oss.webbackend.util.CatEjbConnectionBridge;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.validation.Valid;
import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.Page;

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
    public Page<Customer> customerByCust2(@RequestParam String fromcust, @RequestParam  String tocust) {
        Page<Customer> customer = customerService.getCustomerByCust2(fromcust,tocust);
//        CatEjbConnectionBridge connectionBridge = new CatEjbConnectionBridge();
//        connectionBridge.setConnection(em);
//        Customer customer = customerService.customFindMethodConn(connectionBridge, id);
        return customer;
    }


    @GetMapping("/customerByCust5")
    @ResponseBody
    public List<Customer> customerByCust5(@RequestParam  String fromcust,@RequestParam  String tocust) {
        List<Customer> customer = customerService.getCust5(fromcust,tocust);
//        CatEjbConnectionBridge connectionBridge = new CatEjbConnectionBridge();
//        connectionBridge.setConnection(em);
//        Customer customer = customerService.customFindMethodConn(connectionBridge, id);
        return customer;
    }



    @GetMapping("/customer")
    @ResponseBody
    public Optional<Customer> customerById() {
        Optional<Customer> customer = customerService.getCustomerById(Long.valueOf(164180));
        return customer;
    }



    @GetMapping("/getgkCustomerDtoaa")
    @ResponseBody
    public GkCustomerDto getgkCustomerDtoaa() {
        return  customerService.GkCustomerDto();
    }


    @PostMapping(path = "/setgkCustomerDtoaa")
    public GkCustomerDto setgkCustomerDtoaa(@Valid @RequestBody GkCustomerDto gkCustomerDto) {

        gkCustomerDto.getParamsErpAA().setParama(" retpar");

         return gkCustomerDto;
    }


    }
