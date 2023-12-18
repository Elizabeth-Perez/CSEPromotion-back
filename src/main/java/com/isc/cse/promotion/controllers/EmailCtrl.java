package com.isc.cse.promotion.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.JsonObject;
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
    public JsonObject sendEmail(@RequestBody EmailProjection emailRequest) {
    	JsonObject res = new JsonObject();
    	
    	MimeMessage mimeMessage = emailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage);

        try {
            helper.setTo(emailRequest.getTo());
            helper.setSubject(emailRequest.getSubject());
            helper.setText(emailRequest.getBody(), true);
            emailSender.send(mimeMessage);
            res.addProperty("success", true);
        } catch (MessagingException e) {
        	res.addProperty("success", false);
        	res.addProperty("error", e.getMessage());
        }
        return res;
    }

}
