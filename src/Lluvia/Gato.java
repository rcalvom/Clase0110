
package Lluvia;

import javafx.scene.image.Image;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;

/**
 *
 * @author Ricardo Andrés Calvo
 */
public class Gato {
    private Image imagen;
    private int numMov;
    private int X;
    private int Y;
    private final int velocidad;
    private Shape area;

    public Gato(int X, int Y) {
        this.imagen = new Image("Imagenes/cats.gif");
        this.X = X;
        this.Y = Y;
        this.numMov = 0;
        this.velocidad =(int) (Math.random() * 3 + 1);
        this.area = new Rectangle(this.X+18,this.Y+20,97,55);
    }

    public Image getImagen() {
        return imagen;
    }

    public void setImagen(Image imagen) {
        this.imagen = imagen;
    }

    public int getNumMov() {
        return numMov;
    }

    public void setNumMov(int numMov) {
        this.numMov = numMov;
    }

    public int getX() {
        return X;
    }

    public void setX(int X) {
        this.X = X;
    }

    public int getY() {
        return Y;
    }

    public void setY(int Y) {
        this.Y = Y;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public Shape getArea() {
        return area;
    }

    public void setArea(Shape area) {
        this.area = area;
    }

    public void Avanzar(long cont){
        if(cont%6==0){
            if(this.numMov==5){
                this.numMov=0;
            }else{
                this.numMov++;
            }
        }
        this.area = new Rectangle(this.X+18,this.Y+20,97,55);
        this.X+=this.velocidad;
    }
}
