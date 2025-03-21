/*Desenvolva  um  programa  que  solicite  dois  números  ao  usuário.  Estes números são os catetos de um triângulo retângulo. Sendo assim, apresente ao usuário:
a) Hipotenusa
b) Perímetro
c) Área */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.Math;

public class exercicio9 {

  public static void main(String[] args) throws Exception {

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    try {
      System.out.println("Insira um número para representar o cateto oposto de um triângulo retângulo: ");
      double catetoOposto = Double.parseDouble(reader.readLine());

      System.out.println("Insira outro número para representar o cateto adjacente de um triângulo retângulo: ");
      double catetoAdjacente = Double.parseDouble(reader.readLine());

      double hipotenusa = Math.sqrt(Math.pow(catetoOposto, 2) + Math.pow(catetoAdjacente, 2));
      double perimetro = catetoOposto + catetoAdjacente + hipotenusa;
      double area = (catetoOposto * catetoAdjacente) / 2;

      System.out.println(String.format("A hipotenusa do triângulo retângulo é: %.2f", hipotenusa));
      System.out.println(String.format("O perímetro do triângulo retângulo é: %.2f", perimetro));
      System.out.println(String.format("A área do triângulo retângulo é: %.2f", area));

    } catch (Exception e) {
      e.printStackTrace();
    }
    
  }
  
}
