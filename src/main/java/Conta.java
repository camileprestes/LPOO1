/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Salete
 */
public class Conta{
    private String Dono;
    private int Numero;
    private double  Deposita;
    private double Saca;
    private double Remunera;
    private double Saldo;

    public Conta(String Dono, int Numero, double Deposita, double Saca, double Remunera, double Saldo) {
        this.Dono = Dono;
        this.Numero = Numero;
        this.Deposita = Deposita;
        this.Saca = Saca;
        this.Remunera = Remunera;
        this.Saldo = Saldo;
    }

    public String getDono() {
        return Dono;
    }

    public void setDono(String Dono) {
        this.Dono = Dono;
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    public double getDeposita() {
        return Deposita;
    }

    public void setDeposita(double Deposita) {
        this.Deposita = Deposita;
    }

    public double getSaca() {
        return Saca;
    }

    public void setSaca(double Saca) {
        this.Saca = Saca;
    }

    public double getRemunera() {
        return Remunera;
    }

    public void setRemunera(double Remunera) {
        this.Remunera = Remunera;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }
    
    
    
}
