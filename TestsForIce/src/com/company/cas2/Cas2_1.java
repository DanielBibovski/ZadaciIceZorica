package com.company.cas2;

public class Cas2_1 {
    // Zadaca 1

      // a.
      public void samoBukvi(String[] arr){
        for(String s: arr){
            boolean onlyLeters = true;
            char[] chars = s.toCharArray();
            for (char c : chars) {
                if(!Character.isLetter(c)) {
                    onlyLeters = false;
                }
            }
            if(onlyLeters){
                System.out.println(s);
            }
        }
    }
      // b.
      public void sodrziBrojka(String[] arr){
          for(String s: arr){
              char[] chars = s.toCharArray();

              for (char c : chars) {
                  if(Character.isDigit(c)) {
                      System.out.println(s);
                      break;
                  }
              }
          }
      }
      // c.
      public void sodrziBrojkaIBukva(String[] arr){
          for(String s: arr){
              char[] chars = s.toCharArray();
              boolean containsDigitAndLetter = false;
              for (int i = 0; i < chars.length; i++) {
                  if(Character.isDigit(chars[i])) {
                      for(int j = 0; j < chars.length; j++){
                          if(Character.isLetter(chars[j])){
                              containsDigitAndLetter = true;
                              break;
                          }
                      }
                  }else if(Character.isLetter(chars[i])){
                      for(int j = 0; j < chars.length; j++){
                          if(Character.isDigit(chars[j])){
                              containsDigitAndLetter = true;
                          }
                      }
                  }
              }
              if(containsDigitAndLetter){
                  System.out.println(s);
              }

          }
      }
      // d.
      public void neSodrziBrojkaNiBukva(String[] arr){
        for(String s: arr){

            char[] chars = s.toCharArray();
            boolean norDigitNorLetter = true;

            for (int i = 0; i < chars.length; i++) {
                if(Character.isDigit(chars[i]) || Character.isLetter(chars[i])) {
                    norDigitNorLetter = false;
                    break;
                }
            }
            if(norDigitNorLetter){
                System.out.println(s);
            }
        }
    }




}
