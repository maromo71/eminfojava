package net.maromo;

public abstract class Conta {
    private int idConta;
    private Cliente cliente;
    private double saldo;

    public Conta(){
        cliente = new Cliente();
    }

    public int getIdConta() {
        return idConta;
    }

    public void setIdConta(int idConta) {
        this.idConta = idConta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //Método para efetuar deposito para qualquer conta
    public void depositar(double valor){
        saldo+= valor;
    }
    //Método abstrato sacar. Ele não possui código
    public abstract boolean sacar(double valor);

}
