package atividade01;

import java.util.Scanner;

public class AreaCirculo {

    public static void main(String[] args) {

        System.out.println("Calculo da area do circulo");

        System.out.println("Escreva o raio do circulo: ");
        Scanner scanner = new Scanner(System.in);
        double raio = scanner.nextInt();

        double area = raio * raio * 3.14;

        System.out.println("A area do circulo e: " + area);

    }
}
