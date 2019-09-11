package net.maromo;

public class Main {

    public static void main(String[] args) {
        //Atribuindo valor 0.0038 para atributo estático
        Conta.cpmf = 0.0038;
        Conta conta1, conta2;
        conta1 = new Conta();

        conta1.numConta = 123;
        conta1.nomeCliente = "Tamara";
        conta1.imprimir();
        conta1.depositar(2000);
        conta1.imprimir();
        conta1.sacar(1000);
        conta1.imprimir();
        conta2 = new Conta();

        conta2.numConta = 234;
        conta2.nomeCliente = "Jorge Tadeu";
        conta2.imprimir();
        conta2.depositar(500);
        conta2.sacar(100);
        conta2.imprimir();

    }
}
