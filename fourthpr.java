package com.company;

import java.util.Scanner;

public class Greatest {
    public static void Greatest(int a, int b){
        if(a>b){
            int less = a-b;
            System.out.println(a + " is greater than " + b + " By the difference of " + less);
        }else if(a<b){
            int less1 = b-a;
            System.out.println(b + " is greater than " + a + " By the difference of " + less1);
        }else{
            System.out.println(" both are equal ");
        }

        return;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number ");
        int x = sc.nextInt();
        System.out.println( " Enter the second number ");
        int y = sc.nextInt();

        Greatest(x,y);
    }
}
