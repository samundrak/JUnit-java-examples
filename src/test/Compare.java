/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Comparator;

/**
 *
 * @author samundra
 */
public class Compare implements Comparable<Card> {

    

    @Override
    public int compareTo(Card o) {
        return Integer.max(o.getNumber(), 12);
    }

}
