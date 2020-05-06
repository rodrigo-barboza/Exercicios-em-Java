package diasemana.diasemana2;
public class TesteEnum {
    public static void main (String[] args){
        DiaSemana dia = DiaSemana.TERCA;
        
        System.out.println (dia.toString() + " - " + dia.getValor());
    }
}
