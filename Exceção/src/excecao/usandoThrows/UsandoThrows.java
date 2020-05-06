package excecao.usandoThrows;
import java.util.Scanner;
/*  Object ]-> Throwable -> Error (acontece em tempo de excecução e 
                         -> Exception
    A superclasse de todas as classes do java é a Object
    A superclasse de todos os erros do java é o Throwable
    Error: acontece em tempo de excecução e vai fazer com que o programa termine a execução
           erro não verificado e nãos e tem como tratar
    Exception: conseguimos tratar as exceptions
        tipos:
            - checked  
            - unchecked (RuntimeException): que acontecem em tempo de execução do programa
*/
public class UsandoThrows {
    public static void main (String[] args){
        System.out.print ("Digite um número decimal: ");
        try {
            double num = leNumero();
        } catch (Exception err){
            System.out.println (err.getMessage());
            err.printStackTrace();
        }
    }
    
    // para capturar a exceção com o throws sem usar o try, catch
    public static double leNumero() throws Exception {
        Scanner input = new Scanner(System.in);
        double num = input.nextDouble();
        return num;
    }
}