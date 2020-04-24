package ex.pkg03;

public class Aluno {
    private String nome;
    private int matricula;
    private String curso;
    private String disciplinas[];
    private double notas[];
    
    Aluno (){
        this.nome = "rodrigo";
        this.matricula = 12;
        this.curso = "Eng Comp";
        this.disciplinas = new String[]{"Programação","Eletrônica","OAC"};
        this.notas = new double[] {7, 7, 7};
    }
    
    public void setNome (String nome){
        this.nome = nome;
    }
    
    public void setCurso (String curso){
        this.curso = curso;
    }
    
    public void setDisciplinas (String m1, String m2, String m3){
        this.disciplinas = new String[]{m1,m2,m3};
    }
    
    public void setNotas (double n1, double n2, double n3){
        this.notas = new double[] {n1, n2, n3};
    }
    
    public String getNome (){
        return this.nome;
    }
    
    public int getMatricula (){
        return this.matricula;
    }
    
    public String getCurso (){
        return this.curso;
    }
    
    public String getDisciplinas (int c){
        return this.disciplinas[c];
    }
    
    public double getNotas (int c){
        return this.notas[c];
    }
    
    public String getMedia (){
        float media = 0;
        for (int c=0; c<3; c++){
            media += this.notas[c];
        }
        if (media/3 >= 7){
            return "Aprovado! Média = " + media/3;
        } else return "Reprovado. Média = " + media/3;
    }
}
