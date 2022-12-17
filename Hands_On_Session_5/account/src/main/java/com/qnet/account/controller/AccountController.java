package com.qnet.account.controller;

import com.qnet.account.entity.Accounts;
import com.qnet.account.entity.Customer;
import com.qnet.account.repository.AccountRepository;
import com.qnet.account.service.AccountService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class AccountController {


    Logger logger= LoggerFactory.getLogger(this.getClass());
    @Autowired
    private AccountService accountService;

    @GetMapping("/fetchAccounts")
    public ResponseEntity<List<Accounts>> getAccountDetails(@RequestBody Customer customer){
        logger.info("Inside getAccountDetails");
        List<Accounts> accountLists=accountService.getAccountDetails(customer);
        return new ResponseEntity<List<Accounts>>(accountLists, HttpStatus.OK);
    }

    @GetMapping("/accountService")
    public String accountService(){

        logger.info("Inside accountService");
        return "Inside account controller";
    }


    @PostMapping("/saveAccountDetails")
    private ResponseEntity<Accounts> saveAccountDetails(@RequestBody Accounts accounts){
        logger.info("Inside saveAccountDetails");
        accountService.saveAccount(accounts);
        return new ResponseEntity<Accounts>(accounts,HttpStatus.OK);
    }

    @PostMapping("/saveCustomerDetails")
    private ResponseEntity<Customer> saveCustomerDetails(@RequestBody Customer customer){
        accountService.saveCustomerDetails(customer);
        return new ResponseEntity<Customer>(customer,HttpStatus.OK);
    }
}
