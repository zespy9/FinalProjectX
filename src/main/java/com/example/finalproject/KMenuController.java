package com.example.finalproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class KMenuController implements EaSports {
@FXML
    private Button ForgottenLandButton;
    @FXML
    private Button TripleDeluxeButton;
    @FXML
    private Button ReturnToDreamLandButton;
    @FXML
    private Button StarAlliesButton;
    @FXML
    private Button PlannetRobobotButton;
    public void forgottenLandSwitch(ActionEvent event) throws IOException {
        sceneSwap(event, "KirbyForgottenLand");

    }
    public void tripleDeluxeSwitch(ActionEvent event) throws IOException {
        sceneSwap(event, "KirbyTripleDeluxe");

    }
    public void plannetRobobotSwitch(ActionEvent event) throws IOException {
        sceneSwap(event, "KirbyPlannetRobobot");

    }
    public void starAlliesSwitch(ActionEvent event) throws IOException {
        sceneSwap(event, "KirbyStarAllies");

    }
    public void returnToDreamLandSwitch(ActionEvent event) throws IOException {
        sceneSwap(event, "KirbyReturnToDreamLand");

    }
}
