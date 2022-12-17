package com.qnet.loan.repository;

import com.qnet.loan.entity.Loan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LoanRepository extends JpaRepository<Loan,Integer> {

    Loan findByCustomerId(int i);

    List<Loan> findByCustomerIdOrderByStartDtDesc(int customerId);
}
