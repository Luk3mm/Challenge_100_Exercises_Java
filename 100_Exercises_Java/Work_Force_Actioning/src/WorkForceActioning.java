import java.util.Scanner;

public class WorkForceActioning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int select = 1;

        while(select == 1){
            System.out.println("Digite a força aplicada: ");
            double force = scanner.nextDouble();

            System.out.println("Digite a distancia: ");
            double distance = scanner.nextDouble();

            double work = force * distance;

            System.out.println("O trabalho feito no objeto é: " + work);

            System.out.println("Deseja fazer outra consulta? 1 para sim e 2 para sair");
            select = scanner.nextInt();
        }
    }
}
