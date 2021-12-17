/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Salete
 */
public class ContaCorrente extends Conta{
    public double DepositoInicial;
    public double Limite;

    public ContaCorrente(double DepositoInicial, double Limite, String Dono, int Numero, double Deposita, double Saca, double Remunera, double Saldo) {
        super(Dono, Numero, Deposita, Saca, Remunera, Saldo);
        this.DepositoInicial = DepositoInicial;
        this.Limite = Limite;
    }

    public double getDepositoInicial() {
        return DepositoInicial;
    }

    public void setDepositoInicial(double DepositoInicial) {
        this.DepositoInicial = DepositoInicial;
    }

    public double getLimite() {
        return Limite;
    }

    public void setLimite(double Limite) {
        this.Limite = Limite;
    }
    
    
    @Override
    public boolean saca(double valor) {
        return valor <= this.Limite;
    }
    
    @Override
    public void remunera() {
        this.Saldo *= 1.1;
    }
    
}
