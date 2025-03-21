//Implemente um programa que solicita dois números ao usuário e exibe na tela://

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.Exception;
import java.lang.Math;

public class exercicio1 {
  public static void main(String[] args) throws Exception {

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    try {
      //a) A soma destes dois números //
      System.out.println("Insira um número: ");
      double dValor1 = Double.parseDouble(reader.readLine());

      System.out.println("Insira outro número: ");
      double dValor2 = Double.parseDouble(reader.readLine());

      double soma = dValor1 + dValor2;
      System.out.println("A soma destes números é: " + String.format("%.2f", soma));

      //b) A subtração destes dois números

      double subtracao = dValor1 - dValor2;
      System.out.println("A subtração destes dois números é: " + String.format("%.2f", subtracao));

      //c) A multiplicação destes dois números

      double multiplicacao = dValor1 * dValor2;
      System.out.println("A multiplicação destes dois números é: " + String.format("%.2f", multiplicacao));

      //d) A divisão destes dois números

      double divisao = dValor1 / dValor2;
      System.out.println("A divisão destes dois números é: " + String.format("%.2f", divisao));

      //e) A divisão inteira destes dois números

      int divisaoInteira = (int) (dValor1 / dValor2);
      System.out.println("A divisão inteira destes dois números é: " + divisaoInteira);

      //f) O resto da divisão inteira destes dois números

      int restoDivisaoInteira = (int) (dValor1 % dValor2);
      System.out.println("O resto da divisão inteira destes dois números é: " + restoDivisaoInteira);

      //g) A exponenciação destes dois números

      System.out.println("A exponenciação do 1º número pelo 2º número é: " + Math.pow(dValor1, dValor2));

      System.out.println("A exponenciação do 2º número pelo 1º número é: " + Math.pow(dValor2, dValor1));

      //O maior destes dois números
      System.out.println("O maior destes dois números é: " + Math.max(dValor1, dValor2));

      //O menor destes dois números
      System.out.println("O maior destes dois números é: " + Math.min(dValor1, dValor2));

    } catch (Exception e) {
      e.printStackTrace();
    }
      

  }
}