package com.org.maybyy.model;

import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "loan_product")
public class Loan {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="loan_id")
	private Long loanId;
	@Column(name="bank")
    private String loanBank;
	@Column(name="bank_logo")
    private String loanBankLogo;
	@Column(name="loan_name")
    private String loanName;
	@Column(name="loan_type")
    private String loanType;
	@Column(name="loan_target_customers")
    private String loanTarget;
	@Column(name="loan_credit_line")
    private String loanCreditLine;
	@Column(name="loan_period")
    private String loanPeriod;
	@Column(name="loan_interest_rate")
    private String loanInterestRate;
	@Column(name="loan_desc")
    private String loanDesc;
	@Column(name="lowest_interest_rate")
    private String lowestInterestRate;
    private boolean visibility;
    
    
}
