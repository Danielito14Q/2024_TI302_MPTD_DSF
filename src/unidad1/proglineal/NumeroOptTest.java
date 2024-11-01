package unidad1.proglineal;

import java.util.Scanner;

/**
 *
 * @author danie
 */
public class NumeroOptTest {

    public static void main(String[] args) {

        double[] arr = {1, -3, -6, 9, 0, 1, -2};
        double[] arr2 = {1, 2, 3};
        
        double[] arrDiv1 = {1, 2, 0, 1, -3};
        double[] arrDiv2 = {1, 0, -6, 8, -4};
        double[] arrDiv3 = {-1, 1};
        double[] arrDiv4 = {1, -1};
        double[][] arrGauss = {{1, -60, -30, -20, 0, 0, 0, 0, 0},
        {0, 8, 6, 1, 1, 0, 0, 0, 48},
        {0, 4, 2, 1.5, 0, 1, 0, 0, 20},
        {0, 2, 1.5, 0.5, 0, 0, 1, 0, 8},
        {0, 0, 1, 0, 0, 0, 0, 1, 5}};
        NumeroOpt nop = new NumeroOpt(arr);
        System.out.println(nop.calcular());
    }
}

//class NumeroOptTestOld {
//
//    public static void pepe() {
//        int[] arr = {1, -3, -6, 9, 0, 1, -2};
//        int[] arr2 = {1, 2, 3};
//        NumeroOpt nop = new NumeroOpt(arr);
//        System.out.println("nop: " + nop.calcular());
//
//        nop.setArreglo(arr2);
//        System.out.println("nop: " + nop.calcular());
//    }
//}
////        NumeroOpt nop = new NumeroOpt(arr);
////        System.out.println("nop: " + nop.calcular());
////
////        nop.setArreglo(arr2);
////        System.out.println("nop: " + nop.calcular());

////        GaussR op = new GaussR(arrGauss, 3, 1);
////        op.Operacion();
////        DivisionCrazy dc = new DivisionCrazy(arrDiv3, arrDiv4);
//
////        dc.resolver();
////        dc.print();
//        //System.out.println("nop: " + nop.calcularCP());
////        nop.setArreglo(arr2);
////        System.out.println("nop: " + nop.calcularCP());

