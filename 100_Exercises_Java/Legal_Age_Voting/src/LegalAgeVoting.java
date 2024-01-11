import java.time.LocalDate;
import java.util.Scanner;

public class LegalAgeVoting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var select = 1;

        while(select == 1){
            System.out.println("Digite o ano do seu nascimento: ");
            int birthYear = scanner.nextInt();

            int currentYear = LocalDate.now().getYear();

            int age = currentYear - birthYear;

            if(age >= 16){
                System.out.println("Voce tem " + age + " anos, ja tem idade para votar!");
            }
            else{
                System.out.println("Voce" + age + " anos,  nao tem idade para votar!");
            }

            System.out.println("Deseja realizar outra consulta? 1 para sim e 2 para sair");
            select = scanner.nextInt();
        }
    }
}
