import java.util.Scanner;

public class DeltaQuadraticEquation {
    public static void main (String []args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com o coeficiente a: ");
        double a = scanner.nextDouble();

        System.out.println("Entre com o coeficiente b: ");
        double b = scanner.nextDouble();

        System.out.println("Entre com o coeficiente c: ");
        double c = scanner.nextDouble();

        double delta = Math.pow(b, 2) - 4 * a * c;

        System.out.println("O delta dessa equação é: " + delta);
    }
}
