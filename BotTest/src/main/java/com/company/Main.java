package com.company;

import com.company.controller.BotController;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

public class Main {

    public static BotController MY_TELEGRAM_BOT;


    public static void main(String[] args) {

        Main.MY_TELEGRAM_BOT = new BotController();
        headerMethod();
    }

    private static void headerMethod() {

        try {
            TelegramBotsApi telegramBotsApi = new TelegramBotsApi(DefaultBotSession.class);
            telegramBotsApi.registerBot(MY_TELEGRAM_BOT);

        } catch (TelegramApiException e) {
            e.printStackTrace();
        }

    }
}