package ex.pkg02;

public class ContaCorrente {
    private int numero;
    private double saldo;
    private boolean status;
    
    ContaCorrente (){
        this.numero = 1;
        this.saldo  = 100.00;
        this.status = false;
    }
    
    // metodo para realizar saque, verificando se o cliente pode realizar saques
    public String sacar (double saque){
        if (this.saldo > 0.00 && this.saldo >= saque){
            this.saldo -= saque;
            return "Saque efetuado.";
        } else return "Saldo insuficiente.";
    }
    
    // deposita na conta
    public String depositar (double deposito){
        this.saldo += deposito;
        return "Depositado com sucesso";
    }
    
    // retorna o saldo atual
    public double consultarSaldo (){
        return this.saldo;
    }
    
    // verificar se o cliente está usando cheque especial ou não
    public String verificar (){
        if (status) return "Você usa cheque especial.";
        else return "Você não usa cheque espacil. ";
    }
}
