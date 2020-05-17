package coletorlixo;
public class ColetorLixo {
    public static void obterMemoriaUsada (){
        final int MB = 1024 * 1024;
        // classe runtime
        // padrão singleton
        Runtime runtime = Runtime.getRuntime();
        
        // calcular o total de memória que o programa esta usando 
        System.out.println ((runtime.totalMemory() - runtime.freeMemory())/MB);
        
    }
    public static void main(String[] args) {
        Contato[] contato = new Contato[100000];
        Contato contatos;
        
        for (int c=0; c<contato.length; c++){
            contatos = new Contato ("Contato"+c, "1234-5678"+c, "contato"+c+"@email.com");
            contato[c] = contatos;
        }
        
        System.out.println ("Contatos criados");
        
        obterMemoriaUsada();
        
        contatos = null;
        
        Runtime.getRuntime().runFinalization();
        
        // forçando o garbage collector
        // não é garantido que o gc seja executado, mas é feita uma solicitação
        Runtime.getRuntime().gc();
        
        obterMemoriaUsada();
        
        System.out.println ("Contatos removidos da memória");
     }
    
}
