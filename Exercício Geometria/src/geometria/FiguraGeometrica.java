package geometria;
public abstract class FiguraGeometrica {
    private String nome;
    private String cor;
    
    public void setNome (String nome){
        this.nome = nome;
    }
    
    public void setCor (String cor){
        this.cor = cor;
    }
    
    public String getNome (){
        return nome;
    }
    
    public String getCor (){
        return cor;
    }
    
    public String toString(){
        return "\nCor: " + getCor() + "\n";
    }
}
