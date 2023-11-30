import java.util.Scanner;

public class KinectEnergyCalculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int select = 1;

        while(select == 1){
            System.out.println("Digite a massa do objeto: ");
            double mass = scanner.nextDouble();

            System.out.println("Digite a velocidade do objeto: ");
            double velocity = scanner.nextDouble();

            double kinectEnergy = (mass * Math.pow(velocity, 2)) / 2;

            System.out.println("A energia cinetica do objeto é: " + kinectEnergy);

            System.out.println("Deseja realizar outra consulta? 1 para sim e 2 para encerrar");
            select = scanner.nextInt();
        }
    }
}
