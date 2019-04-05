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
public class Endereco {
    public String nomeRua;
    public String nomeBairro;
    public String nomeCidade;

    public String toString(){
        
        return "Endereço: " + nomeRua + "," + nomeBairro + "," + nomeCidade;
        
    }
    public void getEndereco(){
        nomeRua = JOptionPane.showInputDialog("Rua:");
        nomeBairro = JOptionPane.showInputDialog("Bairro:");
        nomeCidade = JOptionPane.showInputDialog("Cidade:");
        JOptionPane.showMessageDialog(null,"Endereço: " + nomeRua + ", " + nomeBairro + ", " + nomeCidade);
    }

    public String getNomeRua() {
        return nomeRua;
    }

    public void setNomeRua(String nomeRua) {
        this.nomeRua = nomeRua;
    }

    public String getNomeBairro() {
        return nomeBairro;
    }

    public void setNomeBairro(String nomeBairro) {
        this.nomeBairro = nomeBairro;
    }

    public String getNomeCidade() {
        return nomeCidade;
    }

    public void setNomeCidade(String nomeCidade) {
        this.nomeCidade = nomeCidade;
    }

    
}
