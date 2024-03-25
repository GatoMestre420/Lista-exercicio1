

public class Ex09 {
    public static void executar(){
       

        System.out.println("Informe o primeiro numero: ");
        int a = Prompt.lerInteiro();
        System.out.println("Informe o segundo numero: ");
        int b = Prompt.lerInteiro();

        if(a == b){
            System.out.println("Os numeros informados são iguais!!");
        }else if(a != b && a > b){
            System.out.println("São Diferentes e o numero maior é o : " + a);
        }else if (a != b && a < b) {
            System.out.println("São diferentes e o numero maior é o : " + b);
        }
            
        
        
    }

}
