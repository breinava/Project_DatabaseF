/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Correo;

import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

/**
 *
 * @author Jhoan
 */
public class ControladorCorreo {
    
     
    //logica del envio del correo
    public boolean enviarCorreo(Correo correo){
        boolean enviado=false;
        
        
        try{
            //se elige el puerto y el servidor de mensajeria en este caso gmail
            Properties p = new Properties();
            p.put("mail.smtp.host", "smtp.gmail.com");
            p.setProperty("mail.smtp.starttls.enable", "true");
            p.setProperty("mail.smtp.port", "587");
            p.setProperty("mail.smtp.user", correo.getUsuarioCorreo());
            p.setProperty("mial.smtp.auth", "true");
            
            Session s = Session.getDefaultInstance(p, null);
            //Se envia el mensaje
            BodyPart texto = new  MimeBodyPart();
            texto.setText(correo.getMensaje());
            
            //si se adjunta un archivo
            BodyPart adjunto = new MimeBodyPart();
            if(!correo.getRutaArchivo().equals("")){
                adjunto.setDataHandler(new DataHandler(new FileDataSource(correo.getRutaArchivo())));
                adjunto.setFileName(correo.getNombreArchivo());
            }
            
            MimeMultipart m= new MimeMultipart();
            m.addBodyPart(texto);
            
            if(!correo.getRutaArchivo().equals("")){
                m.addBodyPart(adjunto);
            }
            
            //se crea el mensaje  y se manda el destinatario, el destino y el asunto
            
            MimeMessage mensaje = new MimeMessage(s);
            mensaje.setFrom(new InternetAddress(correo.getUsuarioCorreo()));
            mensaje.addRecipient(Message.RecipientType.TO, new InternetAddress(correo.getDestino()));
            mensaje.setSubject(correo.getAsunto());
            mensaje.setContent(m);
            
            //se crea un objeto de tipo transport para conectarse y mandar el mensaje
            Transport t = s.getTransport("smtp");
            t.connect(correo.getUsuarioCorreo(), correo.getContraseña());
            t.sendMessage(mensaje, mensaje.getAllRecipients());
            t.close();
            enviado=true;
        }catch(Exception e){
            enviado = false;
            System.out.println(e);
        }
        
        return enviado;
    }
    
}
