/*Implemente um programa que solicita um número ao usuário. Sendo este 	número uma velocidade em km/h, 
faça um programa para converter esta 	velocidade em m/s e exiba o resultado na tela. */

import java.io.BufferedReader;
import java.lang.Math;
import java.lang.Exception;
import java.io.InputStreamReader;

public class ExercicioKmPorHoraParaMsPorSegundo {
    public static void main(String[] args) throws Exception {
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Insira uma velocidade em km/h: ");

            double velocidade1 = Double.parseDouble(reader.readLine());

            double velocidade2 = velocidade1 / 3.6;

            System.out.println("Velocidade em m/s: " + velocidade2);


        } catch (Exception e) {
            e.printStackTrace();
        }


    }
    
}
