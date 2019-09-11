package net.maromo;

import java.util.Scanner;

public class AcampamentoTeste {

    public static void main(String[] args) {
	    Acampamento membro = new Acampamento();
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome da pessoa: ");
        membro.nome = sc.nextLine();
        System.out.println("Idade da pessoa: ");
        membro.idade = Integer.parseInt(sc.nextLine());
        membro.imprimir();
        membro.separarGrupo();
        membro.imprimir();

    }
}
