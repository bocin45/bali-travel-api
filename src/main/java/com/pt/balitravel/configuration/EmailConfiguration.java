package com.pt.balitravel.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

import java.util.Properties;

@Configuration
public class EmailConfiguration {

    @Bean
    public JavaMailSender getJavaMailSender() {
        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
        mailSender.setHost("smtp.gmail.com");
        mailSender.setPort(587);

        mailSender.setUsername("rizkiabrar45@gmail.com");
        mailSender.setPassword("sistemkomputer45");

        Properties props = mailSender.getJavaMailProperties();
        props.put("mail.transport.protocol", "smtp");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.debug", "true");

        return mailSender;
    }

//    @Bean
//    public GsonHttpMessageConverter gsonHttpMessageConverter() {
//        GsonBuilder gb = new GsonBuilder();
//        gb.registerTypeAdapter(JSONObject.class, JSONObjectAdapter.INSTANCE);
//        GsonHttpMessageConverter converter = new GsonHttpMessageConverter(gb.create());
//        return converter;
//    }

}
