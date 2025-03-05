import java.util.Scanner;

// Clase TrianguloHeron
class TrianguloHeron {
    private double a, b, c;

    public TrianguloHeron(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double calcularSemiperimetro() {
        return (a + b + c) / 2;
    }

    public double calcularArea() {
        double s = calcularSemiperimetro();
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public double calcularPerimetro() {
        return a + b + c;
    }
}

