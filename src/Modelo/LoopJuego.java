
package Modelo;

import javafx.animation.AnimationTimer;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

/**
 *
 * @author Estudiante
 */
public class LoopJuego extends AnimationTimer {
    private GraphicsContext gc;
    private Carro carro;
    private Image fondo;
    private Image gato;
    private Image down0;
    private int imgato;
    private int cont;
   
    public void handle(long l) {
        
        gc.clearRect(0, 0, 1024, 512);
        
        gc.drawImage(fondo, 0, 0);
        
        if(this.cont%6==0){
            if(this.imgato<5){
                this.imgato++;
            }else{
                this.imgato=0;
            }
        }
        
        gc.drawImage(gato, (132*imgato), 0, 132, 80, 20+cont, 350, 132, 80);
        
        int[] velocidades = new int[18];
        if(cont ==1){
            for (int i = 0; i < 18; i++) {
                velocidades[i] = (int) ((Math.random()*10)%6)+1;
            }
        }
       
            gc.fillOval(50, cont+velocidades[0], 15, 15);
        
            gc.fillOval(100, 20+velocidades[1], 15, 15);
            gc.fillOval(150, 20+velocidades[2], 15, 15);
            gc.fillOval(200, 20+velocidades[3], 15, 15);
            gc.fillOval(250, 20+velocidades[4], 15, 15);
            gc.fillOval(300, 20+velocidades[5], 15, 15);
            gc.fillOval(350, 20+velocidades[6], 15, 15);
            gc.fillOval(400, 20+velocidades[7], 15, 15);
            gc.fillOval(450, 20+velocidades[8], 15, 15);
            gc.fillOval(500, 20+velocidades[9], 15, 15);
            gc.fillOval(550, 20+velocidades[10], 15, 15);
            gc.fillOval(600, 20+velocidades[11], 15, 15);
            gc.fillOval(650, 20+velocidades[12], 15, 15);
            gc.fillOval(700, 20+velocidades[13], 15, 15);
            gc.fillOval(750, 20+velocidades[14], 15, 15);
            gc.fillOval(800, 20+velocidades[15], 15, 15);
            gc.fillOval(850, 20+velocidades[16], 15, 15);
            gc.fillOval(900, 20+velocidades[17], 15, 15);
        
        cont++;
        
        gc.setFill(Color.BLUE);
        //gc.strokeRect(200, 20, 30, 39);
        //gc.strokeRect(20+cont, 350, 132, 80);
        //gc.drawImage(down0, 200, 20);
        
        //Shape sdown = new Rectangle(200,20,30,39);
        Shape sgato = new Rectangle(20+cont,350,132,80);
        Shape[] aOval = new Shape[17];
        int random;
        for (int i = 0; i < 17; i++) {
            aOval[i] = new Rectangle(50+(i*50), 20, 15, 15);
        }
        
        //Shape interseccion = SVGPath.intersect(sdown,sgato);
        //if (interseccion.getBoundsInLocal().getWidth()!=1) {
        //    stop();
        //}
        
        
        
        //gc.drawImage(gato, 264, 0, 132, 80, 160, 20, 132, 80);
                
        //gc.drawImage(gato, 50, 50);
        //int x = this.carro.getX();
        /*gc.setFill(Color.BLUE);
        double[] Chasisx = {x+50,x+60,x+65,x+85,x+90,x+100,x+100,x+50,x+50};
        double[] Chasisy = {100,100,85,85,100,100,110,110,100};
        gc.fillPolygon(Chasisx, Chasisy, Chasisx.length);
        gc.setFill(Color.GRAY);
        gc.fillOval(x+55, 110, 10, 10);
        gc.fillOval(x+85, 110, 10, 10);
        
        this.carro.mover();        */
        
    }

    public LoopJuego(GraphicsContext gc) {
        this.gc = gc;
        this.carro = new Carro(0,200);
        this.fondo = new Image("Imagenes/fondo.png");
        this.gato = new Image("Imagenes/cats.gif");
        this.imgato = 0;
        this.cont = 0;
        this.down0 = new Image("Imagenes/down0.png");
    }   
    
}
