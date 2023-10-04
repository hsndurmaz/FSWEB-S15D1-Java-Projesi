package com.workintech.grocery.main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    }
    public static void starGrocery(){
        Scanner scanner = new Scanner(System.in);
        while (true){
            try{
                System.out.println("Yapmak istediğiniz işlemi giriniz:");
                int process = scanner.nextInt();
                if(process < 0 || process >2){
                    System.out.println("Process must be between 0-2");
                }
                if(process == 0){
                    System.exit(0);
                }
                if( process == 1){

                }
                if(process == 2){


                }
            } catch (Exception ex){
                System.out.println("Invelid process: " + ex.getMessage());
                break;
            }

        }
    }
}