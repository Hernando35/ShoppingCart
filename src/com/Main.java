/*
package com;
*/

import com.sun.xml.internal.rngom.parse.host.Base;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static int calcFeetAndInchesToCentimeters(Double feet, Double inches) {
  if((feet < 0) || ((inches < 0)) || (inches > 12)){
      System.out.println("there is something wrong");
          return -1;}
    }

    public static int calcFeetAndInchesToCentimeters(Double inches) {
        if (inches < 0 ){
            return -1;
        }
        if (inches > 0 ){
            Double cms =  1* (inches) / 2.54;
            Double feet = 12 * (inches);
        }
    }

}
