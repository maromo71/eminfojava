package br.com.pfalves.sample2;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int a, b;
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de a: "));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de b: "));
        int soma = a + b;
        JOptionPane.showMessageDialog(null,"Soma: " + soma,
                "Resultado da soma", JOptionPane.INFORMATION_MESSAGE);
    }
}
