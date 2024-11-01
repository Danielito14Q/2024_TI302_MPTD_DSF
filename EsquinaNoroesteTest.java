package unidad2.metododetransporte;

/**
 *
 * @author danie
 */
public class EsquinaNoroesteTest {

    public static void main(String[] args) {
    double O[] = {60, 50, 40}; //valores de cada oferta
    double D[] = {40, 70, 10, 30}; //valores de cada demanda
    double MatrizCostos[][] = {{12, 14, 16, 0}, {14, 13, 19, 0}, {17, 15, 15, 0}}; // matriz de cada costo que hay (Aun no se ocupa)
    ProblemaDeTransporte test = new ProblemaDeTransporte(3, 4, O, D, MatrizCostos); // n es la cantidad de ofertas y m la cantidad de demandas
    test.Resolver();
}
}
