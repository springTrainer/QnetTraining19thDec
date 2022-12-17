package com.qnet.loan.service;

import com.qnet.loan.entity.Customer;
import com.qnet.loan.entity.Loan;
import com.qnet.loan.repository.LoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoanService {

    @Autowired
    private LoanRepository loanRepository;

    public Loan fetchLoanDetails(Customer customer){
        return loanRepository.findByCustomerId(1);
    }

    public List<Loan> fetchLoanDetailsWithStartDateDesc(int customerId) {

        return loanRepository.findByCustomerIdOrderByStartDtDesc(customerId);
    }

    public Loan saveLoanDetails(Loan loan) {
        // TODO Auto-generated method stub
        return loanRepository.save(loan);
    }

}
