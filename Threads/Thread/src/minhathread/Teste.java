package minhathread;
public class Teste {
    public static void main (String[] args){
        MinhaThread thread = new MinhaThread("Thread 1", 500);
        MinhaThread thread2 = new MinhaThread("Thread 2", 1000);
        MinhaThread thread3 = new MinhaThread("Thread 3", 200);
    }   
}
