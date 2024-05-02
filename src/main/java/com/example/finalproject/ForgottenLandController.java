package com.example.finalproject;
import com.example.finalproject.KirbyGames.KForgottenLand;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

import java.io.IOException;


public class ForgottenLandController implements EaSports {
    @FXML
    private Label ForgottenDiscription;

    @FXML
    private ImageView ForgottenImage;

    @FXML
    private Label ForgottenDate;

    @FXML
    private Label ForgottenPrice;

    @FXML
    private Label ForgottenGameName;


    //using the initalize methood to add text to the labels
    public void initialize() {
        KForgottenLand forgottenLand = new KForgottenLand();


        String description = forgottenLand.toString();
        String gameName = forgottenLand.toStringGameName();
        Double Price = forgottenLand.toStringPrice();
        String Date = forgottenLand.toStringGameDate();


        //sets the text to the labels (finally)
        ForgottenGameName.setText(gameName);
        ForgottenDiscription.setText(description);
        ForgottenPrice.setText(String.valueOf(Price));
        ForgottenDate.setText(Date);
    }

    public void backToMenu(ActionEvent event) throws IOException {
        sceneSwap(event, "KirbyMakerMenu");

    }
}
