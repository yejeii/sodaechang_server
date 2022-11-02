package com.org.maybyy.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.maybyy.model.Loan;
import com.org.maybyy.repository.LoanRepository;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/sodaechang/loan/*")
@RequiredArgsConstructor
public class LoanController {

	@Autowired
	private final LoanRepository loanRepository;
	
	@GetMapping("list")
	public Map<String, ArrayList<Loan>> getList() {
		Map<String, ArrayList<Loan>> map = new HashMap<>();
		map.put("loanList", (ArrayList<Loan>) loanRepository.findAll());
		return map;
	}
	
}
