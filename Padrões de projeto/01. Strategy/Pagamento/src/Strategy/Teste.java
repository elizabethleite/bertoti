package Strategy;

import Strategy.Cliente;
import Strategy.PagamentoPix;

public class Teste {
    public static void main(String[] args) {
        Cliente Eliza = new Cliente();
        Eliza.setPagamento(new PagamentoPix());
        Eliza.realizarPagamento();

        System.out.println("Seu pagamento via PIX foi efetuado!");

        Eliza.setPagamento(new PagamentoTranferencia());
        Eliza.realizarPagamento();

        System.out.println("Seu pagamento via transferência bancária (TED) foi efetuado!");
    }
}