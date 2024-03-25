

public class Ex07 {
    public static void executar(){
        

        System.out.println("Informe um numero: ");
        int num = Prompt.lerInteiro();

        if (num >= 100 && num <= 200) {
            System.out.println("Esse número está no range entre 100 e 200!");
            
        }else{
            System.out.println("Esse numero está fora do range proposto! ");
        }

       
    }

}
