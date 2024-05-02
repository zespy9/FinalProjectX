package com.example.finalproject.KirbyGames;

public class KTripleDeluxe extends KirbyInformation {

    public KTripleDeluxe(){
        this.Date = "1/11/2014";
        this.gameName = "Kirby Triple Deluxe";
        this.Price = 59.99;
    }
    @Override
    public String toString() {
        return "With Dream land underseige by an evil empire Kirby has to step up to the plate again.\nbeing forced to climb a beanstalk what will kirby encounter when he climbs?";

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


