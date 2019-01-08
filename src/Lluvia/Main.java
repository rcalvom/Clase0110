
package Lluvia;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/**
 *
 * @author Ricardo Andrés Calvo
 */
public class Main extends Application{ 
    @Override
    public void start(Stage stage) throws Exception {
        Pane panel = new Pane();
        Canvas canvas = new Canvas(1024,512);
        panel.getChildren().add(canvas);
        Scene scene = new Scene(panel,1024,512,Color.WHITESMOKE);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        LoopJuego loop = new LoopJuego(gc);
        loop.start();
        stage.setTitle("Gato bajo la lluvia");
        stage.setScene(scene);
        stage.show();
        stage.setOnCloseRequest(( e) ->{
            Platform.exit();
            LoopJuego.cerrar = true;
        });
    }    
    
    public static void main(String[] args) {
        Application.launch(args);
    }
}
