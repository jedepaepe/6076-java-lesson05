package eu.epfc.c6076.lesson05;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class RectanglesDiagonale extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Canvas canvas = new Canvas(600, 600);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        gc.setFill(Color.DARKSALMON);
        for (int i = 0; i < 20; ++i) {
            gc.fillRect(i * 30, i * 30, 30, 30);
        }

        VBox vBox = new VBox(canvas);
        Scene scene = new Scene(vBox);
        stage.setScene(scene);
        stage.setTitle("rectangles sur la diagonale");
        stage.show();
    }
}
