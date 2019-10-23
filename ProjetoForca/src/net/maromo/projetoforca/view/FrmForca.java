package net.maromo.projetoforca.view;


import net.maromo.projetoforca.model.Forca;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class FrmForca {

    public char[] vetPalavra;
    public int erro;
    public int contaAcerto;

    public FrmForca() throws Exception {
        //Ocultar as caixas de texto pois ainda não se sorteou a palavra
        ocultarText();
        //Colocar a imagem sem enforcamento
        ImageIcon imgForca = new ImageIcon("/home/maromo/eminfojava/ProjetoForca/src/net/maromo/projetoforca/utils/forca0.png");
        lblForca.setIcon(imgForca);
        //Instanciar a classe Forca
        forca = new Forca();
        //Controle de erros e acertos
        erro = 0;
        contaAcerto = 0;
        //Buscar a palavra sorteada
        palavraSorteio = forca.getPalavraSorteio();
        //Buscar a dica do sorteio
        dicaSorteio = forca.getDicaSorteio();
        labelValorDica.setText(dicaSorteio);
        //Transformar a palavra sorteada em uma vetor ex: MANGA = 'M','A','N','G','A'
        vetPalavra = palavraSorteio.toCharArray();
        //Variável para determinar quantas caixas de texto irão ser liberadas
        int tamanho = vetPalavra.length;
        liberarText(tamanho);
        //Habilitar todos os botoes - Estão em três paineis
        habilitarBotoes(this.panelBotoesAJ);
        habilitarBotoes(this.panelBotoesKT);
        habilitarBotoes(this.panelBotoesUZ);

        //Controlar os cliques do jogo
        btA.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    jogar(e);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
        btB.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    jogar(e);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
        btC.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    jogar(e);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
        btD.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    jogar(e);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
        btE.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    jogar(e);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
        btF.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    jogar(e);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
        btG.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    jogar(e);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
        btH.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    jogar(e);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
        btI.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    jogar(e);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
        btJ.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    jogar(e);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
        btK.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    jogar(e);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
        btL.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    jogar(e);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
        btM.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    jogar(e);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
        btN.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    jogar(e);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
        btO.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    jogar(e);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
        btP.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    jogar(e);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
        btQ.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    jogar(e);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
        btR.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    jogar(e);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
        btS.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    jogar(e);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
        btT.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    jogar(e);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
        btU.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    jogar(e);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
        btV.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    jogar(e);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
        btW.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    jogar(e);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
        btX.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    jogar(e);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
        btY.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    jogar(e);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
        btZ.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    jogar(e);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
    }


    //Este método recebe o painel e usamos o uma coleção
    //dos componentes verificando quais sao botões
    //em seguida os habilitamos
    private void habilitarBotoes(JPanel obj) {
        for(Component botao : obj.getComponents()){
            if(botao instanceof JButton){
                JButton botaoLetra = (JButton)botao;
                botaoLetra.setEnabled(true);
            }
        }

    }

    //Logica do jogo
    private void jogar(MouseEvent e) throws Exception {
        //Pega o botão jogado pela variável e
        JButton btJogado = (JButton) e.getSource();
        btJogado.setEnabled(false);
        //Define a letra a ser procurada. Letra do botão
        String letraProcurada = btJogado.getText();
        boolean encontrada = false;
        for (int i = 0; i < vetPalavra.length ; i++) {
            if(letraProcurada.charAt(0)==vetPalavra[i]){
                encontrada=true;
                colocarNoText(i+1, letraProcurada);
            }
        }
        //Se nao encontrada, soma-se um no erro e enforca-se
        if(!encontrada){
            erro++;
            enforcar(erro);
        }
        //se o total de acerto for igual ao tamanho da palavra sorteada
        //significa que temos um vencedor
        if(contaAcerto==vetPalavra.length){
            JOptionPane.showMessageDialog(null, "PARABÉNS");
            System.exit(0);
        }
    }

    //Rotina para enforcar (trocar os desenhos de erro)
    private void enforcar(int erro) throws Exception {
        ImageIcon imgForca;
        if(erro==1){
            imgForca = new ImageIcon("/home/maromo/eminfojava/ProjetoForca/src/net/maromo/projetoforca/utils/forca1.png");
            lblForca.setIcon(imgForca);
        }
        if(erro==2){
            imgForca = new ImageIcon("/home/maromo/eminfojava/ProjetoForca/src/net/maromo/projetoforca/utils/forca2.png");
            lblForca.setIcon(imgForca);
        }
        if(erro==3){
            imgForca = new ImageIcon("/home/maromo/eminfojava/ProjetoForca/src/net/maromo/projetoforca/utils/forca3.png");
            lblForca.setIcon(imgForca);
        }
        if(erro==4){
            imgForca = new ImageIcon("/home/maromo/eminfojava/ProjetoForca/src/net/maromo/projetoforca/utils/forca4.png");
            lblForca.setIcon(imgForca);
        }
        if(erro==5){
            imgForca = new ImageIcon("/home/maromo/eminfojava/ProjetoForca/src/net/maromo/projetoforca/utils/forca5.png");
            lblForca.setIcon(imgForca);
        }if(erro==6){
            imgForca = new ImageIcon("/home/maromo/eminfojava/ProjetoForca/src/net/maromo/projetoforca/utils/forca6.png");
            lblForca.setIcon(imgForca);
            //Mensagem de Erro
            JOptionPane.showMessageDialog(null, "Você MORREU");
            //Apresenta qual era a resposta
            JOptionPane.showMessageDialog(null, "A palavra era: "
            + palavraSorteio.toString().toUpperCase(), "Palavra",
                    JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }


    }



    private void colocarNoText(int i, String letra) {
        if(i==1) textField1.setText(letra);
        if(i==2) textField2.setText(letra);
        if(i==3) textField3.setText(letra);
        if(i==4) textField4.setText(letra);
        if(i==5) textField5.setText(letra);
        if(i==6) textField6.setText(letra);
        if(i==7) textField7.setText(letra);
        if(i==8) textField8.setText(letra);
        if(i==9) textField9.setText(letra);
        if(i==10) textField10.setText(letra);
        if(i==11) textField11.setText(letra);
        contaAcerto++;
    }

    private void liberarText(int tamanho) {
        for (Component comp: this.panelTexts.getComponents()){
            if(comp instanceof JTextField){
                JTextField texto = (JTextField) comp;
                texto.setText(null);
                texto.setVisible(false);
            }
        }
        if(tamanho == 1){
            textField1.setVisible(true);
            return;
        }
        textField1.setVisible(true);
        if(tamanho == 2){
            textField2.setVisible(true);
            return;
        }
        textField2.setVisible(true);
        if(tamanho == 3){
            textField3.setVisible(true);
            return;
        }
        textField3.setVisible(true);
        if(tamanho == 4){
            textField4.setVisible(true);
            return;
        }
        textField4.setVisible(true);
        if(tamanho == 5){
            textField5.setVisible(true);
            return;
        }
        textField5.setVisible(true);
        if(tamanho == 6){
            textField6.setVisible(true);
            return;
        }
        textField6.setVisible(true);
        if(tamanho == 7){
            textField7.setVisible(true);
            return;
        }
        textField7.setVisible(true);
        if(tamanho == 8){
            textField8.setVisible(true);
            return;
        }
        textField8.setVisible(true);
        if(tamanho == 9){
            textField9.setVisible(true);
            return;
        }
        textField9.setVisible(true);
        if(tamanho == 10){
            textField10.setVisible(true);
            return;
        }
        textField10.setVisible(true);
        if(tamanho == 11){
            textField11.setVisible(true);
            return;
        }
    }

    private void ocultarText() {
        textField1.setVisible(false);
        textField2.setVisible(false);
        textField3.setVisible(false);
        textField4.setVisible(false);
        textField5.setVisible(false);
        textField6.setVisible(false);
        textField7.setVisible(false);
        textField8.setVisible(false);
        textField9.setVisible(false);
        textField10.setVisible(false);
        textField11.setVisible(false);
    }

    public JPanel getPanelForca() {
        return panelForca;
    }

    private Forca forca;
    private String palavraSorteio;
    private String dicaSorteio;


    private JPanel panelForca;
    private JLabel lblForca;
    private JButton btA;
    private JButton btB;
    private JButton btC;
    private JButton btD;
    private JButton btE;
    private JButton btF;
    private JButton btG;
    private JButton btH;
    private JButton btI;
    private JButton btJ;
    private JButton btK;
    private JButton btL;
    private JButton btM;
    private JButton btN;
    private JButton btO;
    private JButton btP;
    private JButton btQ;
    private JButton btR;
    private JButton btS;
    private JButton btT;
    private JButton btU;
    private JButton btV;
    private JButton btW;
    private JButton btX;
    private JButton btY;
    private JButton btZ;
    private JLabel labelDica;
    private JLabel labelValorDica;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private JTextField textField7;
    private JTextField textField8;
    private JTextField textField9;
    private JTextField textField10;
    private JTextField textField11;
    private JPanel panelBotoesAJ;
    private JPanel panelBotoesKT;
    private JPanel panelBotoesUZ;
    private JPanel panelTexts;


}
