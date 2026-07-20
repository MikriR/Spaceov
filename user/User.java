package br.com.user;

import java.util.Scanner;

public class User {
    private static final Scanner readerDatesUser = new Scanner(System.in);

    public static int numberChoice(){
        int numberChoices = readerDatesUser.nextInt();
        return numberChoices;
    }
    public static String wordChoice(){
        String wordChoices = readerDatesUser.nextLine();
        return wordChoices;
    }
    public static void bufferClean(){
        readerDatesUser.nextLine();
    }
}
