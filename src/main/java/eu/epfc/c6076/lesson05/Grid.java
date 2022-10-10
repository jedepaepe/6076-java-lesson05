package eu.epfc.c6076.lesson05;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Grid extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Canvas canvas = new Canvas(500, 500);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        gc.setFill(Color.ORANGE);
        for (int i = 0; i < 10; ++i) {
            for (int j = 0; j < 10; ++j) {
                gc.fillRect(5 + i * 50, 5 + j * 50, 40, 40);
            }
        }

        stage.setScene(new Scene(new VBox(canvas)));
        stage.setTitle("grille de rectangles");
        stage.show();
    }
}
