import java.util.Scanner;

public class BmiCalculator {
    public static void main (String []args){
        //Desafio: fazer uma calculadora de BMI(IMC) individual
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu peso em quilogramas: ");
        double weight = scanner.nextDouble();

        System.out.println("Digite sua altura em metros: ");
        double height = scanner.nextDouble();

        double bmi = weight / (height * height);

        System.out.println("Seu BMI(IMC) é: " + bmi);

        if(bmi >= 18.5 && bmi <=24){
            System.out.println("Peso normal!");
        } else if (bmi > 24) {
            System.out.println("Acima do peso!");
        } else if (bmi < 18.5) {
            System.out.println("Abaixo do peso!");
        }

    }

}
