package com.qnet.loan.entity;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Loan {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="loan_number")
    private int loanNumber;
    @Column(name="customer_id")
    private int customerId;
    @Column(name="start_dt")
    private Date startDt;
    @Column(name="loan_type")
    private String loanType;
    @Column(name="total_loan")
    private int totalLoan;
    @Column(name="amount_paid")
    private int amountPaid;
    @Column(name="outstanding_amount")
    private int outstandingAmount;

    @Column(name="create_dt")
    private Date createDt;


}
