package com.company.service;

import com.company.Main;

import com.company.util.InlineKeyboardUtil;

import org.telegram.telegrambots.meta.api.methods.ParseMode;

import org.telegram.telegrambots.meta.api.methods.send.SendDocument;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;
import org.telegram.telegrambots.meta.api.methods.send.SendVideo;
import org.telegram.telegrambots.meta.api.objects.InputFile;
import org.telegram.telegrambots.meta.api.objects.Message;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class UserService extends Thread{

    public static void start(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setReplyMarkup(InlineKeyboardUtil.showMenu());
        sendMessage.setText("<b>ASSALOMU ALEYKUM XUSH KELIBSIZ</b>");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        sendMessage.setParseMode(ParseMode.HTML);
        Main.MY_TELEGRAM_BOT.sendMsg(sendMessage);
    }

    public  void videoDars(String idStr, SendMessage sendMessage) {
            sendMessage.setText("\uD83C\uDFACVideo darslar 2ta bo'limni o'z ichiga oladi:\n 1.Nazariy\n 2.Amaliy" +
                    "Birinchi bo'limda telefonda to'g'ri vidyo'ga olishni o'rgansiz.\n" +
                    "2. bo'limda esa o'rganganlaringiz asosida tajribaviy vidyo'larni tomosh qilasiz :\n" +
                    "Marhamat kerakli bo'limni tanlang⬇️");
            sendMessage.setChatId(idStr);
            sendMessage.setReplyMarkup(InlineKeyboardUtil.video());
            Main.MY_TELEGRAM_BOT.sendMsg(sendMessage);
    }


    public void amal(SendMessage sendMessage, String idStr) {
        sendMessage.setChatId(idStr);
        sendMessage.setText("Ushbu bo'limda real loyihalarda qo'llanilgan tasvirga olish uslublari bilan tanishasiz.\n" +
                "\n" +
                "Bu qismda tajribaga ega professional videgraflar ishlari o'rin olgan. \n" +
                "\n" +
                "\uD83D\uDD25Ular tomonidan takrorlanmas tarzda olingan videolarni siz kreativ bo'lgan holda o'zgacha holatda tasvirga olishga harakat qiling. \n" +
                "\n" +
                "Marhamat, muallifni tanlang  ⤵️");
        sendMessage.setReplyMarkup(InlineKeyboardUtil.Muallif());
        Main.MY_TELEGRAM_BOT.sendMsg(sendMessage);
    }

    public void muallif(SendMessage sendMessage ,String idStr){
        sendMessage.setChatId(idStr);
        sendMessage.setReplyMarkup(InlineKeyboardUtil.Intervyu());
        sendMessage.setText("Vidyo' darslikni ketma ketlik bilan tanlen");
        Main.MY_TELEGRAM_BOT.sendMsg(sendMessage);
    }

    public void Goya(SendMessage sendMessage , String idStr){
        sendMessage.setChatId(idStr);
        sendMessage.setText("Ushbu bo'limda turli rukndagi videolar uchun tayyor g'oyalar bilan tanishasiz. \n" +
                "\n" +
                "Hozirda mavjud:\n" +
                "- Avtomobilni tasvirga olish uchun g'oyalar;\n" +
                "- Manzarani tasvirga olish uchun video g'oyalar. \n" +
                "\n" +
                "O'zingizga kerakli bo'limni tanlang ⤵️");
        sendMessage.setParseMode(ParseMode.HTML);
        sendMessage.setReplyMarkup(InlineKeyboardUtil.Goya());
        Main.MY_TELEGRAM_BOT.sendMsg(sendMessage);

    }

    public void Avt(String  idStr){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("Video ketma-ketligini tanlang ⤵️");
        sendMessage.setChatId(idStr);
        sendMessage.setReplyMarkup(InlineKeyboardUtil.AvtomabiluchunVid());
        sendMessage.setParseMode(ParseMode.HTML);
        Main.MY_TELEGRAM_BOT.sendMsg(sendMessage);
    }

    public  void Menyu(String idStr){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(idStr);
        sendMessage.setText("ASSALOMU ALEYKUM XUSH KELIBSIZ");
        sendMessage.setReplyMarkup(InlineKeyboardUtil.showMenu());
        Main.MY_TELEGRAM_BOT.sendMsg(sendMessage);
    }

    public void Landshaft(String idStr){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("Video ketma-ketligini tanlang ⤵️");
        sendMessage.setParseMode(ParseMode.HTML);
        sendMessage.setChatId(idStr);
        sendMessage.setReplyMarkup(InlineKeyboardUtil.LandshaftVid());
        Main.MY_TELEGRAM_BOT.sendMsg(sendMessage);

    }

    public void Android(String idStr){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setPhoto(new InputFile("AgACAgIAAxkBAAIC1WO-jByfVO3PWO7DLpgp3j0ERcbKAAKvwjEb0NfwSV7g4C1qX7iwAQADAgADeAADLQQ"));
        sendPhoto.setChatId(idStr);
        sendPhoto.setCaption("CapCut — dunyoda koʻp foydalaniladigan top, yuqori sifatli video muharriri. U yordamida ajoyib videolarni yaratishingiz mumkin");


       Main.MY_TELEGRAM_BOT.sendMsg(sendPhoto);
    }

    public void Android1(String idStr){
        SendDocument sendDocument = new SendDocument();
        sendDocument.setChatId(idStr);
        sendDocument.setDocument(new InputFile("BQACAgIAAxkBAAIDkmO_xQ_tKmxouWpoRcIfQb2ontRBAAJhDwACt4A5SWdp92nr2R0eLQQ"));
        sendDocument.setCaption("CapCut");
        Main.MY_TELEGRAM_BOT.sendMsg(sendDocument);
    }

    public void MAster(String idStr){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(idStr);
        sendMessage.setReplyMarkup(InlineKeyboardUtil.MasterVidyo());
        sendMessage.setText("Mobilograf Drexlee tomonidan suratga olingan professional kadrlar!\n" +
                "\n" +
                "Marhamat, kerakli bo'limni tanlang ⤵️");
        Main.MY_TELEGRAM_BOT.sendMsg(sendMessage);

    }

    public void IntervyuUS(String message){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("Ushbu bo'limda video sohasiga oid bo'lgan qiziq suhbatlarni o'zbek tilida tomosha qilasiz.  \n" +
                "\n" +
                "Marhamat, intervyu raqami ustiga bosing ⤵️");
        sendMessage.setChatId(message);
        sendMessage.setReplyMarkup(InlineKeyboardUtil.Intervyu1());
        Main.MY_TELEGRAM_BOT.sendMsg(sendMessage);

    }

    public void After(String idStr){
        SendVideo sendVideo =  new SendVideo();
        sendVideo.setChatId(idStr);
        sendVideo.setVideo(new InputFile("BAACAgIAAxkBAAIC5WO-jvF5pv5IGK2pj2B3b-YY1_13AAK2FAACJ-uRSDY_yDmEacStLQQ"));
        sendVideo.setCaption("After effect dasturida animatsiya tayyorlash bo'yicha bepul kurs. \n" +
                "\n" +
                "⏳ Davomiyligi: 04:06 \n" +
                "⚖️ Hajmi: 68.5 MB \n" +
                "\n" +
                "Noldan professionalgacha bilishingiz kerak bo'lgan ma'lumotlarni o'rganib olasiz. \n" +
                "\n" +
                "* Video ingliz tilida! \n" +
                "\n" +
                "© \uD83D\uDC64 Envato Tuts+");
        Main.MY_TELEGRAM_BOT.sendMsg(sendVideo);

    }

    public void Reklam(String idStr){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(idStr);
        sendMessage.setText("✅Botimizda reklama berish xizmati mavjud!\n" +
                "\n" +
                " Narxlar - t.me/ilmiy_ads/24");
        sendMessage.setParseMode(ParseMode.HTML);
        Main.MY_TELEGRAM_BOT.sendMsg(sendMessage);

    }


}