import java.util.Scanner;

public class Ex15 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite as coordenadas do ponto P1 (x1 y1):");
        double x1 = Prompt.lerDecimal();
        double y1 = Prompt.lerDecimal();

        System.out.println("Digite as coordenadas do ponto P2 (x2 y2):");
        double x2 = Prompt.lerDecimal();
        double y2 = Prompt.lerDecimal();

        // Cálculo da distância entre os pontos
        double distancia = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

        // Exibição do resultado
        System.out.println("A distância entre os pontos P1 e P2 é: " + distancia);


        leitor.close();
    }

}
