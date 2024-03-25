import java.util.Scanner;

public class Ex11 {

    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe o primeiro numero: ");
        int num1 = Prompt.lerInteiro();
        System.out.println("Informe o segundo numero: ");
        int num2 = Prompt.lerInteiro();
        System.out.println("Informe o terceiro numero: ");
        int num3 = Prompt.lerInteiro();

        if(num1 > num2){
            int num4 = num1;
            num1 = num2;
            num2 = num4;

        }
        if(num1 > num3){
            int num4 = num1;
            num1 = num3;
            num3 = num4;
        }
        if(num2 > num3){
            int num4 = num2;
            num2 = num3;
            num3 = num4;
        }

        System.out.println("Os números em ordem Crescente são: " + num1 + " " + num2 + " " + num3);
        

        leitor.close();
    }

}
