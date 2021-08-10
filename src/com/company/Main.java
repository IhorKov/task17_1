package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(getValue("catdogcat"));
        System.out.println(getValue("catcat"));
        System.out.println(getValue("1cat1cadodog"));

    }

    public static boolean getValue(String str){
        String regExDog = "dog";
        String regExCat = "cat";
        int countDog = 0, countCat = 0;

        while (true) {
            if(str.contains(regExDog)){
                str = str.replaceFirst(regExDog, "");
                countDog++;
            }
            if(str.contains(regExCat)){
                str = str.replaceFirst(regExCat, "");
                countCat++;
            }
            if(!str.contains(regExCat) && !str.contains(regExDog)){
                break;
            }
        }

        if (countCat == countDog) {
            return true;
        }
        else {
            return false;
        }
    }
}
