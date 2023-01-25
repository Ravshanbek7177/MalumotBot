package com.company.controller;


import com.company.Main;
import com.company.service.UserService;
import com.company.util.InlineKeyboardUtil;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendVideo;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.DeleteMessage;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.EditMessageText;
import org.telegram.telegrambots.meta.api.objects.CallbackQuery;
import org.telegram.telegrambots.meta.api.objects.InputFile;
import org.telegram.telegrambots.meta.api.objects.Message;


public class QueryController extends Thread {
    UserService userService = new UserService();
    private CallbackQuery callbackQuery;

    public QueryController(CallbackQuery callbackQuery) {
        this.callbackQuery = callbackQuery;
    }

    @Override
    public void run() {
        SendMessage sendMessage = new SendMessage();
        EditMessageText editMessageText = new EditMessageText();
        SendVideo sendVideo = new SendVideo();
        String data = callbackQuery.getData();
        String idStr = String.valueOf(callbackQuery.getFrom().getId());
        if(data.equals("Boshlang'ich tushyncha")){
            sendVideo.setVideo(new InputFile("BAACAgIAAxkBAAIC4GO-jlUEgCdNJHe3x3VTfj_K-6-cAAIaGgACV0oYSgLPsWyG_W1-LQQ"));
            sendVideo.setCaption("\uD83D\uDCF9 MOBILOGRAPHY NIMA? \n" +
                    "\n" +
                    "- Video davomida Mobilografiya haqida boshlang'ich tushuncha ega bo'lasiz.\n" +
                    "\n" +
                    "Ko'rib bo'lgach keyingi bo'limga o'ting ⤵️");
            sendVideo.setChatId(idStr);
            Main.MY_TELEGRAM_BOT.sendMsg(sendVideo);
        }else if(data.equals("_vid")){
            dt(idStr);
           userService.videoDars(idStr,sendMessage);
        } else if (data.equals("_nazar")) {
            dt(idStr);
            sendVideo.setChatId(idStr);
            sendVideo.setVideo(new InputFile("BAACAgIAAxkBAAIC4WO-jpsLNH6jeWrOehXzKbtHQDsAAxEbAALY2xhKhu7i5p2yAAGKLQQ"));
            Main.MY_TELEGRAM_BOT.sendMsg(sendVideo);
        }else if(data.contains("_amal")){
            dt(idStr);
            userService.amal(sendMessage, idStr);
        } else if (data.equals("1-muallif")) {
            sendVideo.setChatId(idStr);
            userService.muallif(sendMessage , idStr);
        } else if (data.equals("_orqaVD")) {
            dt(idStr);
            userService.videoDars(idStr,sendMessage);
        }else if(data.equals("1-video")){
          sendVideo.setVideo(new InputFile("BAACAgIAAxkBAAIC4mO-jvHV6wL6hz6Vc629f90PJC6bAAJSGgAC3VygS4JGo3tBtWLoLQQ"));
            sendVideo.setChatId(idStr);
            Main.MY_TELEGRAM_BOT.sendMsg(sendVideo);
        } else if (data.equals("2-video")) {
            sendVideo.setChatId(idStr);
            sendVideo.setVideo(new InputFile("BAACAgIAAxkBAAIC42O-jvE7TziEcOElvbx8zuJmyVvDAAIXIQACZrkYSko8XcnQAlHYLQQ"));
            Main.MY_TELEGRAM_BOT.sendMsg(sendVideo);

        }else if (data.equals("3-video")) {
            sendVideo.setChatId(idStr);
            sendVideo.setVideo(new InputFile("BAACAgIAAxkBAAIC5GO-jvGnT5sAAfpq_bhOGzV4bKMovwACFBoAAszcIEq2BbYa2HV6NS0E"));
            Main.MY_TELEGRAM_BOT.sendMsg(sendVideo);

        }else if (data.equals("4-video")) {
            sendVideo.setChatId(idStr);
            sendVideo.setVideo(new InputFile("BAACAgIAAxkBAAIC5WO-jvF5pv5IGK2pj2B3b-YY1_13AAK2FAACJ-uRSDY_yDmEacStLQQ"));
            Main.MY_TELEGRAM_BOT.sendMsg(sendVideo);

        }else if (data.equals("5-video")) {
            sendVideo.setChatId(idStr);
            sendVideo.setVideo(new InputFile("BAACAgIAAxkBAAIC5mO-jvEDucv7uTRF2DYH6bqBOPHhAAJFGwAC2NsYSm0fRqWhq3FHLQQ"));
            Main.MY_TELEGRAM_BOT.sendMsg(sendVideo);
        }else if(data.equals("_orqaVid")){
            dt(idStr);
            userService.amal(sendMessage, idStr);

        }else if(data.equals("_AsosiyMV")){
            dt(idStr);
          userService.Menyu(idStr);
        } else if (data.equals("🔁 ORQAGA")) {
            dt(idStr);
            userService.Menyu(idStr);

        } else if (data.equals("_Goy")) {
            dt(idStr);
            userService.Goya(sendMessage,idStr);

        } else if (data.equals("_MoshVi")) {
            dt(idStr);
          userService.Avt(idStr);
        }else if(data.equals("1_Mosh")){

            sendVideo.setChatId(idStr);
            sendVideo.setVideo(new InputFile("BAACAgIAAxkBAAIC52O-j5-5edlaSAaIyrTaHtd_8jUjAAIeHQAC2NsYSsWyHW1qC2sMLQQ"));
            Main.MY_TELEGRAM_BOT.sendMsg(sendVideo);
        }else if(data.equals("2_Moshna")){
            sendVideo.setChatId(idStr);
            sendVideo.setVideo(new InputFile("BAACAgIAAxkBAAIC6GO-j5_5s-mpE26iH5Oblq-0zsk-AAIlHQAC2NsYSiEMWd_cNh6MLQQ"));
            Main.MY_TELEGRAM_BOT.sendMsg(sendVideo);
        } else if (data.equals("_Orqaga1")) {
            dt(idStr);
            userService.Goya(sendMessage,idStr);

        }else if(data.equals("Asosiy Menyu")){
            dt(idStr);
            userService.Menyu(idStr);
        }else if(data.equals("ASOM_GO")){
            dt(idStr);
            userService.Menyu(idStr);
        }else if(data.equals("Orq_Goy")){
            dt(idStr);
            userService.Menyu(idStr);
        } else if (data.equals("_Landshaft")) {
          dt(idStr);
          userService.Landshaft(idStr);
        } else if (data.equals("1-den")) {
            sendVideo.setVideo(new InputFile("BAACAgIAAxkBAAIC6WO-kAJQizELI2wN2NyLZeervGcUAAKtFQACVrNIS6-ioA8Qx_0NLQQ"));
            sendVideo.setChatId(idStr);
            Main.MY_TELEGRAM_BOT.sendMsg(sendVideo);
        }else if (data.equals("2-yomg'")) {
            sendVideo.setVideo(new InputFile("BAACAgIAAxkBAAIC6mO-kALTyjAngokvPG4vXwAB6rGiKgAC_BsAAtjbGEqAwa_GijYexy0E"));
            sendVideo.setChatId(idStr);
            Main.MY_TELEGRAM_BOT.sendMsg(sendVideo);
        }else if (data.equals("3-obHa")) {
            sendVideo.setVideo(new InputFile("BAACAgIAAxkBAAIC62O-kALFiv6zN92RmRUC0JDuCMQTAAL9GwAC2NsYSv48hGpJPbPvLQQ"));
            sendVideo.setChatId(idStr);
            Main.MY_TELEGRAM_BOT.sendMsg(sendVideo);
        }else if (data.equals("4-Darx")) {
            sendVideo.setVideo(new InputFile("BAACAgIAAxkBAAIC7GO-kAIIxnXh7Jucl1VjRJFIPF0eAAIYHQAC2NsYSlhOKwktiVm1LQQ"));
            sendVideo.setChatId(idStr);
            Main.MY_TELEGRAM_BOT.sendMsg(sendVideo);
        } else if (data.equals("_orqaLan")) {
            dt(idStr);
            userService.Goya(sendMessage,idStr);
        }else if(data.equals("_AsosiyLan")){
            dt(idStr);
            userService.Menyu(idStr);
        }else if(data.equals("_Andro'idUch")){
           dt(idStr);
           userService.Android(idStr);
           userService.Android1(idStr);
        }else if(data.equals("_MasterCl")){
            dt(idStr);
            userService.MAster(idStr);
        }else if(data.equals("_orqa")){
            dt(idStr);
            userService.Menyu(idStr);
        }else if(data.equals("_AsosiyMA")){
            dt(idStr);
            userService.Menyu(idStr);
        } else if (data.equals("_TOP 5")) {
            sendVideo.setChatId(idStr);
            sendVideo.setVideo(new InputFile("BAACAgIAAxkBAAIC6WO-kAJQizELI2wN2NyLZeervGcUAAKtFQACVrNIS6-ioA8Qx_0NLQQ"));
            sendVideo.setVideo(new InputFile("BAACAgIAAxkBAAIC7GO-kAIIxnXh7Jucl1VjRJFIPF0eAAIYHQAC2NsYSlhOKwktiVm1LQQ"));
            Main.MY_TELEGRAM_BOT.sendMsg(sendVideo);
        }else if(data.equals("_TOP 6 -> 8")){
            sendVideo.setChatId(idStr);
            sendVideo.setVideo(new InputFile("BAACAgIAAxkBAAIC62O-kALFiv6zN92RmRUC0JDuCMQTAAL9GwAC2NsYSv48hGpJPbPvLQQ"));
            sendVideo.setVideo(new InputFile("BAACAgIAAxkBAAIC7GO-kAIIxnXh7Jucl1VjRJFIPF0eAAIYHQAC2NsYSlhOKwktiVm1LQQ"));
            sendVideo.setVideo(new InputFile("BAACAgIAAxkBAAIC62O-kALFiv6zN92RmRUC0JDuCMQTAAL9GwAC2NsYSv48hGpJPbPvLQQ"));
            sendVideo.setVideo(new InputFile("BAACAgIAAxkBAAIC7GO-kAIIxnXh7Jucl1VjRJFIPF0eAAIYHQAC2NsYSlhOKwktiVm1LQQ"));

            Main.MY_TELEGRAM_BOT.sendMsg(sendVideo);
        }else if(data.equals("_TOP 8 -> 10")){
            sendVideo.setChatId(idStr);
            sendVideo.setVideo(new InputFile("BAACAgIAAxkBAAIC62O-kALFiv6zN92RmRUC0JDuCMQTAAL9GwAC2NsYSv48hGpJPbPvLQQ"));
            sendVideo.setVideo(new InputFile("BAACAgIAAxkBAAIC7GO-kAIIxnXh7Jucl1VjRJFIPF0eAAIYHQAC2NsYSlhOKwktiVm1LQQ"));
            sendVideo.setVideo(new InputFile("BAACAgIAAxkBAAIC62O-kALFiv6zN92RmRUC0JDuCMQTAAL9GwAC2NsYSv48hGpJPbPvLQQ"));
            sendVideo.setVideo(new InputFile("BAACAgIAAxkBAAIC7GO-kAIIxnXh7Jucl1VjRJFIPF0eAAIYHQAC2NsYSlhOKwktiVm1LQQ"));
            sendVideo.setVideo(new InputFile("BAACAgIAAxkBAAIC6WO-kAJQizELI2wN2NyLZeervGcUAAKtFQACVrNIS6-ioA8Qx_0NLQQ"));
            sendVideo.setVideo(new InputFile("BAACAgIAAxkBAAIC7GO-kAIIxnXh7Jucl1VjRJFIPF0eAAIYHQAC2NsYSlhOKwktiVm1LQQ"));
            Main.MY_TELEGRAM_BOT.sendMsg(sendVideo);
        }else if(data.equals("_Inter")){
            dt(idStr);
            userService.IntervyuUS(idStr);

        }else if(data.equals("1-vid")){
            sendVideo.setVideo(new InputFile("BAACAgIAAxkBAAIC4mO-jvHV6wL6hz6Vc629f90PJC6bAAJSGgAC3VygS4JGo3tBtWLoLQQ"));
            sendVideo.setChatId(idStr);
            Main.MY_TELEGRAM_BOT.sendMsg(sendVideo);
        } else if (data.equals("2-vid")) {
            sendVideo.setChatId(idStr);
            sendVideo.setVideo(new InputFile("BAACAgIAAxkBAAIC42O-jvE7TziEcOElvbx8zuJmyVvDAAIXIQACZrkYSko8XcnQAlHYLQQ"));
            Main.MY_TELEGRAM_BOT.sendMsg(sendVideo);

        }else if (data.equals("3-vid")) {
            sendVideo.setChatId(idStr);
            sendVideo.setVideo(new InputFile("BAACAgIAAxkBAAIC5GO-jvGnT5sAAfpq_bhOGzV4bKMovwACFBoAAszcIEq2BbYa2HV6NS0E"));
            Main.MY_TELEGRAM_BOT.sendMsg(sendVideo);

        }else if (data.equals("4-vid")) {
            sendVideo.setChatId(idStr);
            sendVideo.setVideo(new InputFile("BAACAgIAAxkBAAIC5WO-jvF5pv5IGK2pj2B3b-YY1_13AAK2FAACJ-uRSDY_yDmEacStLQQ"));
            Main.MY_TELEGRAM_BOT.sendMsg(sendVideo);

        }else if (data.equals("5-vid")) {
            sendVideo.setChatId(idStr);
            sendVideo.setVideo(new InputFile("BAACAgIAAxkBAAIC5mO-jvEDucv7uTRF2DYH6bqBOPHhAAJFGwAC2NsYSm0fRqWhq3FHLQQ"));
            Main.MY_TELEGRAM_BOT.sendMsg(sendVideo);
        }else if (data.equals("_orqaV")){
            dt(idStr);
            userService.Menyu(idStr);
        } else if (data.equals("_AsosiyM")) {
            dt(idStr);
            userService.Menyu(idStr);

        }else if(data.equals("Afteref")){
            dt(idStr);
            userService.After(idStr);
        }else if(data.equals("Reklama")){
            dt(idStr);
            userService.Reklam(idStr);
        }else if(data.equals("_fikir")){
            dt(idStr);
            sendMessage.setText("Taklif va murojaatlaringizni qoldirishingiz mumkin!");
            sendMessage.setChatId(idStr);

            Main.MY_TELEGRAM_BOT.sendMsg(sendMessage);

        }


    }



    private void dt(String idStr) {
        DeleteMessage deleteMessage = new DeleteMessage();
        deleteMessage.setChatId(String.valueOf(idStr));
        deleteMessage.setMessageId(callbackQuery.getMessage().getMessageId());
        Main.MY_TELEGRAM_BOT.sendMsg(deleteMessage);
    }


}