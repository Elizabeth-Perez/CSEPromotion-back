package com.isc.cse.promotion.controllers;

import java.util.ArrayList;
import java.util.List;
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
    public List<EmailProjection> sendEmail(@RequestBody ForgottenPasswordRequest emailRequest) {
    	List<EmailProjection> res = new ArrayList<EmailProjection>();
    	
    	MimeMessage mimeMessage = emailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage);
        String codeGenerated = generateRandomCode(6);

        try {
            helper.setTo(emailRequest.getTo());
            helper.setSubject(emailRequest.getSubject());
            helper.setText(emailRequest.getBody(), true);
            emailSender.send(mimeMessage);
            res.add(new ForgottenPasswordResponse(true, codeGenerated));
        } catch (MessagingException e) {
        	res.add(new ForgottenPasswordResponse(false, ""));
        }
        return res;
    }
    
    private String generateRandomCode(int length) {
        Random random = new Random();
        StringBuilder code = new StringBuilder();

        for (int i = 0; i < length; i++) {
            code.append(random.nextInt(10));
        }

        return code.toString();
    }

}
