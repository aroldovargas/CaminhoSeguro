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
    private String login;
    private String senha;
    private String nome;
    private String sexo;
    private int idade;
    private String rua;
    private String crime;
    private String comentario;
    
    public Comentario(String login, String senha, String nome, String sexo, String idade, String rua, String crime,String comentario){
        this.login = login;
        this.senha = senha;
        this.nome = nome;
        this.sexo = sexo;
        this.idade = Integer.parseInt(idade);
        this.rua = rua;
        this.crime = crime;
        this.comentario = comentario;
        
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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public String getCrime() {
        return crime;
    }

    public void setCrime(String crime) {
        this.crime = crime;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }
    
    
}
