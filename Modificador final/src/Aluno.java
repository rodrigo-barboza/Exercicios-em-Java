package palavrachavefinal;
/*
    a classe Aluno herda a classe Pessoa, pois tem em comum 
    os atributos

*/
public class Aluno{
    private String curso;
    private double[] notas;
    
    Aluno(){
        
    }
    // this  --> faz referencia a propria classe
    // super --> faz referencia a super classe, nesse caso Pessoa
    public Aluno (String nome, String endereco, String telefone, String curso){
        //super (nome, endereco, telefone);
        this.curso = curso;
    }
    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }
    
    public double calcularMedia (){
        return 0;
    }
    
    public boolean verificarAprovado (){
        return true;
    }
    
    public void metodoQualquer (){
        // this tem acesso a todos elementos tanto da sua classe
        // quanto da super classe
        //this.getCpf();
        // ja super tem acesso apenas aos elementos da super classe
        //super.getCpf();
    }
    
}
