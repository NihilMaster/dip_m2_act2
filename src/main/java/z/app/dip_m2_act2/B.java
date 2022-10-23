package z.app.dip_m2_act2;

import java.util.Scanner;

/**
 *
 * @author M
 */
public class B {
    private static final Scanner s = new Scanner(System.in);   
    
    public static void main(String[] args){
        boolean c=true;
        while(c){
            System.out.println("1.Suma\n2.Resta\n3.Potencia\n4.División\n#.Atras");
            int opt=s.nextInt();
            double a=9,b=9;
            if(opt<5){a = s.nextInt(); b = s.nextInt();}
            Inter calc=(n1,n2)->{};
            switch (opt) {
                case 1 -> calc = (n1,n2)->{
                        System.out.println("Respuessta: "+(n1+n2));
                    };
                case 2 -> calc = (n1,n2)->{
                        System.out.println("Respuessta: "+(n1-n2));
                    };
                case 3 -> calc = (n1,n2)->{
                        System.out.println("Respuessta: "+(n1*n2));
                    };
                case 4 -> {
                    System.out.println("Respuessta: "+(a/b));
                    calc = (n1,n2)->{
                        System.out.println("Respuessta: "+(n1/n2));
                    };
                }
                default -> c=false;
            }
            calc.op(a,b);
        }
        System.out.println("");
    }
    
    
    public interface Inter {
        void op(double a, double b);
    }
    
}
