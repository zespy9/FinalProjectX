package com.example.finalproject.KirbyGames;


public class KForgottenLand extends KirbyInformation {

    public KForgottenLand(){
        this.Date = "03/25/2022";
        this.gameName = "Kirby Return to Dream Land";
        this.Price = 59.99;
    }

    //@Override
    public String toString() {
        return "The 13 Installment within the series, Kirby Finds himself in a different dimenson after being warped away to a new location. \nNew allies and foes alike, Will kirby be able to save his friends from the beast pack? \n Find out when you play this game!";


    }

    //@Override
    public String toStringGameName() {
        return "Game Name: " + gameName;
    }
        public double toStringPrice(){
           return Price;
        }
    public String toStringGameDate(){
        return "Date:" + Date;
    }
}



