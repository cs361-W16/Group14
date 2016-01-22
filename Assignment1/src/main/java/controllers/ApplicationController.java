/**
 * Copyright (C) 2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package controllers;

import Model.Card;
import Model.Deck;
import ninja.Result;
import ninja.Results;
import ninja.Context;

import com.google.inject.Singleton;


@Singleton
public class ApplicationController {

    public Result index() {
        return Results.html();
    }

    public Result acesUp() {
        return Results.html().template("views/AcesUp/AcesUp.flt.html");
    }

    public Result acesDeal(Card c){
        //Ostensibly, the framework should cast the serialized JSON array into a Card since that's the argument
        //Make sure that c is actually a card
        //if("Hearts".equals(c.suit)){
        //    System.out.println("Bananas");
        //}


        /*Deck d = new Deck(usedCards);
        Card[] fourCards = d.deal();
        */


        Card[] fourCards = new Card[2];
        fourCards[1] = new Card(1, 1);
        fourCards[2] = new Card(10, 4);
        return Results.json().render(fourCards);
    }

}
