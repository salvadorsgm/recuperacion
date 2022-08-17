/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package procesos;

import com.google.gson.Gson;
import informacion.datos;

/**
 *
 * @author Lenovo Corei7
 */
public class conversiones {
    public String cjons(datos datos){
    Gson gson = new Gson();
    return gson.toJson(datos);
}
    public datos cDA(String cadena){
        Gson gson = new Gson();
        return gson.fromJson(cadena ,datos.class);
    }

    public datos cjson(datos datos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public datos cDTA(String cadena) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
