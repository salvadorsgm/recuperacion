/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recurse6.pkg1;

import com.google.gson.Gson;

/**
 *
 * @author Lenovo Corei7
 */
public class Recurse61 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    datos datos = new datos("salvador",42,"personal@personal.com");
    Gson gson = new Gson();
    String cadena = gson.toJson(datos);
    System.out.println("nombre "+ datos.getNombre());
    System.out.println("edad "+String.valueOf(datos.getEdad()));
    System.out.println("correo "+datos.getCorreo());
    System.out.println("la cadena contiene ->" + cadena);
    
    String cjson ="{\"nombre\":\"desty\",\"edad\":42,\"correo\":\"sin correo\"}"; 
    datos datos2 = gson.fromJson(cjson, datos.class);
    System.out.println("nombre "+ datos2.getNombre());
    System.out.println("edad "+String.valueOf(datos2.getEdad()));
    System.out.println("correo "+datos2.getCorreo());
    }
    }
