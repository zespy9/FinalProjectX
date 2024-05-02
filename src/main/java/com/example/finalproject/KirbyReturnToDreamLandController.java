package com.example.finalproject;
import com.example.finalproject.KirbyGames.KForgottenLand;
import com.example.finalproject.KirbyGames.KReturnToDreamLand;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

import java.io.IOException;


public class KirbyReturnToDreamLandController implements EaSports{


    @FXML
    private Label ReturnToDiscription;

    @FXML
    private ImageView ReturnToImage;

    @FXML
    private Label ReturnToDate;

    @FXML
    private Label ReturnToPrice;

    @FXML
    private Label ReturnToGameName;


    //using the initalize methood to add text to the labels
    public void initialize() {
        KReturnToDreamLand returnToDreamLand = new KReturnToDreamLand();


        String description = returnToDreamLand.toString();
        String gameName = returnToDreamLand.toStringGameName();
        Double Price = returnToDreamLand.toStringPrice();
        String Date = returnToDreamLand.toStringGameDate();

        //sets the text to the labels (finally)
        ReturnToGameName.setText(gameName);
        ReturnToDiscription.setText(description);
        ReturnToPrice.setText(String.valueOf(Price));
        ReturnToDate.setText(Date);
    }

    public void backToMenu(ActionEvent event) throws IOException {
        sceneSwap(event, "KirbyMakerMenu");

    }

}
