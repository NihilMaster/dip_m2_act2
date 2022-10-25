package z.app.dip_m2_act2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author M
 */
public class C {
    private static final Scanner s = new Scanner(System.in); 
    
    public static void main(String[] args){
        boolean c1=true,c2=true;
        while(c1){
            System.out.println("1.Suma\n2.Resta\n3.Potencia\n4.División\n#.Atras");
            int opt=s.nextInt(),c=0;
            List<Integer> l = new ArrayList<>();
            if(opt<5){
                System.out.println("Ingrese uno a uno los números\nSi no quiere meter más números oprima la tecla [Q]");
                while(c2){
                    System.out.print("Sig. num o [Q]: ");
                    String temp = s.next();
                    try {
                        int x = Integer.parseInt(temp);
                        l.add(x);
                    } catch(NumberFormatException e){  
                        break;
                    }
                    c++;
                }
            }
            switch (opt) {
                case 1 -> System.out.println("Respuesta: "+l.stream().reduce(0, (a,b) -> a+b));
                case 2 -> System.out.println("Respuesta: "+l.stream().reduce(0, (a,b) -> a-b));
                case 3 -> System.out.println("Respuesta: "+l.stream().reduce(1, (a,b) -> a*b));
                case 4 -> {
                    int x = l.get(0);
                    System.out.println("Respuesta: "+l.stream().mapToDouble(n -> Double.parseDouble(String.valueOf(n))).reduce(x, (a,b) -> a/b));
                }
                default -> c1=false;
            }
        }
        System.out.println("");
    }
}
