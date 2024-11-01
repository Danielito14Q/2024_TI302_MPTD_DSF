package unidad1.proglineal;

/** ITESS - TICS
 * AGOSTO - SEPTEMBER 2024
 * EyOD
 * Prof: Montecillo
 * @author Daniel Salas Flores
 * Description:
 * 25 - Septiembre - 2024
 */
public class GaussR {
    private double matrizA[][];
    private int R;
    private int C;

    public GaussR(double[][] matrizA, int R, int C) {
        this.matrizA = matrizA;
        this.R = R;
        this.C = C;
    }
    
    public void Operacion(){
        System.out.println(matrizA[R][C]);
        double pivote = matrizA[R][C];
        //if(matrizA[R][C]!= 1){
            for (int i = 0; i < matrizA[R].length; i++) {
                matrizA[R][i] = matrizA[R][i]*(1/pivote);
            }
        //}
        double nume; 
        for (int i = 0; i < matrizA.length; i++) {
            nume = (matrizA[i][C])*-1;              //Aqui se escoje el numero porel cual se multiplicara el renglos pivote
            if(i!=R)
            for (int j = 0; j < matrizA[i].length; j++) {
                    matrizA[i][j] +=((matrizA[R][j]*nume));
            }
        }
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                //System.out.print(matrizA[i][j] + "\t");  //"%+6.3f "
                System.out.printf("%+6.3f ", matrizA[i][j]);
            }
            System.out.println("");
        }
    }
}
