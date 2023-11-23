import java.util.Scanner;

public class CircleArea {
    public static void main (String []args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o raio do circulo: ");
        double radius = scanner.nextDouble();

        double area = Math.PI * Math.pow(radius, 2);

        System.out.println("A area do circulo é: " + area);

    }
}
