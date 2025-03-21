import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.Exception;

public class exercicio4 {
  
  public static void main(String[] args) throws Exception {
    
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    try {

      System.out.println("Insira uma velocidade: ");

      double velocidade_km = Double.parseDouble(reader.readLine());

      double velocidade_ms = (velocidade_km / 3.6);

        System.out.println("Velocidade em km/h: " + velocidade_km);
        System.out.println("Velocidade em m/s: " + String.format("%.2f", velocidade_ms));

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}


