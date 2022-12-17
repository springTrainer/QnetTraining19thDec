package com.qnet.account.repository;

import com.qnet.account.entity.Accounts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountRepository extends JpaRepository<Accounts,Long> {
    List<Accounts> findByCustomerId(int customerId);

}
