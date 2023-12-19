import java.util.Scanner;

public class CountLegalAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var select = 1;

        while(select == 1){
            System.out.println("Digite a idade da primeira pessoa: ");
            int age1 = scanner.nextInt();

            System.out.println("Digite a idade da segunda pessoa: ");
            int age2 = scanner.nextInt();

            System.out.println("Digite a idade da terceira pessoa: ");
            int age3 = scanner.nextInt();

            int countAge = 0;

            if(age1 >= 18){
                countAge++;
            }

            if(age2 >= 18){
                countAge++;
            }

            if(age3 >= 18){
                countAge++;
            }

            System.out.println("Numero de pessoas com a maioridade é: " + countAge);

            System.out.println("Deseja realizar outra consulta? 1 para sim e 2 para sair");
            select = scanner.nextInt();
        }
    }
}
