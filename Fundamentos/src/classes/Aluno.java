/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Aluno
 */
public class Aluno {
    private String nome;
    private String email;
    private String ra;
    private boolean aprovado;
    private int qtdeFaltas;

    public Aluno(String nome, String email, String ra, boolean aprovado, int qtdeFaltas) {
        this.nome = nome;
        this.email = email;
        this.ra = ra;
        this.aprovado = aprovado;
        this.qtdeFaltas = qtdeFaltas;
    }

    public boolean alunoAprovado() {
    return this.aprovado;
}
    
    public void qtdeFaltas(){
        this.qtdeFaltas =qtdeFaltas;
    }
    
    @Override
    public String toString() {
        return "Aluno{" + "nome=" + nome + ", email=" + email + ", ra=" + ra + ", aprovado=" + aprovado + ", qtdeFaltas=" + qtdeFaltas + '}';
    }



    
    
    
}
