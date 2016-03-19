/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.LinkedList;
import java.util.Random;

/**
 *
 * @author samundra
 */
public class Query {
    
    Card.card_type type;
    Player player;
    
    public Card.card_type getType() {
        return type;
    }
    
    public void setType(Card.card_type type) {
        this.type = type;
    }
    
    public Player getPlayer() {
        return player;
    }
    
    public void setPlayer(Player player) {
        this.player = player;
    }
    
    public Query(Player player) {
        this.player = player;
    }
    
    private LinkedList<Card> getCards(Card.card_type type) {
        return player.getSortedCards().get(type);
    }
    Card card;
    
    boolean isCardTypeAvailable() {
        return getCards(type).size() > 0;
    }
    
    public Card getCard() {
        return card;
    }
    
    public void setCard(Card card) {
        this.card = card;
    }
    
    Query isCardAvailable(int number) {
        for (Card card : getCards(getType())) {
            if (card.getNumber() == number) {
                setCard(card);
                return this;
            }
        }
        setCard(null);
        return this;
    }
    
    Query highestCard() {
        int count = 0;
        Card card = null;
        for (Card c : getCards(getType())) {
            if (c.getNumber() > count) {
                card = c;
                count = c.getNumber();
            }
        }
        if (count == 0) {
            setCard(null);
        } else {
            setCard(card);
        }
        return this;
    }
    
    Query lowestCard() {
        int count = 20;
        Card card = null;
        for (Card c : getCards(getType())) {
            if (c.getNumber() < count) {
                card = c;
                count = c.getNumber();
            }
        }
        if (count == 0) {
            setCard(null);
        } else {
            setCard(card);
        }
        return this;
    }
    
    void excludeThisCard(int number) {
        for (Card c : getCards(type)) {
            if (c.getNumber() != number) {
                setCard(c);
                return;
            }
        }
    }
    
    void getParCard(int par) {
        for (Card c : getCards(type)) {
            if (c.getNumber() > par) {
                setCard(c);
                return;
            }
        }
    }
    
    void getBelowParCard(int par) {
        for (Card c : getCards(type)) {
            if (c.getNumber() < par) {
                setCard(c);
                return;
            }
        }
    }
    
    void getAnyCard() {
        if (getCards(type).size() > 0) {
            try {
                setCard(getCards(type).get(new Random().nextInt(getCards(type).size())));
            } catch (Exception e) {
                setCard(getCards(type).getFirst());
            }
        }
    }
    
    void getAnyBigCard() {
        for (Card c : player.getCard()) {
            if (c.getNumber() > 10) {
                setCard(c);
                return;
            }
        }
    }
    
    void getAnySmallCard() {
        for (Card c : player.getCard()) {
            if (c.getNumber() < 10) {
                setCard(c);
                return;
            }
        }
    }
    
    void getInRangeCards(int from, int to) {
        for (Card c : player.getSortedCards().get(type)) {
            if (c.getNumber() > from && c.getNumber() < to) {
                setCard(c);
                return;
            }
        }
    }
    
    void getAnyInRangeCards(int from, int to) {
        for (Card c : player.getCard()) {
            if (c.getNumber() > from && c.getNumber() < to) {
                setCard(c);
                return;
            }
        }
    }
}
