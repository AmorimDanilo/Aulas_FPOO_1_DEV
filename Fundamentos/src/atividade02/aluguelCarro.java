package atividade02;

import java.util.Scanner;

public class AluguelCarro {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite qual carro deseja alugar: (Tecle 1 para Fiat Argo, 2 para Fiat Mobi, ou 3 para Hyundai HB20");
        String carro = scanner.nextLine();

        System.out.println("Qual quilometragem sera percorrida?");
        Double quilometragemPercorrida = scanner.nextDouble();

        if (carro.equalsIgnoreCase("1")) {
            double valorFinal = 98.00 + (quilometragemPercorrida * 2.39);
            System.out.println("O valor gasto sera de: " + valorFinal + " reais");
        } else if (carro.equalsIgnoreCase("2")) {
            double valorFinal = 79.00 + (quilometragemPercorrida * 1.99);
            System.out.println("O valor gasto sera de: " + valorFinal + " reais");
        } else if (carro.equalsIgnoreCase("3")) {
            double valorFinal = 102.00 + (quilometragemPercorrida * 2.99);
            System.out.println("O valor gasto sera de: " + valorFinal + " reais");
        }
    }
}
