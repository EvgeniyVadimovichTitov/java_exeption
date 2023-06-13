package view;

import controller.Controllable;
import model.Data;

import javax.swing.text.DateFormatter;
import java.text.SimpleDateFormat;
import java.time.DateTimeException;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class View {
    private final Controllable controller;
    public View(Controllable controller) {
        this.controller = controller;
    }

    public void run(){
        String [] fullname = inputFullname().split(" ");
        try {
            controller.save(new Data(fullname[0], fullname[1], fullname[2], inputBirthDate(),
                    inputPhone(), inputGender()));
        }catch (ArrayIndexOutOfBoundsException e){
            controller.save(new Data(fullname[0], fullname[1], inputBirthDate(),
                    inputPhone(), inputGender()));
        }
    }
    private Character inputGender(){
        while (true){
            String buff = sin("Please, input your gender (one character format: f or m): ");
            if(buff.isEmpty()){
                System.out.println("Line is empty, please repeat input!");
                continue;
            }
            if (buff.length()>1){
                System.out.println("You input more one character! Please, repeat input!");
                continue;
            }
            if (isgenderValid(buff.charAt(0))){
                System.out.println("OK");
                return buff.charAt(0);
            }
            System.out.println("You input invalid format gender. Please, repeat input!");
        }
    }
    private boolean isgenderValid(Character gender){
        return gender == 'f' || gender == 'm';
    }
    private String inputPhone(){
        while (true){
            String buff = sin("Please, input your phone (eleven digit without format): ");
            if(buff.isEmpty()){
                System.out.println("Line is empty, please repeat input!");
                continue;
            }
            if(isPhoneValid(buff)){
                System.out.println("OK");
                return buff;
            }
            System.out.println("Invalid format phone number! Please repeat input! ");
        }

    }
    private boolean isPhoneValid(String phone){
        return phone.matches("^[7|8]([0-9]{2,11}$)");
    }
    private String inputBirthDate(){
        while (true){
            String buff = sin("Please input your birth date (format - dd.mm.yyyy): ");
            if(buff.isEmpty()){
                System.out.println("Line is empty, please repeat input!");
                continue;
            }if(isDateValid(buff)){
                System.out.println("OK");
                return buff;
            }else{System.out.println("You input invalid date.Please repeat input!");}
        }
    }
    private static boolean isDateValid(String date) {

        SimpleDateFormat myFormat = new SimpleDateFormat("dd.MM.yyyy");
        myFormat.setLenient(false);
        ZoneId defaultZoneId = ZoneId.systemDefault();
        try {
            Date current = Date.from(LocalDate.now().atStartOfDay(defaultZoneId).toInstant());
            Date tmp = myFormat.parse(date);
            if (tmp.before(current)) return true;
            else {
                System.out.println("Input date must be before current date!");
                return false;
            }
        }catch (DateTimeException e) {
            return false;
        }catch (Exception e) {
            return false;
        }

    }
    private String inputFullname(){
        while (true) {
            String buff = sin("Please, input your full name separated by spase: ");
            if(buff.isEmpty()){
                System.out.println("Line is empty, please repeat input!");
                continue;
            }
            int count = 0;
            boolean flag =true;
            for (String el: buff.split(" ")) {
               if (isAlpha(el)){
                   count++;
               }else {
                   flag = false;
                   switch (count){
                       case (0) :
                            System.out.println("You used invalid characters in family name. " +
                               "Please, repeat input!");
                            break;
                       case (1):
                            System.out.println("You used invalid characters in name. " +
                               "Please, repeat input!");
                            break;
                       case (2):
                           System.out.println("You used invalid characters in surname. " +
                                   "Please, repeat input!");
                           break;
               }
               break;
               }
            }
            if(flag) {
                System.out.println("OK");
                return buff;
            }
        }
    }
    private boolean isAlpha(String name){
        return name.matches("^[A-ZА-Я]([a-zа-я]*$)");
    }
    private String sin(String message){
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}
