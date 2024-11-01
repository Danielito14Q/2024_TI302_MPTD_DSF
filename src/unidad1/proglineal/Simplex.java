package unidad1.proglineal;

/**
 *
 * @author danie
 */
public class Simplex {
        public static void main(String[] args) {
            java.util.Scanner lector = new java.util.Scanner(System.in);
        int numR = 5;
        int numC = 9;
        double[][] arrGauss2 = new double[numR][numC];
        String Scan;
        String ScanArr[];
        System.out.print("Introduce los datos de la f.o. \nZ= ");
        Scan = lector.nextLine();
        ScanArr = (Scan.split(", "));
        for (int i = 0; i < numC; i++) {
            arrGauss2[0][i] = Double.parseDouble(ScanArr[i]);
        }

        for (int i = 1; i < numR; i++) {
            System.out.print("Introducir datos del renglon [" + i + "]= ");
            Scan = lector.nextLine();
            ScanArr = (Scan.split(", "));
            for (int j = 0; j < numC; j++) {
                arrGauss2[0][j] =Double.parseDouble(ScanArr[i]);
            }
        }
        
        NumeroOpt nop = new NumeroOpt(arrGauss2[0]);
        System.out.println(nop.calcular());
        
        DivisionCrazy dc = new DivisionCrazy(arrGauss2[nop.calcular()], arrGauss2[numR-1]);
        dc.resolver();
        dc.print();
        }
    
}
class NumeroOpt {

    private double[] arreglo;

    public NumeroOpt(double[] arreglo) {
        this.arreglo = arreglo;
    }

    public int calcular() {
        double min = arreglo[0];
        int index = 0;
        double menor = 0;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] < 0 && (arreglo[i]>menor || menor==0)) { //puede fallar por el signo >
                index = i;
                menor = arreglo[i];
                min = arreglo[i];
            }
        }
        return min >= 0 ? -1 : index;
    }

    public void setArreglo(double[] arreglo) {
        this.arreglo = arreglo;
    }

}

class DivisionCrazy {

    private double columna1[];
    private double columna2[];
    private double division[];
    private int RenglonP = 0;
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

