import java.util.Scanner;

public class TwoPointsCartesianPlane {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int select = 1;

        while(select == 1){
            System.out.println("Digite a coordenada de X no primeiro ponto: ");
            double x1 = scanner.nextDouble();

            System.out.println("Digite a coordenada de Y no primeiro ponto: ");
            double y1 = scanner.nextDouble();

            System.out.println("Digite a coordenada de X no segundo ponto: ");
            double x2 = scanner.nextDouble();

            System.out.println("Digite a coordenada de Y no segundo ponto: ");
            double y2 = scanner.nextDouble();

            double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

            System.out.println("A distancia dos dois pontos é: " + distance);

            System.out.println("Deseja realizar outra consulta? 1 para sim e 2 para sair");
            select = scanner.nextInt();
        }
    }
}
