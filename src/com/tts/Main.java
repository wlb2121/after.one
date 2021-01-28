package com.tts;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;


public class Main {

    public static void main(String[] args) {
        HashMap<String, String> carMap = new HashMap<>(5);
        carMap.put("Tesla", "X3");
        carMap.put("Ford", "Festiva");
        carMap.put("Chevrolet", "Trax");
        carMap.put("Toyota", "Corolla");
        carMap.put("Scion", "XB");
        System.out.println("What is the make you are looking for? ");
        Scanner scan = new Scanner(System.in);
        String makeName = scan.nextLine();
        System.out.println("What is the model you are looking for? ");
        String modelName = scan.nextLine();
        if (carMap.containsKey(makeName) && carMap.containsValue(modelName)) {
            System.out.println("We have that vehicle! please follow me...");
        }else {
            System.out.println("I am sorry. We do not currently have that make and model. Would you like join our email list?");
        }


    }
}
