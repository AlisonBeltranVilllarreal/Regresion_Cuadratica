import java.util.List;

public class Error {

    public static double R2(List<Double> x, List<Double> y, double B0, double B1, double B2) {
        double ssTotal = 0.0;
        double ssRes = 0.0;
        double yMean = Mate_Discreta.Suma_Y(y) / y.size();

        for (int i = 0; i < x.size(); i++) {
            double yi = y.get(i);
            double yPred = B0 + B1 * x.get(i) + B2 * x.get(i) * x.get(i);
            ssTotal += Math.pow(yi - yMean, 2);
            ssRes += Math.pow(yi - yPred, 2);
        }

        return 1 - (ssRes / ssTotal);
    }

    public static double correlacion(List<Double> x, List<Double> y) {
        // Implementar cálculo de correlación si es necesario
        return 0.0;
    }
}
