package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String watashiwaGokkusaiDes;

        final int NUM = 0;


        String word = "meeoow";

        watashiwaGokkusaiDes = NUM + word;


        System.out.println(watashiwaGokkusaiDes + NUM + word);

        if (NUM < 0){
            System.out.println("Вы сохранили отрицательное число");
        }else if (NUM > 0){
            System.out.println("Вы сохранили положительное число");
        }else {
            System.out.println("Вы сохранили нуль");
        }


        Scanner vvod = new Scanner(System.in);
        System.out.println("Введите ваше имя:");
        String imya = vvod.nextLine();
        System.out.println("Приветствую вас," + " " + imya + " " + "!");




    }
}
