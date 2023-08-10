

package atividade02;

import java.util.Scanner;


public class calculoSalario {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

            System.out.println("Digite seu cargo: (Tecle G para Gerente, S para Supervisor, T para tecnico ou A para Auxiliar)");
            String cargo = scanner.nextLine();

                if (cargo.equalsIgnoreCase("G")) {
                    double salarioLiquido = 5590 - 8% - 289;
                    System.out.println("O seu salario liquido sera de " + salarioLiquido + "reais");
                } else if (cargo.equalsIgnoreCase("C")) {
                    double salarioLiquido = 4128 - 7% - 239;
                    System.out.println("O seu salario liquido sera de " + salarioLiquido + "reais");
                } else if (cargo.equalsIgnoreCase("S")) {
                    double salarioLiquido = 4128 - 7% - 239;
                    System.out.println("O seu salario liquido sera de " + salarioLiquido + "reais");
                } else if (cargo.equalsIgnoreCase("T")) {
                    double salarioLiquido = 3789 - 4% - 189;
                    System.out.println("O seu salario liquido sera de " + salarioLiquido + "reais");
                } else if (cargo.equalsIgnoreCase("A")) {
                    double salarioLiquido = 2345 - 2% - 156;
                    System.out.println("O seu salario liquido sera de " + salarioLiquido + "reais");
                }
    }
}
