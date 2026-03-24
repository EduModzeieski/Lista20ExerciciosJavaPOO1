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
public class ContaPoupanca extends ContaBancaria {

    public ContaPoupanca(String numero, double saldo, Cliente titular) {
        super(numero, saldo, titular);
    }

    // Rendimento ao consultar saldo
    @Override
    public void consultarSaldo() {
        double rendimento = getSaldo() * 0.02;
        setSaldo(getSaldo() + rendimento);
        System.out.println("Saldo com rendimento: R$ " + getSaldo());
    }
}