package lab08;
import java.util.Arrays;
import java.util.Scanner;

public class ProgDinam {
/**
 *
 * @autoras Mendoza Deza Lucely Rubi & Yanarico Yauri, Salomé Nazira
 */
public static int minpaquetes(int n, int[] kilos) {
        //En el método minpaquetes, se buscará devolver la cantidad mínima de paquetes que le daran respecto a los kilos
        int[] compras = new int[n + 1];
        //El número mínimo para llegar al último elemento desde el mismo es 0
        Arrays.fill(compras, Integer.MAX_VALUE);
        compras[0] = 0;
        int comparacion = 0;
        //Se construye un array, en donde se representa la cantidad mínima 
        for(int peso: kilos){
            for(int cantidad = 0; cantidad < compras.length; cantidad++){
                //Si se puede llegar directamente
                if(peso <= cantidad){
                    if(compras[cantidad - peso] == Integer.MAX_VALUE){
                        comparacion = compras[cantidad - peso];
                    //Caso contrario, para poder saber el número mínimo se comprueban todos los puntos alcanzables.    
                    } else{
                        comparacion = compras[cantidad - peso] + 1;
                    }
                    compras[cantidad] = Math.min(compras[cantidad], comparacion);
                }
            }
        }
        //Finalmente retorna el min
        return compras[n]!= Integer.MAX_VALUE ? compras[n] : -1;
    }
}