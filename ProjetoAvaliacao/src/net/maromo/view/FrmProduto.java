package net.maromo.view;

import jdk.nashorn.internal.scripts.JO;
import net.maromo.Produto;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class FrmProduto {
    private JTextField textQuantidade;
    private JTextField textSaldoEstoque;
    private JButton registrarEntradaButton;
    private JButton registrarSaidaButton;
    private JButton consultarEstoqueButton;
    private JButton sairButton;
    private JPanel panelProdutos;
    private Produto produto;

    public FrmProduto() {
        produto = new Produto();
        registrarEntradaButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int qtd = Integer.parseInt(textQuantidade.getText());
                boolean resultado = produto.registrarEntrada(qtd);
                if(resultado==true){
                    JOptionPane.showMessageDialog(null,
                            "Entrada efetuada com sucesso");
                }else{
                    JOptionPane.showMessageDialog(null,
                            "Quantidade informada é inválida");
                }
                limpar();
            }
        });
        registrarSaidaButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int qtd = Integer.parseInt(textQuantidade.getText());
                boolean resultado = produto.registrarSaida(qtd);
                if(resultado==true){
                    JOptionPane.showMessageDialog(null,
                            "Saída efetuada com sucesso");
                }else{
                    JOptionPane.showMessageDialog(null,
                            "Quantidade não existente no estoque");
                }
                limpar();
            }
        });
        consultarEstoqueButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                textSaldoEstoque.setText(Integer.toString(produto.exibirEstoque()));
            }
        });
        sairButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.exit(0);
            }
        });
    }

    public void limpar(){
        textQuantidade.setText(null);
        textSaldoEstoque.setText(null);
    }
    public JPanel getPanelProdutos(){
        return panelProdutos;
    }
}
