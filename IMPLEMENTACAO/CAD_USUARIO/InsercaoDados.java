/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastrousuario;

import javax.swing.JOptionPane;

/**
 *
 * @author 20171bsi0146
 */
public class InsercaoDados {
    
    public InsercaoDados(){}
    
    public void dadosUsuario(){
        
        String nome = JOptionPane.showInputDialog("Informe o seu nome: ");
        String sexo = JOptionPane.showInputDialog("Digite o sexo (M ou F): ");
        String idade = JOptionPane.showInputDialog("Informe a sua idade: ");
        String email = JOptionPane.showInputDialog("Informe o e-mail de cadastro: ");
        String login = JOptionPane.showInputDialog("Cadastre o nome de usuário para login: ");
        String senha = JOptionPane.showInputDialog("Cadastre a senha para efetuar o login: ");
        String cpf = JOptionPane.showInputDialog("Informe o seu CPF: ");  
        
        Usuario conta = new Usuario(nome,sexo, idade, email, login, senha, cpf);
        GuardarDados salvar_dados = new GuardarDados();
        salvar_dados.salvarDados(conta);        

    }
    
    
}
