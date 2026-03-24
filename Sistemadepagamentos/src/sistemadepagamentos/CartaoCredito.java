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
public class CartaoCredito extends Pagamento {
    private String numeroCartao;

    public CartaoCredito(double valor, String data, String descricao, String numeroCartao) {
        super(valor, data, descricao);
        this.numeroCartao = numeroCartao;
    }

    @Override
    public void processarPagamento() {
        System.out.println("Pagamento de R$ " + getValor() + " no cartão de crédito.");
    }

    // Getter e Setter
    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }
}
