/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orientacaoObjeto.redessociais;

/**
 *
 * @author Aluno
 */
public class Posts {
    private double qtdeLikes;
    private String descricao;
    private double qtdeComentarios;
    private String usuario;
    private int estrelas;

    public Posts(double qtdeLikes, String descricao, double qtdeComentarios, String usuario, int estrelas) {
        this.qtdeLikes = qtdeLikes;
        this.descricao = descricao;
        this.qtdeComentarios = qtdeComentarios;
        this.usuario = usuario;
        this.estrelas = estrelas;
    }

    public double getQtdeLikes() {
        return qtdeLikes;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getQtdeComentarios() {
        return qtdeComentarios;
    }

    public String getUsuario() {
        return usuario;
    }

    public int getEstrelas() {
        return estrelas;
    }

    @Override
    public String toString() {
        return "Posts{" + "qtdeLikes=" + qtdeLikes + ", descricao=" + descricao + ", qtdeComentarios=" + qtdeComentarios + ", usuario=" + usuario + ", estrelas=" + estrelas + '}';
    }



    
}
