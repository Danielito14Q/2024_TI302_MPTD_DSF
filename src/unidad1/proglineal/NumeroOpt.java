package unidad1.proglineal;

/**
 *
 * @author danie
 */
public class NumeroOpt {

    private int[] arreglo;

    public NumeroOpt(int[] arreglo) {
        this.arreglo = arreglo;
    }

    public int calcular() {
        int min = arreglo[0];
        int index = 0;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] < min) {
                index = i;
                min = arreglo[i];
                System.out.println(min);
            }
        }
        return min >= 0 ? -1 : index;
    }

    public void setArreglo(int[] arreglo) {
        this.arreglo = arreglo;
    }

}

class DivisionCrazy {

    private double columna1[];
    private double columna2[];
    private double division[];
    private int RenglonP = 1;
    private boolean YoN;

    public DivisionCrazy(double[] columna1, double[] columna2) {
        this.columna1 = columna1;
        this.columna2 = columna2;
        this.division = new double[columna1.length];
    }

    public int resolver() {
        int inicio =0;
        for (int i = 1; i < columna1.length; i++) {
            division[i] = columna2[i] / columna1[i];
            if (division[i]>0 && inicio==0){
                inicio =i;
                YoN = true;
                RenglonP =i;
            }
            if(division[i]>0 && division[i]<division[RenglonP]){
            RenglonP = i;
            }
        }
        if (YoN == false)
                RenglonP =-1;
        return 0;
    }

    public void print() {
        for (int i = 0; i < division.length; i++) {
            System.out.println("div" + i + ":" + division[i]);
        }
        System.out.println(RenglonP);
    }

    public void setColumna1(double[] columna1) {
        this.columna1 = columna1;
    }

    public void setColumna2(double[] columna2) {
        this.columna2 = columna2;
    }

    public void setDivision(double[] division) {
        this.division = division;
    }
}
