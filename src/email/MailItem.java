/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package email;

/**
 *
 * @author Lenovo
 */
public class MailItem {
    
    private String remetente;
    private String destinatario;
    private String assunto;
    private String mensagem;

    public MailItem() {
    }

    public MailItem(String remetente, String destinatario, String assunto, String mensagem) {
        this.remetente = remetente;
        this.destinatario = destinatario;
        this.assunto = assunto;
        this.mensagem = mensagem;
    }

    public String getRemetente() {
        return remetente;
    }

    public void setRemetente(String remetente) {
        this.remetente = remetente;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String toString() {
        return "De: "+remetente+"\n"+"Para: "+destinatario+
                "\nAssunto: "+assunto+"\nMensagem:\n"+mensagem;
    }
   
}
