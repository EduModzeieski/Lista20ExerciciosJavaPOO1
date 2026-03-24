/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemadepagamentos;

/**
 *
 * @author eduar
 */
public class Boleto extends Pagamento {
    private String codigoBarras;

    public Boleto(double valor, String data, String descricao, String codigoBarras) {
        super(valor, data, descricao);
        this.codigoBarras = codigoBarras;
    }

    @Override
    public void processarPagamento() {
        System.out.println("Pagamento de R$ " + getValor() + " via boleto bancário.");
    }

    // Getter e Setter
    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }
}