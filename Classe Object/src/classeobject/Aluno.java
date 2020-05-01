package classeobject;

import java.util.Arrays;
import java.util.Objects;

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
    
    /*@Override
    public String toString (){
        String s = curso + "\n";
        // estrutura do for melhorado
        // a variavel nota do tipo double vai receber os elementos de notas
        for (double nota: notas){
            s += nota + " ";
        }
        return s;
    }*/

    @Override
    public String toString() {
        return "Aluno{" + "curso=" + curso + ", notas=" + notas  + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Aluno other = (Aluno) obj;
        if (!Objects.equals(this.curso, other.curso)) {
            return false;
        }
        if (!Arrays.equals(this.notas, other.notas)) {
            return false;
        }
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
