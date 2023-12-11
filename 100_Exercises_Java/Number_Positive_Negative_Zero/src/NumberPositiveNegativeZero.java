import java.util.Scanner;

public class NumberPositiveNegativeZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int select = 1;

        while(select == 1){
            System.out.println("Digite o numero: ");
            double number = scanner.nextDouble();

            if(number > 0){
                System.out.println("O numero é positivo!");
            }
            else if(number < 0){
                System.out.println("O numero é negativo!");
            }
            else{
                System.out.println("O numero é Zero!");
            }

            System.out.println("Deseja realizar outra consulta? 1 para sim e 2 para sair");
            select = scanner.nextInt();
        }
    }
}
