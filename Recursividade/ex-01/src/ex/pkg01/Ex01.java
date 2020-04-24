package ex.pkg01;
/*
    ENUNCIADO:
    https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aula-35

    AUTOR: RODRIGO BARBOZA
    DATA: 24/04/2020
*/
public class Ex01 {
    public static void main(String[] args) {
        System.out.println (fibonacci(13));
    }
    public static int fibonacci (int num){
        if (num <= 2) return 1;
        return fibonacci (num-1) + fibonacci(num-2);
    }
}
