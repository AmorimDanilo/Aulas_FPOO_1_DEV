package atividade01;

import java.util.Scanner;

public class velocidadeCarro {

    public static void main(String[] args) {

        int limiteDeVelocidade = 80;
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira a velocidade do carro: ");
        int velocidadeCarro = scanner.nextInt();
        
        if (velocidadeCarro > limiteDeVelocidade) {
            int multa = (velocidadeCarro-80)*5;
            System.out.println("Voce foi multado em " + multa + " reais por ultrapassar o limite de velocidade da via");
        }  
        else { 
            System.out.println("Voce estava dentro do limite de velocidade, parabens!");
    }
    }
}