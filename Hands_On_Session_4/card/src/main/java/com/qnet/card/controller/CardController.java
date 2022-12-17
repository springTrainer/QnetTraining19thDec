package com.qnet.card.controller;

import com.qnet.card.entity.Card;
import com.qnet.card.service.CardService;
import org.apache.coyote.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardController {

    Logger logger= LoggerFactory.getLogger(this.getClass());

    @Autowired
    private CardService cardService;

    @PostMapping("/saveCardDetails")
    private ResponseEntity<Card> saveCardDetails(@RequestBody Card card){
        logger.info("Inside saveCardDetails");
        Card cardDetails=cardService.saveCardDetails(card);
        return new ResponseEntity<Card>(cardDetails, HttpStatus.OK);
    }

    @PostMapping("/fetchCardDetails/{id}")
    private ResponseEntity<Card> fetchCardDetails(@PathVariable("id")int customerId){
        logger.info("Inside fetchCardDetails");
        Card card=cardService.fetchCardDetails(customerId);
        return new ResponseEntity<Card>(card,HttpStatus.OK);
    }
}
