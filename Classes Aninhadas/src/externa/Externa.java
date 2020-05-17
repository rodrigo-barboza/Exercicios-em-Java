package externa;

// anotações
@Informacao(
    autor = "rodrigo",
    aulaNumero = 65,
    blog = "rodrigo.com"
)

public class Externa {
    private String texto = "texto externo";
    
    public class Interna {
        private String texto = "texto interno";
        public void imprimeTexto(){
            System.out.println (texto);
            
            // acessando a mais externa
            System.out.println (Externa.this.texto);
        }
    }
    public static void main(String[] args) {
        Externa externa = new Externa();
        Interna interna = externa.new Interna();
        
        interna.imprimeTexto();
    }  
    
}
