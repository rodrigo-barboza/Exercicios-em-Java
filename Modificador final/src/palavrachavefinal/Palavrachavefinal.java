package palavrachavefinal;
/*
    * a palavra chave "final" não permite extender para outra classe
    * final em variáveis
        final String valorImutavel = "valorInicial";
        valorImutavel = "novoValor" -> não pode ser feito porque a variavel 
    possui o modificador final
    * nomenclatura em constantes
        public static final String EXEMPLO_VARIAVEL_CONSTANTE = "www.google.com";
*/
public class Palavrachavefinal {
    public static void main(String[] args) {
       Aluno aluno = new Aluno();
       Professor professor = new Professor();
       
       // imprimir a variavel que nao é constante
       System.out.println (Constantes.URL_BLOG);
       // se ela nao e constante eu posso modificar
       Constantes.URL_BLOG = "www.youtube.com";
       System.out.println (Constantes.URL_BLOG);
       // já na constante eu não posso fazer o mesmo
       System.out.println (Constantes.LINK_COMPLETO);
       // não posso alterar o valor da variável constante
       //Constantes.LINK_COMPLETO = "https://www.youtube.com";
       
    }
    
}
