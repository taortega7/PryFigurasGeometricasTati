import java.util.Scanner;

// Clase Cuadrado
class Cuadrado {
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public double calcularArea() {
        return lado * lado;
    }

    public double calcularPerimetro() {
        return 4 * lado;
    }

    public double calcularDiagonal() {
        return lado * Math.sqrt(2);
    }
}
