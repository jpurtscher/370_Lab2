package com.example.graph_app2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.shape.Line;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import java.util.Random;

public class HelloApplication extends Application {

    @Override
    public void start(Stage stage) {

        int startX = 0;
        int startY = 0;
        int endX = 0;
        int endY = 0;

        int gridStartX = 70;
        int gridStartY = 40;

        int rectangleStartX = 95;
        int rectangleStartY = 65;

        Pane root = new Pane();
        Scene scene = new Scene(root, 640, 640);

        Button random = new Button();
        random.setText("Redraw");

        random.setLayoutX(280);
        random.setLayoutY(600);
        root.getChildren().add(random);

        // Vertical grid lines
        for (int i = 0; i <= 10; i++) {

            startX = gridStartX + (i * 50);
            endX = startX;

            startY = gridStartY;
            endY = gridStartY + 500;

            Line line = new Line(startX, startY, endX, endY);
            root.getChildren().add(line);
        }

        // Horizontal grid lines
        for (int i = 0; i <= 10; i++) {

            startY = gridStartY + (i * 50);
            endY = startY;

            startX = gridStartX;
            endX = gridStartX + 500;

            Line line = new Line(startX, startY, endX, endY);
            root.getChildren().add(line);
        }

        for( int i = 0; i <= 10; i++){
            Rectangle rectangle = new Rectangle();

            root.getChildren().add(rectangle);
        }

        stage.setTitle("Random Bar Chart");
        stage.setScene(scene);
        stage.show();
    }
}