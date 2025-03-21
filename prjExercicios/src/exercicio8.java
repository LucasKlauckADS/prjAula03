/*Desenvolva um programa que solicite dois números ao usuário e que exiba o resultado do primeiro número elevado ao segundo, ou seja, potência. */

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.Math;

public class exercicio8 {

  public static void main(String[] args) throws Exception {

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("Insira um número: ");
    double numero1 = Double.parseDouble(reader.readLine());

    System.out.println("Insira outro número: ");
    double numero2 = Double.parseDouble(reader.readLine());

    double potencia = Math.pow(numero1, numero2);
    System.out.println(String.format("O primeiro número elevado ao segundo é: %.2f", potencia));
  }
  
}
