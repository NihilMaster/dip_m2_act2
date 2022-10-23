/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package z.app.dip_m2_act2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author super
 */
public class C {
    private static final Scanner s = new Scanner(System.in); 
    
    public static void main(String[] args){
        boolean c1=true,c2=true;
        while(c1){
            System.out.println("1.Suma\n2.Resta\n3.Potencia\n4.División\n#.Atras");
            int opt=s.nextInt(),c=0;
            Map<Integer, Integer> m = new HashMap<>();
            if(opt<5){
                System.out.println("Ingrese uno a uno los números\nSi no quiere meter más números oprima la tecla [Q]");
                while(c2){
                    System.out.print("Sig. num o [Q]: ");
                    String temp = s.next();
                    try {
                        int x= Integer.parseInt(temp);
                        m.put(c, x);
                    } catch(NumberFormatException e){  
                        break;
                    }
                    c++;
                }
            }
            switch (opt) {
                case 1:
                    System.out.println("Respuesta: "+sum(m));
                    break;
                case 2:
                    System.out.println("Respuesta: "+res(m));
                    break;
                case 3:
                    System.out.println("Respuesta: "+pot(m));
                    break;
                case 4:
                    System.out.println("Respuesta: "+div(m));
                    break;                
                default:
                    c1=false; break;
            }
        }
        System.out.println("");
    }
    
    private static int sum(Map<Integer,Integer> m){
        Integer ss=0;
        for(int i=0; i<m.size(); i++){
            ss+=m.get(i);
        }
        return ss;
    }

    private static int res(Map<Integer,Integer> m){
        int ss=0;
        for(int i=0; i<m.size(); i++){
            ss-=m.get(i);
        }
        return ss;
    }

    private static int pot(Map<Integer,Integer> m){
        int ss=1;
        for(int i=0; i<m.size(); i++){
            ss*=m.get(i);
        }
        return ss;
    }

    private static int div(Map<Integer,Integer> m){
        int ss=m.get(0);
        for(int i=1; i<m.size()-1; i++){
            ss/=m.get(i);
        }
        return ss;
    }
}
