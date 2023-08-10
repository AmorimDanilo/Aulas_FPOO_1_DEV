

package atividade02;

import java.util.Scanner;


public class economiaMes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual item você deseja comprar? (Tecle 1 para Notebook Lenovo, 2 para Celular Moto G22, 3 para Carro Hyundai HB20 ou 4 para Apartamento)");
        String item = scanner.nextLine();

        if (item.equalsIgnoreCase("1")) {
            double valorParcela = 3299.00 * 0.05;
            double qtdeMeses = 3299.00 / valorParcela;
            System.out.println("O valor da parcela sera de: " + valorParcela + " reais, que serao pagos por " + qtdeMeses + "meses");
        } else if (item.equalsIgnoreCase("2")) {
            double valorParcela = 1789.00 * 0.10;
            double qtdeMeses = 1789.00 / valorParcela;
            System.out.println("O valor da parcela sera de: " + valorParcela + " reais, que serao pagos por " + qtdeMeses + "meses");
        } else if (item.equalsIgnoreCase("3")) {
            double valorParcela = 68000.00 * 0.02;
            double qtdeMeses = 68000.00 / valorParcela;
            System.out.println("O valor da parcela sera de: " + valorParcela + " reais, que serao pagos por " + qtdeMeses + "meses");
        } else if (item.equalsIgnoreCase("4")) {
            double valorParcela = 180000.00 * 0.01;
            double qtdeMeses = 180000.00 / valorParcela;
            System.out.println("O valor da parcela sera de: " + valorParcela + " reais, que serao pagos por " + qtdeMeses + "meses");
    }
}
}
