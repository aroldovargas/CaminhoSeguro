/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Crimes;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 20171bsi0278
 */
public class GravaArquivo {

    public void salvarConta(Crimes crimes) {

        FileWriter arq;
        try {
            arq = new FileWriter("C:\\Users\\20171bsi0227\\Documents\\NetBeansProjects\\Crimes\\crimes.txt", true);        
            PrintWriter gravarArq = new PrintWriter(arq);
            gravarArq.append(crimes.getData() + "," +crimes.getHora()
                + ","+ crimes.getEndereco()+","+ crimes.getTipo_Crime()+"," + crimes.getVitima()+ "\r\n");        
            arq.close();   
        } catch (IOException ex) {
            Logger.getLogger(GravaArquivo.class.getName()).log(Level.SEVERE, null, ex);                                                       
        }        
    }
 
}
