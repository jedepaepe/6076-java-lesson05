package eu.epfc.c6076.lesson05;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class BigOcean extends Application {
    @Override
    public void start(Stage stage) {
        Canvas canvas = new Canvas(400, 400);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.setFill(Color.AQUA);
        gc.fillRect(50, 50, 300, 300);
        VBox vBox = new VBox(canvas);
        Scene scene = new Scene(vBox);
        stage.setScene(scene);
        stage.setTitle("big ocean");
        stage.show();
    }
}
