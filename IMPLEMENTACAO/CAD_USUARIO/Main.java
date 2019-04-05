/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastrousuario;

/**
 *    - nome
      - sexo
      - idade
      - e-mail
      - login
      - senha
      - cpf
 * @author Emanuel medeiros claudino
 * 20171bsi0146
 */
import javax.swing.JOptionPane;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int operacao = Integer.parseInt(JOptionPane.showInputDialog("1 - Cadastrar novo usuário\n0 - Sair"));
        
        while (operacao != 0){
            
            String nome = JOptionPane.showInputDialog("Informe o seu nome: ");
            String sexo = JOptionPane.showInputDialog("Digite o sexo (M ou F): ");
            String idade = JOptionPane.showInputDialog("Informe a sua idade: ");
            String email = JOptionPane.showInputDialog("Informe o e-mail de cadastro: ");
            String login = JOptionPane.showInputDialog("Cadastre o nome de usuário para login: ");
            String senha = JOptionPane.showInputDialog("Cadastre a senha para efetuar o login: ");
            String cpf = JOptionPane.showInputDialog("Informe o seu CPF: ");    
            operacao = Integer.parseInt(JOptionPane.showInputDialog("1 - Cadastrar novo usuário\n0 - Sair"));
            
            CadUser Cadastro = new CadUser(nome,sexo,idade,email,login,senha,cpf);
            GuardarDados salvar_dados = new GuardarDados();
            salvar_dados.salvarDados(Cadastro);
    
        }
        JOptionPane.showMessageDialog(null,"Finalizando cadastro(s)");
    }
}