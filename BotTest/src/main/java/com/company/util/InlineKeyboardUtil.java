package com.company.util;



import org.telegram.telegrambots.meta.api.objects.Video;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;

import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboard;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;


import java.util.LinkedList;
import java.util.List;

public class InlineKeyboardUtil {


    public  static  InlineKeyboardMarkup showMenu(){
        InlineKeyboardButton menbutton = new InlineKeyboardButton();
        menbutton.setText("Boshlang'ich tushyncha");
        menbutton.setCallbackData("Boshlang'ich tushyncha");

        InlineKeyboardButton test = new InlineKeyboardButton();
        test.setText("Vidyo' darslar");
        test.setCallbackData("_vid");


        List<InlineKeyboardButton> row = new LinkedList<>();
        row.add(menbutton);
        row.add(test);



        InlineKeyboardButton test2 = new InlineKeyboardButton();
        test2.setText("G'oya ide");
        test2.setCallbackData("_Goy");

        InlineKeyboardButton test1 = new InlineKeyboardButton();
        test1.setText("Andro'id uchun montaj dastur");
        test1.setCallbackData("_Andro'idUch");

        List<InlineKeyboardButton> row2 = new LinkedList<>();
        row2.add(test2);
        row2.add(test1);



        InlineKeyboardButton test5 = new InlineKeyboardButton();
        test5.setText("Master class");
        test5.setCallbackData("_MasterCl");

        InlineKeyboardButton test6 = new InlineKeyboardButton();
        test6.setText("Interviyu");
        test6.setCallbackData("_Inter");

        List<InlineKeyboardButton> row4 = new LinkedList<>();
        row4.add(test5);
        row4.add(test6);


        InlineKeyboardButton test8 = new InlineKeyboardButton();
        test8.setText("After effect darsi");
        test8.setCallbackData("Afteref");

        List<InlineKeyboardButton> row5 = new LinkedList<>();
        row5.add(test8);



        InlineKeyboardButton test9 = new InlineKeyboardButton();
        test9.setText("Reklama");
        test9.setCallbackData("Reklama");

        InlineKeyboardButton test10 = new InlineKeyboardButton();
        test10.setText("Fikir bildrish");
        test10.setCallbackData("_fikir");

        List<InlineKeyboardButton> row6 = new LinkedList<>();
        row5.add(test9);
        row6.add(test10);

        List<List<InlineKeyboardButton>> rowCollection = new LinkedList<>();
        rowCollection.add(row);
        rowCollection.add(row2);
        rowCollection.add(row4);
        rowCollection.add(row5);
        rowCollection.add(row6);



        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        inlineKeyboardMarkup.setKeyboard(rowCollection);
        

        return inlineKeyboardMarkup;
    }

    public static InlineKeyboardMarkup video(){

        InlineKeyboardButton inlineKeyboardButton = new InlineKeyboardButton();
        inlineKeyboardButton.setText("Nazariy");
        inlineKeyboardButton.setCallbackData("_nazar");

        InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
        inlineKeyboardButton1.setText("Amaliy");
        inlineKeyboardButton1.setCallbackData("_amal");

        InlineKeyboardButton button1 = new InlineKeyboardButton();
        button1.setText("🔁 ORQAGA");
        button1.setCallbackData("_orqaVD");

         List<InlineKeyboardButton> buttonList = new LinkedList<>();
         buttonList.add(inlineKeyboardButton);
         buttonList.add(inlineKeyboardButton1);

         List<InlineKeyboardButton>buttonList1 = new LinkedList<>();
         buttonList1.add(button1);




         List<List<InlineKeyboardButton>>row = new LinkedList<>();
         row.add(buttonList);
         row.add(buttonList1);
         InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
         inlineKeyboardMarkup.setKeyboard(row);
         return inlineKeyboardMarkup;

    }
    public static InlineKeyboardMarkup Muallif(){
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("1-muallif");
        button.setCallbackData("1-muallif");

        List<InlineKeyboardButton>row = new LinkedList<>();
        row.add(button);

        InlineKeyboardButton button1 = new InlineKeyboardButton();
        button1.setText("🔁 ORQAGA");
        button1.setCallbackData("_orqaVD");

        List<InlineKeyboardButton>row1 = new LinkedList<>();
        row1.add(button);
        row1.add(button1);

        List<List<InlineKeyboardButton>> rowlis = new LinkedList<>();
        rowlis.add(row1);

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        inlineKeyboardMarkup.setKeyboard(rowlis);
        return inlineKeyboardMarkup;
    }

    public static InlineKeyboardMarkup Goya(){
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("\uD83D\uDE97Avtomobil uchun");
        button.setCallbackData("_MoshVi");
        List<InlineKeyboardButton>row = new LinkedList<>();
        row.add(button);

        InlineKeyboardButton button1 = new InlineKeyboardButton();
        button1.setText("\uD83D\uDDBC\uD83C\uDF0E️Landshaft uchun");
        button1.setCallbackData("_Landshaft");
        List<InlineKeyboardButton>row1 = new LinkedList<>();
        row1.add(button1);

        InlineKeyboardButton button2 = new InlineKeyboardButton();
        button2.setText("Orqaga");
        button2.setCallbackData("Orq_Goy");
        InlineKeyboardButton button3 = new InlineKeyboardButton();
        button3.setText("Asosiy menyu");
        button3.setCallbackData("ASOM_GO");

        List<InlineKeyboardButton>row2 = new LinkedList<>();
        row2.add(button2);
        row2.add(button3);


        List<List<InlineKeyboardButton>>rowLis = new LinkedList<>();
        rowLis.add(row);
        rowLis.add(row1);
        rowLis.add(row2);


        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        inlineKeyboardMarkup.setKeyboard(rowLis);
        return inlineKeyboardMarkup;

    }


    public static InlineKeyboardMarkup AvtomabiluchunVid() {
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("1.\uD83D\uDE97\uD83D\uDCA1");
        button.setCallbackData("1_Mosh");

        List<InlineKeyboardButton> row = new LinkedList<>();
        row.add(button);

        InlineKeyboardButton button1 = new InlineKeyboardButton();
        button1.setText("2.\uD83D\uDCA1");
        button1.setCallbackData("2_Moshna");

        List<InlineKeyboardButton> row1 = new LinkedList<>();
        row1.add(button1);

        InlineKeyboardButton button2 = new InlineKeyboardButton();
        button2.setText("🔁 ORQAGA");
        button2.setCallbackData("_Orqaga1");

        InlineKeyboardButton button3 = new InlineKeyboardButton();
        button3.setText("Asosiy Menyu");
        button3.setCallbackData("Asosiy Menyu");

        List<InlineKeyboardButton>row2 = new LinkedList<>();
         row2.add(button2);
         row2.add(button3);

         List<List<InlineKeyboardButton>>rowList = new LinkedList<>();
         rowList.add(row);
         rowList.add(row1);
         rowList.add(row2);

         InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
         inlineKeyboardMarkup.setKeyboard(rowList);

        return inlineKeyboardMarkup;
    }

    public static InlineKeyboardMarkup LandshaftVid() {
        InlineKeyboardButton menbutton = new InlineKeyboardButton();
        menbutton.setText("1-\uD83D\uDCA1\uD83C\uDF0A");
        menbutton.setCallbackData("1-den");

        InlineKeyboardButton test = new InlineKeyboardButton();
        test.setText("2-2- \uD83D\uDCA1\uD83D\uDCA6");
        test.setCallbackData("2-yomg'");


        List<InlineKeyboardButton> row = new LinkedList<>();
        row.add(menbutton);
        row.add(test);



        InlineKeyboardButton test2 = new InlineKeyboardButton();
        test2.setText("3-\uD83D\uDCA1");
        test2.setCallbackData("3-obHa");

        InlineKeyboardButton test1 = new InlineKeyboardButton();
        test1.setText("4-\uD83C\uDF34\uD83D\uDCA1");
        test1.setCallbackData("4-Darx");

        List<InlineKeyboardButton> row2 = new LinkedList<>();
        row2.add(test2);
        row2.add(test1);



        InlineKeyboardButton test5 = new InlineKeyboardButton();
        test5.setText("5-\uD83C\uDFDA️ \uD83D\uDCA1");
        test5.setCallbackData("5-Uy");

        InlineKeyboardButton test6 = new InlineKeyboardButton();
        test6.setText("6- \uD83C\uDF03 \uD83D\uDCA1");
        test6.setCallbackData("6-Rasim");

        List<InlineKeyboardButton> row4 = new LinkedList<>();
        row4.add(test5);
        row4.add(test6);

        InlineKeyboardButton test10 = new InlineKeyboardButton();
        test10.setText("7-7️⃣");
        test10.setCallbackData("7-yaxsh⃣");

        List<InlineKeyboardButton> row6 = new LinkedList<>();

        row6.add(test10);


        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("🔁 ORQAGA");
        button.setCallbackData("_orqaLan");

        InlineKeyboardButton button1 = new InlineKeyboardButton();
        button1.setText("\uD83D\uDD1D Asosiy Menyu");
        button1.setCallbackData("_AsosiyLan");

        List<InlineKeyboardButton> row7 = new LinkedList<>();
        row7.add(button);
        row7.add(button1);


        List<List<InlineKeyboardButton>> rowCollection = new LinkedList<>();
        rowCollection.add(row);
        rowCollection.add(row2);
        rowCollection.add(row4);
        rowCollection.add(row6);
        rowCollection.add(row7);



        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        inlineKeyboardMarkup.setKeyboard(rowCollection);


        return inlineKeyboardMarkup;
    }

    public static InlineKeyboardMarkup MasterVidyo() {
        InlineKeyboardButton inlineKeyboardButton = new InlineKeyboardButton();
        inlineKeyboardButton.setText("\uD83D\uDD1D TOP 5");
        inlineKeyboardButton.setCallbackData("_TOP 5");

        List<InlineKeyboardButton>row = new LinkedList<>();
        row.add(inlineKeyboardButton);

        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("\uD83D\uDD1D TOP 6 -> 8");
        button.setCallbackData("_TOP 6 -> 8");

        InlineKeyboardButton button1 = new InlineKeyboardButton();
        button1.setText("\uD83D\uDD1D TOP 8 -> 10");
        button1.setCallbackData("_TOP 8 -> 10");

        List<InlineKeyboardButton>row1 = new LinkedList<>();
        row1.add(button);
        row1.add(button1);

        InlineKeyboardButton button2 = new InlineKeyboardButton();
        button2.setText("🔁 ORQAGA");
        button2.setCallbackData("_orqa");

        InlineKeyboardButton button3 = new InlineKeyboardButton();
        button3.setText("\uD83D\uDD1D Asosiy Menyu");
        button3.setCallbackData("_AsosiyMA");

        List<InlineKeyboardButton> row7 = new LinkedList<>();
        row7.add(button2);
        row7.add(button3);



        List<List<InlineKeyboardButton>>rowlis = new LinkedList<>();
        rowlis.add(row);
        rowlis.add(row1);
        rowlis.add(row7);

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        inlineKeyboardMarkup.setKeyboard(rowlis);

        return inlineKeyboardMarkup;


    }

    public static InlineKeyboardMarkup Intervyu(){

        InlineKeyboardButton menbutton = new InlineKeyboardButton();
        menbutton.setText("1");
        menbutton.setCallbackData("1-video");

        InlineKeyboardButton test = new InlineKeyboardButton();
        test.setText("2");
        test.setCallbackData("2-video");


        List<InlineKeyboardButton> row = new LinkedList<>();
        row.add(menbutton);
        row.add(test);



        InlineKeyboardButton test2 = new InlineKeyboardButton();
        test2.setText("3");
        test2.setCallbackData("3-video");

        InlineKeyboardButton test1 = new InlineKeyboardButton();
        test1.setText("4");
        test1.setCallbackData("4-video");

        List<InlineKeyboardButton> row2 = new LinkedList<>();
        row2.add(test2);
        row2.add(test1);

        InlineKeyboardButton test3 = new InlineKeyboardButton();
        test3.setText("5");
        test3.setCallbackData("5-video");

        List<InlineKeyboardButton>row3 = new LinkedList<>();
        row3.add(test3);

        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("🔁 ORQAGA");
        button.setCallbackData("_orqaVid");

        InlineKeyboardButton button1 = new InlineKeyboardButton();
        button1.setText("\uD83D\uDD1D Asosiy Menyu");
        button1.setCallbackData("_AsosiyMV");

        List<InlineKeyboardButton> row4 = new LinkedList<>();
        row4.add(button);
        row4.add(button1);

        List<List<InlineKeyboardButton>>rowlis = new LinkedList<>();
        rowlis.add(row);
        rowlis.add(row2);
        rowlis.add(row3);
        rowlis.add(row4);

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        inlineKeyboardMarkup.setKeyboard(rowlis);
        return inlineKeyboardMarkup;


    }
    public static InlineKeyboardMarkup Intervyu1(){

        InlineKeyboardButton menbutton = new InlineKeyboardButton();
        menbutton.setText("1");
        menbutton.setCallbackData("1-vid");

        InlineKeyboardButton test = new InlineKeyboardButton();
        test.setText("2");
        test.setCallbackData("2-vid");


        List<InlineKeyboardButton> row = new LinkedList<>();
        row.add(menbutton);
        row.add(test);



        InlineKeyboardButton test2 = new InlineKeyboardButton();
        test2.setText("3");
        test2.setCallbackData("3-vid");

        InlineKeyboardButton test1 = new InlineKeyboardButton();
        test1.setText("4");
        test1.setCallbackData("4-vid");

        List<InlineKeyboardButton> row2 = new LinkedList<>();
        row2.add(test2);
        row2.add(test1);

        InlineKeyboardButton test3 = new InlineKeyboardButton();
        test3.setText("5");
        test3.setCallbackData("5-vid");

        List<InlineKeyboardButton>row3 = new LinkedList<>();
        row3.add(test3);

        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("🔁 ORQAGA");
        button.setCallbackData("_orqaV");

        InlineKeyboardButton button1 = new InlineKeyboardButton();
        button1.setText("\uD83D\uDD1D Asosiy Menyu");
        button1.setCallbackData("_AsosiyM");

        List<InlineKeyboardButton> row4 = new LinkedList<>();
        row4.add(button);
        row4.add(button1);

        List<List<InlineKeyboardButton>>rowlis = new LinkedList<>();
        rowlis.add(row);
        rowlis.add(row2);
        rowlis.add(row3);
        rowlis.add(row4);

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        inlineKeyboardMarkup.setKeyboard(rowlis);
        return inlineKeyboardMarkup;


    }



}