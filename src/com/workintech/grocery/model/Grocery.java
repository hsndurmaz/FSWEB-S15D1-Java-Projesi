package com.workintech.grocery.model;

import java.util.List;
import java.util.Scanner;

public class Grocery {
    private static String getInput(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
    public static void addItems(List<String> groceyList){
        System.out.println("Eklenmesini istediğiniz elemanları giriniz.");
        String input = getInput();
        if(input.contains(",")){

        }
    }
}
