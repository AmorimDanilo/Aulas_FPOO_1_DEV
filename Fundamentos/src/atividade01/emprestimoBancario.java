

package atividade01;

import java.util.Scanner;


public class emprestimoBancario {
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da casa: ");
        double valorCasa = scanner.nextDouble();

        System.out.print("Digite o salario: ");
        double salario = scanner.nextDouble();

        System.out.print("Digite a quantidade de anos de financiamento: ");
        int quantidadeAnos = scanner.nextInt();

       
        double prestacaoMaxima = salario * 0.3; 
        double valorPrestacao = valorCasa / quantidadeAnos / 12;

        if (valorPrestacao <= prestacaoMaxima) {
            System.out.println("O seu emprestimo foi aprovado, e a prestacao sera de: " + valorPrestacao);
        } else {
            System.out.println("O seu emprestimo foi negado");
        }
 }
}
