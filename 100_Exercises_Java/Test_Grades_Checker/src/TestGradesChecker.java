import java.util.Scanner;

public class TestGradesChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var select = 1;

        while(select == 1){
            System.out.println("Digite a primeira nota: ");
            double score1 = scanner.nextDouble();

            System.out.println("Digite a segunda nota: ");
            double score2 = scanner.nextDouble();

            double scoreMean = (score1 + score2) / 2;

            if(scoreMean >= 6){
                System.out.println("Voce obteve a media de " + scoreMean + " Parabens! Voce passou");
            }
            else{
                System.out.println("Voce obteve a media de " + scoreMean + " Infelizmente voce não passou");
            }

            System.out.println("Deseja realizar outra consulta? 1 para sim 2 para sair");
            select = scanner.nextInt();
        }
    }
}
