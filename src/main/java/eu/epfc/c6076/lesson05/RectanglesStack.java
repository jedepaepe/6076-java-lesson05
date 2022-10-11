package eu.epfc.c6076.lesson05;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class RectanglesStack extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Canvas canvas = new Canvas(800, 800);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        for (int i = 0; i <= 10; ++i) {
            if (i % 2 == 0) {
                gc.setFill(Color.SANDYBROWN);
            } else {
                gc.setFill(Color.WHEAT);
            }
            gc.fillRect(i * 40, i * 40, 800 - i * 80, 800 - i * 80);
        }

        stage.setScene(new Scene(new VBox(canvas)));
        stage.setTitle("rectangles empillés");
        stage.show();
    }
}
