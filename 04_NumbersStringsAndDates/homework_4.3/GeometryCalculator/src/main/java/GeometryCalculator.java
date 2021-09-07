public class GeometryCalculator {
    // метод должен использовать абсолютное значение radius
    public static double getCircleSquare(double radius) {
        double S = Math.PI * Math.pow(Math.abs(radius), 2);
        return S;
    }

    // метод должен использовать абсолютное значение radius
    public static double getSphereVolume(double radius) {
        double V = (double) 4 / 3 * Math.PI * Math.pow(Math.abs(radius), 3);
        return V;
    }

    public static boolean isTrianglePossible(double a, double b, double c) {
        if (a + b <= c || a + c <= b || b + c <= a){return false;}
        else
            return true;
    }

    public static double getTriangleSquare(double a, double b, double c) {
        if (isTrianglePossible(a, b, c)) {
            double p = 0.5 * (a + b + c);
          double S = Math.sqrt(p * (p - a) * (p - b) * (p - c));
          return S;
        }else
        return -1.0;
    }
}
