/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes.atividade;

import classes.Carro;
import classes.CorEnum;

/**
 *
 * @author Aluno
 */
public class Imprimir {
    
    public static void main(String[] args) {
        
        Computador pcGamer = new Computador(MemoriaEnum.OITO_GB, ProcessadorEnum.RYZEN_7, 1200, "Windows 11", true, true);
        Computador pcEscritorio = new Computador(MemoriaEnum.QUATRO_GB, ProcessadorEnum.INTEL_I3, 500, "Windows 10", true, false);
        Computador pcSenai = new Computador(MemoriaEnum.OITO_GB, ProcessadorEnum.INTEL_I5, 465, "Windows 10", false, false);
        
        Sala salaSesi = new Sala(34, 34, 7, true, 1);
        Sala laboratorioSenai = new Sala(34, 12, 1, true, 34);
        Sala laboratorioSesi = new Sala(36, 8, 2, true, 36);
        
        Curso devSenai = new Curso("Desenvolvimento de Sistemas", "Curso para desenvolvimento de software front e back-end", CategoriaEnum.TECNICO, false, true);
        Curso powerBi = new Curso("Power Bi", "Curso para aprendizagem da plataforma Power Bi", CategoriaEnum.CURSOS_GRATUITOS, true, true);
        Curso inglesBasico = new Curso("Curso de Inglês", "Curso para aprendizado da lingua inglesa", CategoriaEnum.IDIOMAS, true, false);
    }
}
