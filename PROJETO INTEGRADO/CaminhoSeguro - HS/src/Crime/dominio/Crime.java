/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Crime.Dominio;

/**
 *
 * @author Harrison Sanches
 */
public class Crime {
    public int Id;
    public String data; 
    public String hora ;
    public String tipo_Crime;
    public String sexo;
    public int idade;
    public String cidade;
    public String bairro;
    public String rua;
    
    public Crime(String id,String data, String hora, String tipo_Crime, String sexo, String idade, String cidade,String bairro,String rua) throws Exception{
        this.setId(id);
        this.setData(data);
        this.setHora(hora);
        this.setTipo_Crime(tipo_Crime);
        this.setSexo(sexo);  
        this.setIdade(idade); 
        this.setCidade(cidade); 
        this.setBairro(bairro);
        this.setRua(rua);
    }
      
    public Crime(){}

    public String getData() {
        
        return data;
    }
    
    public void setData(String data) throws Exception {
            this.data = data;
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
        if (tipo_Crime.equalsIgnoreCase("") || tipo_Crime.contains("^[0-9]")){
            throw new Exception("Crime inválido!");
        }
        else{
            this.tipo_Crime = tipo_Crime;
        }
    }

//    public String getVitima() {
//        return vitima;
//    }
//
//    public void setVitima(String vitima) throws Exception {
//       if ( (vitima.equalsIgnoreCase("") || vitima.contains("^[0-9]"))) {
//           throw new Exception("Vitima inválida!");
//       } 
//       else {
//           this.vitima = vitima;
//       }
//    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) throws Exception {
        if (sexo.equalsIgnoreCase("")){
            throw new Exception("Sexo inválido!");
        }
        else{
            this.sexo = sexo;
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(String idade) throws Exception{
        if (idade.equalsIgnoreCase("")){
            throw new Exception("idade inválida!");    
        }
        else{
            this.idade = Integer.parseInt(idade);
        }
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) throws Exception{
        if ( (cidade.equalsIgnoreCase("") || cidade.contains("^[0-9]"))){
            throw new Exception("cidade inválida!"); 
        }
        else{
            this.cidade = cidade;
        }
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro)  throws Exception{
        if ( (bairro.equalsIgnoreCase("")) ){
            throw new Exception("bairro inválido!"); 
        }
        else{
            this.bairro = bairro;
        }
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) throws Exception {
        if ( (rua.equalsIgnoreCase("")) ){
            throw new Exception("rua inválida!");
        }
        else{
            this.rua = rua;
        }
    }

    public int getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Integer.parseInt(Id);
    }
    
    public String classifica (int numero){
        String Classificacao ;
        if (numero == 0){
            Classificacao = "RUA SEM REGISTROS DE CRIMES";
            return Classificacao;
        }
        if (numero == 1){
           Classificacao = "A - RUA ALTAMENTE SEGURA";
            return Classificacao;
        }
        if ((numero == 2)) {
           Classificacao = "B - RUA SEGURA";
            return Classificacao;
        }
                if ((numero == 3)) {
           Classificacao = "C - RUA COM RISCO INTERMEDIÁRIO ";
            return Classificacao;
        }
        if ((numero == 4)) {
           Classificacao = "D - RUA PERIGSA ";
            return Classificacao;
        }
        if ((numero > 5)) {
           Classificacao = "E - RUA ALTAMENTE PERIGOSA";
            return Classificacao;
        }
        return null;
    }
  
    
    
}