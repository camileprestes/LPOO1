/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Camile
 */
public class ContaInvestimento extends Conta{
    public double MontanteMinimo;
    public double DepositoMinimo;
    public double DepositoInicial;

    public ContaInvestimento(double MontanteMinimo, double DepositoMinimo, double DepositoInicial, String Dono, int Numero, double Deposita, double Saca, double Remunera, double Saldo) {
        super(Dono, Numero, Deposita, Saca, Remunera, Saldo);
        this.MontanteMinimo = MontanteMinimo;
        this.DepositoMinimo = DepositoMinimo;
        this.DepositoInicial = DepositoInicial;
    }

    public double getMontanteMinimo() {
        return MontanteMinimo;
    }

    public void setMontanteMinimo(double MontanteMinimo) {
        this.MontanteMinimo = MontanteMinimo;
    }

    public double getDepositoMinimo() {
        return DepositoMinimo;
    }

    public void setDepositoMinimo(double DepositoMinimo) {
        this.DepositoMinimo = DepositoMinimo;
    }

    public double getDepositoInicial() {
        return DepositoInicial;
    }

    public void setDepositoInicial(double DepositoInicial) {
        this.DepositoInicial = DepositoInicial;
    }
    @Override
    public boolean deposita(double valor) {
        if (valor >= this.DepositoMinimo)
            return super.deposita(valor);
        return false;
    }
    
    @Override
    public boolean saca(double valor) {
        if (this.Saldo - valor >= this.MontanteMinimo)
            return super.saca(valor);
        return false;
    }
    
    @Override
    public void remunera() {
        this.Saldo *= 1.2;
    }
    
}
