package z.app.dip_m2_act2;

import java.util.Scanner;

/**
 *
 * @author M
 */
public class A {
    private static final Scanner s = new Scanner(System.in);
    
    public static void main(String[] args){
        boolean c=true;
        while(c){
            System.out.println("1.Suma\n2.Resta\n3.Potencia\n4.División\n#.Atras");
            int opt=s.nextInt(),a=1,b=1;
            if(opt<4){a = s.nextInt(); b = s.nextInt();}
            switch (opt) {
                case 1 -> System.out.println("Respuesta: "+Op.sum(a,b));
                case 2 -> System.out.println("Respuesta: "+Op.res(a,b));
                case 3 -> System.out.println("Respuesta: "+Op.pot(a,b));
                case 4 -> System.out.println("Respuesta: "+Op.div(a,b));
                default -> c=false;
            }
        }
        System.out.println("");
    }
    private static class Op{
        private static double sum(int a, int b){
            return a+b;
        }

        private static double res(int a, int b){
            return a-b;
        }

        private static double pot(int a, int b){
            return a*b;
        }

        private static double div(int a, int b){
            return a/b;
        }
    }
}
