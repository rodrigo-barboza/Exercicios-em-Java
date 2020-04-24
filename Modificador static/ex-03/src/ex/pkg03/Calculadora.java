package ex.pkg03;
public class Calculadora {
    public static double somar (double a, double b){
        return a+b;
    }
    
    public static double subtrair (double a, double b){
        return a-b;
    }
    
    public static double multiplicar (double a, double b){
        return a*b;
    }
    
    public static double dividir (double a, double b){
        return a/b;
    }
    
    public static double elevar (double a, double n){
        return (double) Math.pow(a, n);
    }
    // fatorial recursivo
    public static double fatorial (double x){
        if (x == 0) return 1;
        else return (x * fatorial (x-1));
    }
}