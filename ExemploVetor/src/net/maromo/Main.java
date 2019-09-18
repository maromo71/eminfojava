package net.maromo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    //Vetor para acondicionar 10 valores inteiros
        int n[] = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite os valores");
        for (int i = 0; i < 10; i++) {
            System.out.println("Elemento " + i);
            n[i] = Integer.parseInt(sc.nextLine());
        }
        //Exibir os 10
        for (int i = 0; i < 10; i++) {
            System.out.println("Elemento n[" + i + "] = " + n[i]);
        }
    }
}
