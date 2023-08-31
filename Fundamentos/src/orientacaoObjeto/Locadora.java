/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orientacaoObjeto;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class Locadora {
    
    public static void main(String[] args) throws UnsupportedEncodingException {
        System.setOut(new PrintStream(System.out, true, "UTF-8"));
        
        Cliente c1 = new Cliente("Thomas Müller");
        System.out.println(c1);
        double valorLocacaoSimples = c1.calcularLocacao(3);
        System.out.println("O valor para locação do filme simples é: " + valorLocacaoSimples);
        c1.validarNome(c1.getNome());
        c1.verificarEmailDominioGoogle(c1.getEmail());
        
        
        Cliente c2 = new Cliente("João Gomes", "joaogomes@gmail.com");
        System.out.println(c2);
        double valorLocacaoLancamento = c1.calcularLocacao(3, true);
        System.out.println("O valor para locação do filme lançamento é: " + valorLocacaoLancamento);
        c2.validarNome(c2.getNome());
        c2.verificarEmailDominioGoogle(c2.getEmail());
    }
        
}
