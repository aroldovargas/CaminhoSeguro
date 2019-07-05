/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comentario;

import usuario.dominio.Usuario;
/**
 *
 * @author 20171BSI0146
 */
public class Comentario {
    private Usuario id_usuario;
    private String comentario;
    
    public Comentario(){
    }
    
    
    public Comentario (Usuario id_usuario, String comentario) throws Exception{
        this.setId_usuario(id_usuario);
        this.setComentario(comentario);
    }

    public Usuario getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Usuario id_usuario) throws Exception {
        
        this.id_usuario = id_usuario;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) throws Exception {
        if (comentario.equalsIgnoreCase("")){
            throw new Exception("\nEscreva um comentário válido\n");
        }
        else if (comentario.length() > 250){
            throw new Exception("\nComentário deve conter no máximo 250 caracteres\n");
        }
        this.comentario = comentario;
    }
}
