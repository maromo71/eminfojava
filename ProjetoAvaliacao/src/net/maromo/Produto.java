package net.maromo;

public class Produto {
    private String descricao;
    private int quantidade;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int exibirEstoque(){
        return quantidade;
    }

    public boolean registrarSaida(int qtd){
        if(quantidade >= qtd){
            quantidade-= qtd;
            return true;
        }
        return false;
    }
    public boolean registrarEntrada(int qtd){
        if(qtd>0){
            quantidade+= qtd;
            return true;
        }
        return false;
    }
}
