package Model;

/**
 * Created by Jacob on 1/20/2016.
 */
public class Deck
{
    Card[] usedCards;


    public Deck(Card[] cards){
        usedCards = cards;
    }
    /*public deal(ArrayList<Card> cards){
     }*/

    public Card[] deal(){
        Card[] dealFour = new Card[4];
        dealFour[0] = new Card(1, "Hearts");
        dealFour[1] = new Card(1, "Spades");
        dealFour[2] = new Card(1, "Clubs");
        dealFour[3] = new Card(1, "Diamonds");
        return dealFour;
    }
}