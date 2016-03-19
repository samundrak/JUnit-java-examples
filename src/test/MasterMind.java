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
public class MasterMind {

    Player player;
    Card card;
    Game game;

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public MasterMind(Player player) {
        this.player = player;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }
    int turn;

    public int getTurn() {
        return turn;
    }

    public void setTurn(int turn) {
        this.turn = turn;
    }

    Card throwCards() {
        switch (turn) {
            case 1:
                break;
            case 2:
                secondCardThrower();
                break;
            case 3:
                break;
            case 4:
                break;
        }
        return null;
    }

    private void secondCardThrower() {
//        if(player.getCard().s)
        Query  query = new Query(player);
        query.setType(game.getKhela());
        query.getAnyCard();
        setCard(query.getCard());
    }
}
