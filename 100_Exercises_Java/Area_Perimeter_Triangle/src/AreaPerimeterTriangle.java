import java.util.Scanner;

public class AreaPerimeterTriangle {
    public static void main (String []args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o lado A do triangulo: ");
        double sideA = scanner.nextDouble();

        System.out.println("Digite o lado B do triangulo: ");
        double sideB = scanner.nextDouble();

        System.out.println("Digite o lado C do triangulo: ");
        double sideC = scanner.nextDouble();

        System.out.println("Digite a altura relativa ao lado Bss: ");
        double height = scanner.nextDouble();

        double perimeter = sideA + sideB + sideC;

        double area = (sideB * height) / 2;

        System.out.println("O perimetro do triangulo é: " + perimeter);
        System.out.println("A area do triangulo é: " + area);
    }
}
