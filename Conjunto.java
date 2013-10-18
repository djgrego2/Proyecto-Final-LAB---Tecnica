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
    
    static String elementos[] = new String[10];
    public  static Set<String> vacio = new TreeSet<>(Arrays.asList(elementos));
    
    public static int dimension()
    {
        return elementos.length;
    }
    
    static int cardinal()
    {
        int Salida = 0, Contador;
        for(Contador = 0; Contador < dimension(); Contador++)
        { 
            if(elementos[Contador] != null)
                Salida++;
        }
        return Salida;
    }
    
    static Set union(Set Parametro) {
        Set Salida = new TreeSet(vacio);
        Salida.addAll(Parametro);
        return Salida;
    }
    
    static Set interseccion(Set Parametro) {
        Set Salida = new TreeSet(vacio);
        Salida.retainAll(Parametro);
        return Salida;
    }
    
    static Set diferencia(Set Parametro) {
        Set Salida = new TreeSet(vacio);
        Salida.removeAll(Parametro);
        return Salida;
    }
    
    static void desplegar()
    {
        System.out.println("Conjunto: " + vacio);
    }
   
}
