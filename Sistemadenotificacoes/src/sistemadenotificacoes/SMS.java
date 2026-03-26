/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemadenotificacoes;

/**
 *
 * @author eduar
 */
public class SMS extends Notificacao {

    public SMS(String destinatario, String mensagem, String data) {
        super(destinatario, mensagem, data);
    }

    @Override
    public void enviar() {
        System.out.println("SMS enviado para " + getDestinatario() +
                ": " + getMensagem());
    }
}