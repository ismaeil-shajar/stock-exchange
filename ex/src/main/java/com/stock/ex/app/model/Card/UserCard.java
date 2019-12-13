package com.stock.ex.app.model.Card;

import com.stock.ex.app.model.items.BuyersUnits;


public class UserCard {


//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name="user_id")
//    private User user;

    private long startTime;
    private long endTime;

//    @ManyToOne(fetch = FetchType.LAZY)
    private BuyersUnits card;

//    @ManyToOne(fetch = FetchType.LAZY)
    private CardStatus status;
}

