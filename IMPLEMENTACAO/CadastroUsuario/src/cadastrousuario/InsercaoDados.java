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
    
    public Usuario dadosUsuario(){
        
        String nome = JOptionPane.showInputDialog("Informe o seu nome: ");
        String sexo = JOptionPane.showInputDialog("Digite o sexo (M ou F): ");
        String idade = JOptionPane.showInputDialog("Informe a sua idade: ");
        String email = JOptionPane.showInputDialog("Informe o e-mail de cadastro: ");
        String login = JOptionPane.showInputDialog("Cadastre o nome de usuário para login: ");
        String senha = JOptionPane.showInputDialog("Cadastre a senha para efetuar o login: ");
        String cpf = JOptionPane.showInputDialog("Informe o seu CPF: ");  
        Usuario conta = null;
        try{
            conta = new Usuario(nome,sexo, idade, email, login, senha, cpf);
            GuardarDados salvar_dados = new GuardarDados();
            salvar_dados.salvarDados(conta); 
        } catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
            JOptionPane.showMessageDialog(null,"Digite 1 para preencher os dados cadastrais novamente ou pressione qualquer tecla para sair");
            int operacao = Integer.parseInt(JOptionPane.showInputDialog("1 - PREENCHER CADASTRO NOVAMENTE\n0 - PRESSIONE 0 ou QUALQUER TECLA PARA PARA SAIR"));
            if(operacao == 1){
                conta = dadosUsuario();
            }
            else{
                return null;
            }
        }
        return conta;
    }   
}