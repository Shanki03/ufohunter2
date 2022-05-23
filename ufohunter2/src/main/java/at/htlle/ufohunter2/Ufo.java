package at.htlle.ufohunter2;

import javafx.scene.Group;
import javafx.scene.effect.Shadow;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;

public class Ufo extends Group {
    private double xPos;
    private double yPos;
    private double speed;
    private double width;

    Ufo(double width, double yPos, double speed){
        this.width = width;
        this.yPos = yPos;
        this.speed = speed;
        this.xPos = width/2.0;

        createLayout();
        setTranslateX(xPos);
        setTranslateY(yPos);
    }

    private void createLayout() {
        double cockpitRadius = width / 2.8;
        Shape cockpit = Shape.subtract(new Ellipse(cockpitRadius, width / 2.0), new Rectangle(-cockpitRadius, 1.0, cockpitRadius * 2.0, width / 2.0));
        cockpit.setFill(Color.SIENNA);
        getChildren().add(cockpit);

        Shape hull = new Ellipse(width/2.0, width/4.0);
        hull.setFill(Color.LIGHTGREY);
        getChildren().add(hull);

    }
}
