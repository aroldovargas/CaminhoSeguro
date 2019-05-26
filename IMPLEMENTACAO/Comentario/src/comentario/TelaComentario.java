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
public class TelaComentario {
    
    public TelaComentario(){}
    
    public Comentario telaComentario(String id_usuario){
        
        String rua = JOptionPane.showInputDialog("Informe a rua: ");
        String crime = JOptionPane.showInputDialog("Digite o tipo de crime a ser reportado: ");
        String comentario = JOptionPane.showInputDialog("Escreva o seu comentário ");
        Comentario novoComentario = null;
        
        try {
            novoComentario = new Comentario(id_usuario,rua,crime,comentario);
            GuardarComentario salvar_dados = new GuardarComentario();
            salvar_dados.salvarComentario(novoComentario); 
        } catch (Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
            JOptionPane.showMessageDialog(null,"Digite 1 para preencher os dados cadastrais novamente ou pressione qualquer tecla para sair");
            int operacao = Integer.parseInt(JOptionPane.showInputDialog("1 - PREENCHER CADASTRO NOVAMENTE\n0 - PRESSIONE 0 ou QUALQUER TECLA PARA PARA SAIR"));
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
