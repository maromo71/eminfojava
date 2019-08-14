package net.maromo;

public class Computador {
    public String marca;
    public String modelo;
    public String cor;
    public long numeroSerie;
    public double preco;

    public void imprimir(){
        System.out.println("marca = " + marca);
        System.out.println("modelo = " + modelo);
        System.out.println("cor = " + cor);
        System.out.println("numeroSerie = " + numeroSerie);
        System.out.println("preco = " + preco);
    }
    public void calcularValor(){
        if(marca.equalsIgnoreCase("HP")){
            preco *= 1.3;
            return;
        }
        if(marca.equalsIgnoreCase("IBM")){
            preco *= 1.5;
        }
    }
    public int alterarValor(double valor){
        if(valor>0){
            preco = valor;
            return 1;
        }
        return 0;
    }

}
