/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ComentarioCrime.visao;

import ComentarioCrime.dominio.ComentarioCrime;
import ComentarioCrime.GuardarComentarioCrime;
import javax.swing.JOptionPane;
import usuario.dominio.Usuario;

/**
 *
 * @author Emanuel
 */
public class TelaComentarioCrime {
    
    public TelaComentarioCrime(){}
    
    public ComentarioCrime telaComentario(Usuario id_usuario){
        
        String rua = JOptionPane.showInputDialog("Informe a rua: ");
        String crime = JOptionPane.showInputDialog("Digite o tipo de crime a ser reportado: ");
        String comentario = JOptionPane.showInputDialog("Escreva o seu comentário ");
        ComentarioCrime novoComentario = null;
        
        try {
            novoComentario = new ComentarioCrime(id_usuario,rua,crime,comentario);
            GuardarComentarioCrime salvar_dados = new GuardarComentarioCrime();
            salvar_dados.salvarComentario(novoComentario); 
        } catch (Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
            JOptionPane.showMessageDialog(null,"Digite 1 para preencher o comentário novamente ou pressione qualquer tecla para sair");
            int operacao = Integer.parseInt(JOptionPane.showInputDialog("1 - Preencher novamente\n0 - Pressione qualquer tecla para sair"));
            if(operacao == 1){
                novoComentario = telaComentario(id_usuario);
            }
            else{
                return null;
            }   
        }
        return novoComentario;
    }
}
