package Crimes;

import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 20171BSI0227
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String data = JOptionPane.showInputDialog("Informe a data do crime: ");
        String hora = JOptionPane.showInputDialog("Informe a hora do crime: ");
        String tipo_Crime = JOptionPane.showInputDialog("Informe o tipo do crime: ");
        String endereco = JOptionPane.showInputDialog("Informe o endereco do crime: ");
        String vitima = JOptionPane.showInputDialog("Informe a vitima do crime: ");  


        Crimes crime_cometido = new Crimes(data,hora,tipo_Crime,endereco,vitima);
        
        GravaArquivo salvando = new GravaArquivo();
        salvando.salvarConta(crime_cometido);
           
    }
    
}
