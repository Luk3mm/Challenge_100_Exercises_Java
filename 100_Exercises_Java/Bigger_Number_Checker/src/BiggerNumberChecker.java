import java.util.Scanner;

public class BiggerNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int select = 1;

        while(select == 1){
            System.out.println("Digite o primeiro numero: ");
            double number1 = scanner.nextDouble();

            System.out.println("Digite o segundo numero: ");
            double number2 = scanner.nextDouble();

            if(number1 > number2){
                System.out.println("O numero " + number1 + " é maior que o numero " + number2);
            }
            else if (number2 > number1) {
                System.out.println("O numero " + number2 + " é maior que o numero " + number1);
            }
            else{
                System.out.println("Os numeros são iguais!");
            }

            //ou voce pode usar o max da biblioteca do Math
            //double biggerNumber = Math.max(number1, number2);

            System.out.println("Deseja fazer outra consulta? 1 para sim e 2 para não");
            select = scanner.nextInt();
        }
    }
}
