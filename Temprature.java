package com.aditya;

import java.util.Scanner;

public class Temprature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the temperature : ");

        int tempC = input.nextInt();
        int tempF = (tempC * 9/5) + 32;

        System.out.println(tempF);

      input.close();
    }
}
