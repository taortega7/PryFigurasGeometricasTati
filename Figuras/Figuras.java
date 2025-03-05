import java.util.Scanner;

public class Figuras
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese el lado del cuadrado: ");
        Cuadrado cuadrado = new Cuadrado(sc.nextDouble());
        System.out.println("Área: " + cuadrado.calcularArea());
        System.out.println("Perímetro: " + cuadrado.calcularPerimetro());
        System.out.println("Diagonal: " + cuadrado.calcularDiagonal());
    }
}