

public class Ex20 {
    public static void executar(){
      

                // Solicitar o tempo de viagem e a velocidade média ao usuário
                System.out.print("Informe o tempo da viagem em horas: ");
                double tempoViagem = Prompt.lerDecimal();
                
                System.out.print("Informe a velocidade média durante a viagem em km/h: ");
                double velocidadeMedia = Prompt.lerDecimal();
                
                // Calcular a distância total da viagem
                double distancia = velocidadeMedia * tempoViagem;
                
                // Calcular a quantidade de litros de combustível gasta
                double consumo = 12; // eficiência do veículo em km/l
                double litros = distancia / consumo;
                
                // Exibir o resultado
                System.out.println("Quantidade de litros de combustível gasta: " + litros + "L");

        
    }

}
