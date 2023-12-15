import java.util.Scanner;

public class SumPositiveNegativeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var select = 1;

        while(select == 1){
            System.out.println("Digite o primeiro numero: ");
            double number1 = scanner.nextDouble();

            System.out.println("Digite o segundo numero: ");
            double number2 = scanner.nextDouble();

            System.out.println("Digite o terceiro numero: ");
            double number3 = scanner.nextDouble();

            double sum = number1 + number2 + number3;

            if(sum > 0){
                System.out.println("A soma dos numero é positivo!");
            }
            else if(sum < 0){
                System.out.println("A soma dos numero é negativo!");
            }
            else{
                System.out.println("A soma dos numero é zero!");
            }

            System.out.println("Deseja realizar outra consulta? 1 para sim e 2 para sair");
            select = scanner.nextInt();
        }
    }
}
