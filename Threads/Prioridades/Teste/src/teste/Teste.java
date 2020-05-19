package teste;

public class Teste {
    public static void main(String[] args) {
        MinhaThreadRunnable t1 = new MinhaThreadRunnable ("#1", 500);
        MinhaThreadRunnable t2 = new MinhaThreadRunnable ("#2", 500);
        MinhaThreadRunnable t3 = new MinhaThreadRunnable ("#3", 500);
        
        Thread _t1 = new Thread (t1);
        Thread _t2 = new Thread (t2);
        Thread _t3 = new Thread (t3);
        
        // como definir prioridades para as threads
        // parametro da prioridade é de 1 a 10
        _t1.setPriority(7);
        _t2.setPriority(1);
        _t3.setPriority(5);
        
        // também pode-se usar para definir prioridades
        /*
        _t1.setPriority(Thread.NORM_PRIORITY);
        _t1.setPriority(Thread.MAX_PRIORITY);
        _t1.setPriority(Thread.MIN_PRIORITY);
        */
      
        _t1.start(); _t2.start(); _t3.start(); 
    }
    
}
