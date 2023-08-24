

package atividade01;

import java.util.Scanner;


public class DistanciaPercorrida {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Insira a distancia que sera percorrida: ");
        int distanciaPercorrida = scanner.nextInt();
        
        if (distanciaPercorrida < 200) {
             double valorPassagem = (distanciaPercorrida*0.50);
             System.out.println("O valor pago sera de: " +valorPassagem + "reais");
        }
        else {
             double valorPassagem = (distanciaPercorrida*0.45);       
        System.out.println("O valor pago sera de: " +valorPassagem + "reais" );
    }
    }
}
