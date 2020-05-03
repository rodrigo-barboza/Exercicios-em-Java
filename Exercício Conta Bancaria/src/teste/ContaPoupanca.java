package teste;
// subclasse
public class ContaPoupanca extends ContaBancaria{
    private double diaRendimento;
    
    public void setDiaRendimento (double rendimento){
        this.diaRendimento = rendimento;
    }
    
    public double getDiaRendimento (){
        return this.diaRendimento;
    }
    // recebe a taxa de rendimento da poupança
    // e atualiza o saldo
    public double calcularNovoSaldo (){
         setSaldo (getSaldo() + diaRendimento);
         return getSaldo();
    }
    
    public String toString (){
        return "-------------------------------------------\n" +
                "Tipo de conta: Poupança\n"
                + "Rendimento ao dia: " + diaRendimento + "\n"
                + super.toString()
                + "-------------------------------------------";
    }
}