/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.HashMap;
import java.util.LinkedList;

/**
 *
 * @author samundra
 */
public class Player {
    String name;
    int id;
    LinkedList<Card> card;
    HashMap<Card.card_type, LinkedList<Card>> sortedCards;
    public Player() {
        sortedCards = new HashMap<>();
        card =  new LinkedList<>();
    }

    public HashMap<Card.card_type,  LinkedList<Card>> getSortedCards() {
        return sortedCards;
    }

    public void setSortedCards(HashMap<Card.card_type,  LinkedList<Card>> sortedCards) {
        this.sortedCards = sortedCards;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LinkedList<Card> getCard() {
        return card;
    }

    public void setCard(LinkedList<Card> card) {
        this.card = card;
    }

    void addCards(Card e) {
        card.add(e);
    }
    
    
}
