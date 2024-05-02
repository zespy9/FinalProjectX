package com.example.finalproject;
import com.example.finalproject.KirbyGames.KForgottenLand;
import com.example.finalproject.KirbyGames.KTripleDeluxe;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

import java.io.IOException;


public class KirbyTripleDeluxeController implements EaSports {

    @FXML
    private Label TripleDiscription;

    @FXML
    private ImageView TripleImage;

    @FXML
    private Label TripleDate;

    @FXML
    private Label TriplePrice;

    @FXML
    private Label TripleGameName;


    //using the initalize methood to add text to the labels
    public void initialize() {
        KTripleDeluxe TripleDeluxe = new KTripleDeluxe();


        String description = TripleDeluxe.toString();
        String gameName = TripleDeluxe.toStringGameName();
        Double Price = TripleDeluxe.toStringPrice();
        String Date = TripleDeluxe.toStringGameDate();


        //sets the text to the labels (finally)
        TripleGameName.setText(gameName);
        TripleDiscription.setText(description);
        TriplePrice.setText(String.valueOf(Price));
        TripleDate.setText(Date);
    }

    public void backToMenu(ActionEvent event) throws IOException {
        sceneSwap(event, "KirbyMakerMenu");

    }


}
