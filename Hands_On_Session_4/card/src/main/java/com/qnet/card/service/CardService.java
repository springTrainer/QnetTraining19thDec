package com.qnet.card.service;

import com.qnet.card.entity.Card;
import com.qnet.card.repository.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CardService {

    @Autowired
    private CardRepository cardRepository;

    public Card saveCardDetails(Card card){
        cardRepository.save(card);
        return card;
    }

    public Card fetchCardDetails(int customerId){
        return cardRepository.findByCustomerId(customerId);
    }
}
