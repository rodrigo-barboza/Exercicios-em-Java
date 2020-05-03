package receita;
public class PessoaFisica extends Contribuintes{
    private double rendaBruta;
    private double imposto;
    
    public PessoaFisica (){
        setNome("Não informado");
        rendaBruta = 0.00;
    }
    
    public void setRendaBruta(double renda){
        rendaBruta = renda;
    }
    
    public double getRendaBruta (){
        return rendaBruta;
    }
    
    public void setImposto (double imposto){
        this.imposto = imposto/100;
    }
    
    public double getImposto (){
        return imposto;
    }
    
    @Override
    public double calcularImposto (){
        if (getRendaBruta()>=0 && getRendaBruta() <= 1400){
            return 0.00;
        } else if (getRendaBruta()> 1400 && getRendaBruta() <= 2100){
            setImposto (10);
            return getRendaBruta()*getImposto();
        } else if (getRendaBruta()> 2100 && getRendaBruta() <= 2800){
            setImposto (15);
            return getRendaBruta()*getImposto();
        } else if (getRendaBruta()> 2800 && getRendaBruta() <= 3600){
            setImposto (25);
            return (getRendaBruta()*getImposto());
        } else if (getRendaBruta()> 3600){
            setImposto (30);
            return getRendaBruta()*getImposto();
        } else return -1;
    }
    
    @Override
    public String toString (){
        return "----------------------------------------------\n" +
                super.toString() +
                "Renda bruta: " + getRendaBruta() + "\n" +
                "Taxa de imposto (pessoa física): " + getImposto()*100 + "%\n" +
                "Imposto: " + calcularImposto() + "\n" +
                "----------------------------------------------";
    }
}
