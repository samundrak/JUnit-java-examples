/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author samundra
 */
public class Game {

    private Card.card_type turup;
    private Card.card_type khela;
    private LinkedList<Card> cards;
    private LinkedList<Card> played_cards;
    private LinkedList<Player> players;

    public Game() {
        cards = new LinkedList<Card>();
        played_cards = new LinkedList<Card>();
        players = new LinkedList<Player>();
    }

    public Card.card_type getTurup() {
        return turup;
    }

    public void setTurup(Card.card_type turup) {
        this.turup = turup;
    }

    public Card.card_type getKhela() {
        return khela;
    }

    public void setKhela(Card.card_type khela) {
        this.khela = khela;
    }

    public LinkedList<Card> getCards() {
        return cards;
    }

    public void setCards(LinkedList<Card> cards) {
        this.cards = cards;
    }

    public LinkedList<Card> getPlayed_cards() {
        return played_cards;
    }

    public void setPlayed_cards(LinkedList<Card> played_cards) {
        this.played_cards = played_cards;
    }

    public LinkedList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(LinkedList<Player> players) {
        this.players = players;
    }

}
