package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
                int randomNumber = new Random().nextInt(100);
                System.out.println("ok");
                System.out.println("输入你的数字:");
                Scanner sc = new Scanner(System.in);
                int enterNumber = sc.nextInt();

                while(enterNumber != randomNumber){

                    if(enterNumber>randomNumber) {

                        System.out.println("sorry,it's big");
                    }else {

                        System.out.println("sorry，it's little");
                    }

                    System.out.println("enter your number ");
                    enterNumber = sc.nextInt();
                }
                System.out.println("congratulation  successful!");
            System.out.println("中文");
            }


    }
