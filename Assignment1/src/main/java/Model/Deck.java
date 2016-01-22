package Model;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Jacob on 1/20/2016.
 */
public class Deck
{
    private Card[] usedCards;
    private Card[] deck;
    private String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
    private int[] ranks = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};


    public Deck(Card[] cards){
        usedCards = cards;
        this.deck = new Card[52];
        int i = 0;
        for (String s: suits){
            for(int r : ranks){
                deck[i] = new Card(r,s);
            }
        }
    }


    public Card[] deal(){
        for(int i = 0; i < usedCards.length;i++){
            if(Arrays.asList(deck).contains(usedCards[i])){
               deck = ArrayUtils.removeElement(deck, usedCards[i]);
            }
        }
        Random gen = new Random();
        Card[] topFour = new Card[4];
        for(int i = 0;i<4;i++){
            int randPosition = gen.nextInt(deck.length);
            topFour[i] = deck[randPosition];
        }
        return topFour;
    }
}