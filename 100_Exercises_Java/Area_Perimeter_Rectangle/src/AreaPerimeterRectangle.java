import java.util.Scanner;

public class AreaPerimeterRectangle {
    public static void main (String []args){
        Scanner scanner = new Scanner(System.in);
        int select = 1;

        while(select == 1){
            System.out.println("Digite a largura do retangulo:");
            double width = scanner.nextDouble();

            System.out.println("Digite o comprimento do retangulo: ");
            double length = scanner.nextDouble();

            double perimeter = 2 * (width + length);
            double area = width * length;

            System.out.println("O perimetro desse retangulo é: " + perimeter);
            System.out.println("A area desse retangulo é: " + area);

            System.out.println("Deseja realizar outra consulta? digite 1 para sim e 2 para nao");
            select = scanner.nextInt();
        }

    }

}
