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
public class ConjuntoTest{
    
    String elementos[] = {"Otra", "coleccion", "mas"};
    public  Set<String> Prueba = new TreeSet<>(Arrays.asList(elementos));
    
    boolean dimensionTest()
    {
        int Salida = 4;
        int Comparador = Conjunto.dimension();
        if(Comparador == Salida)
            return true;
        else
            return false;
    }
    
    boolean cardinalTest()
    {
        int Salida = 4;
        int Comparador = Conjunto.cardinal();
        if(Comparador == Salida)
            return true;
        else
            return false;
    }
    
    boolean unionTest() {
        Set Resultado = Conjunto.union(Prueba);
        if(Resultado.size() == 6)
            return true;
        else
            return false;
    }
    
    boolean interseccionTest(Set Parametro) {
        Set Resultado = Conjunto.union(Prueba);
        if(Resultado.size() == 1)
            return true;
        else
            return false;
    }
    
    boolean diferenciaTest(Set Parametro) {
        Set Resultado = Conjunto.union(Prueba);
        if(Resultado.size() == 3)
            return true;
        else
            return false;
    }
    
   
}
