package z.app.dip_m2_act2;

import java.util.Scanner;

/**
 *
 * @author M
 */
public class Dip_m2_act2 {
    private static final Scanner s = new Scanner(System.in);
    
    public static void main(String[] args) {
        boolean v=true;
        while(v){
            System.out.println("Escoja el modo de operar");
            System.out.println("a.Apuntadores a funciones\nb.Funciones Lambda\nc.Map y Reduce\n?.Salir");
            String opt = s.next();
            switch (opt) {
                case "a", "A" -> { 
                    System.out.println("\nApuntadores a funciones");
                    A.main(null);
                }
                case "b", "B" -> { 
                    System.out.println("Funciones Lambda");
                    B.main(null);
                }

                case "c", "C" -> {
                    System.out.println("Map y Reduce");
                    C.main(null);
                }
                default -> {
                    System.out.println("Adiós");
                    v=false;
                }
            }
        }
    }
}
