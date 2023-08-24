/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes.atividade;

/**
 *
 * @author Aluno
 */
public enum ProcessadorEnum {
 
    INTEL_I3("Intel Core I3"),
    INTEL_I5("Intel Core I5"),
    INTEL_17("Intel Core I7"), 
    INTEL_I9("Intel Core I9"),
    RYZEN_3("AMD Ryzen 3"),
    RYZEN_5("AMD Ryzen 5"),
    RYZEN_7("AMD Ryzen 7");
    
    private String processador;

    private ProcessadorEnum(String processador) {
        this.processador = processador;
    }

    @Override
    public String toString() {
        return "processadorEnum{" + "processador=" + processador + '}';
    }
}
