/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maparisco;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Aroldo
 */
public class TelaEndereco {
    
    public Endereco getEndereco(){
        Endereco endereco = new Endereco();
        try {
            endereco.setNomeRua(JOptionPane.showInputDialog("Rua:"));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "É necessário inserir o nome da rua!");
        }
        try {
            endereco.setNomeBairro(JOptionPane.showInputDialog("Bairro:"));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "É necessário inserir o nome do bairro!");
        }
    
        try {
            endereco.setNomeCidade(JOptionPane.showInputDialog("Cidade:"));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "É necessário inserir o nome do cidade!");
        }
     
        
        JOptionPane.showMessageDialog(null,endereco.toString());
        
        return endereco;
    }

}
