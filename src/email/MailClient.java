/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package email;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public class MailClient {
    
    private String endereco;
    private List<MailItem> caixaEntrada;
    private List<MailItem> enviadas;
    private MailServer servidor;

    public MailClient(String endereco) {
        this.endereco = endereco;
        this.caixaEntrada = new ArrayList<>();
        this.enviadas = new ArrayList<>();
    }
    
    /**
     * 
     * @param destinatario
     * @param assunto
     * @param mensagem
     * @return 
     */
    public MailItem criarMensagem(String destinatario, 
            String assunto, String mensagem) {
        MailItem mailItem = new MailItem(this.endereco, 
                destinatario, assunto, mensagem);      
        return mailItem;
    }
    
    /**
     * TODO
     * @param mensagem 
     */
    public void enviar(MailItem mensagem){
        if (servidor != null) {
            this.enviadas.add(mensagem);
            this.servidor.receber(mensagem);
        }
        System.out.println("Servidor não configurado.");
    }
    
    /**
     * TODO
     * @param mensagem 
     */
    public void receber(MailItem mensagem){
        this.caixaEntrada.add(mensagem);
    }

    @Override
    public String toString() {
        return endereco;
    }

    public void setServidor(MailServer servidor) {
        this.servidor = servidor;
    }

    public String getEndereco() {
        return endereco;
    }

    public List<MailItem> getCaixaEntrada() {
        return caixaEntrada;
    }

    public List<MailItem> getEnviadas() {
        return enviadas;
    }
    
    
    
    
    
}
