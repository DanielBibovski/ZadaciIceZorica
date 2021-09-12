package com.company.cas2;

public class Cas2_2 {

    // Zadaca 2
    public void dellividoCetiriISedum(){
        for(int i = 0; i<1000; i++){
            if(i%4 == 0 && i%7 == 0){
                System.out.println("Ura!");
            }else if(i%4 == 0){
                System.out.println("Yes!");
            }else if(i%7 == 0){
                System.out.println("No!");
            }
        }

    }

    // Zadaca 3
    public void isPalindrom(String[] srr){

        for(String str : srr) {
            String rev = "";

            for (int i = str.length() - 1; i >= 0; i--)
                rev = rev + str.charAt(i);

            if (str.equals(rev))
                System.out.println(str + " e palindrom");
            else
                System.out.println(str + " ne e palindrom");
        }
    }

    // Zadaca 4
    public void ispecatiPrevrteno(int[] broevi){
        for(int r : broevi){
            int reversed;
            //for(int i=0; i<)
        }
        for(int number: broevi) {

            int reverse = 0;
            while (number != 0) {
                int remainder = number % 10;
                reverse = reverse * 10 + remainder;
                number = number / 10;
            }
            System.out.println(reverse);
        }

    }

    //Zadaca 5 e vo Main.java



    // Zadaca 6

    public void brojotEProst(int num){

        boolean eProst = true;
        String broj = "";
        for (int i = 2; i <= num / 2; ++i) {
            if (num % i == 0) {
                eProst = false;
                break;
            }
        }
        if (eProst){
            broj = "e prost";
        }else {
            broj = "ne e prost";
        }
        System.out.println("Brojot " +num+ " " + broj + " , kade " +num+ " e vneseniot broj.");

    }

    // Zadaca 7 e vo Main.java


}
