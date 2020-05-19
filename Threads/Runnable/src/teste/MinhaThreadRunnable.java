package teste;
/*
    Threads são tarefas que são executadas no programa
    * porque usar o implements Runnable ao invés de apenas extender o Thread?
      - no java só se pode extender uma classe, então se no meu projeto eu precisar extender mais de uma
        classe, será melhor optar por implementar a interface Runnable, pois eu posso implementar quantas
        interfaces eu quiser.

      - instancia.isAlive(); retorna 1 ou 0
      - intancia.join();
*/
public class MinhaThreadRunnable implements Runnable  {
    
    private String nome;
    private int tempo;
    
    public MinhaThreadRunnable (String nome, int tempo){
        this.nome = nome;
        this.tempo = tempo;
        // para iniciar a thread com a função start da classe Thread
        // tenho que criar uma imstância dela
       // Thread _t = new Thread(this);
       // _t.start();
    }
    
    @Override
    public void run(){
        try{
            for (int c=0; c<5; c++){
                System.out.println (this.nome + " cont " + c);
                Thread.sleep(this.tempo);
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        
        System.out.println ("Fim de execução: " + this.nome);
            
    }
}
