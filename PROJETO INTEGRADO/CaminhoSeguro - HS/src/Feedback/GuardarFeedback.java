/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Feedback;

import Feedback.dominio.Feedback;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Emanuel
 */
public class GuardarFeedback {
    
    public GuardarFeedback(){}
    
    public void salvarFeedback(Feedback dados){
            
        FileWriter arq;
        try{
            arq = new FileWriter("D:\\IFES\\5° periodo\\POO1\\ExerciciosPOO1-JogoPerguntas\\feedback.txt", true);
            PrintWriter gravarArq = new PrintWriter(arq);
            gravarArq.append("- "+ dados.getId_usuario() + "\r\n"  + dados.getTipoFeedback() + "\r\n" + dados.getComentario() + "\r\n");
            arq.close(); 
        } catch (IOException ex) {
            Logger.getLogger(GuardarFeedback.class.getName()).log(Level.SEVERE, null, ex);   
        }
    }
}

