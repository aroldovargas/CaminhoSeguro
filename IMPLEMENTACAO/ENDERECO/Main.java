/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maparisco;
import javax.swing.JOptionPane;
/**
 *
 * @author Aroldo
 */
public class Main {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Insira as informações relacionadas ao endereço que deseja pesquisar:");
        Endereco endereco = new Endereco();
        endereco.getEndereco();
        
        PersistenciaArquivo salvar = new PersistenciaArquivo();
        salvar.salvarEndereco(endereco);
    }
    
}
