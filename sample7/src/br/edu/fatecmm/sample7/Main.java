package br.edu.fatecmm.sample7;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner leitor = new Scanner(System.in);
        float nota1, nota2, media;
        String resultado;
        //Solicitar a entrada de dados
        System.out.println("Digite a nota 1: ");
        nota1 = Float.parseFloat(leitor.nextLine());

        System.out.println("Digite a nota 2: ");
        nota2 = Float.parseFloat(leitor.nextLine());

        //processar a media - exemplo com if ternario
        media = (nota1 + nota2) / 2;

        resultado = media >= 6 ? " aluno aprovado " : " aluno reprovado ";
        System.out.println("Resultado: " + resultado + " com a media: " + media);
    }
}
