package com.qnet.account.controller;

import com.qnet.account.entity.Accounts;
import com.qnet.account.entity.Customer;
import com.qnet.account.repository.AccountRepository;
import com.qnet.account.service.AccountService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/account")
public class AccountController {



    @Autowired
    private AccountService accountService;

    @GetMapping("/fetchAccounts")
    public ResponseEntity<List<Accounts>> getAccountDetails(@RequestBody Customer customer){
        List<Accounts> accountLists=accountService.getAccountDetails(customer);
        return new ResponseEntity<List<Accounts>>(accountLists, HttpStatus.OK);
    }

    @GetMapping("/accountService")
    public String accountService(){
        return "Inside account controller";
    }


    @PostMapping("/saveAccountDetails")
    private ResponseEntity<Accounts> saveAccountDetails(@RequestBody Accounts accounts){
        accountService.saveAccount(accounts);
        return new ResponseEntity<Accounts>(accounts,HttpStatus.OK);
    }

    @PostMapping("/saveCustomerDetails")
    private ResponseEntity<Customer> saveCustomerDetails(@RequestBody Customer customer){
        accountService.saveCustomerDetails(customer);
        return new ResponseEntity<Customer>(customer,HttpStatus.OK);
    }
}
