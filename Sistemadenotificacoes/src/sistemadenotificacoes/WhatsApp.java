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
public class WhatsApp extends Notificacao {

    public WhatsApp(String destinatario, String mensagem, String data) {
        super(destinatario, mensagem, data);
    }

    @Override
    public void enviar() {
        System.out.println("Mensagem de WhatsApp enviada para " + getDestinatario() +
                ": " + getMensagem());
    }
}