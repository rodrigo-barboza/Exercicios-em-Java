package ex.pkg01;
public class Contador {
    private static int cont=0;
    // incrementa sempre que for instanciada
    Contador (){
        cont++;
    }
    public static void incrementa (){
        cont++;
    }
    public static int atual (){
        return cont;
    }
    
    public static void zera (){
        cont = 0;
    }
        
}
