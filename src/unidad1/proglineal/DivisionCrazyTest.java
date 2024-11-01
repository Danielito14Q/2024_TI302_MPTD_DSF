
package unidad1.proglineal;

/**
 *
 * @author danie
 */
public class DivisionCrazyTest {
    public static void main(String[] args) {
                double[] arrDiv1 = {1, 2, 0, 1, -3};
        double[] arrDiv2 = {1, 0, -6, 8, -4};
        double[] arrDiv3 = {-1, 1};
        double[] arrDiv4 = {1, -1};
        DivisionCrazy dc = new DivisionCrazy(arrDiv3, arrDiv4);
        dc.resolver();
        dc.print();
    }
}
