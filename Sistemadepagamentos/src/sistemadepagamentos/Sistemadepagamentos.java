/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemadepagamentos;

import java.util.ArrayList;

public class Sistemadepagamentos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Pagamento> pagamentos = new ArrayList<>();

        pagamentos.add(new CartaoCredito(150.0, "24/03/2026", "Compra online", "1234-5678"));
        pagamentos.add(new Pix(200.0, "24/03/2026", "Transferência", "email@pix.com"));
        pagamentos.add(new Boleto(300.0, "24/03/2026", "Conta de luz", "000111222333"));
        pagamentos.add(new Dinheiro(50.0, "24/03/2026", "Pagamento local"));

        for (Pagamento p : pagamentos) {
            p.processarPagamento();
            System.out.println("----------------------");
        }
    }
}