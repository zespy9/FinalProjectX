package com.example.finalproject;

import com.example.finalproject.KirbyGames.KForgottenLand;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import com.example.finalproject.KirbyGames.KPlannetRobobot;
import java.io.IOException;

public class KirbyPlannetRobobotController implements EaSports{
    @FXML
    private Label RobobotDiscription;

    @FXML
    private ImageView Robobotimage;

    @FXML
    private Label RobobotDate;

    @FXML
    private Label RobobotPrice;

    @FXML
    private Label RobobotName;


    //using the initalize methood to add text to the labels
    public void initialize() {
        KPlannetRobobot PlannetRobobot =  new KPlannetRobobot();


        String description = PlannetRobobot.toString();
        String gameName = PlannetRobobot.toStringGameName();
        Double Price = PlannetRobobot.toStringPrice();
        String Date = PlannetRobobot.toStringGameDate();


        //sets the text to the labels (finally)
        RobobotName.setText(gameName);
        RobobotDiscription.setText(description);
        RobobotPrice.setText(String.valueOf(Price));
        RobobotDate.setText(Date);
    }

    public void backToMenu(ActionEvent event) throws IOException {
        sceneSwap(event, "KirbyMakerMenu");

    }
}

