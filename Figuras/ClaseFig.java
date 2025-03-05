import java.util.Scanner;

public class ClaseFig {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el lado a del triángulo: ");
        double a = sc.nextDouble();
        System.out.print("Ingrese el lado b del triángulo: ");
        double b = sc.nextDouble();
        System.out.print("Ingrese el lado c del triángulo: ");
        double c = sc.nextDouble();

        TrianguloHeron triangulo = new TrianguloHeron(a, b, c);

        System.out.println("Área: " + triangulo.calcularArea());
        System.out.println("Perímetro: " + triangulo.calcularPerimetro());
        System.out.println("Semiperímetro: " + triangulo.calcularSemiperimetro());

     
    }
}



