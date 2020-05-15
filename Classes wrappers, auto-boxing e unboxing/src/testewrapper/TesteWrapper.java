package testewrapper;
public class TesteWrapper {
    public static void main(String[] args) {
        short n1 = 1;
        byte n2 = 10;
        int n3 = 100;
        long n4 = 1000;
        float n5 = 3.5f;
        double n6 = 3.555;
        boolean n7 = true;
        char a = 'a';
        
        // classes wrapper que representam tipos
        Short n8 = new Short((short)1);
        Byte n9 = new Byte ((byte)10);
        Integer n10 = new Integer((int)100);
        Long n11 = new Long(1000l);
        Float n12 = new Float ((float)3.5f);
        Double n13 = new Double ((double)3.5555);
        Boolean n14 = new Boolean ((boolean)true);
        Character b = new Character ((char)'b');
        
        Integer m1 = new Integer ("1000");
        Double m2 = new Double ("3.5");
        System.out.println (m2.intValue());
        System.out.println (m2.longValue());
        
        Long m3 = m2.longValue();
        
        double m4 = Double.parseDouble("3.555");
        System.out.println (m4);
        
        // ----------- autoboxing e unboxing
        
        // autoboxing
        Short b1 = 1;
        Double b2 = 5.555;
        Boolean b3 = true;
        
        short x1 = b1; // auto un-boxing
        
        // autoboxing em expressões
        b1++;
        
        // auto unboxing do b1 -> auto boxing de x1/b1 -> b4
        Integer b4 = x1/b1;
    }
    
}
