

package atividade02;

import java.util.Scanner;


public class construcaoImovel {
public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

            System.out.println("Insira a largura do terreno: ");
            Double largura = scanner.nextDouble();
            
            System.out.println("Insira o comprimento do terreno: ");
            Double comprimento = scanner.nextDouble();
            
            Double metrosQuadrados = comprimento * largura;

                if (metrosQuadrados <= 250) {
                    double valorConstrucao = metrosQuadrados * 8.50;
                    System.out.println("O valor para construcao sera de " + valorConstrucao + "reais");
                } else if (metrosQuadrados <= 350) {
                    double valorConstrucao = metrosQuadrados * 9.50;
                    System.out.println("O valor para construcao sera de " + valorConstrucao + "reais");
                } else if (metrosQuadrados > 350) {
                    double valorConstrucao = metrosQuadrados * 11.50;
                    System.out.println("O valor para construcao sera de " + valorConstrucao + "reais");
                }
}
}
