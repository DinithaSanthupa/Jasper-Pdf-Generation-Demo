package com.cbc.bank.service;

import java.util.List;

import com.cbc.bank.model.Customer;

public interface CustomerService {

	List<Customer> showAll();
	
	Customer findById(int id);
	
	Customer findByCreditCardId(long creditCardId);
	
	Customer findCreditDebitDetails(int id);
	
	Customer getCrediCardStatement(long creditCardId);
	
	Customer setCreditCardLimit(int id, Customer customer);
	
}
