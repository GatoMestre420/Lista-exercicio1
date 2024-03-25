import java.util.Scanner;

public class Ex17 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("informe a nota 1 do aluno: ");
        double nota1 = Prompt.lerDecimal();
        System.out.println("informe o peso da nota 1: ");
        int peso1 = Prompt.lerInteiro();
        System.out.println("informe a nota 2 do aluno: ");
        double nota2 = Prompt.lerDecimal();
        System.out.println("informe o peso da nota 2: ");
        int peso2 = Prompt.lerInteiro();
        System.out.println("informe a nota 3 do aluno: ");
        double nota3 = Prompt.lerDecimal();
        System.out.println("informe o peso da nota 3: ");
        int peso3 = Prompt.lerInteiro();

        double mediaPond = (((nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3)) / (peso1 + peso2 + peso3));

        System.out.println("A Média Ponderada do aluno é : " + mediaPond);






        leitor.close();
    }

}
