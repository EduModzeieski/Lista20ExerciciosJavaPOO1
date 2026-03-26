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
public class Sistemadenotificacoes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Email email = new Email("user@email.com", "Bem-vindo!", "26/03/2026");
        SMS sms = new SMS("99999-9999", "Código: 1234", "26/03/2026");
        WhatsApp zap = new WhatsApp("99999-9999", "Olá!", "26/03/2026");
        Push push = new Push("AppUser", "Nova atualização disponível", "26/03/2026");

        email.enviar();
        sms.enviar();
        zap.enviar();
        push.enviar();
    }
}