import java.util.Scanner;

public class Ex13 {
    public static void executar(){

        Scanner leitor = new Scanner(System.in);

        // Leitura dos valores e do operador
        System.out.println("Informe o primeiro valor: ");
        Double num1 = Prompt.lerDecimal();
        System.out.println("Informe o segundo valor: ");
        Double num2 = Prompt.lerDecimal();
        System.out.println("Informe o operador Aritimético (+ , -, *, /)");
        char operador = leitor.next().charAt(0);

        // Operação do operador e tratamento de erros
        double resultado = 0;
        Boolean operacaoValida = true;

        switch (operador){
            case '+':
            resultado = num1 + num2;
            break;

            case '-':
            resultado = num1 - num2;
            break;

            case '*':
            resultado = num1 * num2;
            break;

            case '/':
            if(num2 != 0){
                resultado = num1 / num2;
            }else{
                System.out.println("ERRO!! Divisão por ZERO");
                operacaoValida = false;
            }
            break;

            default:
            System.out.println("Operador não reconhecido!");
            operacaoValida = false;
            
        }

        // Impressão do resultado se a operação for válida

        if(operacaoValida = true){
            System.out.println("Resultado: " + resultado);
        }

        leitor.close();
    }

}
