package diasemana;

public class Teste {
    public static void main (String[] args){
        usandoEnum();
    }
    private static void usandoConstantes (){
        int segunda = DiaSemana.SEGUNDA;
        int terca = DiaSemana.TERCA;
        int quarta = DiaSemana.QUARTA;
        int quinta = DiaSemana.QUINTA;
        int sexta = DiaSemana.SEXTA;
        int sabado = DiaSemana.SABADO;
        int domingo = DiaSemana.DOMINGO;
        
        /*imprimeDiaSemana(segunda);
        imprimeDiaSemana(terca);
        imprimeDiaSemana(quarta);
        imprimeDiaSemana(quinta);*/
        
    }
    
    private static void imprimeDiaSemana (EnumDiaSemana dia){
        switch(dia){
            case SEGUNDA: System.out.println ("Segunda");
            break;
            case TERCA: System.out.println ("Terça");
            break;
            case QUARTA: System.out.println ("Quarta");
            break;
            case QUINTA: System.out.println ("Quinta");
            break;
            case SEXTA: System.out.println ("Sexta");
            break;
            case SABADO: System.out.println ("Sábado");
            break;
            case DOMINGO: System.out.println ("Domingo");
            break;
        }
    }
    
    public static void sad (){
        System.out.println ("What the shit men...");
    }
    
    private static void usandoEnum (){
        EnumDiaSemana segunda = EnumDiaSemana.SEGUNDA;
        EnumDiaSemana terca = EnumDiaSemana.TERCA;
        EnumDiaSemana quarta = EnumDiaSemana.QUARTA;
        EnumDiaSemana quinta = EnumDiaSemana.QUINTA;
        
    }
}