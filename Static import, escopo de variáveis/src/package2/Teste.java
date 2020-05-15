package package2;
public class Teste {
    public static void main (String[] args){
        EscopoVariaveis escopo = new EscopoVariaveis();
        
        escopo.setValor(10);
        System.out.println (escopo.getValor());
        System.out.println (escopo.calculaValor(20));
        System.out.println (escopo.getValor());
        System.out.println (escopo.teste());
        System.out.println (escopo.getValor());
        
        int[] vet = new int[]{2,3,4,6,1,42};
        
        for (int c: vet)
            System.out.println (c);
    }
}
