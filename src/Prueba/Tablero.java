
package Prueba;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/**
 *
 * @author Estudiante
 */
public class Tablero extends Application{

    public void start(Stage stage) throws Exception {
        Pane panel = new Pane();
        Canvas canvas = new Canvas(300,300);
        panel.getChildren().add(canvas);
        Scene scene = new Scene(panel,300,300,Color.WHITESMOKE);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        
        
        
        
        
        
        
        
        
        /*gc.setFill(Color.BLUE);
        gc.fillRect(10, 10, 20, 20);
        gc.setFill(Color.RED);
        gc.fillOval(20, 20, 50, 50);
        Color color = new Color((255/255), (185/255.0), (255/255), 1);
        gc.setFill(color);
        gc.strokeLine(20, 20, 50, 50);
        gc.fillOval(50, 50, 50, 50);
        
        double xpoints[] = {10,30,20,10};
        double ypoints[] = {30,30,15,30};
        gc.fillPolygon(xpoints, ypoints, xpoints.length);*/
        
        
        
        stage.setTitle("Ejemplo Canvas");
        stage.setScene(scene);
        stage.show();
    }    
    
    /*public static void main(String[] args) {
        Application.launch(args);
    }*/
    
}

