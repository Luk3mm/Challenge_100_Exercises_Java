import java.util.Scanner;

public class TriangleSideChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var select = 1;

        while(select == 1){
            System.out.println("Digite o primeiro numero: ");
            double side1 = scanner.nextDouble();

            System.out.println("Digite o segundo numero: ");
            double side2 = scanner.nextDouble();

            System.out.println("Digite o terceiro numero: ");
            double side3 = scanner.nextDouble();

            if((side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1)){
                System.out.println("Os lados formam um triangulo!");
            }
            else {
                System.out.println("Os lados não formam um triangulo!");
            }

            System.out.println("Deseja realizar outra consulta? 1 para sim e 2 para sair");
            select = scanner.nextInt();
        }
    }
}
