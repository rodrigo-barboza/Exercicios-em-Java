package staticimport;

// para não precisar ficar usando Math.pow();
// posso declarar uma importação static já para especificar qual quero usar

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

// ou para poder usar todos os métodos da classe Math
// import static java.lang.Math.*;

public class StaticImport {
    public static void main(String[] args) {  
        double a = 2;
        double b = 3;
        double c = 4;
        
        System.out.println (pow(a,b));
        System.out.println (sqrt(c));  
    }
    
}
