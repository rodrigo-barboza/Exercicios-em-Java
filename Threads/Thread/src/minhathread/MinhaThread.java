package minhathread;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MinhaThread extends Thread{
    private String nome;
    private int tempo;
    
    public MinhaThread(String nome, int tempo){
        this.nome = nome;
        this.tempo = tempo;
        start();
    }
    
    @Override
    public void run(){
        
        try {
            for (int c=0; c<6; c++){
                System.out.println(nome +" contador " + c);
                Thread.sleep(this.tempo);
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(MinhaThread.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println (this.nome +" terminou a execução. ");
    }
    
}
