package ex.pkg01;
/*
    ENUNCIADO
    https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-28-a-33
    
    AUTOR: RODRIGO BARBOZA
    DATA: 22/04/2020

*/
public class Ex01 {
    public static void main(String[] args) {
       Lampada show = new Lampada ();
       System.out.println (show.getEstado());
       show.setEstado(true);
       System.out.println (show.getEstado());
       System.out.println (show.desligar());
       System.out.println (show.desligar());
       System.out.println (show.ligar());
       System.out.println (show.ligar());
       System.out.println (show.desligar());
        
    }
    
}
