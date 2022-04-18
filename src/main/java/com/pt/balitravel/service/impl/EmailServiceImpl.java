package com.pt.balitravel.service.impl;

import com.pt.balitravel.entity.Customer;
import com.pt.balitravel.service.EmailService;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailServiceImpl implements EmailService {

    JavaMailSender emailSender;

    public EmailServiceImpl(JavaMailSender emailSender) {
        this.emailSender = emailSender;
    }

    @Override
    public void sendEmail(Customer customer) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("rizkiabrar45@gmail.com");
        message.setTo("rizkiabrar@gmail.com");
        message.setSubject(customer.getName());
        message.setText(customer.getName() + "\n" + customer.getEmail() + "\n" + customer.getPhoneNumber() + "\n" + customer.getNationality());
        emailSender.send(message);
        ;
    }
}
