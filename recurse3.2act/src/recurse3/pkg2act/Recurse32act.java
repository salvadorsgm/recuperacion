/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recurse3.pkg2act;

import informacion.Datos;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lenovo Corei7
 */
public class Recurse32act {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Datos> listadatos = new ArrayList<Datos>();
        Datos objdatos = new Datos("fernando gomez",23,"fer@gmail.com");
        listadatos.add(objdatos);
        objdatos.setNombre("armando sanchez");
        objdatos.setEdad(32);
        objdatos.setCorreo("armando@gmail.com");
        listadatos.add(objdatos);
        objdatos =new Datos("wendy sanchez",22,"wendy@gmail.com");
        listadatos.add(objdatos);
        
        for (Datos datos:listadatos){
            System.out.println("nombre "+ datos.getNombre());
            System.out.println("edad" + datos.getEdad());
            System.out.println("correo" + datos.getCorreo());
            
        }
        System.out.println("--------------------------------------");
        System.out.println("usando foreach");
        System.out.println("--------------------------------------");
        
        
        listadatos.forEach(datos->{
        System.out.println("nombre "+ datos.getNombre());
        System.out.println("edad" + datos.getEdad());
        System.out.println("correo" + datos.getCorreo());
        System.out.println("");
    });
        System.out.println("--------------------------------------");
        System.out.println("usando foreach");
        System.out.println("--------------------------------------");
        listadatos.stream().forEach(datos->{
        System.out.println("nombre "+ datos.getNombre());
        System.out.println("edad" + datos.getEdad());
        System.out.println("correo" + datos.getCorreo());
        System.out.println("");
        
        });
    }
    
}
