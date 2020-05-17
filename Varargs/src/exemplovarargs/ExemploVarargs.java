package exemplovarargs;
/*
    * varargs é o nome de um recurso da linguagem java que permite
      passar infinitos parâmetros para um método sem ter que declarar 
      todos os parâmetros

*/
public class ExemploVarargs {
    public static void main(String[] args) {
        System.out.println (soma(1,2));
        System.out.println (soma(1,2,3));
        
        int[] vetor = new int[]{1,2,3,4,5};
        System.out.println (soma(vetor));
        
        // com o varargs
        System.out.println (soma(1,2,3,4,5,6,7));
    }
    
    static int soma(int a, int b){
        return a+b;
    }
    
    static int soma(int a, int b, int c){
        return a+b+c;
    }
    
    static int soma (int[] vetor){
        int total = 0;
        
        for (int c: vetor) total += c;
        return total;
    }
    
    // com o varargs, aceita somente parâmetros de classes
    // Integer... vetor (vários parâmetros do tipo Integer, de nome vetor)
    // se for declarar outros parametros tem de ser antes do varargs
    static int soma (int a, int b, Integer... vetor){
        int total = 0;
        
        for (int c: vetor) total += c;
        return total;
    }
}