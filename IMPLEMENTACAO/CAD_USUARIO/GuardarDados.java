/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastrousuario;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Emanuel
 */
public class GuardarDados {

    public void salvarDados(CadUser dados){
        
        FileWriter arq;
        try{
            arq = new FileWriter("D:\\IFES\\5° periodo\\POO1\\dados.txt", true);
            PrintWriter gravarArq = new PrintWriter(arq);
            gravarArq.append("- " +  dados.getNome_user() + "\r\n" + dados.getSexo() + "\r\n" + dados.getIdade() + "\r\n" + dados.getEmail() + "\r\n" + dados.getLogin() + "\r\n" + dados.getSenha() + "\r\n" + dados.getCpf()+ "\r\n");
            arq.close();
        } catch (IOException ex) {
            Logger.getLogger(GuardarDados.class.getName()).log(Level.SEVERE, null, ex);   
        }
    }     
    
}
