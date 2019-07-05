/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assinatura.dominio;

import java.util.Date;
import usuario.dominio.Usuario;

/**
 *
 * @author Aroldo
 */
public class Assinatura {
    public int idAssinatura;
    public int id_usuario;
    public String status;
    public String formaPagamento;
    public double valor;
    public Date dataInicio;
    
    public Assinatura(int idAssinatura,int id_usuario, String status, String pagamento, double valor, Date dataIni){
        this.setIdAssinatura(idAssinatura);
        this.setId_usuario(id_usuario);
        this.setStatus(status);
        this.setFormaPagamento(pagamento);
        this.setValor(valor);
        this.setDataInicio(dataIni);
  
    }
        
    public Assinatura(){}
    
    public int getIdAssinatura() {
        return idAssinatura;
    }

    public void setIdAssinatura(int idAssinatura) {
        this.idAssinatura = idAssinatura;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        
        this.id_usuario = id_usuario;
    }

/*
    public String getUsuario(){
        return usuario;
    }

    public void setUsuario(String usuario){
        this.usuario = usuario;
    }
*/
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) { 
        this.status = status;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }
    
    public void informarPagamento(){
        
    }
      
}
