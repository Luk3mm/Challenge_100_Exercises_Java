import java.util.Scanner;

public class TestResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var select = 1;

        while(select == 1){
            System.out.println("Digite a nota da primeira prova: ");
            double score1 = scanner.nextDouble();

            System.out.println("Digite a nota da segunda prova: ");
            double score2 = scanner.nextDouble();

            if(score1 >= 6){
                System.out.println("Parabens! Voce passou no teste 1");
            }
            else{
                System.out.println("Infelizmente voce não passou");
            }

            if(score2 >= 6){
                System.out.println("Parabens! voce passou no teste 2");
            }
            else{
                System.out.println("Infelizmente voce não passou");
            }

            System.out.println("Deseja realizar um nova consulta? 1 para sim e 2 para sair");
            select = scanner.nextInt();
        }
    }
}
