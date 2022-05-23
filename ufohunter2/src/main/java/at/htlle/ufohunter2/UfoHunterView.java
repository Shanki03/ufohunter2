package at.htlle.ufohunter2;

import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;

public class UfoHunterView extends Parent {

    private  final int GAMEFIELDHEIGHT = 480;
    private  final int GAMEFIELDWIDTH = 640;

    VBox primaryVbox = new VBox();
    HBox gameInfoBox = new HBox();
    Label lblPointsTxt = new Label("Points");
    Label lblPointsVal = new Label("0");
    Label lblLivesTxt = new Label("Lives");
    Label lblLivesVal = new Label("3");

    Group gameField = new Group();
    Rectangle gameFieldBackground = new Rectangle();


    public void createLayout(){
        gameInfoBox.setSpacing(5);
        gameInfoBox.setPadding(new Insets(10, 50, 10, 10));
        lblPointsTxt.setFont(new Font("Comic Sans MS", 16));
        lblPointsVal.setFont(new Font("Comic Sans MS", 16));
        lblLivesTxt.setFont(new Font("Comic Sans MS", 16));
        lblLivesVal.setFont(new Font("Comic Sans MS", 16));

        gameInfoBox.getChildren().add(lblPointsTxt);
        gameInfoBox.getChildren().add(lblPointsVal);
        gameInfoBox.getChildren().add(lblLivesTxt);
        gameInfoBox.getChildren().add(lblLivesVal);
        primaryVbox.getChildren().add(gameInfoBox);

        gameFieldBackground.setHeight(GAMEFIELDHEIGHT);
        gameFieldBackground.setWidth(GAMEFIELDWIDTH);
        gameFieldBackground.setFill(Color.BLACK);
        gameField.getChildren().add(gameFieldBackground);
        primaryVbox.getChildren().add(gameField);
    }

    public void createUfo(double width, double yPos, double speed){
        Ufo ufo = new Ufo(width, yPos, speed);
        gameField.getChildren().add(ufo);
    }

    public VBox getPrimaryVbox(){
        return primaryVbox;
    }
}
