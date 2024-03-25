import java.util.Scanner;

public class Ex18 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe a primeira nota do aluno: ");
        double nota1 = Prompt.lerDecimal();
        System.out.println("Informe a segunda nota do aluno: ");
        double nota2 = Prompt.lerDecimal();
        System.out.println("Informe a terceira nota do aluno: ");
        double nota3 = Prompt.lerDecimal();


        double mediaHarmonica = (3/(1/nota1 + 1/nota2 + 1/nota3));

        System.out.printf("A média Harmônica do aluno é: " + String.format("%.2f", mediaHarmonica));

        leitor.close();
    }

}
