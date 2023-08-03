

package atividade01;

import java.util.Scanner;


public class salarioFuncionario {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual seu salario?");
        int salario = scanner.nextInt();
        
            if (salario > 1350) {
            double aumento = salario + (salario*0.10);
            System.out.println("O seu salario recebeu um aumento de 10%, e agora sera de: " +aumento);
    }
            else {
                double aumento = salario + (salario*0.15);
                System.out.println("O seu salario recebeu um aumento de 10%, e agora sera de: " +aumento);
            }
    }
}
