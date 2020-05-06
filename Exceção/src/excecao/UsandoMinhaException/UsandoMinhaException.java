package excecao.UsandoMinhaException;
public class UsandoMinhaException {
    public static void main (String[] args){
        int[] num = {4,8,5,16,32,21,64,128};
        int[] den = {2,0,4,8,0,2,4};
        
        for (int c=0; c<num.length; c++){
            try{
                if (num[c]%2!=0){
                    // lançar minha exceptin
                    throw new DivisaoNaoExata(num[c], den[c]);
                }
            }catch (Exception e){
                System.out.println ("Ocorreu um erro: " + e.getMessage());
                e.printStackTrace();
            }
        }
        
    }
}
