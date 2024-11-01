package unidad1.proglineal;

/**
 *
 * @author danie
 */
public class GaussRTest {
    public static void main(String[] args) {
        double[][] arrGauss = {{1, -60, -30, -20, 0, 0, 0, 0, 0},
        {0, 8, 6, 1, 1, 0, 0, 0, 48},
        {0, 4, 2, 1.5, 0, 1, 0, 0, 20},
        {0, 2, 1.5, 0.5, 0, 0, 1, 0, 8},
        {0, 0, 1, 0, 0, 0, 0, 1, 5}};
            GaussR op = new GaussR(arrGauss, 3, 1);
        op.Operacion();
    }
}
