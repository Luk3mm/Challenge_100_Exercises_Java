import java.util.Scanner;

public class VolumeSphere {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int select = 1;

        while(select == 1){
            System.out.println("Digite o raio da esfera: ");
            double radius = scanner.nextDouble();

            double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

            System.out.println("O volume da esfera é: " + volume);

            System.out.println("Deseja realizar outra consulta? 1 para sim e 2 para sair");
            select = scanner.nextInt();
        }
    }
}
