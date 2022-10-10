package eu.epfc.c6076.lesson05;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class RectanglesLine extends Application {
    @Override
    public void start(Stage stage) {
        Canvas canvas = new Canvas(600, 100);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.setFill(Color.GREEN);
        for (int i = 0; i < 10; ++i) {
            gc.fillRect(60 * i, 0, 50, 50);
        }
        VBox vBox = new VBox(canvas);
        Scene scene = new Scene(vBox);
        stage.setScene(scene);
        stage.setTitle("ligne de rectangles");
        stage.show();
    }
}
