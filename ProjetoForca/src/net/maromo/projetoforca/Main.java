package net.maromo.projetoforca;

import net.maromo.projetoforca.view.FrmForca;

import javax.swing.*;

public class Main {

    public static void main(String[] args) throws Exception {
        JFrame tela = new JFrame();
        tela.setContentPane(new FrmForca().getPanelForca());
        tela.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        tela.setTitle("Jogo da Forca");
        tela.setVisible(true);
        tela.pack();

    }
}
