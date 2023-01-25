package com.company.controller;

import com.company.service.UserService;
import org.telegram.telegrambots.meta.api.objects.Message;

public class UserController {

    public void start(Message message){
        if(message.hasText()){
            if(message.getText().equals("/start")){
                UserService.start(message);
            }
        }
    }

}
