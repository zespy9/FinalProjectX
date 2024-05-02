package com.example.finalproject.KirbyGames;

public class KPlannetRobobot extends KirbyInformation {
    public KPlannetRobobot() {
        this.Date = "05/28/2016";
        this.gameName = "Kirby Plannet Robobot";
        this.Price = 59.99;
    }
    public String toString() {
        return "When A Robot Invason Threatens Kirbys World He's Quick To defend his plannet \nWill Kirby be able to stop the impending invason? \nFind out when you play";

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




