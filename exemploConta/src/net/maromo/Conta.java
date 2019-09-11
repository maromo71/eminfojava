package net.maromo;

/**
 * @author Alunos
 * @since 2019 - segundo semestre
 * @version 1.0 Beta
 */
public class Conta {
    public int numConta;
    public String nomeCliente;
    public double saldo;
    public static double cpmf;

    /**
     *
     * @param valor Valor em Reais Passado para o Saque
     */
    public void sacar(double valor){
        double valorImposto = valor * cpmf;
        saldo = saldo - valor - valorImposto;
    }

    /**
     *
     * @param valor Valor em Reais passado para depósito
     */
    public void depositar(double valor){
        saldo = saldo + valor;
    }

    /**
     * Método imprimir - Imprime todos dos dados da conta
     */
    public void imprimir(){
        System.out.println("Dados da conta");
        System.out.println("Num. da Conta = " + numConta);
        System.out.println("Nome do Cliente = " + nomeCliente);
        System.out.println("Saldo = " + saldo);
        System.out.println("-----------------");
    }
}
