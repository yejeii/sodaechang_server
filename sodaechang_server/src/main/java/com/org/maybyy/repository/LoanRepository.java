package com.org.maybyy.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

import com.org.maybyy.model.Loan;

public interface LoanRepository extends  JpaRepository<Loan, Long>{
	
	Loan findByLoanName(String loanName);
	
	
	
}
