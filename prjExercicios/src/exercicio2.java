import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.Exception;

public class exercicio2 {
  
  public static void main(String[] args) throws Exception {
    
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    try {

      System.out.println("Insira uma temperatura em celsius: ");

      double temperatura_celsius = Double.parseDouble(reader.readLine());

      double temperatura_fahrenheit = ((temperatura_celsius * 1.8) + 32);

        System.out.println("Temperatura em celsius: " + temperatura_celsius);
        System.out.println("Temperatura em fahrenheit: " + temperatura_fahrenheit);

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
