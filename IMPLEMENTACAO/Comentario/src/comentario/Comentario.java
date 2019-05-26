/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comentario;

/**
 *
 * @author Emanuel
 */
public class Comentario {
    private int id_usuario;
    private String rua;
    private String crime;
    private String comentario;
    
    public Comentario(String id_usuario, String rua, String crime,String comentario) throws Exception{

        this.setId_usuario(id_usuario);
        this.setRua(rua);
        this.setCrime(crime);
        this.setComentario(comentario);
    }

    Comentario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(String id_usuario) throws Exception {
        
        if (id_usuario.equalsIgnoreCase("")){
            throw new Exception("\nId do usuario não pode ser vazio\n");
        } else if (id_usuario.contains("-")){
            throw new Exception("\nId inválido\n");
        } else if (id_usuario.equalsIgnoreCase("0")){
            throw new Exception("\nValor inválido para Id\n");
        }
        
        this.id_usuario = Integer.parseInt(id_usuario);
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) throws Exception {
        
        if (rua.equalsIgnoreCase("")){
            throw new Exception("\nNome inválido, a rua deve ser diferente de vazio\n");
        } else if (rua.length() >  70)
            throw new Exception("\nNome da rua deve conter no máximo 70 caracteres\n");
        
        this.rua = rua;
    }

    public String getCrime() {
        return crime;
    }

    public void setCrime(String crime) throws Exception {
        if (crime.equalsIgnoreCase("")){
            throw new Exception("\nDigite o crime a ser reportado\n");
        }
        this.crime = crime;
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
