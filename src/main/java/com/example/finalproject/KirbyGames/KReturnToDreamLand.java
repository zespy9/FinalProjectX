package com.example.finalproject.KirbyGames;

public class KReturnToDreamLand extends KirbyInformation {

public KReturnToDreamLand(){
    this.Date = "02/24/2023";

    this.gameName = "Kirby Return to Dream Land Deluxe";
    this.Price = 59.99;
}
    @Override
    public String toString() {
        return "Kirby And Friends are back! \n Choose from 4 Charaters such as kirby King Dedede, Waddle Dee, And MetaKnight! \nFind out what Adventures await this colorful cast!";

    }


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




