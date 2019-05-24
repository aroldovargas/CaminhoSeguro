package Crimes;

import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Harrison
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        
        int option = Integer.parseInt(JOptionPane.showInputDialog("1 - Cadastrar novo Crime\n0 - Sair"));
        
        while (option != 0){     
            Insere_Dados dados_Preenchidos = new Insere_Dados();
            Crimes novo_Crime = dados_Preenchidos.Insere_Crimes();
            option = Integer.parseInt(JOptionPane.showInputDialog("1 - Cadastrar novo crime\n0 - Sair"));
        }
    }
}
