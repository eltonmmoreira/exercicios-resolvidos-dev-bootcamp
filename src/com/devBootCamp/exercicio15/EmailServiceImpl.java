package com.devBootCamp.exercicio15;

public class EmailServiceImpl implements EmailService {

    @Override
    public boolean enviarEmail(Email email) {
        System.out.println("Email enviado com sucesso de: " +  email.getDe() + " para: " +  email.getPara());
        System.out.println(email.getConteudo());
        return true;
    }
}
