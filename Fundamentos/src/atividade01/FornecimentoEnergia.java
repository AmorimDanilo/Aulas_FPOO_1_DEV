

package atividade01;

import java.util.Scanner;


public class FornecimentoEnergia {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

            System.out.println("Quantos KW/h foram consumidos?");
            double consumoKWH = scanner.nextDouble();

            System.out.println("Digite R para instalacao em residencia, C para instalacao em comercio e I para instalacao em industria");
            String localInstalacao = scanner.next();

                if (localInstalacao.equalsIgnoreCase("R")) {
                    if (consumoKWH <= 500) {
                        double valorConsumido = consumoKWH* 0.40;
                        System.out.println("O valor gasto foi de: " +valorConsumido + "reais"); 
                    }
                    else {
                        double valorConsumido = consumoKWH* 0.65;
                        System.out.println("O valor gasto foi de: " +valorConsumido + "reais");
                    }
                    
                } else if (localInstalacao.equalsIgnoreCase("C")) {
                    if (consumoKWH <= 1000) {
                        double valorConsumido = consumoKWH* 0.55;
                        System.out.println("O valor gasto foi de: " +valorConsumido + "reais"); 
                    }
                    else {
                        double valorConsumido = consumoKWH* 0.60;
                        System.out.println("O valor gasto foi de: " +valorConsumido + "reais");
                    }
                     } else if (localInstalacao.equalsIgnoreCase("I")) {
                    if (consumoKWH <= 5000) {
                        double valorConsumido = consumoKWH* 0.55;
                        System.out.println("O valor gasto foi de: " +valorConsumido + "reais"); 
                    }
                    else {
                        double valorConsumido = consumoKWH* 0.60;
                        System.out.println("O valor gasto foi de: " +valorConsumido + "reais");
                    }
                }
    }
}
