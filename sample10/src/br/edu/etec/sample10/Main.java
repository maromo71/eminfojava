package br.edu.etec.sample10;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Exemplo do comando switch
        //Escolha pelo número

        int opc = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha pelo Número");
        System.out.println("1.. Big Mac");
        System.out.println("2.. Stakehouse");
        System.out.println("3.. Casquinha de chocolate");
        System.out.println("9.. Sair");
        System.out.println("Digite o número: ");
        opc = Integer.parseInt(sc.nextLine());
        switch (opc) {
            case 1:
                System.out.println("Sua escolha foi Big Mac");
                break;
            case 2:
                System.out.println("Sua escolha foi StakeHouse");
                break;
            case 3:
                System.out.println("Divirta-se com a casquinha");
                break;
            case 9:
                System.out.println("Fim do programa");
                break;
            default:
                System.out.println("Escolha corretamente");
        }


    }
}
