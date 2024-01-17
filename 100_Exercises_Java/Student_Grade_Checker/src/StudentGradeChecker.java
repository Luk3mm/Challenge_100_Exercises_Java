import java.util.Scanner;

public class StudentGradeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int select = 1;

        while(select == 1){
            System.out.println("Digite a primeira nota: ");
            double grade1 = scanner.nextDouble();

            System.out.println("Digite a segunda nota: ");
            double grade2 = scanner.nextDouble();

            System.out.println("Digite a terceira nota: ");
            double grade3 = scanner.nextDouble();

            double average = (grade1 + grade2 + grade3) / 3.0;

            if(average >= 7){
                System.out.println("Você passou!");
            }
            else if(average < 4){
                System.out.println("Você falhou =/");
            }
            else{
                System.out.println("Você ficou de recuperação");
            }

            System.out.println("Deseja realizar outra consulta? 1 para sim e 2 para sair");
            select = scanner.nextInt();
        }
    }
}
