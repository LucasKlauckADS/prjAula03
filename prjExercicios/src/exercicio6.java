/*Desenvolva um programa que solicite ao usuário a altura e a largura de um retângulo e exiba o perímetro e a área deste retângulo na tela. */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class exercicio6 {

  public static void main(String[] args) throws Exception {

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    try {

    System.out.println("Insira a altura do retângulo: ");
    double altura = Double.parseDouble(reader.readLine());

    System.out.println("Insira a largura do retângulo: ");
    double largura = Double.parseDouble(reader.readLine());

    double perimetro = 2 * (largura + altura);
    double area = largura * altura;

    System.out.println(String.format("A perímetro do retângulo é: %.2f", perimetro));
    System.out.println(String.format("A área do retângulo é: %.2f", area));
    
    
  } catch (Exception e) {
    e.printStackTrace();
  }
  }
  
}
