package unidad2.metododetransporte;

/**
 *
 * @author danie
 */
public class CostosMinimosTest {
    public static void main(String[] args) {
        double O[] = {15, 15}; //valores de cada oferta
        double D[] = {10, 10, 10}; //valores de cada demanda
        double MatrizCostos[][] = {{4, 2, 4}, {12, 8, 4}}; // matriz de cada costo que hay (Aun no se ocupa)
        
        CostosMinimos pipipi = new CostosMinimos(2, 3); // n es la cantidad de ofertas y m la cantidad de demandas
        pipipi.setD(D);
        pipipi.setO(O);
        pipipi.setMatrizCostos(MatrizCostos);
        pipipi.solve();
        pipipi.print();
    }
}
