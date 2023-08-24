/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Aluno
 */
public enum marchaEnum {
    PRIMEIRA_MARCHA("Primeira marcha", 1),
    SEGUNDA_MARCHA("Segunda marcha", 2),
    TERCEIRA_MARCHA("Terceira marcha", 3),
    QUARTA_MARCHA("Quarta marcha", 4),
    QUINTA_MARCHA("Quinta marcha", 5),
    MARCHA_RE("Marcha ré", -1),
    NEUTRO("Neutro", 0);

    private String marcha;
    private int numeroMarcha;

    private marchaEnum(String marcha, int numeroMarcha) {
        this.marcha = marcha;
        this.numeroMarcha = numeroMarcha;
    }
    
    public String getMarcha() {
        return marcha;
    }
    
    public int getNumeroMarcha() {
        return numeroMarcha;
    }
    
    @Override
    public String toString() {
        return "marchaEnum{" + "marcha=" + marcha + ", numeroMarcha=" + numeroMarcha + '}';
    }
   
    
    
}
