/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author samundra
 */
public class Card {

    static enum card_type {spades,hearts,diamonds,clubs};
    int number =0;
    card_type type;
    public Card(int number) {
        this.number =  number;
        
    }
    public card_type getType() {
        return type;
    }

    public void setType(card_type type) {
        this.type = type;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    
    
}
