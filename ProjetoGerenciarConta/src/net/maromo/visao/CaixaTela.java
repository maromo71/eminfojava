package net.maromo.visao;

import net.maromo.Caixa;
import org.omg.CORBA.portable.ApplicationException;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CaixaTela {
    private JTextField txtValor;
    private JTextField txtSaldo;
    private JButton btnDepositar;
    private JButton btnRetirar;
    private JButton btnConsultar;
    private JButton btnSair;
    private JTextArea txtMensagem;
    private JPanel panelCaixa;

    public JPanel getPanelCaixa() {
        return panelCaixa;
    }

    //Objeto do tipo Caixa.
    private Caixa caixa;

    public CaixaTela() {
        caixa = new Caixa(); //Instanciar caixa

        btnDepositar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                double valor;
                valor = Double.parseDouble(txtValor.getText());
                boolean deuCerto = caixa.depositar(valor);
                if(deuCerto){
                    txtMensagem.append("Depósito feito com sucesso \n");
                }else{
                    txtMensagem.append("Valor incorreto para depósito \n");
                }
                limparTextos();
            }


        });
        btnRetirar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                double valor;
                valor = Double.parseDouble(txtValor.getText());
                boolean deuCerto = caixa.sacar(valor);
                if(deuCerto){
                    txtMensagem.append("Saque efetuado com sucesso \n");
                }else{
                    txtMensagem.append("Valor insuficente na conta \n");
                }
                limparTextos();
            }
        });
        btnConsultar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                txtSaldo.setText(Double.toString(caixa.consultar()));
                txtMensagem.append("Saldo Consultado em Tela \n");
               }
        });
        btnSair.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JOptionPane.showMessageDialog(null,
                        "Fim de Programa",
                        "Mensagem",
                        JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
            }

        });
    }

    private void limparTextos() {
        txtValor.setText(null);
        txtSaldo.setText(null);
        txtValor.requestFocus();
    }
}
