import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the fist number: ");
        double number01 = scanner.nextDouble();
        System.out.println("Enter the second number: ");
        double number02 = scanner.nextDouble();

        double addition = number01 + number02;
        double subtraction = number01 - number02;
        double multiplication = number01 * number02;
        double division = number01 / number02;

        System.out.println("The addition is: " + addition);
        System.out.println("The subtraction is: " + subtraction);
        System.out.println("The multiplication is: " + multiplication);
        System.out.println("The division is: " + division);

        scanner.close();
    }
}