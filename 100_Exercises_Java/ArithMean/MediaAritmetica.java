import java.util.Scanner;

public class MediaAritmetica {
    public static void main(String []args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o primeiro numero: ");
        double number1 = scanner.nextDouble();

        System.out.println("Insira o segundo numero: ");
        double number2 = scanner.nextDouble();

        double arithMean = (number1 + number2) / 2;

        System.out.println("Media aritimetica: " + arithMean);

    }

}
