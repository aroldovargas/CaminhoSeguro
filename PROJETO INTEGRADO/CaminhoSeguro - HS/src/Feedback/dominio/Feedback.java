/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Feedback.dominio;

import Comentario.Comentario;
import usuario.dominio.Usuario;



/**
 *
 * @author Emanuel
 */
public class Feedback extends Comentario {
    private String tipoFeedback;
    
    public Feedback(Usuario id_usuario,String tipoFeedback,String comentario) throws Exception{

        super(id_usuario,comentario);
        this.setTipoFeedback(tipoFeedback);
    } 

    public Feedback() {   
    }


    public String getTipoFeedback() {
        return tipoFeedback;
    }

    public void setTipoFeedback(String tipoFeedback) throws Exception {
        
        if (tipoFeedback.equalsIgnoreCase("")){
           throw new Exception("\nO tipo de comentario não pode ser vazio\n"); 
        } else if (tipoFeedback.contains("-")){
            throw new Exception("\nInforme um tipo de comentario \n"); 
        } else if ((!tipoFeedback.equalsIgnoreCase("^1") || !tipoFeedback.equalsIgnoreCase("^2") || !tipoFeedback.equalsIgnoreCase("^3") )){
            throw new Exception("\nInforme um tipo de comentario válido \n"); 
        }
        
        this.tipoFeedback = tipoFeedback;
    }
    

}
