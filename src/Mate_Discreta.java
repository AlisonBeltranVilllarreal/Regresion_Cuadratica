import java.util.List;

public class Mate_Discreta {

    public static double Suma_X(List<Double> listaX) {
        double sumaX = 0.0;
        for (double R : listaX) {
            sumaX += R;
        }
        return sumaX;
    }

    public static double Suma_Y(List<Double> listaY) {
        double sumaY = 0.0;
        for (double R : listaY) {
            sumaY += R;
        }
        return sumaY;
    }

    public static double Suma_XY(List<Double> listaX, List<Double> listaY) {
        double sumaXY = 0.0;
        for (int i = 0; i < listaX.size(); i++) {
            sumaXY += listaX.get(i) * listaY.get(i);
        }
        return sumaXY;
    }

    public static double Suma_Xdos(List<Double> listaX) {
        double sumaXdos = 0.0;
        for (double R : listaX) {
            sumaXdos += R * R;
        }
        return sumaXdos;
    }

    public static double Suma_X3(List<Double> listaX) {
        double sumaX3 = 0.0;
        for (double R : listaX) {
            sumaX3 += R * R * R;
        }
        return sumaX3;
    }

    public static double Suma_X4(List<Double> listaX) {
        double sumaX4 = 0.0;
        for (double R : listaX) {
            sumaX4 += Math.pow(R, 4);
        }
        return sumaX4;
    }

    public static double Suma_X2Y(List<Double> listaX, List<Double> listaY) {
        double sumaX2Y = 0.0;
        for (int i = 0; i < listaX.size(); i++) {
            sumaX2Y += Math.pow(listaX.get(i), 2) * listaY.get(i);
        }
        return sumaX2Y;
    }
}
