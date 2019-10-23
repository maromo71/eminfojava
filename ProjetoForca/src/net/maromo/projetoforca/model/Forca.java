package net.maromo.projetoforca.model;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Forca {
    private List<String> lista = new ArrayList<>();

    public String getPalavraSorteio() {
        return palavraSorteio;
    }

    public String getDicaSorteio() {
        return dicaSorteio;
    }

    private String palavraSorteio;
    private String dicaSorteio;

    public Forca(){
        montarLista();
        sortear();
    }

    private void sortear() {
        //determinar quantas linhas
        int tam = lista.size();
        Random r = new Random();
        int numLinha = r.nextInt(tam);
        int virgula = lista.get(numLinha).indexOf(",");
        palavraSorteio = lista.get(numLinha).substring(0,virgula);
        dicaSorteio = lista.get(numLinha).
                substring(virgula+1,lista.get(numLinha).length());
    }

    private void montarLista() {
        try {
            String property = System.getProperty("user.dir");
            FileReader arq = new FileReader("/home/maromo/eminfojava/ProjetoForca/src/net/maromo/projetoforca/palavras.txt");
            BufferedReader lerArq = new BufferedReader(arq);
            String linha = lerArq.readLine(); // lê a primeira linha
            while (linha != null) {
                lista.add(linha);
                linha = lerArq.readLine(); // lê da segunda até a última linha
            }
         arq.close();
        } catch (IOException e) {
            System.err.printf("Erro na abertura do arquivo: %s.\n",
                    e.getMessage());
        }
    }
}
