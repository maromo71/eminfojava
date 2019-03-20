package br.edu.etec.sample8;

public class Main {

    public static void main(String[] args) {
	// comando if
        int x = 10;
        boolean ehCasado = false;
        double salario = 2000.0;
        double aumento = calcularValorDeAumento(ehCasado, salario);
        System.out.println("aumento = " + aumento);
    }

    public static double calcularValorDeAumento(boolean ehCasado, double salario){
        if(ehCasado && salario>=950.0){
            return salario * 0.10;
        }
        if(!ehCasado && salario >= 1500.0){
            return salario * 0.10;
        }
        return salario * 0.09;
    }
}
