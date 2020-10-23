package condicionescompetencias_interrupcion;
import java.util.ArrayList;
/**
 *
 * @author José Alfredo Moreno Suárez
 */
public class RCompartido {
    private String datoCompartido; 
    private ArrayList<Interrupcion> interrupciones;
    
    RCompartido(){
        datoCompartido = "";
        interrupciones = new ArrayList<Interrupcion>();
        for(int i=0;i<10;i++){
            interrupciones.add(new Interrupcion());
        }
    }
    
    public String getDatoCompartido(){
        /*String aux = "En Espera...";
        if(isEntra()){//Aqui i es un objeto, no un entero
            bloquea();
            aux = datoCompartido;
            desbloquea();
        }   
        return aux;*/
        return datoCompartido;
    }
    public void setDatoCompartido(String datoCompartido){
        /*for(Interrupcion i: interrupciones)
            if(i.isInter())
                this.datoCompartido = datoCompartido;*/
        this.datoCompartido=datoCompartido;
    }
    
    public ArrayList<Interrupcion> getInterrupciones(){
        return interrupciones;
    }
    public void setInterrupciones(ArrayList<Interrupcion> interrupciones){
        this.interrupciones = interrupciones;
    }
    
    public void bloquea(){
        for(Interrupcion i: interrupciones)
            i.setInter(false);
    }
    public void desbloquea(){
        for(Interrupcion i: interrupciones)
            i.setInter(true);
    }
    
    public boolean isEntra(){
        boolean ban = false;
        for(Interrupcion i: interrupciones)
            if(i.isInter())
                ban=true;
            else return false;
        return ban;
    }
}
