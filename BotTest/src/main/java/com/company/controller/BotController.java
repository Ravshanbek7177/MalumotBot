package com.company.controller;


import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendDocument;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;
import org.telegram.telegrambots.meta.api.methods.send.SendVideo;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.DeleteMessage;


import org.telegram.telegrambots.meta.api.objects.CallbackQuery;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class BotController extends TelegramLongPollingBot {
   @Override
    public String getBotUsername() {
        return "magazin_uz";
    }

    @Override
    public String getBotToken() {
        return "5896513575:AAE848fcYbqUItvzJDxlDf9Y1-sWuH_TXZ8";
    }
    @Override
    public void onUpdateReceived(Update update) {
        //2034683255
   /*   if(update.getMessage().getChatId()==2034683255){
            if(update.getMessage().getVideo()!=null){
                String fileId = update.getMessage().getVideo().getFileId();
                System.out.println("vidyo' aydisi   "+fileId);
            }else if(update.getMessage().getPhoto() != null){
                String phonId = update.getMessage().getPhoto().toString();
               System.out.println("rasim aydisi   "+phonId);
            } else if (update.getMessage().getDocument() != null) {
                 String dokumentId = update.getMessage().getDocument().getFileId();

                System.out.println("Dokument ID    "+ dokumentId);
            }
      }*/
        //BAACAgQAAxkBAAOdY70fPu28QKCYS2UZUFyZDf6oepAAAj4DAALcCCxSuMwrKoCoK2UtBA
        if (update.hasMessage()) {
            Message message = update.getMessage();
            System.out.println(message.getFrom().getFirstName());
                UserController userController = new UserController();
                userController.start(message);

        }
       else if (update.hasCallbackQuery()) {
            CallbackQuery callbackQuery = update.getCallbackQuery();
            QueryController queryController = new QueryController(callbackQuery);
            queryController.start();

        }
    }


    public void sendMsg(SendMessage sendMessage) {

        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }

    }
    public void sendMsg(DeleteMessage deleteMessage) {

        try {
            execute(deleteMessage);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }

    }
    public void sendMsg(SendPhoto sendPhoto) {

        try {
            execute(sendPhoto);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }

    }
    public void sendMsg(SendVideo sendVideo) {

        try {
            execute(sendVideo);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }

    }

    public void sendMsg(SendDocument sendDocument) {

        try {
            execute(sendDocument);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }

    }





}