
package service;

import java.util.Properties;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class Email {
    static final String REMETENTE_NOME = "douglas.t.teste@gmail.com";
    static final String REMETENTE_SENHA = "jzki gbdn yqoj thbz";
    private String assunto;
    private String mensagem;
    private String destinatario;

    public Email(String assunto, String mensagem, String destinatario) {
        this.assunto = assunto;
        this.mensagem = mensagem;
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

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }
    
    public void enviar() {
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "465");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.ssl.enable", "true");
        props.put("mail.smtp.ssl.protocols", "TLSv1.2");  
        
        Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator(){
            protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
                return new javax.mail.PasswordAuthentication(REMETENTE_NOME, REMETENTE_SENHA);
            }
        }); 
        
        try {
            Transport transport = session.getTransport("smtp");
            transport.connect("smtp.gmail.com",REMETENTE_NOME, REMETENTE_SENHA);
            
            SimpleEmail email = new SimpleEmail();
            email.setMailSession(session);
            email.setFrom(REMETENTE_NOME);
            email.setDebug(true);
            email.setSubject(this.assunto);
            email.setMsg(this.mensagem);
            email.addTo(this.destinatario);
            
            email.send();
            transport.close();
            
        } catch (EmailException | MessagingException e) {
            e.printStackTrace();
        }
    }
    
}

