package br.com.user;

import java.util.Scanner;

public class User {
    private static final Scanner readerDatesUser = new Scanner(System.in);

    public static int numberChoice(){

        return readerDatesUser.nextInt();
    }
    public static String wordChoice(){
        return readerDatesUser.nextLine();
    }
    public static void bufferClean(){
        readerDatesUser.nextLine();
    }
}
