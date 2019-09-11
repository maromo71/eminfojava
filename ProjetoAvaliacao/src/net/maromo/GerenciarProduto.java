package net.maromo;

import net.maromo.view.FrmProduto;

import javax.swing.*;

public class GerenciarProduto {

    public static void main(String[] args) {
        JFrame tela = new JFrame();
        tela.setContentPane(new FrmProduto().getPanelProdutos());
        tela.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        tela.setTitle("Movimentação de Produto");
        tela.setVisible(true);
        tela.pack();
    }
}
