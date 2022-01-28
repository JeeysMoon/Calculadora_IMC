/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoraimc;

import java.util.Scanner;

/**
 *
 * @author Jennifer
 */
public class CalculadoraIMC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         double altura,peso, imc;
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Altura: ");
        altura = leitor.nextDouble();
        System.out.print("Peso: ");
        peso = leitor.nextDouble();
                     
        imc = peso / (altura * altura);
        
        /**if(imc < 18.5) {
            System.out.println("Você está abaixo do peso");
        } else if (imc <= 24.9) {
            System.out.println("Seu peso está normal, imc: " + imc);
        } if (imc <= 29.9) {
            System.out.println("Você está com sobrepeso, imc: " + imc);
        } else if (imc <= 34.9) {
            System.out.println("Você está com obesidade grau I, imc: " + imc);
        } if (imc <= 39.9) {
            System.out.println("Você está com obesidade grau II, imc: " + imc);
        } else {
             System.out.println("Você está com obesidade grau III, imc: " + imc);
            
        }*/
        
        switch (imc) {
            case 18.5:
            System.out.println("Você está abaixo do peso");
            break;
            case 24.9;
            System.out.println("Peso normal");
            break;
        }
        leitor.close();
    }
    
}
