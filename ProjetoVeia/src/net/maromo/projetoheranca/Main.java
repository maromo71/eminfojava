package net.maromo.projetoheranca;

import net.maromo.projetoheranca.visao.FrmVeia;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        JFrame tela = new JFrame();
        tela.setContentPane(new FrmVeia().getPanelVeia());
        tela.setTitle("Jogo da Véia");
        tela.setVisible(true);
        tela.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        tela.pack();
    }
}
