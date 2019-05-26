/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comentario;

import javax.swing.JOptionPane;

/**
 *
 * @author Emanuel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String id = "120";
        TelaComentario comentario = new TelaComentario();
        Comentario novoComent = comentario.telaComentario(id);
        
        JOptionPane.showMessageDialog(null,"Finalizando cadastro de comentário");
        
    }
    
}
