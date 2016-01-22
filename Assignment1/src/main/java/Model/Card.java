package Model;

import java.io.Serializable;

/**
 * Created by vgrejuc on 1/21/16.
 */
public class Card implements Serializable {
    public int rank;
    public int suit;

    public Card(int r, int s){
        this.rank = r;
        this.suit = s;
    }

    public Card(){
        this.rank = 1;
        this.suit = 1;
    }

    public String toString(){
        String tempString = "";
        switch (rank){
            case 1: tempString = tempString + "Ace ";
                break;
            case 2: tempString = tempString + "Two ";
                break;
            case 3: tempString = tempString + "Three ";
                break;
            case 4: tempString = tempString + "Four ";
                break;
            case 5: tempString = tempString + "Five ";
                break;
            case 6: tempString = tempString + "Six ";
                break;
            case 7: tempString = tempString + "Seven ";
                break;
            case 8: tempString = tempString + "Eight ";
                break;
            case 9: tempString = tempString + "Nine ";
                break;
            case 10: tempString = tempString + "Ten ";
                break;
            case 11: tempString = tempString + "Jack ";
                break;
            case 12: tempString = tempString + "Queen ";
                break;
            case 13: tempString = tempString + "King ";
                break;
        }
        switch (suit){
            case 1: tempString = tempString + "Spades";
                break;
            case 2: tempString = tempString + "Hearts";
                break;
            case 3: tempString = tempString + "Diamonds";
                break;
            case 4: tempString = tempString + "Clubs";
                break;
        }

        return tempString;

    }

}
