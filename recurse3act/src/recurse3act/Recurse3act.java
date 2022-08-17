/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recurse3act;

import java.util.ArrayList;

/**
 *
 * @author Lenovo Corei7
 */
public class Recurse3act {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here:
        ArrayList<String> lista = new ArrayList<String>();
        lista.add("fernando");
        lista.add("monica");
        lista.add("araceli");
        lista.add("federico");
        lista.add("armando");
       
        for(int i=0;i<lista.size();i++){
            
            System.out.println("valores de la poscicio [ " +i+"]= " + lista.get(i));
        }
        int a=0;
        for(String cadena : lista){
            System.out.println("valores de la poscicio [ " +a+"]= " + cadena);
            a++;
        }
        lista.forEach(cadena ->{
            System.out.println("valores de la lista " + cadena);
        });
        lista.stream().forEach(cadena->{
            System.out.println("valores de la lista por stream " + cadena);
        });
    }
    
}
