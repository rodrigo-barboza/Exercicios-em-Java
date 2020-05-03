package receita;

public class Receita {
    public static void main(String[] args) {
        PessoaJuridica pj1 = new PessoaJuridica();
        pj1.setNome("Rodrigo Barboza");
        pj1.setRendaBruta(3600);
        
        PessoaFisica pf1 = new PessoaFisica();
        pf1.setNome("Leandro Ramos");
        pf1.setRendaBruta(2700);
        
        PessoaJuridica pj2 = new PessoaJuridica();
        pj2.setNome("nome 2");
        pj2.setRendaBruta(3000);
        
        PessoaFisica pf2 = new PessoaFisica();
        pf2.setNome("nome 3");
        pf2.setRendaBruta(1700);
        
        PessoaJuridica pj3 = new PessoaJuridica();
        pj3.setNome("nome 4");
        pj3.setRendaBruta(2100);
        
        PessoaFisica pf3 = new PessoaFisica();
        pf3.setNome("nome 5");
        pf3.setRendaBruta(1300);
        
        Contribuintes[] contribuinte = new Contribuintes[6];
        contribuinte[0] = pf1;
        contribuinte[1] = pf2;
        contribuinte[2] = pf3;
        contribuinte[3] = pj1;
        contribuinte[4] = pj2;
        contribuinte[5] = pj3;
        
        for (Contribuintes c: contribuinte)
            System.out.println (c.toString());
    }
    
}
