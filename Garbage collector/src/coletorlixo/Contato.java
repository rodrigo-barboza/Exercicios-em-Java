package coletorlixo;
public class Contato {
    private String nome;
    private String numero;
    private String email;

    public Contato(String nome, String numero, String email){
        this.nome = nome;
        this.email = email;
        this.numero = numero;
    }
    
    public Contato() {}
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contato{" + "nome=" + nome + ", numero=" + numero + ", email=" + email + '}';
    }
}
