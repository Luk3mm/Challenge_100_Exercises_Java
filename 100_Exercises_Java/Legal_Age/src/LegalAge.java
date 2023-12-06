import java.util.Scanner;

public class LegalAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int select = 1;

        while(select == 1){
            System.out.println("Digite a sua idade: ");
            int age = scanner.nextInt();

            if(age >= 18){
                System.out.println("Voce ja tem a maioridade!");
            }
            else{
                System.out.println("Voce ainda não tem a maioridade!");
            }

            System.out.println("Deseja fazer outra verificação? 1 para sim e 2 para sair");
            select = scanner.nextInt();
        }
    }
}
