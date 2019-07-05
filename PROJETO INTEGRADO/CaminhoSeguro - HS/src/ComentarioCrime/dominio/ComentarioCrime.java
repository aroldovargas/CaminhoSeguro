/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ComentarioCrime.dominio;

import Comentario.Comentario;
import usuario.dominio.Usuario;

/**
 *
 * @author Emanuel
 */
public class ComentarioCrime extends Comentario {
    private String rua;
    private String crime;
    
    public ComentarioCrime(Usuario id_usuario, String rua, String crime,String comentario) throws Exception{

        super(id_usuario,comentario);
        this.setRua(rua);
        this.setCrime(crime);
        
    }

    public ComentarioCrime() {
        
    }


    public String getRua() {
        return rua;
    }

    public void setRua(String rua) throws Exception {
        
        if (rua.equalsIgnoreCase("")){
            throw new Exception("\nNome inválido, a rua deve ser diferente de vazio\n");
        } else if (rua.length() >  100)
            throw new Exception("\nNome da rua deve conter no máximo 100 caracteres\n");
        
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

}
