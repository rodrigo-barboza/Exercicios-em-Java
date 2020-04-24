package ex.pkg01;

public class Lampada {
    private boolean estado;
    
    Lampada (){
        this.estado = false;
    }
    public void setEstado (boolean estado){
        this.estado = estado;
    }
    
    public boolean getEstado (){
        return this.estado;
    }
    
    public String ligar (){
        if (!this.estado){
            this.estado = true;
            return "Lampada ligada";
        }
        else return "Lampada já está ligada";
    }
    
    public String desligar (){
        if (this.estado){ 
            this.estado = false;
            return "Lampada desligada";
        }
        else return "Lampada já está desligada";
    }
}
