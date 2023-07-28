package com.example.homework2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Random;
import java.util.Scanner;

@SpringBootApplication
public class Homework2Application {

    public static void main(String[] args) {
        Random random = new Random();
        int secret = random.nextInt(10) + 1;
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        while (num != secret) {
            System.out.println("請從1~10中猜測數字:");
            num = scanner.nextInt();
            if (num < secret) {
                System.out.println("higer");
            } else if (num > secret) {
                System.out.println("lower");
            } else {
                System.out.println("great");
            }
        }
    }
}
