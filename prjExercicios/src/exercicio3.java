import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.Exception;

public class exercicio3 {
  
  public static void main(String[] args) throws Exception {
    
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    try {

      System.out.println("Insira uma temperatura em fahrenheit: ");

      double temperatura_fahrenheit = Double.parseDouble(reader.readLine());

      double temperatura_celsius = ((temperatura_fahrenheit -32) / 1.8);

        System.out.println("Temperatura em fahrenheit: " + temperatura_fahrenheit);
        System.out.println("Temperatura em celsius: " + temperatura_celsius);

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

