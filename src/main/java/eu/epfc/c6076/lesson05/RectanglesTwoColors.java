package eu.epfc.c6076.lesson05;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class RectanglesTwoColors extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Canvas canvas = new Canvas(450, 300);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        for (int i = 0; i < 9; ++i) {
            if (i % 2 == 0) {
                gc.setFill(Color.LIGHTBLUE);
            } else {
                gc.setFill(Color.DARKBLUE);
            }
            gc.fillRect(i * 50, 0, 50, 300);
        }

        stage.setScene(new Scene(new VBox(canvas)));
        stage.setTitle("rectangles de deux couleurs");
        stage.show();
    }
}
