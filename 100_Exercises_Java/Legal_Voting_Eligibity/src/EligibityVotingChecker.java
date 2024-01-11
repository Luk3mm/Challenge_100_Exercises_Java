import java.time.LocalDate;
import java.util.Scanner;

public class EligibityVotingChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var select = 1;

        while(select == 1){
            System.out.println("Digite o ano do seu nascimento: ");
            int birthYear = scanner.nextInt();

            int currentYear = LocalDate.now().getYear();

            int age = currentYear - birthYear;

            if(age < 16){
                System.out.println("Voce ainda nao pode votar!");
            }
            else if(age >= 16 && age < 18) {
                System.out.println("Voce pode votar mas nao é obrigatorio!");
            }
            else if(age >= 18 && age < 70){
                System.out.println("Voce pode votar e é obrigatorio votar!");
            }
            else{
                System.out.println("Voce ja tem 70 anos ou mais, não é obrigatorio votar!");
            }

            System.out.println("Deseja realizar outra consulta? 1 para sim e 2 para sair");
            select = scanner.nextInt();
        }
    }
}
