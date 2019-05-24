/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastrousuario;

import static javafx.beans.binding.Bindings.length;

/**
 *
 * @author Emanuel
 */
public class Usuario {
    
    private String nomeUsuario;
    private String sexo;
    private int idade;
    private String email;
    private String login;
    private String senha;
    private long cpf;
    
    public Usuario(String nome, String sexo, String idade, String email, String login, String senha, String cpf) throws Exception{
        
        this.setNome(nome);
 
        this.setSexo(sexo);
        
        this.setIdade(idade);
        
        this.setEmail(email);
        
        this.setLogin(login);
        
        this.setSenha(senha);
        
        this.setCpf(cpf);
        /*
        this.nomeUsuario = nome;
        this.sexo = sexo;
        this.idade = Integer.parseInt(idade);
        this.email = email;
        this.login = login;
        this.senha = senha;
        this.cpf = Long.parseLong(cpf);
        */
    }

    Usuario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    public String getNome() {
        return nomeUsuario;
    }

    public void setNome(String nome) throws Exception {
        if(nome.equalsIgnoreCase("")){
            throw new Exception("\nNome de usuario não pode ser vazio\n");            
        }
        this.nomeUsuario = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) throws Exception {
       
        if(sexo.equalsIgnoreCase("")){
            throw new Exception("\nSexo de usuario não pode ser vazio\n");            
        }else if (!sexo.equalsIgnoreCase("M")  && !sexo.equalsIgnoreCase("F")){
            throw new Exception("\nSexo inválido\n"); 
        }
        
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(String idade) throws Exception {
        if(idade.equalsIgnoreCase("") ||  idade.contains("-") || idade.equals("0")){
            if(String.valueOf(idade).equalsIgnoreCase("")){
                throw new Exception("\nDeve ser informado um valor válido para idade\n");
            }
            else{
                throw new Exception("\nA idade deve ser maior que 0\n"); 
            }            
        }
        
        this.idade = Integer.parseInt(idade);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws Exception{ 
            
        if(!email.contains("@") || !email.contains(".")){
            throw new Exception("\ne-maill inválido\n");     
        } else if (email.length() != 12){
            throw new Exception("\nQuantidade de caracteres inválida para e-mail\n");
        }   
            
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) throws Exception {
        
    if(login.matches("[0-9]") && login.matches("[a-Z]") ){
        throw new Exception("\nO login não deve conter apenas números\n");    
    }
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) throws Exception {
        
        if(senha.equalsIgnoreCase(login)){
            throw new Exception("\nA senha deve ser diferente do login\n");        
        } else if(senha.length() < 6){
            throw new Exception("\nA senha deve conter no mínimo 5 digitos\n");
        }
        
        this.senha = senha;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) throws Exception {
        
        if(cpf.length() != 11){  
            throw new Exception("\nO CPF deve conter 11 digitos\n");
        }
        
        this.cpf = Long.parseLong(cpf);
    }
}