package net.maromo.projetoheranca.visao;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class FrmVeia {
    private JPanel panelVeia;
    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JButton btn4;
    private JButton btn5;
    private JButton btn6;
    private JButton btn7;
    private JButton btn8;
    private JButton btn9;
    private JButton btnNovo;
    private JButton btnSair;


    public int vez = 0;

    public FrmVeia() {
        iniciar();
        btnNovo.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                //Limpar todos os 9 botões
                iniciar();
            }
        });
        btnSair.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JOptionPane.showMessageDialog(null,
                        "Fim de Jogo", "Pronto",
                        JOptionPane.INFORMATION_MESSAGE);
                System.exit(0); //Sinal para finalizar o programa
            }
        });
        btn1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                jogar(e);
            }
        });
        btn2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                jogar(e);
            }
        });
        btn3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                jogar(e);
            }
        });
        btn4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                jogar(e);
            }
        });
        btn5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                jogar(e);
            }
        });
        btn6.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                jogar(e);
            }
        });
        btn7.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                jogar(e);
            }
        });
        btn8.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                jogar(e);
            }
        });
        btn9.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                jogar(e);
            }
        });
    }

    private void iniciar() {
        btn1.setBackground(Color.white);
        btn2.setBackground(Color.white);
        btn3.setBackground(Color.white);
        btn4.setBackground(Color.white);
        btn5.setBackground(Color.white);
        btn6.setBackground(Color.white);
        btn7.setBackground(Color.white);
        btn8.setBackground(Color.white);
        btn9.setBackground(Color.white);

        btn1.setText(null);
        btn2.setText(null);
        btn3.setText(null);
        btn4.setText(null);
        btn5.setText(null);
        btn6.setText(null);
        btn7.setText(null);
        btn8.setText(null);
        btn9.setText(null);
        vez = 0;
    }

    private void jogar(MouseEvent e) {
        JButton meuBotao = (JButton) e.getComponent();
        if(meuBotao.getText()!=null){
            JOptionPane.showMessageDialog(null,
                    "Local já jogado",
                    "ERRO",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        vez++;
        if(vez % 2 == 1){
            meuBotao.setText("X");
        }else{
            meuBotao.setText("O");
        }
        if(vez<5){
            return;
        }else{
            verQuemGanhou();
        }
    }

    private void verQuemGanhou() {
        if(btn1.getText()=="X" && btn2.getText()=="X" && btn3.getText()=="X"){
            pintar(1,2,3);
            venceuX();
        }
        if(btn4.getText()=="X" && btn5.getText()=="X" && btn6.getText()=="X"){
            pintar(4,5,6);
            venceuX();
        }
        if(btn7.getText()=="X" && btn8.getText()=="X" && btn9.getText()=="X"){
            pintar(7,8,9);
            venceuX();
        }
        if(btn1.getText()=="X" && btn4.getText()=="X" && btn7.getText()=="X"){
            pintar(1,4,7);
            venceuX();
        }
        if(btn2.getText()=="X" && btn5.getText()=="X" && btn8.getText()=="X"){
            pintar(2,5,8);
            venceuX();
        }
        if(btn3.getText()=="X" && btn6.getText()=="X" && btn9.getText()=="X"){
            pintar(3,6,9);
            venceuX();
        }
        if(btn1.getText()=="X" && btn5.getText()=="X" && btn9.getText()=="X"){
            pintar(1,5,9);
            venceuX();
        }
        if(btn3.getText()=="X" && btn5.getText()=="X" && btn7.getText()=="X"){
            pintar(3,5,7);
            venceuX();
        }

        if(btn1.getText()=="O" && btn2.getText()=="O" && btn3.getText()=="O"){
            pintar(1,2,3);
            venceuO();
        }
        if(btn4.getText()=="O" && btn5.getText()=="O" && btn6.getText()=="O"){
            pintar(4,5,6);
            venceuO();
        }
        if(btn7.getText()=="O" && btn8.getText()=="O" && btn9.getText()=="O"){
            pintar(7,8,9);
            venceuO();
        }
        if(btn1.getText()=="O" && btn4.getText()=="O" && btn7.getText()=="O"){
            pintar(1,4,7);
            venceuO();
        }
        if(btn2.getText()=="O" && btn5.getText()=="O" && btn8.getText()=="O"){
            pintar(2,5,8);
            venceuO();
        }
        if(btn3.getText()=="O" && btn6.getText()=="O" && btn9.getText()=="O"){
            pintar(3,6,9);
            venceuO();
        }
        if(btn1.getText()=="O" && btn5.getText()=="O" && btn9.getText()=="O"){
            pintar(1,5,9);
            venceuO();
        }
        if(btn3.getText()=="O" && btn5.getText()=="O" && btn7.getText()=="O"){
            pintar(3,5,7);
            venceuO();
        }
    }

    private void pintar(int a, int b, int c) {
        if(a==1)btn1.setBackground(Color.orange);
        if(a==2)btn2.setBackground(Color.orange);
        if(a==3)btn3.setBackground(Color.orange);
        if(a==4)btn4.setBackground(Color.orange);
        if(a==5)btn5.setBackground(Color.orange);
        if(a==6)btn6.setBackground(Color.orange);
        if(a==7)btn7.setBackground(Color.orange);
        if(a==8)btn8.setBackground(Color.orange);
        if(a==9)btn9.setBackground(Color.orange);

        if(b==1)btn1.setBackground(Color.orange);
        if(b==2)btn2.setBackground(Color.orange);
        if(b==3)btn3.setBackground(Color.orange);
        if(b==4)btn4.setBackground(Color.orange);
        if(b==5)btn5.setBackground(Color.orange);
        if(b==6)btn6.setBackground(Color.orange);
        if(b==7)btn7.setBackground(Color.orange);
        if(b==8)btn8.setBackground(Color.orange);
        if(b==9)btn9.setBackground(Color.orange);

        if(c==1)btn1.setBackground(Color.orange);
        if(c==2)btn2.setBackground(Color.orange);
        if(c==3)btn3.setBackground(Color.orange);
        if(c==4)btn4.setBackground(Color.orange);
        if(c==5)btn5.setBackground(Color.orange);
        if(c==6)btn6.setBackground(Color.orange);
        if(c==7)btn7.setBackground(Color.orange);
        if(c==8)btn8.setBackground(Color.orange);
        if(c==9)btn9.setBackground(Color.orange);
    }

    private void venceuO() {
        JOptionPane.showMessageDialog(null,
                "Jogador O Venceu",
                "Fim do Jogo",
                JOptionPane.INFORMATION_MESSAGE);
    }

    private void venceuX() {
        JOptionPane.showMessageDialog(null,
                "Jogador X Venceu",
                "Fim do Jogo",
                JOptionPane.INFORMATION_MESSAGE);
    }


    public JPanel getPanelVeia(){
        return panelVeia;
    }
}
