package com.example.springboot;
import org.example.MailHandler;

import org.example.Sub;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.bind.annotation.RequestMapping;
@RestController
public class Controller {

    @Autowired
    private Objects objects;

    public static Sub email;

    @GetMapping("objects")
    public String getObjects(){
        String objectsAsString = objects.toString();

        email.setSub(objectsAsString);
        MailHandler MailHandler = new MailHandler();
        MailHandler.sendMail();
        return objectsAsString;
    }
}
