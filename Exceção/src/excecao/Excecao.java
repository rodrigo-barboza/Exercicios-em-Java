package excecao;
public class Excecao {
    /*
    
     * não tratar os erros em java, faz com que a execução do programa termine
     * permite que o programa execute uma determinada lógica caso o erro ocorra
     * permite que o programa continue a execução 
 
    * métodos classe Throwable:
        getMessege(); // retorna a descrição do erro 
        printStackTrace(); // imprime o stack trace do erro
    ex:
        try {
            [code]
        }catch (Exception nomeErro){
            System.out.println (nomeErro.getMessege());
            nomeErro.printStackTrace();
        }
     * throws
        - passa a responsabilidade para quem for utilizar o método
        - exceptions disparadas em tempo de excecução (ArrayOutofBound,Arithmetic)
        não necessitam de throws explicitamente.
    
    */
    
    public static void main(String[] args) {  
        // bloco para tratamento de erros
        // se ele não conseguir reproduzir, ele vai pegar a Exception e colocar
        // na variável name e imprimir o erro.
        try{
            int[] vetor = new int [4];
            vetor[5] = 1;
            System.out.println ("Antes da exception.");
        } catch (Exception name){
            System.out.println ("erro." + name);
        }
        
        System.out.println ("Depois da exception.");
        
        // outro exemplo:
        int[] num = {3, 4, 10, 5, 9};
        int[] den = {2, 0, 4, 8, 0}; // causa errro por divisão por zero
        
        // usar Throwable vai pegar o erro que ocorrer (não é uma boa prática), uma boa prática é usar o Exception
        for (int c=0; c<num.length; c++){
            try { // aqui porque existe a possibilidade de ocorrer um erro
                System.out.println (num[c]+"/"+den[c]+" = " + (num[c]/den[c]));
            } catch (Throwable erro){ // pego o erro e coloco na variável erro
                System.out.println (erro); // imprimo o motivo do erro e continuo a excecução
            }
            // finally sempre será executado, EXCETO se tiver por exemplo um System.exit(0) que força o termino do programa
            finally{
                System.out.println ("Linha impressa sempre após o try ou catch.");
            }
        }
    }
    
}
