/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoFinal;
import java.util.*;

/**
 *
 * @author MINERD
 */
public class Conjunto {
    
    String elementos[] = new String[10];
    public  Set<String> vacio = new TreeSet<>(Arrays.asList(elementos));
    
    int dimension()
    {
        return elementos.length;
    }
    
    int cardinal()
    {
        int Salida = 0, Contador;
        for(Contador = 0; Contador < dimension(); Contador++)
        { 
            if(elementos[Contador] != null)
                Salida++;
        }
        return Salida;
    }
    
    Set union(Set Parametro) {
        Set Salida = new TreeSet(vacio);
        Salida.addAll(Parametro);
        return Salida;
    }
    
    Set interseccion(Set Parametro) {
        Set Salida = new TreeSet(vacio);
        Salida.retainAll(Parametro);
        return Salida;
    }
    
    Set diferencia(Set Parametro) {
        Set Salida = new TreeSet(vacio);
        Salida.removeAll(Parametro);
        return Salida;
    }
   
}
