package com.qnet.card.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Card {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="card_id")
    private int cardId;
    @Column(name="customer_id")
    private int customerId;
    @Column(name="card_type")
    private String cardType;
    @Column(name="card_number")
    private Long cardNumber;
    @Column(name="total_limit")
    private Long totalLimit;
    @Column(name="amount_used")
    private Long amountUsed;
    @Column(name="available_amt")
    private Long availableAmount;
    @Column(name="create_dt")
    private Date createDt;
}
