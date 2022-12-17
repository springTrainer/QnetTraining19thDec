package com.qnet.loan.controller;

import com.qnet.loan.entity.Customer;
import com.qnet.loan.entity.Loan;
import com.qnet.loan.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LoanController {

    @Autowired
    private LoanService loanService;

    @PostMapping("/fetchLoanDetails")
    public ResponseEntity<Loan> fetchLoanDetails(@RequestBody Customer customer){
        Loan loan=loanService.fetchLoanDetails(customer);
        return new ResponseEntity<Loan>(loan, HttpStatus.OK);
    }

    @PostMapping("/fetchLoanDetailsWithStartDateDesc/{id}")
    public ResponseEntity<List<Loan>> fetchLoanDetailsWithStartDateDesc(@PathVariable("id") int customerId){
        List<Loan> loanList=loanService.fetchLoanDetailsWithStartDateDesc(customerId);
        return new ResponseEntity<List<Loan>>(loanList,HttpStatus.OK);
    }

    @PostMapping("/saveLoan")
    public ResponseEntity<Loan> saveLoanDetails(@RequestBody Loan loan){
        Loan customer=loanService.saveLoanDetails(loan);
        return new ResponseEntity<Loan>(customer,HttpStatus.OK);
    }
}
