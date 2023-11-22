import java.util.Scanner;

public class PerimeterCircle {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com o raio do circulo: ");
        double radius = scanner.nextDouble();

        double perimeter = 2 * Math.PI * radius; //Math.PI coloca o valor de PI

        System.out.println("O perimetro do circulo é: " + perimeter);

    }
}
