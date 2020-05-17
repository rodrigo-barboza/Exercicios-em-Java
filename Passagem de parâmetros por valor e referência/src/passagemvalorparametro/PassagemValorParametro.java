package passagemvalorparametro;
/*
    tipos primitivos: passagem por valor
    tipos classe, enum, array: passagem por referência
*/
public class PassagemValorParametro {
    public static void main(String[] args) {
        Contato contato = new Contato ("Contato 1", "1234-4567", "contato1@email.com");
        int valor = 10;
        
        System.out.println (contato);
        System.out.println (valor);
        
        testePassagemValorReferencia (valor, contato);
        
        System.out.println (contato);
        System.out.println (valor);
    }
    
    private static void testePassagemValorReferencia (int valor, Contato contato){
        int novoValor = valor + 10;
        valor = novoValor;
        
        //contato = new Contato ("Contato 2", "234-4567", "contatol@email.com");
        contato.setNome("Contato 2");
    }
}

