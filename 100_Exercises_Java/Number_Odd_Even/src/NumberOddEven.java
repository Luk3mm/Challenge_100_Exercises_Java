import java.util.Scanner;

public class NumberOddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int select = 1;

        while(select == 1){
            System.out.println("Digite o numero: ");
            int number = scanner.nextInt();

            if(number % 2 == 0){
                System.out.println("O numero é par!");
            }
            else{
                System.out.println("O numero é impar!");
            }

            System.out.println("Deseja realizar outra consulta? 1 para sim e 2 para sair");
            select = scanner.nextInt();
        }
    }
}
