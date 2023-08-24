/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes.atividade;

/**
 *
 * @author Aluno
 */
public class Curso {
    private String nome;
    private String descricao;
    private CategoriaEnum categoria;
    private boolean temVagas;
    private boolean presencial;

    public Curso(String nome, String descricao, CategoriaEnum categoria, boolean temVagas, boolean presencial) {
        this.nome = nome;
        this.descricao = descricao;
        this.categoria = categoria;
        this.temVagas = temVagas;
        this.presencial = presencial;
    }
public boolean verificarSeHaVagas() {
    return this.temVagas;
}

public boolean cursoPresencial() {
    return this.cursoPresencial();
}
    @Override
    public String toString() {
        return "Curso{" + "nome=" + nome + ", descricao=" + descricao + ", categoria=" + categoria + ", temVagas=" + temVagas + ", presencial=" + presencial + '}';
    }
    
    
}
