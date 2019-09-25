package net.maromo;

public class Corrente extends Conta {
    private double limite;

    public double getLimite() {
        return limite;
    }
    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public boolean sacar(double valor) {
        if(valor<=(getSaldo()+limite)){
            setSaldo(getSaldo()-valor);
            return true;
        }
        return false;
    }
}
