package com.cbc.bank.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;


@Entity
@Table(name = "customer_tab")
public class Customer {
	
	
	@Id
    @Column(name="id")
	private long id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="address")
	private String address;
	
	@Column(name="birth_day")
	@DateTimeFormat(pattern = "dd/MM/yyyy")
    @Temporal(TemporalType.DATE)
	private Date birthDay;
	
	@Column(name="credit_balance")
	private double creditBalance;
	
	@Column(name="debit_balance")
	private double debitBalance;
	
	@Column(name="credit_score")
	private int creditScore;
	
	@Column(name="loan_amount")
	private double loanAmount;
	
	@Column(name="loan_issue_date")
	private Date loanIssueDate;
	
	@Column(name="loan_interest")
	private double loanInterest;
	
	@Column(name="loan_status")
	private String loanStatus;
	
	@Column(name="credit_card_id")
	private long creditCardId;
	
	@Column(name="card_issue_date")
	@DateTimeFormat(pattern = "dd/MM/yyyy")
    @Temporal(TemporalType.DATE)
	private Date cardIssueDate;
	
	@Column(name="credit_card_interest")
	private double creditCardInterest;
	
	@Column(name="credit_card_limit")
	private double creditCardLimit;
	
	@Column(name="loyalty_id")
	private int loyalityId;
	
	
	public Customer() {
		super();
	}


	public Customer(long id, String name, String address, Date birthDay, double creditBalance, double debitBalance,
			int creditScore, double loanAmount, Date loanIssueDate, double loanInterest, String loanStatus,
			long creditCardId, Date cardIssueDate, double creditCardInterest, double creditCardLimit, int loyalityId) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.birthDay = birthDay;
		this.creditBalance = creditBalance;
		this.debitBalance = debitBalance;
		this.creditScore = creditScore;
		this.loanAmount = loanAmount;
		this.loanIssueDate = loanIssueDate;
		this.loanInterest = loanInterest;
		this.loanStatus = loanStatus;
		this.creditCardId = creditCardId;
		this.cardIssueDate = cardIssueDate;
		this.creditCardInterest = creditCardInterest;
		this.creditCardLimit = creditCardLimit;
		this.loyalityId = loyalityId;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public Date getBirthDay() {
		return birthDay;
	}


	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}


	public double getCreditBalance() {
		return creditBalance;
	}


	public void setCreditBalance(double creditBalance) {
		this.creditBalance = creditBalance;
	}


	public double getDebitBalance() {
		return debitBalance;
	}


	public void setDebitBalance(double debitBalance) {
		this.debitBalance = debitBalance;
	}


	public int getCreditScore() {
		return creditScore;
	}


	public void setCreditScore(int creditScore) {
		this.creditScore = creditScore;
	}


	public double getLoanAmount() {
		return loanAmount;
	}


	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}


	public Date getLoanIssueDate() {
		return loanIssueDate;
	}


	public void setLoanIssueDate(Date loanIssueDate) {
		this.loanIssueDate = loanIssueDate;
	}


	public double getLoanInterest() {
		return loanInterest;
	}


	public void setLoanInterest(double loanInterest) {
		this.loanInterest = loanInterest;
	}


	public String getLoanStatus() {
		return loanStatus;
	}


	public void setLoanStatus(String loanStatus) {
		this.loanStatus = loanStatus;
	}


	public long getCreditCardId() {
		return creditCardId;
	}


	public void setCreditCardId(long creditCardId) {
		this.creditCardId = creditCardId;
	}


	public Date getCardIssueDate() {
		return cardIssueDate;
	}


	public void setCardIssueDate(Date cardIssueDate) {
		this.cardIssueDate = cardIssueDate;
	}


	public double getCreditCardInterest() {
		return creditCardInterest;
	}


	public void setCreditCardInterest(double creditCardInterest) {
		this.creditCardInterest = creditCardInterest;
	}


	public double getCreditCardLimit() {
		return creditCardLimit;
	}


	public void setCreditCardLimit(double creditCardLimit) {
		this.creditCardLimit = creditCardLimit;
	}


	public int getLoyalityId() {
		return loyalityId;
	}


	public void setLoyalityId(int loyalityId) {
		this.loyalityId = loyalityId;
	}


}


