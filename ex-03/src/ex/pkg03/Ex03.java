package ex.pkg03;
/*
    ENUNCIADO
    http://slideshare.net/loianeg/curso-java-basico-exercicios-aulas-28-a-33

    AUTOR: RODRIGO BARBOZA
    DATA: 22/04/2020
*/
public class Ex03 {
    public static void main(String[] args) {
        Aluno alu = new Aluno();
        
        System.out.println (alu.getNome());
        System.out.println (alu.getMatricula());
        System.out.println (alu.getCurso());
        for (int c=0; c<3; c++){
            System.out.println (alu.getDisciplinas(c));
        }
        for (int c=0; c<3; c++){
            System.out.println (alu.getNotas(c));
        }
        alu.setNome("Rodrigo Barboza");
        alu.setCurso("Engenharia de computação");
        alu.setDisciplinas("POO", "OAC II", "Banco de dados");
        alu.setNotas(9.50, 10.00, 9.0);
        
        System.out.println (alu.getNome());
        System.out.println (alu.getMatricula());
        System.out.println (alu.getCurso());
        for (int c=0; c<3; c++){
            System.out.println (alu.getDisciplinas(c));
        }
        for (int c=0; c<3; c++){
            System.out.println (alu.getNotas(c));
        }
        
        System.out.println ("Situação do aluno: " + alu.getMedia());
    }
    
}
