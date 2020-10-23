package condicionescompetencias_interrupcion;

/**
 *
 * @author José Alfredo Moreno Suárez
 */
public class Interrupcion {
    private boolean inter;
    
    Interrupcion(){
        inter=true; //true; actuva la Interrupcion
    }
    
    
    
    public boolean isInter() {
        return inter;
    }
    public void setInter(boolean inter) {
        this.inter = inter;
    }
    
}
