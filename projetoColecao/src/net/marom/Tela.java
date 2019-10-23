package net.marom;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Tela {
    private JPanel panel1;
    private JPanel panelCaixas;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JButton limparButton;
    private JButton sairButton;
    private JTextField textField6;

    public Tela() {
        limparButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                limpar(panelCaixas);
            }
        });

    }

    private void limpar(JPanel panelCaixas) {
        for (Component comp: panelCaixas.getComponents()){
            if (comp instanceof JTextField){
                JTextField caixa = (JTextField) comp;
                caixa.setText(null);
            }

        }
    }

    public JPanel getPanel1() {
        return panel1;
    }

}
