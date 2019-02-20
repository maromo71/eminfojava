package br.com.pfalves.sample3;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Ultima versão de soma de dois valores usando a tela
        int a, b;
        //Criar um leitor de teclado
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um valor para a: ");
        a = Integer.parseInt(leitor.nextLine());

        System.out.println("Digite um valor para b: ");
        b = Integer.parseInt(leitor.nextLine());

        int soma =  a + b;
        System.out.println("Resultado da soma = " + soma);
    }
}
