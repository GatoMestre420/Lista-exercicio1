

public class Ex05 {
    public static void executar(){

      

        System.out.println("Informe o valor de A: ");
        int a = Prompt.lerInteiro();
        System.out.println("Informe o valor de B: ");
        int b = Prompt.lerInteiro();


        // Exibe os valores originais
        System.out.println("Valores Originais: ");
        System.out.println("O valor de A: " + a);
        System.out.println("O valor de B: " + b);

        int c = a;
        a = b;
        b = c;

        // Exibe variaveis com valores de A e B trocados
        System.out.println("Variávies com os valores trocados:");
        System.out.println("A = " + a);
        System.out.println("B = " + b);



        

    
    }

}
