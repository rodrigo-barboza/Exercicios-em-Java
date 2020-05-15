package package2;
public class EscopoVariaveis {
    private int valor;
    
    public void setValor (int valor){
        this.valor = valor;
    }
    
    public int getValor (){
        return valor;
    }
    
    public int calculaValor (int valor){
        valor = valor + 10;
        return valor;
    }
    
    public int teste (){
        int valor = 5;
        
        if (true){
            valor--;
        }
         
        return valor;
    }
}
