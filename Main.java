package com.itfactory;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        System.out.println("Introduceti un text al carui cuvinte sa fie separate prin spatiu si fara semne de punctuatie.");
        Scanner scanner = new Scanner(System.in);
        String [] textIntrodus = scanner.nextLine().split(" ");

        for(String textSeparat: textIntrodus) {
            System.out.println(textSeparat) ;
        }


        Set<String> textSeparatInSet = new HashSet<>();
        textSeparatInSet.addAll(List.of(textIntrodus));

        System.out.println(textSeparatInSet);
        System.out.println(textSeparatInSet.size());
    }
}
