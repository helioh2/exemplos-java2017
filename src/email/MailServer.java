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
public class MailServer {
    
    private List<MailClient> clientes;

    public MailServer() {
        this.clientes = new ArrayList<>();      
    }

    public List<MailClient> getClientes() {
        return clientes;
    }
    
    public void addClient(MailClient cliente){
        this.clientes.add(cliente);
        cliente.setServidor(this);
    }
    
    public void receber(MailItem mensagem) {
        this.encaminhar(mensagem);
    }
    
    private void encaminhar(MailItem mensagem) {
        
        String destinatario = mensagem.getDestinatario();     
//        for (int i = 0; i < this.clientes.size(); i++) {
//            MailClient cliente = this.clientes.get(i);
        for (MailClient cliente: this.clientes){
            if (destinatario.equals(cliente.getEndereco())) {
                cliente.receber(mensagem);
            }
        }       
    }
    
    
    
    
    
}
