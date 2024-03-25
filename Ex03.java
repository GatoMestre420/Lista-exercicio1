

public class Ex03 {
    public static void executar(){


        System.out.println("Informe o primeiro numero: ");
        int a = Prompt.lerInteiro();
        System.out.println("Informe o segundo numero: ");
        int b = Prompt.lerInteiro();

        if(a > b){
            System.out.println("O numero " + a + " é maior!");
        }else if(b > a){
            System.out.println("O numero " + b + " é maior!");
        }if(a == b){
            System.out.println("A sequencia de numeros informados é inválida!");
        }

        
    }

}
