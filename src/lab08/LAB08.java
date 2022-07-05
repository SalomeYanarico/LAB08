package lab08;
import java.util.ArrayList;
/**
 *
 * @autoras Mendoza Deza Lucely Rubi & Yanarico Yauri, Salomé Nazira
 */
public class LAB08 {
    public static int minpaquetes(int peso, int[] paque) {
        //Declaracion de un arraylist
        ArrayList<Integer> itera = new ArrayList<>();
        
        //Se utiliza el bucle for para ver todas las posibilidades que existen
        for (int i = 0; i < paque.length; i++) {  
            itera.add(paque[i]); 
            //añade al paquete
        }
        int aux = 1;
        return minpaquetes(peso, itera, aux, itera);
    }
    private static int minpaquetes(int peso, ArrayList<Integer> itera, int resultado, ArrayList<Integer> itera1) {
        //Declaracion de un arraylist para la segunda iteracion
        ArrayList<Integer> itera2 = new ArrayList<>();
        resultado++;
        for (int i = 0; i < itera.size(); i++) {
            int X = itera.get(i);
            for (int j = 0; j < itera1.size(); j++) {
                int Y = itera1.get(j);
                int suma = X + Y;
                //suma de la iteracion 1 + iteracion 2 es igual al peso total
                if (suma == peso) {
                    return resultado;
                } else {
                    if (itera.contains(suma) == false) {
                        if (itera2.contains(suma) == false) {
                            itera2.add(suma);
                        }
                    }
                }
            }
        }
        return minpaquetes(peso, itera2, resultado, itera1);
    } 
}
