package teste;

public class Teste {
    public static void main(String[] args) {
        MinhaThreadRunnable t1 = new MinhaThreadRunnable ("T1", 300);
        MinhaThreadRunnable t2 = new MinhaThreadRunnable ("T2", 600);
        MinhaThreadRunnable t3 = new MinhaThreadRunnable ("T3", 800);
        
        Thread _t1 = new Thread(t1);
        Thread _t2 = new Thread(t2);
        Thread _t3 = new Thread(t3);
        
        _t1.start(); _t2.start(); _t3.start();
        
        try{
            _t1.join(); _t2.join(); _t3.join();
        }catch (Exception e){
            e.printStackTrace();
        }
        
        System.out.println ("Programa finalizado. ");
    }
    
}
