package teste;
public abstract class ContaBancaria {
    private String nomeCliente;
    private int numConta;
    private double saldo;
    
    ContaBancaria (){
        nomeCliente = "default";
        numConta    = 000;
        saldo       = 0.00;
    }
    // saldo não pode ficar negativo
    public String sacar (double valor){
        if (this.saldo >= valor){
            this.saldo -= valor;
            return "sacado com sucesso!";
        } else return "saldo insuficiente.";            
    }
    
    public void depositar (double valor){
        this.saldo += valor;
    }
    
    public void setNomeCliente (String nome){
        this.nomeCliente = nome;
    }
    
    public String getNomeCliente (){
        return nomeCliente;
    }
    
    public void setNumConta (int num){
        this.numConta = num;
    }
    
    public int getNumConta (){
        return numConta;
    }
    
    public void setSaldo (double saldo){
        this.saldo = saldo;
    }
    public double getSaldo (){
        return saldo;
    }  
    
    public String toString (){
        return "Nome: " + getNomeCliente() + "\n"
                + "Número da conta: " + getNumConta() + "\n"
                + "Saldo: " + getSaldo()+ "\n";
    }
}