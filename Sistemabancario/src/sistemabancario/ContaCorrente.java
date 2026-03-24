/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemabancario;

/**
 *
 * @author eduar
 */
public class ContaCorrente extends ContaBancaria {

    public ContaCorrente(String numero, double saldo, Cliente titular) {
        super(numero, saldo, titular);
    }

    @Override
    public void sacar(double valor) {
        double taxa = 2.0;
        double total = valor + taxa;

        if (getSaldo() >= total) {
            setSaldo(getSaldo() - total);
            System.out.println("Saque com taxa realizado. Taxa: R$ 2,00");
        } else {
            System.out.println("Saldo insuficiente para saque com taxa.");
        }
    }
}