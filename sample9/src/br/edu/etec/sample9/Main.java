package br.edu.etec.sample9;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double salario;
        //Pedir para o usuário o valor do salário
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o salario: ");
        salario = Double.parseDouble(sc.nextLine());

        //Calcular o aumento usando o if ternário
        double aumento = salario > 5000.0 ? salario * 0.09 : salario * 0.11;
        System.out.println("Aumento:  " + aumento);

    }
}
