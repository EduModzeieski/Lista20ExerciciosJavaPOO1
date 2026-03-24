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
public class Sistemabancario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente cliente = new Cliente("João", "123.456.789-00");

        ContaBancaria c1 = new ContaCorrente("001", 1000, cliente);
        ContaBancaria c2 = new ContaPoupanca("002", 1000, cliente);
        ContaBancaria c3 = new ContaSalario("003", 1000, cliente);

        ContaBancaria[] contas = {c1, c2, c3};

        for (ContaBancaria conta : contas) {
            conta.depositar(200);
            conta.sacar(300);
            conta.consultarSaldo();
            System.out.println("----------------------");
        }
    }
}