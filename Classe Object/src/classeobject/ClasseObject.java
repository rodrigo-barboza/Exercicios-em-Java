package classeobject;

public class ClasseObject {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        
        aluno.setCurso ("Computacao");
        double[] notas = {10, 8, 9, 7};
        aluno.setNotas(notas);
        System.out.println(aluno); // é o mesmo de fazer aluno.toString()
        
        String s1 = "rodrigoF";
        String s2 = "rodrigof";
        
        System.out.println (s1 == s2);
        // ou 
        System.out.println (s1.equals(s2));
        
        Aluno aluno2 = new Aluno();
        aluno2.setCurso ("Ciencias");
        double[] notas2 = {10, 8, 9, 7};
        aluno2.setNotas(notas2);
        
        System.out.println (aluno == aluno2);
        // a maneira melhor de fazer comparacoes entre objetos e
        System.out.println (aluno.equals(aluno2));
        // o método equals ele compara os atributos 
        
    }
    
}
