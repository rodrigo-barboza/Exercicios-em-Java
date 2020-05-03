package geometria;
public class Geometria {
    public static void main(String[] args) {
        Cilindro  form1 = new Cilindro();
        Circulo   form2 = new Circulo();
        Cubo      form3 = new Cubo();
        Piramide  form4 = new Piramide();
        Quadrado  form5 = new Quadrado();
        Triangulo form6 = new Triangulo();
        
        form1.setCor("Azul");
        form2.setCor("Rosa");
        form3.setCor("Branco");
        form4.setCor("Amarelo");
        form5.setCor("Preto");
        form6.setCor("Roxo");
        
        FiguraGeometrica[] form = new FiguraGeometrica[6]; // upcasting
  
        form[0] = form1;
        form[1] = form2;
        form[2] = form3;
        form[3] = form4;
        form[4] = form5;
        form[5] = form6;
   
        for (FiguraGeometrica c: form)
            System.out.println (c);
        
        // ou 
        /*
            for (FiguraGeometrica c: form){
                System.out.println (figura.getCor());
                
                if (c instanceof Figura2D){
                    Figura2D f2d = (Figura2D) c; // downcasting
                    f2d.getArea();
                    [code]
                }
        
                if (c instanceof Figura3D){
                    Figura3D f3d = (Figura3D) c; // downcasting
                    f3d.getArea();
                    f3d.getVolume();
                    [code]
                }
            }
        
        */
    }
    
}
