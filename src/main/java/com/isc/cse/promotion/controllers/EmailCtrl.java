package com.isc.cse.promotion.controllers;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.isc.cse.promotion.models.classes.ForgottenPasswordRequest;
import com.isc.cse.promotion.models.classes.ForgottenPasswordResponse;
import com.isc.cse.promotion.projections.EmailProjection;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/email")
public class EmailCtrl {
	
	@Autowired
    private JavaMailSender emailSender;

    @PostMapping("/forgotten-password")
    public EmailProjection sendEmail(@RequestBody ForgottenPasswordRequest emailRequest) {
    	
    	MimeMessage mimeMessage = emailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage);

        EmailProjection res;
        try {
            helper.setTo(emailRequest.getTo());
            helper.setSubject(emailRequest.getSubject());
            helper.setText(emailRequest.getBody(), true);
            emailSender.send(mimeMessage);
            res = new ForgottenPasswordResponse(true);
        } catch (MessagingException e) {
        	res = new ForgottenPasswordResponse(false);
        }
        return res;
    }

}
