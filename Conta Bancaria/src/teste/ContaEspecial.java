package teste;
// subclasse
public class ContaEspecial extends ContaBancaria{
    private double limite;
    
    public void setLimite (double limite){
        this.limite = limite;
    }
    // sobreescreva o método sacar com a nova lógica necessária
    @Override
    public String sacar (double saque){
        if (saque <= this.limite && saque <= getSaldo()){
            setSaldo(getSaldo()- saque);
            return "Sacado com sucesso!";
        } else {
            return "Limite insuficiente";
        }
    }
    
    public String toString (){
        return "-------------------------------------------\n" +
                "Tipo de conta: Especial\n"
                + "Limite: " + limite + "\n"
                + super.toString()
                + "-------------------------------------------";
    }
}