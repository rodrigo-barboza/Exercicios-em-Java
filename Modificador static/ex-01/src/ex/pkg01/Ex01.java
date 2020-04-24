package ex.pkg01;
/*
    ENUNCIADO:
    https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aula-34

    AUTOR: RODRIGO BARBOZA
    DATA: 24/04/2020
*/
public class Ex01 {
    public static void main(String[] args) {
        Contador cont = new Contador (); 
        System.out.println (Contador.atual());
        Contador.incrementa();
        Contador.incrementa();
        System.out.println (Contador.atual());
        Contador.incrementa();
        System.out.println (Contador.atual());
        Contador.zera();
        System.out.println (Contador.atual());
    }
    
}
