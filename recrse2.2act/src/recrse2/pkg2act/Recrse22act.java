/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recrse2.pkg2act;

import java.util.ArrayList;

/**
 *
 * @author Lenovo Corei7
 */
public class Recrse22act {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arreglo = new int[]{1,4,6,7,8,9};
        int[] arreglo2 = new int [10];
        arreglo2[0]=110;
        arreglo2[1]=111;
        arreglo2[2]=112;
        arreglo2[3]=113;
        arreglo2[4]=114;
        arreglo2[5]=115;
        arreglo2[6]=116;
        arreglo2[7]=117;
        arreglo2[8]=118;
        arreglo2[9]=119;
        
        System.out.println("valor de la variable en la posicion 4 " + arreglo[4]);
        arreglo[3] = 10;
        System.out.println("valor del arreglo 2");
        int i=0;
        for(;;){
            System.out.println("arreglo[" + i + "] = " + arreglo2[i]);
            i++;
            if (i > arreglo2.length-1) break;
                    }
        for (i =0;i<arreglo2.length-1;i++){
            System.out.println("arreglo[" + i + "] = " + arreglo2[i]);
        }
        ArrayList<Integer> objlista = new ArrayList<Integer>();
        objlista.add(15);
        objlista.add(10);
        objlista.add(22);
         
         
        for(i=0;i<objlista.size();i++){
            
            System.out.println("valores de lista " + String.valueOf(objlista.get(i)));
        }

    }
    
}
