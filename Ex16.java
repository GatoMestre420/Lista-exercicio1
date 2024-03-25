import java.util.Scanner;

public class Ex16 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe a primeira nota do aluno: ");
        double nota1 = Prompt.lerDecimal();
        System.out.println("Informe a segunda nota do aluno: ");
        double nota2 = Prompt.lerDecimal();
        System.out.println("Informe a terceira nota do aluno: ");
        double nota3 = Prompt.lerDecimal();

        System.out.println("A média do aluno é : " + (nota1 + nota2 + nota3)/3);

        leitor.close();
    }

}
