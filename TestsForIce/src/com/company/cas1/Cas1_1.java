package com.company.cas1;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Cas1_1 {

    // Zadaca 1
    public void zdravo() {
        String ime = "Daniel";
        String prezime = "Bibovski";
        String adresa = "Narodni Heroi 18";
        int godinaNaRaganje = 1987;

        LocalDate birthdate = LocalDate.of(1987, 6, 3);
        LocalDate now = LocalDate.now();
        long age = ChronoUnit.YEARS.between(birthdate, now);


        System.out.println("Zdravo jas sum " + ime + " " + prezime+".");
        System.out.println("Dolzinata na moeto ime e: " + ime.length() + " karakteri.");
        System.out.println("Roden sum " + godinaNaRaganje+ " i imam " + age + " godini.");

    }
    // Zadaca 3
    public void pecatiOperacii(int x, int y){
        if(x%y != 0){
            System.out.println("Zbirot e: " + (x+y));
            System.out.println("Razlikata e: " + (x-y));
            System.out.println("Proizvodot e: " + x*y);
            System.out.println("Kolicnikot e: " + (x/y) + " so ostatok " + (x%y));

        }

    }

    // Zadaca 4
    public void substring1(){

        String s = "paralelogram";
        String sub = s.substring(4,9);
        System.out.println(sub);

    }

    //Zadaca 5
    public void substring2(){
        String s = "mary had a little lamb";
        String sub = s.substring(0,5) + s.substring(11,22);
        System.out.println(sub);

    }

}
