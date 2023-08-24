/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes.atividade;

/**
 *
 * @author Aluno
 */
public enum MemoriaEnum {
    DOIS_GB("2gb"),
    QUATRO_GB("4gb"),
    OITO_GB("8gb"), 
    DEZESSEIS_GB("16gb"),
    TRINTA_E_DOIS_GB("32gb"),
    SESSENTA_E_QUATRO_GB("64gb");
    
    private String memoria;

    private MemoriaEnum(String memoria) {
        this.memoria = memoria;
    }

    @Override
    public String toString() {
        return "memoriaEnum{" + "memoria=" + memoria + '}';
    }

}
