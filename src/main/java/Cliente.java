/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Salete
 */
public class Cliente {
    private Long id;
    private String nome;
    private String sobrenome;
    private String RG;
    private String CPF;
    private String endereco;
    
    public Cliente(Long id,String nome, String sobrenome, String RG, String CPF, String endereco){
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.RG = RG;
        this.CPF = CPF;
        this.endereco = endereco;          
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
}
