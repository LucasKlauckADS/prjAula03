/*Solicite um número ao usuário. Sendo este número uma temperatura em 	graus Celsius, faça um  programa  que  converte 
esta  temperatura para 	graus Fahrenheit e exibe o resultado na tela. Fahrenheit = Celsius * 1.8 + 	32.*/

import java.io.BufferedReader;
import java.lang.Math;
import java.lang.Exception;
import java.io.InputStreamReader;



public class ExercicioCelsiusParaFahrenheit {

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 

        
        try {
            
        
        System.out.println("Insira um número: ");
        double temperatura_celsius = Double.parseDouble(reader.readLine());

        double temperatura_fahrenheit = (temperatura_celsius * 1.8) + 32;

        System.out.println(temperatura_celsius);
        System.out.println(temperatura_fahrenheit);

    } catch (Exception e) {
        e.printStackTrace();
    }

    }
    
}
