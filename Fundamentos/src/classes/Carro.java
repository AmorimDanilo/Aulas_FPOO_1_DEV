/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Carro
 */
public class Carro {
    private String modelo;
    private String marca;
    private String cor;
    private int anoFabricacao;
    private int qtdeRodas;
    private int velocidade;
    private int velocidadeFreio;
    private int situacao;

    public Carro(String modelo, String marca, String cor, int anoFabricacao, int qtdeRodas) {
        this.modelo = modelo;
        this.marca = marca;
        this.cor = cor;
        this.anoFabricacao = anoFabricacao;
        this.qtdeRodas = qtdeRodas;
        this.velocidade = 0;
        this.velocidadeFreio = 0;
    }
    
    public void andar(int velocidade) {
    this.velocidade =velocidade;
}    

public void  freiar() {
    this.velocidadeFreio =velocidadeFreio;

}

    @Override
    public String toString() {
        return "Carro{" + "modelo=" + modelo + ", marca=" + marca + ", cor=" + cor + ", anoFabricacao=" + anoFabricacao + ", qtdeRodas=" + qtdeRodas + ", velocidade=" + velocidade + ", velocidadeFreio=" + velocidadeFreio + '}';
    }

   
    
}



