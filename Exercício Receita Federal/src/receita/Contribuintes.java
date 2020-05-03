package receita;
public abstract class Contribuintes {
    private String nome;
   
    public void setNome (String nome){
        this.nome = nome;
    }
    
    public String getNome (){
        return nome;
    }
    
    public String toString(){
        return "Nome: " + getNome() + "\n";
    }
    
    public abstract double calcularImposto();
}
