package com.qnet.card.controller;

import com.qnet.card.entity.Card;
import com.qnet.card.service.CardService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardController {

    @Autowired
    private CardService cardService;

    @PostMapping("/saveCardDetails")
    private ResponseEntity<Card> saveCardDetails(@RequestBody Card card){
        Card cardDetails=cardService.saveCardDetails(card);
        return new ResponseEntity<Card>(cardDetails, HttpStatus.OK);
    }

    @PostMapping("/fetchCardDetails/{id}")
    private ResponseEntity<Card> fetchCardDetails(@PathVariable("id")int customerId){
        Card card=cardService.fetchCardDetails(customerId);
        return new ResponseEntity<Card>(card,HttpStatus.OK);
    }
}
