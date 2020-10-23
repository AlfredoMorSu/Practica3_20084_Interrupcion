package condicionescompetencias_interrupcion;

/**
 *
 * @author José Alfredo Moreno Suárez
 */
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextArea;

public class Hilo extends Thread{
    private JTextArea area;
    private RCompartido rc;
    private final static int ini = 195;
    private final static int fin = 200;
    private boolean dead=false;
    
    public Hilo(JTextArea area, RCompartido rc){
        this.area=area;
        this.rc=rc;
    }
    
    public void run(){
        while(true){
            try{
                String aux = "En Espera...";
                if(rc.isEntra()){//Aqui i es un objeto, no un entero
                    rc.bloquea();
                    rc.setDatoCompartido(this.getName());
                    area.append(rc.getDatoCompartido()+"\n");
                    if(isDead())//Aqui debe detenerse
                        stop();
                    rc.desbloquea();
                }else area.append(aux+"\n");
                Thread.sleep((int)(ini + Math.random()*fin));
            }catch(Exception e){System.out.println(e.getMessage());}
        }
    }
    
    public boolean isDead(){
        
        return dead=false;
    }
    
    public void setDead(boolean d){
        this.dead=d;
    }
}
