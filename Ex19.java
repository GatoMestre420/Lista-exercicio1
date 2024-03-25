import java.util.Scanner;

public class Ex19 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe o raio do cilindro: ");
        double raio = Prompt.lerDecimal();
        System.out.println("Informe a altura do cilindro: ");
        double altura = Prompt.lerDecimal();

        double volume = ((3.14 * Math.pow(raio,2)) * altura);

        System.out.println("O volume do cilindro é: " + volume);

        leitor.close();
    }

}
