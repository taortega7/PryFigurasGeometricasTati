import java.util.Scanner;

// Clase Circulo
class Circulo 
{
    double radio;

    public Circulo(double radio) 
    {
        this.radio = radio;
    }

    public double calcularArea() 
    {
        return Math.PI * Math.pow(radio, 2);
    }

    public double calcularPerimetro() 
    {
        return 2 * Math.PI * radio;
    }

    public double calcularDiametro() 
    {
        return 2 * radio;
    }
}
