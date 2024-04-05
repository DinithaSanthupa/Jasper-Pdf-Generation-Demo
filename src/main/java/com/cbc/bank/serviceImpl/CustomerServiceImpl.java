package com.cbc.bank.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.cbc.bank.dao.CustomerRepository;
import com.cbc.bank.model.Customer;
import com.cbc.bank.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService{
	
    static Logger logger = LoggerFactory.getLogger(CustomerServiceImpl.class);

	
	@Autowired
	CustomerRepository customerRepository;

	@Override
	public List<Customer> showAll() {
		try {
			return customerRepository.findAll();
			
		}
		catch (DataAccessException e) {
			throw new RuntimeException("Error occurred while fetching all customers", e);
		}
		
	}
	
	static int id;
	
	@Override
	public Customer findById(int id) {
		
		this.id = id;
		
		Customer customer = null;
		
		
		try {
			Optional<Customer> result = customerRepository.findById(id);
			
			
			if (result.isPresent()) {
				customer = result.get();
			}
		}
		catch (DataAccessException e) {
			throw new RuntimeException("Error occurred while fetching find customer", e);
		}

		return customer;
	}

	@Override
	public Customer findByCreditCardId(long creditCardId) {
		
		Customer customer = null;
		
		try {
			Optional<Customer> result = customerRepository.findByCreditCardId(creditCardId);
			
			if (result.isPresent()) {
				customer = result.get();
			}
		}
		catch (DataAccessException e) {
			throw new RuntimeException("Error occurred while fetching customer find by id", e);
		}

		return customer;
	
	}

	@Override
	public Customer findCreditDebitDetails(int id) 
	{
		
		Customer customer = null;
		
		
		Optional<Customer> result = customerRepository.findById(id);
		
		
		if (result.isPresent()) {
			customer = result.get();
		}

		return customer;
	}

	@Override
	public Customer getCrediCardStatement(long creditCardId) {
		
		Customer customer = null;
		
		try {
			Optional<Customer> result = customerRepository.findByCreditCardId(creditCardId);
			
			
			if (result.isPresent()) {
				customer = result.get();
			}

		}
		catch (DataAccessException e) {
			throw new RuntimeException("Error occurred while fetching all customers", e);
		}
		
		return customer;
	}

	@Override
	public Customer setCreditCardLimit(int id, Customer customer) {
		
		Customer customer2 = null;
		
		try {
			Optional<Customer> result = customerRepository.findById(id);
			
			
			if (result.isPresent()) {
				customer2 = result.get();
				
				customer2.setCreditCardId(customer.getCreditCardId());
				customer2.setCardIssueDate(customer.getCardIssueDate());
				customer2.setCreditCardInterest(customer.getCreditCardInterest());
				customer2.setCreditCardLimit(customer.getCreditCardLimit());
				
				customerRepository.save(customer2);
				
				return customer2;
			}
		}
		catch (DataAccessException e) {
			throw new RuntimeException("Error occurred while fetching customer find by id", e);
		}
		
		return customer2;

		
	}

}
