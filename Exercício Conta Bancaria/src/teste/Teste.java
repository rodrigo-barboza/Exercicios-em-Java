/*
    exercícios: https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-36-a-43
 */
package teste;
public class Teste {
    public static void main(String[] args) {
        // abrindo novas contas
        ContaPoupanca cp1 = new ContaPoupanca();
        ContaEspecial ce1 = new ContaEspecial();
        ContaPoupanca cp2 = new ContaPoupanca();
        ContaEspecial ce2 = new ContaEspecial();
        
        cp1.setNomeCliente("Rodrigo");
        cp1.setNumConta (1234);
        cp1.setDiaRendimento(12.00);
        cp1.depositar(720.00);
        System.out.println (cp1.sacar(800.00));
        System.out.println (cp1.sacar(400.00));
        System.out.println (cp1.calcularNovoSaldo());
        System.out.println (cp1);
        
        ce1.setNomeCliente("Barboza");
        ce1.setNumConta (1345);
        ce1.setLimite(1200.00);
        ce1.depositar(320.00);
        System.out.println(ce1.getSaldo());
        System.out.println (ce1.sacar(800.00));
        System.out.println (ce1.sacar(200.00));
        System.out.println (ce1);
    }
    
}
