package eu.epfc.c6076.lesson05;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class YellowRectangle extends Application {
    @Override
    public void start(Stage stage) {
        Canvas canvas = new Canvas(600, 400);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.setFill(Color.YELLOW);
        gc.fillRect(100, 20, 300, 200);
        VBox vBox = new VBox(canvas);
        Scene scene = new Scene(vBox);
        stage.setScene(scene);
        stage.setTitle("yellow rectangle");
        stage.show();
    }
}
