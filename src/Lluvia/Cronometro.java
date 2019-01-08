package Lluvia;


/**
 *
 * @author Ricardo Andrés Calvo
 */
public class Cronometro extends Thread {
    
    private int minutos;
    private int segundos;
    private boolean activo;
    
    @Override
    public void run(){
        while(activo){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                ex.getMessage();
            }
            sumarSegundo();
        }
    }

    public Cronometro() {
        this.minutos = 0;
        this.segundos = 0;
        this.activo = true;
    }
    
    public int getMinutos() {
        return this.minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundos() {
        return this.segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }
    
    private void sumarSegundo(){
        if(segundos==59){
            segundos=0;
            minutos++;
        }else{
            segundos++;
        }
    }

    public boolean isActivo() {
        return this.activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    
    
    public String getCadena(){
        if(this.minutos<10 && this.segundos<10){
            return "0"+this.minutos+":"+"0"+this.segundos;
        }else if(this.minutos>=10 && this.segundos<10){
            return this.minutos+":"+"0"+this.segundos;
        }else if(this.minutos<10 && this.segundos>=10){
            return "0"+this.minutos+":"+this.segundos;
        }else{
            return +this.minutos+":"+this.segundos;
        }
    }
}
