package com.qnet.card.repository;

import com.qnet.card.entity.Card;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepository extends JpaRepository<Card,Integer> {

    Card findByCustomerId(int customerId);
}
