import java.util.Scanner;

public class DisplayAscendingOrder {
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

            if(number1 <= number2 && number1 <= number3){
                System.out.println(number1 + "");

                if(number2 <= number3){
                    System.out.println(number2 + " " + number3);
                }
                else{
                    System.out.println(number3 + " " + number2);
                }
            }
            else if(number2 <= number1 && number2 <= number3){
                System.out.println(number2 + "");

                if(number1 <= number3){
                    System.out.println(number1 + " " + number3);
                }
                else{
                    System.out.println(number3 + " " + number1);
                }
            }
            else{
                System.out.println(number3 + "");

                if(number1 <= number2){
                    System.out.println(number1 + " " + number2);
                }
                else{
                    System.out.println(number2 + " " + number1);
                }
            }

            System.out.println("Deseja realizar outra consulta? 1 para sim e 2 para sair");
            select = scanner.nextInt();
        }
    }
}
