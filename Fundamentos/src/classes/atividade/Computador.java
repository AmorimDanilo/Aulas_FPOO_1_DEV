/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes.atividade;

/**
 *
 * @author Aluno
 */
public class Computador {
    
    private MemoriaEnum memoria;
    private ProcessadorEnum processador;
    private int capacidadeDiscoRigido;
    private String sistemaOperacional;
    private boolean temSenha;
    private boolean rodaJogos;

    public Computador(MemoriaEnum memoria, ProcessadorEnum processador, int capacidadeDiscoRigido, String sistemaOperacional, boolean temSenha, boolean rodaJogos) {
        this.memoria = memoria;
        this.processador = processador;
        this.capacidadeDiscoRigido = capacidadeDiscoRigido;
        this.sistemaOperacional = sistemaOperacional;
        this.temSenha = temSenha;
        this.rodaJogos = rodaJogos;
    }
    

   
public boolean verificarSeTemSenha() {
    return this.temSenha;
}

public boolean rodaJogos() {
    return this.rodaJogos;
}
    
    
    @Override
    public String toString() {
        return "Computador{" + "memoria=" + memoria + ", processador=" + processador + ", capacidadeDiscoRigido=" + capacidadeDiscoRigido + ", sistemaOperacional=" + sistemaOperacional + ", temSenha=" + temSenha + ", rodaJogos=" + rodaJogos + '}';
    }
}
