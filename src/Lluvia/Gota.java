
package Lluvia;

import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;

/**
 *
 * @author Ricardo Andrés Calvo
 */
public class Gota {
    private int X;
    private int Y;
    private int velocidad;
    private Shape area;

    public Gota(int X, int Y) {
        this.X = X;
        this.Y = (int) (Math.random()*400+1);
        this.velocidad = (int) (Math.random()*5+1);
        this.area = new Rectangle(this.X, this.Y, 15,15);
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

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
    
    public void newVelocidad(){
        this.velocidad = this.velocidad = (int) (Math.random()*5+1);
    }
    
    public void Avanzar(){
        this.Y+=this.velocidad;
        this.area = new Rectangle(this.X, this.Y, 15, 15);
        if(this.Y>=425){
            this.Y=0;
            this.velocidad = (int) (Math.random()*5+1);
        }
    }
    
}
