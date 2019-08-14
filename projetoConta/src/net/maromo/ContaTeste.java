package net.maromo;

import java.util.Scanner;

public class ContaTeste {

    public Conta cc = new Conta();

    public static void main(String[] args) {
	// write your code here
        int opc = 0;
        Scanner sc = new Scanner(System.in);
        ContaTeste ct = new ContaTeste();
        do{
            //Criando o menu
            System.out.println("MENU");
            System.out.println("====");
            System.out.println("1.. Cadastrar");
            System.out.println("2.. Consultar");
            System.out.println("3.. Depositar");
            System.out.println("4.. Sacar");
            System.out.println("9.. Sair");
            System.out.println("Escolha sua opção: ");
            opc = Integer.parseInt(sc.nextLine());
            switch(opc){
                case 1:
                    ct.execCadastrar();
                    break;
                case 2:
                    ct.execConsultar();
                    break;
                case 3:
                    ct.execDepositar();
                    break;
                case 4:
                    ct.execSacar();
                    break;
                case 9:
                    System.out.println("FIM");
                    break;
                default:
                    System.out.println("Opção não existente");
            }
        }while(opc!=9);
    }

    public void execCadastrar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a informações da conta");
        System.out.println("Digite o numero da conta");
        cc.conta = sc.nextLine();
        System.out.println("Digite a agencia");
        cc.agencia = sc.nextLine();
        System.out.println("Digite o nome do cliente: ");
        cc.nomeCliente = sc.nextLine();
        System.out.println("CONTA CADASTRADA COM SUCESSO");
        System.out.println();
    }
    public void execConsultar(){
        cc.imprimir();
    }
    public void execSacar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do saque: ");
        double valor = Double.parseDouble(sc.nextLine());
        int retorno = cc.sacar(valor);
        if(retorno == 1){
            System.out.println("Saque efetuado com sucesso");
        }else{
            System.out.println("Sem saldo para saque");
        }
    }
    public void execDepositar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do deposito: ");
        double valor = Double.parseDouble(sc.nextLine());
        cc.depositar(valor);
        System.out.println("Depósito efetuado com sucesso");
    }
}

