/*Implemente um programa que solicita ao usuário o preço de um calçado e 	o percentual de desconto. Em seguida, calcule o valor do desconto e o valor final a ser pago pelo calçado. */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.Exception;

public class exercicio5 {
  
  public static void main(String[] args) throws Exception {
    
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    try {

      System.out.println("Insira o preço do calçado: ");
      double preco = Double.parseDouble(reader.readLine());

      System.out.println("Insira o percentual de desconto: ");
      double desconto = Double.parseDouble(reader.readLine());

      double valorDesconto = (preco * desconto) / 100;

      double precoFinal = preco - valorDesconto;

      System.out.println(String.format("Desconto aplicado: R$% .2f", valorDesconto));
      System.out.println(String.format("Valor final do calçado: R$% .2f", precoFinal));

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}


