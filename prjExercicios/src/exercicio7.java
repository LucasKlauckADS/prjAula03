/*Desenvolva um programa que solicite ao usuário a base e a altura de um triângulo e exiba o valor da área deste triângulo na tela. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class exercicio7 {

  public static void main(String[] args) throws Exception {
    
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    try {

      System.out.println("Insira a altura do triângulo: ");
      double altura = Double.parseDouble(reader.readLine());

      System.out.println("Insira a base do triângulo: ");
      double base = Double.parseDouble(reader.readLine());

      double area = (base * altura) / 2;
      System.out.println(String.format("A área do triângulo é: %.2f", area));
      
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
  
}
