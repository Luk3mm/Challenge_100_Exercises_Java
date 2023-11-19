import java.util.Scanner;

public class GeometricMean {
        public static void main (String []args){
            Scanner scanner = new Scanner(System.in);

            System.out.println("Entre com o primeiro numero: ");
            double number1 = scanner.nextDouble();

            System.out.println("Entre com o segundo numero: ");
            double number2 = scanner.nextDouble();

            System.out.println("Entre com o terceiro numero:");
            double number3 = scanner.nextDouble();

            double geometricMean = Math.pow(number1 * number2 * number3, 1.0 / 3.0);
            /*Explicaçoes: quero calcular a media geometrica de tres numeros, para isso o metodo pow do Math, o pow é usando
            * para calcular uma ase elevada a uma potencia, vao ser passadas dois paramentros o primeiro era a base e depois a potencia
            * nesse contexto a multiplicação dos numeros é a base e o 1/3 é a potencia, o 1/3 é o mesmo que a raiz cubica
            * que é o que precisamos fazer nessse caso*/

            System.out.println("A media geometrica é: " + geometricMean);
        }
}
