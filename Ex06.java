
import java.util.Locale;

public class Ex06 {
    public static void executar(){

       

        System.out.println("Informe a Temperatura em Celcius: ");
        double C = Prompt.lerDecimal();

        double F = ((9 * C) + 160) / 5;
        
        System.out.printf("A temperatura em Fahrenheit é: " + F + "F");
        Locale.setDefault(Locale.US);

        
    }

}
