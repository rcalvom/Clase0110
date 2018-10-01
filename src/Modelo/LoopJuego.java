
package Modelo;

import javafx.animation.AnimationTimer;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/**
 *
 * @author Estudiante
 */
public class LoopJuego extends AnimationTimer {
    private GraphicsContext gc;
    private Carro carro;
   
    public void handle(long l) {
        gc.clearRect(0, 0, 300, 300);
        int x = this.carro.getX();
        gc.setFill(Color.BLUE);
        double[] Chasisx = {x+50,x+60,x+65,x+85,x+90,x+100,x+100,x+50,x+50};
        double[] Chasisy = {100,100,85,85,100,100,110,110,100};
        gc.fillPolygon(Chasisx, Chasisy, Chasisx.length);
        gc.setFill(Color.GRAY);
        gc.fillOval(x+55, 110, 10, 10);
        gc.fillOval(x+85, 110, 10, 10);
        
        this.carro.mover();
       
    }

    public LoopJuego(GraphicsContext gc) {
        this.gc = gc;
        this.carro = new Carro(0,200);
    }   
    
}
