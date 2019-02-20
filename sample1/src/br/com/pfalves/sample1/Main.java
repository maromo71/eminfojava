package br.com.pfalves.sample1;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        int a;
        int b;
        a = 15;
        b = 20; //Atribuição do valor 20
        int soma = a + b;
        // System.out.println("O resultado: " + soma);
        JOptionPane.showMessageDialog(null,"Resultado " + soma,
                "Soma de Valores", JOptionPane.INFORMATION_MESSAGE);
    }
}
