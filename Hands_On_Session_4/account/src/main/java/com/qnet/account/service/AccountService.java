package com.qnet.account.service;

import com.qnet.account.entity.Accounts;
import com.qnet.account.entity.Customer;
import com.qnet.account.repository.AccountRepository;
import com.qnet.account.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    private CustomerRepository customerRepository;

    public List<Accounts> getAccountDetails(Customer customer){
        /*Accounts account=
                new Accounts(1,111,"Savings","NY",new Date());
        return Arrays.asList(account);*/

        List<Accounts> accountList=accountRepository.findByCustomerId(customer.getCustomerId());
        return accountList;
    }

    public void saveAccount(Accounts account){
        accountRepository.save(account);
        System.out.println("Account details saved successfully");
    }

    public void saveCustomerDetails(Customer customer){
        customerRepository.save(customer);
        System.out.println("Customer details saved successfully");
    }

    public void saveCustomer(Customer customer){
        customerRepository.save(customer);
    }
}
