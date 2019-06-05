package net.maromo;

import net.maromo.model.Cliente;
import net.maromo.model.Conta;

import java.util.Scanner;

public class GerenciarConta {
    public Conta conta = new Conta();

    public static void main(String[] args) {
        //Lógica para o menu
        GerenciarConta gc = new GerenciarConta();
        Scanner sc = new Scanner(System.in);
        int opcao = 0;
        do {
            //montar o menu
            System.out.println("MENU PRINCIPAL");
            System.out.println("1.. Cadastrar Conta");
            System.out.println("2.. Depositar");
            System.out.println("3.. Sacar");
            System.out.println("4.. Ver o Saldo");
            System.out.println("5.. Ver dados");
            System.out.println("9.. SAIR");
            System.out.println("Digite sua opção: ");
            opcao = Integer.parseInt(sc.nextLine());
            switch (opcao) {
                case 1:
                    gc.cadastrarConta();
                    break;
                case 2:
                    gc.efetuarDeposito();
                    break;
                case 3:
                    gc.efetuarSaque();
                    break;
                case 4:
                    gc.consultarSaldo();
                    break;
                case 5:
                    gc.consultarDados();
                    break;
                case 9:
                    System.out.println("Fim do Programa");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        } while (opcao != 9);
    }

    public void consultarDados() {
        System.out.println(conta.toString());
    }

    public void cadastrarConta() {
        Scanner sc = new Scanner(System.in);
        //Cadastrar o cliente primeiro
        Cliente cliente = new Cliente();
        System.out.println("Digite o id do Cliente: ");
        cliente.setIdCliente(Integer.parseInt(sc.nextLine()));
        System.out.println("Digite o nome do Cliente: ");
        cliente.setNome(sc.nextLine());
        System.out.println("Digite o email do Cliente: ");
        cliente.setEmail(sc.nextLine());
        //Dados da conta
        conta.setCliente(cliente);
        System.out.println("Digite o número da conta: ");
        conta.setNumConta(Integer.parseInt(sc.nextLine()));
        System.out.println("Digite a agência da conta: ");
        conta.setAgencia(sc.nextLine());
        System.out.println("Conta cadastra com sucesso");
    }

    public void efetuarDeposito() {
        Scanner sc = new Scanner(System.in);
        double valor;
        System.out.println("Digite o valor do deposito: ");
        valor = Double.parseDouble(sc.nextLine());
        //Depositar agora
        boolean deuCerto = conta.depositar(valor);
        if(deuCerto){
            System.out.println("Depósito efetuado com sucesso");
        }else{
            System.out.println("Valor inválido para depósito");
        }
    }

    public void efetuarSaque() {
        Scanner sc = new Scanner(System.in);
        double valor;
        System.out.println("Digite o valor do saque: ");
        valor = Double.parseDouble(sc.nextLine());
        //sacar agora
        boolean deuCerto = conta.sacar(valor);
        if(deuCerto){
            System.out.println("Saque efetuado com sucesso");
        }else{
            System.out.println("Sem saldo para o saque");
        }
    }

    public void consultarSaldo() {
        System.out.println("Saldo R$: " + conta.getSaldo());
    }
}
