package com.example.finalproject.KirbyGames;

public class KStarAllies extends KirbyInformation {

   public KStarAllies(){
    this.Date = "03/16/2018";
    this.gameName = "Kirby Star Allies";
    this.Price = 59.99;
   }

    @Override
    public String toString() {
        return "Kirby is back with a new power! \nWith the power to befrend anyone with the power a heart that was bistowed upon him, \nwhat will happen in this brand new adventure in the series?";

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













