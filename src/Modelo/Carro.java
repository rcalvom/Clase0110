
package Modelo;

/**
 *
 * @author Estudiante
 */
public class Carro {
    private int X;
    private int Y;
    private Chasis chasis;
    private Llanta[] llantas;

    public Carro(int X, int Y) {
        this.X = X;
        this.Y = Y;
        this.chasis = new Chasis(X,Y);
        this.llantas = new Llanta[2];
        for (int i = 0; i < this.llantas.length; i++) {
            this.llantas[i] = new Llanta(X,Y);
        }
    }
    
    public Carro(){
        this.llantas = new Llanta[2];
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

    public Chasis getChasis() {
        return chasis;
    }

    public void setChasis(Chasis chasis) {
        this.chasis = chasis;
    }

    public Llanta[] getLlantas() {
        return llantas;
    }

    public void setLlantas(Llanta[] llantas) {
        this.llantas = llantas;
    }
    
    public void mover(){
        this.X++;
    }
    
    
}
