/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Feedback.visao;

import Feedback.dominio.Feedback;
import Feedback.GuardarFeedback;
import javax.swing.JOptionPane;
import usuario.dominio.Usuario;

/**
 *
 * @author Emanuel
 */
public class TelaFeedback {
    
    public TelaFeedback(){}
        
    public Feedback telaFeedback(Usuario id_usuario){
        
        String tipoFeedback = JOptionPane.showInputDialog("1 - Relatar erros do aplicativo\n2 - Enviar sugestão 3 - Outros");
        String comentario = JOptionPane.showInputDialog("Escreva o seu comentário ");
        Feedback novoFeedback = null;
        
        try {
            novoFeedback = new Feedback(id_usuario,tipoFeedback,comentario);
           GuardarFeedback salvar_dados = new GuardarFeedback();
           salvar_dados.salvarFeedback(novoFeedback); 
        } catch (Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
            JOptionPane.showMessageDialog(null,"Digite 1 para preencher o comentário novamente ou pressione qualquer tecla para sair");
            int operacao = Integer.parseInt(JOptionPane.showInputDialog("1 - Preencher novamente\n0 - Pressione qualquer tecla para sair"));
            if(operacao == 1){
                novoFeedback = telaFeedback(id_usuario);
            }
            else{
                return null;
            }   
        }
        return novoFeedback;
    }
}
