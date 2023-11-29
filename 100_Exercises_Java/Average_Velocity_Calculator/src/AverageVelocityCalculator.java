import java.util.Scanner;

public class AverageVelocityCalculator {
    public static void main (String []args){
        Scanner scanner = new Scanner(System.in);
        int select = 1;

        while(select == 1){
            System.out.println("Digite a variação do espaço: ");
            double spaceVariation = scanner.nextDouble();

            System.out.println("Digite a variação do tempo: ");
            double timeVariation = scanner.nextDouble();

            double averageVelocity = spaceVariation / timeVariation;

            System.out.println("A velocidade media desse objeto é: " + averageVelocity);

            System.out.println("Deseja fazer uma nova consulta? 1 para sim e 2 para não");
            select = scanner.nextInt();
        }
    }
}
