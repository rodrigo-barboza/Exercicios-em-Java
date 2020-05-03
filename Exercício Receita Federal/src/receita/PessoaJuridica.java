package receita;
public class PessoaJuridica extends Contribuintes {
    private double rendaBruta;
    private double imposto;
    
    public PessoaJuridica (){
        rendaBruta = 0.00;
        imposto = 0.1;
        setNome("Não informado");
    }
    
    public void setRendaBruta (double renda){
        rendaBruta = renda;
    }
    
    public double getRendaBruta (){
        return rendaBruta;
    }
    
    public double getImposto (){
        return imposto;
    }
    
    @Override
    public double calcularImposto (){
        return  getImposto()*getRendaBruta();
    }
    
    @Override
    public String toString (){
        return "----------------------------------------------\n" +
                super.toString() +
                "Renda bruta: " + getRendaBruta() + "\n" +
                "Taxa de imposto (pessoa jurídica): " + getImposto()*100 + "%\n" +
                "Imposto: " + calcularImposto() + "\n" +
                "----------------------------------------------";
    }
}
