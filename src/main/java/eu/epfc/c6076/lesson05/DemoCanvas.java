package eu.epfc.c6076.lesson05;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class DemoCanvas extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Canvas canvas = new Canvas(600, 400);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.setFill(Color.DARKSEAGREEN);
        gc.fillRect(100, 20, 300, 200);
        VBox vBox = new VBox(canvas);
        Scene scene = new Scene(vBox);
        stage.setScene(scene);
        stage.setTitle("demo canvas");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
