/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastrousuario;

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
    
    public Usuario(String nome, String sexo, String idade, String email, String login, String senha, String cpf){
        this.nomeUsuario = nome;
        this.sexo = sexo;
        this.idade = Integer.parseInt(idade);
        this.email = email;
        this.login = login;
        this.senha = senha;
        this.cpf = Long.parseLong(cpf);
    }

    public String getNome_user() {
        return nomeUsuario;
    }

    public void setNome_user(String nome) {
        this.nomeUsuario = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }
}
