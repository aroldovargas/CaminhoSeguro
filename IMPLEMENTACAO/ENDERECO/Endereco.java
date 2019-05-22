/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maparisco;

import javax.swing.JOptionPane;

/**
 * @author Aroldo
 */

public class Endereco {
    public String nomeRua;
    public String nomeBairro;
    public String nomeCidade;
    
    
    
    public String toString(){
        
        return "Endereço: " + nomeRua + "," + nomeBairro + "," + nomeCidade;
    }
  
    public String getNomeRua() {
        return nomeRua;
    }

    public void setNomeRua(String nomeRua) throws Exception {
        
        if (nomeRua.equalsIgnoreCase(""))
        {
            throw new Exception("Nome da rua não pode ser vazio");
        }
        
        this.nomeRua = nomeRua;
    }

    public String getNomeBairro() {
        return nomeBairro;
    }

    public void setNomeBairro(String nomeBairro) throws Exception{
        if(nomeBairro.equalsIgnoreCase(""))
        {
            throw new Exception("Nome do bairro não pode ser vazio");
        }
        this.nomeBairro = nomeBairro;
    }

    public String getNomeCidade() {
        return nomeCidade;
    }

    public void setNomeCidade(String nomeCidade) throws Exception{
        if(nomeCidade.equalsIgnoreCase(""))
        {
            throw new Exception("Nome da cidade não pode ser vazio");
        }
        this.nomeCidade = nomeCidade;
    }

    
}
