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
public class RegistrarComentario {
    
    public RegistrarComentario(){}
    
    public Comentario telaComentario(){
        
        String login = JOptionPane.showInputDialog("Cadastre o nome de usuário para login: ");
        String senha = JOptionPane.showInputDialog("Cadastre a senha para efetuar o login: ");
        String nome = JOptionPane.showInputDialog("Informe o seu nome: ");
        String sexo = JOptionPane.showInputDialog("Digite o sexo (M ou F): ");
        String idade = JOptionPane.showInputDialog("Informe a sua idade: ");
        String rua = JOptionPane.showInputDialog("Informe a rua: ");
        String crime = JOptionPane.showInputDialog("Digite o tipo de crime a ser reportado: ");
        String comentario = JOptionPane.showInputDialog("Escreva o seu comentário ");

        Comentario novoComentario = new Comentario(login, senha, nome, sexo, idade, rua, crime, comentario);
        return novoComentario;
    }
}
