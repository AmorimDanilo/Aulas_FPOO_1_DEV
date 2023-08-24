/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes.atividade;

/**
 *
 * @author Aluno
 */
public enum CategoriaEnum {

TECNICO("Curso Tecnico"),
IDIOMAS("Curso de Idiomas"),
TECNOLOGO("Curso Tecnólogo"),
CURSOS_GRATUITOS("Curso Gratuito");

private String categoriaCurso;

    private CategoriaEnum(String cursos) {
        this.categoriaCurso = categoriaCurso;
    }

    @Override
    public String toString() {
        return "CategoriaEnum{" + "categoriaCurso=" + categoriaCurso + '}';
    }
}
