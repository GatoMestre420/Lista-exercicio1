import java.util.Scanner;

public class Ex14 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        // Leitura do valores 

        System.out.println("Digite o valor do primeiro termo (a1) de PA: ");
        int a1 = Prompt.lerInteiro();
        System.out.println("Digite o valor da Razão (r) de PA: ");
        int r = Prompt.lerInteiro();
        System.out.println("Digite o valor de n para encontrar o n-ésimo termo: ");
        int n = Prompt.lerInteiro();

        //Cálculo do n-ésimo termo da PA

        int an = a1 + (n-1) * r;

        //Exibição do Resultado

        System.out.println("O " + n + "º termo da PA é: " + an);


        leitor.close();
    }

}
