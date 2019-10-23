package net.marom;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        JFrame meuFrame = new JFrame("Formulário");
        meuFrame.setContentPane(new Tela().getPanel1());
        meuFrame.setDefaultCloseOperation(
                WindowConstants.EXIT_ON_CLOSE);
        meuFrame.setVisible(true);
        meuFrame.pack();
    }
}
