package net.maromo;



import net.maromo.visao.CaixaTela;

import javax.swing.*;


public class GerenciarCaixa {

    public static void main(String[] args) {
	// Código para Abrir a Janela
        JFrame frame = new JFrame();
        frame.setContentPane(new CaixaTela().getPanelCaixa());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
