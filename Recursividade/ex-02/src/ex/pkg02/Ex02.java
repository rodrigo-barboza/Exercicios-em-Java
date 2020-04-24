package ex.pkg02;
/*
    ENUNCIADO:
    https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aula-35

    AUTOR: RODRIGO BARBOZA
    DATA: 24/04/2020
*/
public class Ex02 {
    public static void main(String[] args) {
       System.out.println (somatorio(100));
    }
    public static int somatorio (int num){
        if (num == 1) return 1;
        return num + somatorio(num-1);
    }
}
