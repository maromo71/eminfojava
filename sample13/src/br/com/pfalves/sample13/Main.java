package br.com.pfalves.sample13;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	// Calculo do imc de uma pessoa usando janelas para entrada
        String nome;
        double altura, peso;
        nome = JOptionPane.showInputDialog(null,
                "Digite o seu nome: ");
        altura = Double.parseDouble(JOptionPane.showInputDialog(null,
                "Digite a sua altura: "));
        peso = Double.parseDouble(JOptionPane.showInputDialog(null,
                "Digite o seu peso: "));
        double imc = peso / (altura * altura);
        JOptionPane.showMessageDialog(null,
                "Nome: " + nome + " \nSeu imc = " + imc);
    }
}
