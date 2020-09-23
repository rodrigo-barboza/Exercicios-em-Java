/*
    * modificadores de acesso:
        modificador -> acesso

        + public      -> classe, subclasse, pacote, todos (pacotes, classes)
        # protected   -> classe, subclasse, pacote
        ! default     -> classe, pacote
        - private     -> classe
        
    * abstract
        uma classe abstrata nao pode ser instanciada diretamente:
            NomeClasse objeto = new NomeClasse();                      [ x ]
        ela só pode ser extendida por outras classes:
            public class NomeClasse extends NomeSuperClasseAbstrata {} [ v ]

   * exemplo
    Animal <- [ Ave <- (Papagaio), Mamifero <- (Cachorro, Gato) ]
        superClasse mae    public abstract class Animal {}
        superClasse filha  public abstract class Ave extends Animal {}
        superClasse filha  public abstract class Mamifero extends Animal {}
        classe filha       public class Papagaio extends Ave {}
        classe filha       public class Cachorro extends Mamifero {}
        classe filha       public class Gato extends Mamifero {}

*/
public class heranca {
    public static void main (String[] args){
        
        Aluno aluno = new Aluno("rodrigo", "rua tal", "0000", "curso");
        aluno.getNome();
        // uma super classe, já que Pessoa é a classe mãe, eu posso fazer:
        
        Pessoa aluno2 = new Aluno("rodrigo", "rua tal", "0000", "curso");
        // mas a super classe só da acesso ao que é comum entre as classes
    
        
    }
}
