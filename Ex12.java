import java.util.Scanner;

public class Ex12 {

    public static void executar(){
        Scanner leitor = new Scanner(System.in);


        System.out.println("Informe o número do mês: ");
        int mes = Prompt.lerInteiro();

        switch (mes){
            case 1:
            System.out.println("JANEIRO");
            break;
            
            case 2:
            System.out.println("FEVEREIRO");
            break;

            case 3:
            System.out.println("MARÇO");
            break;

            case 4:
            System.out.println("ABRIL");
            break;

            case 5:
            System.out.println("MAIO");
            break;

            case 6:
            System.out.println("JUNHO");
            break;

            case 7:
            System.out.println("JULHO");
            break;

            case 8:
            System.out.println("AGOSTO");
            break;

            case 9:
            System.out.println("SETEMBRO");
            break;

            case 10:
            System.out.println("OUTUBRO");
            break;

            case 11:
            System.out.println("NOVEMBRO");
            break;

            case 12:
            System.out.println("DEZEMRBO");
            break;

            default:
            System.out.println("MÊS INVÁLIDO! Digite um nùmero de 1 a 12!");

        }
        
        leitor.close();
    }

}
