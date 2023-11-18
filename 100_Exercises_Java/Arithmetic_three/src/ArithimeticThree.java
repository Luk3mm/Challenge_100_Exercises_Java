import java.util.Scanner;

public class ArithimeticThree {
    public static void main (String []args){
        Scanner scanner = new Scanner(System.in); //inicializando o metodo do Java Scanner, ele que vai pedir alguma entrada

        System.out.println("Digite o primeiro numero: ");
        double number1 = scanner.nextDouble();

        System.out.println("Digite o segundo numero: ");
        double number2 = scanner.nextDouble();

        System.out.println("Digite o terceiro numero: ");
        double number3 = scanner.nextDouble();

        double result = (number1 + number2 + number3) / 3;

        System.out.println("O resultado é: " + result);

    }

}
