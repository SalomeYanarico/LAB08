package lab08;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @autoras Mendoza Deza Lucely Rubi & Yanarico Yauri, Salomé Nazira
 */
public class ProgDinamTest {

    @Test
    public void minpaquetes() {
        System.out.println("\033[35m PRUEBA 1");
        System.out.println("Input:");
        System.out.println(12);
        int[] input = {1, 2, 5};
        System.out.println("{1,2,5}");
        System.out.println("Output:");
        int resultado = ProgDinam.minpaquetes(12, input);
        System.out.println(resultado);

        System.out.println("\n" + "\033[35m PRUEBA 2");
        System.out.println("Input:");
        System.out.println(10);
        int[] input1 = {1, 3, 4};
        System.out.println("{1,3,4}");
        System.out.println("Output:");
        int resultado1 = ProgDinam.minpaquetes(10, input1);
        System.out.println(resultado1);

        System.out.println("\n" + "\033[35m PRUEBA 3");
        System.out.println("Input:");
        System.out.println(6);
        int[] input2 = {1, 3, 4};
        System.out.println("{1,3,4}");
        System.out.println("Output:");
        int resultado2 = ProgDinam.minpaquetes(6, input2);
        System.out.println(resultado2);

        System.out.println("\n" + "\033[35m PRUEBA 4");
        System.out.println("Input:");
        System.out.println(18);
        int[] input3 = {1, 3, 5, 7};
        System.out.println("{1,3,5,7}");
        System.out.println("Output:");
        int resultado3 = ProgDinam.minpaquetes(18, input3);
        System.out.println(resultado3);

        System.out.println("\n" + "\033[35m PRUEBA 5");
        System.out.println("Input:");
        System.out.println(360);
        int[] input4 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("{1, 2, 3, 4, 5, 6, 7, 8, 9}");
        System.out.println("Output:");
        int resultado4 = ProgDinam.minpaquetes(360, input4);
        System.out.println(resultado4);

        System.out.println("\n" + "\033[35m PRUEBA 6");
        System.out.println("Input:");
        System.out.println(360);
        int[] input5 = {1, 2, 5, 7, 11, 13};
        System.out.println("{1, 2, 5, 7, 11, 13}");
        System.out.println("Output:");
        int resultado5 = ProgDinam.minpaquetes(360, input5);
        System.out.println(resultado5);

        System.out.println("\n" + "\033[35m PRUEBA 7");
        System.out.println("Input:");
        System.out.println(1360);
        int[] input6 = {1, 2, 5, 7, 11, 13};
        System.out.println("{1, 2, 5, 7, 11, 13}");
        System.out.println("Output:");
        int resultado6 = ProgDinam.minpaquetes(1360, input6);
        System.out.println(resultado6);
    }
}