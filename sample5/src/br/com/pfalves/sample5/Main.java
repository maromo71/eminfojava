package br.com.pfalves.sample5;

public class Main {

    public static void main(String[] args) {
	// Exemplo de atalhos
        int valores[] = {1,2,5,7,9};
        //For tradicional
        for (int i = 0; i < 5; i++) {
            System.out.println("Valor = " +valores[i]);
        }
        //foreach   (percorre cada valor na coleção)
        for (int x:valores) {
            System.out.println(x);
        }
    }
}
