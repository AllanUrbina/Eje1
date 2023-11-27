public class CalcularRaiz {
    public double calcularDiscriminante(double a, double b, double c) {
        return (b * b) - (4 * a * c);
    }

    public boolean tieneRaices(double discriminante) {
        return discriminante > 0;
    }

    public boolean tieneRaiz(double discriminante) {
        return discriminante == 0;
    }

    public double calcularRaiz1(double a, double b, double discriminante) {
        return (-b + Math.sqrt(discriminante)) / (2 * a);
    }

    public double calcularRaiz2(double a, double b, double discriminante) {
        return (-b - Math.sqrt(discriminante)) / (2 * a);
    }

    public double calcularUnicaRaiz(double a, double b) {
        return -b / (2 * a);
    }
}