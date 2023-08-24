package atividade01;

import com.sun.tools.javac.Main;
import java.util.Scanner;

public class CalculoTotal {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite o nome do produto:");
            String nomeProduto = scanner.nextLine();

            System.out.println("Digite o valor do produto:");
            double valorProduto = scanner.nextDouble();

            System.out.println("Digite a quantidade desejada:");
            int quantidade = scanner.nextInt();

            double valorTotal = valorProduto * quantidade;

            System.out.println("Digite D para pagamento em debito e C para pagamento em credito:");
            String formaPagamento = scanner.next();

                if (formaPagamento.equalsIgnoreCase("D")) {
                    double desconto = valorTotal <= 100.0 ? 0.05 : 0.03;
                    valorTotal -= valorTotal * desconto;
                    System.out.println("Compra realizada no debito com desconto de " + (desconto * 100) + "%");
                } else if (formaPagamento.equalsIgnoreCase("C")) {
                    System.out.println("Digite o numero de parcelas:");
                    int numParcelas = scanner.nextInt();
                    double valorParcela = valorTotal / numParcelas;
                    System.out.println("Compra realizada no credito em " + numParcelas + " parcelas de" + valorParcela + "reais");
                }
            System.out.println("Informações da compra:");
        System.out.println("Nome do produto: " + nomeProduto);
        System.out.println("Valor unitário: " + valorProduto);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Valor total: " + valorTotal);
        }
    }
    
