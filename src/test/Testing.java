/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Collections;
import java.util.LinkedList;
import static junit.framework.Assert.assertEquals;
import org.junit.Test;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.BeforeClass;

/**
 *
 * @author samundra
 */
public class Testing {

    private Game game;
    private MasterMind mm;

    @Before 
    public   void stepUp() {
        Card.card_type[] types = new Card.card_type[]{Card.card_type.clubs, Card.card_type.diamonds, Card.card_type.hearts, Card.card_type.spades};
        LinkedList<Card> cards = new LinkedList<>();
        for (int i = 0; i < 4; i++) {
            for (int j = 2; j < 15; j++) {
                Card card = new Card(j);
                card.setType(types[i]);
                cards.add(card);
            }

        }
        Collections.shuffle(cards);
        System.out.println(cards.size());
        LinkedList<Player> players = new LinkedList<>();
        for (int i = 0; i < 4; i++) {
            Player player = new Player();
            player.setName("Player_" + i);
            for (int j = 0; j < 13; j++) {
                player.addCards(cards.poll());
            }
            player.getCard().stream().forEach((Card t) -> {
                if (player.getSortedCards().containsKey(t.type)) {
                    player.getSortedCards().get(t.getType()).add(t);
                } else {
                    player.getSortedCards().put(t.getType(), new LinkedList());
                    player.getSortedCards().get(t.getType()).add(t);
                }
            });
            for (Card.card_type type : types) {
                player.getSortedCards().get(type).sort((Card o1, Card o2) -> Integer.compare(o1.getNumber(), o1.getNumber()));
            }
            players.add(player);

        }
        for (Card.card_type type : types) {
            players.get(0).getSortedCards().get(type).stream().forEach((Card card) -> {
            });
        }
        game = new Game();
        game.setCards(cards);
        game.setPlayers(players);
        game.setTurup(Card.card_type.clubs);
        game.setKhela(Card.card_type.spades);
        mm = new MasterMind(players.get(0));
        mm.setGame(game);
        mm.setTurn(2);
        mm.throwCards();
//        System.out.println("=========");
//        if (mm.getCard() != null) {
//            System.out.println(mm.getCard().getType());
//            System.out.println(mm.getCard().getNumber());
//        } else {
//            System.out.println("No Card found");
//        }

    }

    @Test
    public void test_numberOfPlayers() {
        assertEquals(4, game.getPlayers().size());
    }

    @Test
    public void test_turupTest() {
        assertEquals(game.getTurup().toString(), "clubs");
    }
    
    @Test
    public void test_khela(){
        assertEquals(game.getKhela().toString(),"spades");
    }
}
