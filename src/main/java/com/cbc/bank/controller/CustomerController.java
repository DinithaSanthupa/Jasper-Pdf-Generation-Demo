package com.cbc.bank.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cbc.bank.model.Customer;
import com.cbc.bank.serviceImpl.CustomerServiceImpl;


@RestController
@RequestMapping("/customers")
//@CrossOrigin("http://localhost:4200/")
public class CustomerController {
		

	@Autowired
	private CustomerServiceImpl customerServiceImpl;
	
    Logger logger = LoggerFactory.getLogger(CustomerController.class);
	
	@GetMapping("/all")
	List<Customer> showAll(){
		logger.info("show all rest controller called");
		return customerServiceImpl.showAll();
	}
	
	
	@GetMapping("/{id}")
	Customer findById(@PathVariable int id) {
		logger.info("find by id rest controller called");
		return customerServiceImpl.findById(id);
	}
	
	
	@GetMapping("/creditcard/{creditCardId}")
	Customer findByCreditCardId(@PathVariable long creditCardId) {
		logger.info("find by credit card id rest controller called");
		return customerServiceImpl.findByCreditCardId(creditCardId);
	} 
	

	
	@PutMapping("/setcreditcardlimit/{id}")
	Customer setCreditCardLimit(@PathVariable int id, @RequestBody Customer customer) {
		logger.info("set credit card id rest controller called");
		return customerServiceImpl.setCreditCardLimit(id, customer);
	}
	
	
}
