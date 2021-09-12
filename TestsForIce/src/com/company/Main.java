package com.company;


import com.company.cas1.Cas1_1;
import com.company.cas2.Cas2_1;
import com.company.cas2.Cas2_2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String[] zborovi = {"majka", "dete", "tatko", "cvetan arsov 23", "P@ssw0rd", "danco 25ka", "$%(*#"};
        String[] mozniPalindromi = {"oko", "raka", "noga", "usta", "sosos" };
        int[] broevi = {123450, 6789122, 123, 342356};

        Cas1_1 cas1 = new Cas1_1();
        cas1.zdravo();
        cas1.pecatiOperacii(11,5);
        cas1.substring1();
        Cas2_2 cas2_1 = new Cas2_2();
        cas2_1.brojotEProst(3);
        cas2_1.ispecatiPrevrteno(broevi);

        // Zadaca 5

//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Vnesete broj: ");
//        int num = sc.nextInt();
//        String paren = "";
//
//        if(num%2 == 0){
//            paren = "paren";
//        }else{
//            paren = "neparen";
//        }
//        System.out.println("Brojot " +num+ " e " + paren+ " , kade " +num+ " e vneseniot broj.");



        //Zadaca 7

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Vnesete dva broja: ");
//
//        int prvBroj = sc.nextInt();
//        int vtorBroj = sc.nextInt();
//
//        int suma = prvBroj + vtorBroj;
//
//        System.out.println
//                ("Zbirot na broevite " + prvBroj + " i "+ vtorBroj + " e " + suma + " kade " + prvBroj +
//                 " e prvo vneseniot broj, " + vtorBroj + " e vtoro vneseniot broj i " + suma + " e zbirot od dvata broja.");


    }

}
