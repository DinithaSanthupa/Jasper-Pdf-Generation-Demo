package com.cbc.bank.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cbc.bank.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>{

	
	Optional<Customer> findByCreditCardId(long creditCardId);
	
	
}
