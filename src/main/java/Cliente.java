/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Salete
 */
public class Cliente implements Comparable<Cliente>{
    public long id;
    public String nome;
    public String sobrenome;
    public String RG;
    public String CPF;
    public String endereco;
    public double salario;
    public int ordenar;
    
    public Cliente() {
    }
    
    public Cliente(long id,String nome, String sobrenome, String RG, String CPF, String endereco, double salario){
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.RG = RG;
        this.CPF = CPF;
        this.endereco = endereco;
        this.salario = salario;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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
    
     public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int ordenar() {
        return ordenar;
    }

    public void setordenar(int ordenarPor) {
        this.ordenar = ordenarPor;
    }
    
    @Override
    public int compareTo(Cliente cliente) {
        if (this.ordenar == 0) 
            return this.nome.compareTo(cliente.nome);
        else if (this.ordenar == 1) 
            return this.sobrenome.compareTo(cliente.sobrenome);
        else {
            if (this.salario < cliente.salario) 
                    return 1;
                else if (this.salario > cliente.salario)
                    return -1;
                else
                    return 0;
        }
    }
}
