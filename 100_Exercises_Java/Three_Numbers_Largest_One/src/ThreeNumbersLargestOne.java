import java.util.Scanner;

public class ThreeNumbersLargestOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int select = 1;

        while(select == 1){
            System.out.println("Digite o primeiro numero: ");
            double number1 = scanner.nextDouble();

            System.out.println("Digite o segundo numero: ");
            double number2 = scanner.nextDouble();

            System.out.println("Digite o terceiro numero: ");
            double number3 = scanner.nextDouble();

            double largestNumber;

            if(number1 >= number2 && number1 >= number3){
                largestNumber = number1;
            }
            else if(number2 >= number1 && number2 >= number3) {
                largestNumber = number2;
            }
            else{
                largestNumber = number3;
            }

            System.out.println("O maior numero é: " + largestNumber);

            System.out.println("Deseja fazer outra consulta? 1 para sim e 2 para sair");
            select = scanner.nextInt();
        }

    }
}
