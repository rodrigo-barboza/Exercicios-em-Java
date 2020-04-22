package ex.pkg02;
/*
    ENUNCIADO:
    https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-28-a-33

    AUTOR: RODRIGO BARBOZA
    DATA: 22/04/2020
*/
public class Ex02 {
    public static void main(String[] args) {
        ContaCorrente cliente = new ContaCorrente();
        System.out.println (cliente.consultarSaldo());
        System.out.println (cliente.sacar(75.00));
        System.out.println (cliente.consultarSaldo());
        System.out.println (cliente.depositar (30.00));
        System.out.println (cliente.consultarSaldo());
        System.out.println (cliente.sacar(60.00));
        System.out.println (cliente.sacar(55.00));
        System.out.println (cliente.consultarSaldo());
        System.out.println (cliente.depositar(1000.00));
        System.out.printf ("%.2f\n", cliente.consultarSaldo());
        
    }
    
}
