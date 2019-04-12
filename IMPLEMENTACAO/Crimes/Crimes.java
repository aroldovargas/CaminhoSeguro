/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Crimes;


/**
 *
 * @author 20171BSI0227
 */
public class Crimes {
     private String data; 
     private String hora ;
     private String tipo_Crime;
     private String endereco ;
     private String vitima;   
    
    public Crimes(String data, String hora, String tipo_Cliente, String endereco, String vitima){
        this.data = data;
        this.hora = hora;
        this.tipo_Crime = tipo_Cliente;
        this.endereco = endereco;
        this.vitima = vitima;     
}

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getTipo_Crime() {
        return tipo_Crime;
    }

    public void setTipo_Crime(String tipo_Crime) {
        this.tipo_Crime = tipo_Crime;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getVitima() {
        return vitima;
    }

    public void setVitima(String vitima) {
        this.vitima = vitima;
    }
    
     
     
}
