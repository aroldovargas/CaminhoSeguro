/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Endereco.dominio;

/**
 *
 * @author Aroldo
 */
public class Endereco {
    private int idEndereco = 0;
    public String nomeRua;
    public String nomeBairro;
    public String nomeCidade;
    public int quantCrimes = 0;
    public String classificacao;
    public String descricao;
    

    public int getQuantCrimes() {
        return quantCrimes;
    }

    public void setQuantCrimes(int quantCrimes) {
        this.quantCrimes = quantCrimes;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    @Override
    public String toString(){
        
        return "Endereço: " + nomeRua + "," + nomeBairro + "," + nomeCidade;
    }
    
    public int getIdEndereco() {
        return this.idEndereco;
    }
    
    public void setIdEndereco(int idEndereco) {
        this.idEndereco = idEndereco;
    }
    
    public String getNomeRua() {
        return nomeRua;
    }

    public void setNomeRua(String nomeRua) throws Exception {
        
        if (nomeRua.equalsIgnoreCase(""))
        {
            throw new Exception("Nome da rua não pode ser vazio");
        }
        
        this.nomeRua = nomeRua;
    }

    public String getNomeBairro() {
        return nomeBairro;
    }

    public void setNomeBairro(String nomeBairro) throws Exception{
        if(nomeBairro.equalsIgnoreCase(""))
        {
            throw new Exception("Nome do bairro não pode ser vazio");
        }
        this.nomeBairro = nomeBairro;
    }

    public String getNomeCidade() {
        return nomeCidade;
    }

    public void setNomeCidade(String nomeCidade) throws Exception{
        if(nomeCidade.equalsIgnoreCase(""))
        {
            throw new Exception("Nome da cidade não pode ser vazio");
        }
        this.nomeCidade = nomeCidade;
    }

    
}