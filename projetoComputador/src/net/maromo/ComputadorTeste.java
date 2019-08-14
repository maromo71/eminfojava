package net.maromo;

public class ComputadorTeste {

    public static void main(String[] args) {
	// write your code here
        Computador c1 = new Computador();
        c1.modelo = "Novo";
        c1.cor = "Prata";
        c1.marca = "hp";
        c1.numeroSerie = 998989;
        c1.preco = 5000.0;
        c1.imprimir();
        c1.calcularValor();
        System.out.println();
        c1.imprimir();


        Computador c2 = new Computador();
        c2.modelo = "Velho";
        c2.cor = "Preto";
        c2.marca = "ibm";
        c2.numeroSerie = 1212;
        c2.preco = 4000.0;
        c2.imprimir();
        c2.calcularValor();
        System.out.println();
        c2.imprimir();
        int retorno = c2.alterarValor(0);
        if(retorno==1){
            System.out.println("Preço alterado com sucesso");
        }else{
            System.out.println("Valor inválido para alteração");
        }
        c2.imprimir();

    }
}
