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
     private String vitima;   
    
    public Crimes(String data, String hora, String tipo_Cliente, String vitima) throws Exception{
        this.setData(data);
        this.setHora(hora);
        this.setTipo_Crime(tipo_Cliente);
        this.setVitima(vitima);     
}   
    Crimes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    public String getData() {
        return data;
    }

    public void setData(String data) throws Exception {
        if (data.equalsIgnoreCase("") || !data.contains("/") || data.contains("^[a-Z]")){
            throw new Exception("Data inválida!");
        } 
        else {
            this.data = data;
        }
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora)throws Exception {
        if (hora.equalsIgnoreCase("") ||  !hora.contains(":") || hora.contains("^[a-Z]") ){
            throw new Exception("Hora Inválida!");
        }
        else{
            this.hora = hora;
        }
    }

    public String getTipo_Crime() {
        return tipo_Crime;
    }

    public void setTipo_Crime(String tipo_Crime) throws Exception {
        if (tipo_Crime.equalsIgnoreCase("") || data.contains("^[0-9]")){
            throw new Exception("Crime inválido!");
        }
        else{
            this.tipo_Crime = tipo_Crime;
        }
    }

    public String getVitima() {
        return vitima;
    }

    public void setVitima(String vitima) throws Exception {
       if ( (vitima.equalsIgnoreCase("") || vitima.contains("^[0-9]"))) {
           throw new Exception("Vitima inválida!");
       } 
       else {
           this.vitima = vitima;
       }
    }
    
     
     
}
