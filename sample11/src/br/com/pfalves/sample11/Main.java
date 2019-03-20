package br.com.pfalves.sample11;

public class Main {

    public static void main(String[] args) {
	// Comando de repeticao for
        //int vetor[] = new int[10];
        int vetor[] = {1,2,3,4,5,6,7,8,9,10};

        for (int i = 0; i < 10 ; i++) {
            System.out.println("vetor na posicao " + i +  " = " + vetor[i]);
        }
        //Percorrer com o comando for each
        for (int x: vetor) {
            System.out.println("Valores = " + x);
        }
    }
}
