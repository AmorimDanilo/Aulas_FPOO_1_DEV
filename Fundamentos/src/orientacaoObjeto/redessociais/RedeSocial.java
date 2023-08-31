    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orientacaoObjeto.redessociais;

/**
 *
 * @author Aluno
 */
public class RedeSocial implements ClassificacaoPost{
    
    public static void main(String[] args) {
        
        Posts post1 = new Posts(150, "Foto de cachorro", 10, "ZeDoRepolho", LEGAL);
        System.out.println(post1);
        Posts post2 = new Posts(100, "Vendo Celta 2005 1.4 Spirit 4 Portas. Preço Inbox.", 3, "FlavinDOPneu", SUPER_LEGAL);
        System.out.println(post2);
        Posts post3 = new Posts(1300, "São Paulo perde jogo de ida contra LDU Quito", 28, "CalleriMilGrau", COMUM);
        System.out.println(post3);
    }
}
