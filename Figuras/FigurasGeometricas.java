import java.util.Scanner;

public class FigurasGeometricas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Circulo
        System.out.print("Ingrese el radio del círculo: ");
        Circulo circulo = new Circulo(sc.nextDouble());
        System.out.println("Área: " + circulo.calcularArea());
        System.out.println("Perímetro: " + circulo.calcularPerimetro());
        System.out.println("Diámetro: " + circulo.calcularDiametro());

        sc.close();
    }
}
