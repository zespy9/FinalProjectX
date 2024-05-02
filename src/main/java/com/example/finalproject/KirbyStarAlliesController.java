package com.example.finalproject;
import com.example.finalproject.KirbyGames.KForgottenLand;
import com.example.finalproject.KirbyGames.KStarAllies;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

import java.io.IOException;


public class KirbyStarAlliesController implements EaSports {


    @FXML
    private Label AlliesDiscription;

    @FXML
    private ImageView AlliesImage;

    @FXML
    private Label AlliesDate;

    @FXML
    private Label AlliesPrice;

    @FXML
    private Label AlliesGameName;


    //using the initalize methood to add text to the labels
    public void initialize() {
        KStarAllies starAllies = new KStarAllies();


        String description = starAllies.toString();
        String gameName = starAllies.toStringGameName();
        Double Price = starAllies.toStringPrice();
        String Date = starAllies.toStringGameDate();


        //sets the text to the labels (finally)
        AlliesGameName.setText(gameName);
        AlliesDiscription.setText(description);
        AlliesPrice.setText(String.valueOf(Price));
        AlliesDate.setText(Date);
    }

    public void backToMenu(ActionEvent event) throws IOException {
        sceneSwap(event, "KirbyMakerMenu");

    }

}
