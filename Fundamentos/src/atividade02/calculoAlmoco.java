

package atividade02;

import java.util.Scanner;


public class calculoAlmoco {
public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

            System.out.println("Qual prato sera consumido? (Tecle 1 para Arroz, feijao e bife acebolado; 2 para Arroz, feijao e file de frango ou 3 para Arroz feijao e brajola)");
            String prato = scanner.nextLine();
            
            System.out.println("Qual a quantidade de pessoas?");
            Double qtdePessoas = scanner.nextDouble();

                if (prato.equalsIgnoreCase("1")) {
                    double valor = 19.99 * qtdePessoas;
                    System.out.println("O valor final sera de " + valor + "reais");
                } else if (prato.equalsIgnoreCase("2")) {
                    double valor = 18.99 * qtdePessoas;
                    System.out.println("O valor final sera de " + valor + "reais");
                } else if (prato.equalsIgnoreCase("3")) {
                    double valor = 23.99 * qtdePessoas;
                    System.out.println("O valor final sera de " + valor + "reais");
                }
    }
}
