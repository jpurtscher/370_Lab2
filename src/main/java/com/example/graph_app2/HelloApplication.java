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

        //variables for coordinates
        int startX = 0;
        int startY = 0;
        int endX = 0;
        int endY = 0;

        int gridStartX = 70;
        int gridStartY = 40;

        //setting scene
        Pane root = new Pane();
        Scene scene = new Scene(root, 640, 640);

        Pane barPane = new Pane();
        root.getChildren().add(barPane);

        //button logic
        Button random = new Button();
        random.setText("Redraw");

        random.setLayoutX(280);
        random.setLayoutY(600);

        //clear and redraw bars on press
        random.setOnAction(event -> {
            barPane.getChildren().clear();
            drawBars(barPane);
        });

        root.getChildren().add(random);

        // Draw bars
        drawBars(barPane);

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

        stage.setTitle("Random Bar Chart");
        stage.setScene(scene);
        stage.show();
    }


    void drawBars(Pane barPane) {

        Random rand = new Random();

        int rectangleStartX = 75;
        int rectangleWidth = 40;

        for (int i = 0; i < 10; i++) {

            // Calculate X position
            int rectangleGridStartX = rectangleStartX + (i * 50);

            // Random height
            int rectangleHeight = rand.nextInt(500) + 1;

            int rectangleStartY = 540 - rectangleHeight;

            // Random color
            int red = rand.nextInt(256);
            int green = rand.nextInt(256);
            int blue = rand.nextInt(256);

            Color randomColor = Color.rgb(red, green, blue);

            // Create bar
            Rectangle rectangle = new Rectangle();

            rectangle.setX(rectangleGridStartX);
            rectangle.setY(rectangleStartY);
            rectangle.setWidth(rectangleWidth);
            rectangle.setHeight(rectangleHeight);
            rectangle.setFill(randomColor);

            barPane.getChildren().add(rectangle);
        }
    }
        public static void main(String[] args) {
        launch(args);
    }
}