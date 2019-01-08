
package Lluvia;

import javafx.animation.AnimationTimer;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;
import javafx.scene.text.Font;

/**
 *
 * @author Ricardo Andrés Calvo
 */
public class LoopJuego extends AnimationTimer {
    private final GraphicsContext gc;
    private final Image fondo;
    private final Gato gato;
    private final Gota[] gotas;
    private int choques;
    private long cont;
    private final Font font;
    private final Cronometro cronometro;
    public static boolean cerrar = false;
   
    @Override
    public void handle(long l) {
        
        //borrar y redibujar el fondo
        gc.clearRect(0, 0, 1024, 512);
        gc.drawImage(fondo, 0, 0);
        
        //recrear movimiento gato
        if(gato.getX()>=1024){
            gato.setX(-132);
        }
        gc.drawImage(gato.getImagen(), 132*gato.getNumMov(), 0, 132, 80, gato.getX(), gato.getY(), 132, 80);
        gato.Avanzar(cont);
        
        //dibujar las gotas
        for (Gota gota : this.gotas) {
            gc.setFill(Color.AQUA);
            gc.fillOval(gota.getX(), gota.getY(), 15, 15);
            gc.setFill(Color.BLACK);
            gc.strokeOval(gota.getX(), gota.getY(), 15, 15);
            gota.Avanzar();
        }
        
        //dibujar contador choques
        gc.setFill(Color.WHITE);
        gc.setFont(this.font);
        gc.fillText("Choques : "+this.choques, 875, 495);
        
        //dibujar cronometro
        gc.setFill(Color.WHITE);
        gc.setFont(this.font);
        if(this.cont==0){
            cronometro.start();
        }
        if(LoopJuego.cerrar){
            cronometro.setActivo(false);
            cronometro.interrupt();
        }        
        gc.fillText(cronometro.getCadena(),20,495);
      
        //cerrar el juego después de tiempo dado.
        /*if(cronometro.getSegundos()==10){
            System.exit(0);    
        }*/
        
        //Event Manager
        for (Gota gota : gotas) {
            Shape interseccion = SVGPath.intersect(gato.getArea(),gota.getArea());
            if (interseccion.getBoundsInLocal().getWidth()!=-1 && interseccion.getBoundsInLocal().getHeight()!=-1) {
                gota.setY(0);
                gota.newVelocidad();
                this.choques++;
            }
        }
        //Actualizar el contador de tiempo
        this.cont++;
    }
    
    public LoopJuego(GraphicsContext gc) {
        this.gc = gc;
        this.fondo = new Image("Imagenes/fondo.png");
        this.gato = new Gato(20,350);
        this.gotas = new Gota[19];
        for (int i = 0; i < gotas.length; i++) {
            this.gotas[i] = new Gota(50*i+50,20);
        }
        this.cont = 0;
        this.choques = 0;
        this.font = new Font(20);
        this.cronometro = new Cronometro();
    }   
}
