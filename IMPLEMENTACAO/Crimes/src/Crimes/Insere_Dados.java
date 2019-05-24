/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Crimes;

/**
 *
 * @author harri
 */

import javax.swing.JOptionPane;


public class Insere_Dados {
    
    public Insere_Dados(){}
   
    
    public Crimes Insere_Crimes(){
        
        String data = JOptionPane.showInputDialog("Informe a data do crime: ");
        String hora = JOptionPane.showInputDialog("Informe a hora do crime: ");
        String tipo_Crime = JOptionPane.showInputDialog("Informe o tipo do crime: ");
        String vitima = JOptionPane.showInputDialog("Informe a vitima do crime: "); 
        Crimes Crime = null;
        try{
            Crime = new Crimes(data,hora,tipo_Crime,vitima);
            GravaArquivo salvando = new GravaArquivo();
            salvando.salvarCrime(Crime);
        } 
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
            int option = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para preencher um crime novamente ou 0 para sair"));
            if(option == 1){
                Crime = Insere_Crimes();
            }
            else{
                return null;
            }
        }
        return Crime;
    }   
    
}
