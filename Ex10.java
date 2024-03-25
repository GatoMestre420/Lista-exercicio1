import java.util.Scanner;

public class Ex10 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um numero de 1 à 5");
        int num = Prompt.lerInteiro();

        switch (num){
            case 1:
            System.out.println("UM");
            break;

            case 2:
            System.out.println("DOIS");
            break;

            case 3:
            System.out.println("TRÊS");
            break;

            case 4:
            System.out.println("QUATRO");
            break;

            case 5:
            System.out.println("CINCO");
            break;

            default:
            System.out.println("Numero Inválido!");
        }

        leitor.close();
    }

}
