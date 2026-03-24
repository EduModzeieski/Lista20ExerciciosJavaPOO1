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
public class Pix extends Pagamento {
    private String chavePix;

    public Pix(double valor, String data, String descricao, String chavePix) {
        super(valor, data, descricao);
        this.chavePix = chavePix;
    }

    @Override
    public void processarPagamento() {
        System.out.println("Pagamento de R$ " + getValor() + " via Pix.");
    }

    // Getter e Setter
    public String getChavePix() {
        return chavePix;
    }

    public void setChavePix(String chavePix) {
        this.chavePix = chavePix;
    }
}