/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enumeracao;

/**
 *
 * @author Aluno
 */
public class Enumeracao {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("nome", "email@gmail.com", true, TipoUsuarioEnum.TECNICO);
        System.out.println(usuario);
        
        Pedido pedido = new Pedido("Pedido do usuario 01", 29.98, StatusEnum.EM_PREPARACAO.getStatus());
        System.out.println(pedido);
        pedido.setStatus(StatusEnum.EM_TRANSPORTE.getStatus());
    }
}