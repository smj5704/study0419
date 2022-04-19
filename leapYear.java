package com.example.study0419;

import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if(1<= year && year <= 4000) {
//            윤년이면 1 아니면 0 을 출력한다
            if(year % 4 == 0 && year%100 != 0 || year % 400 == 0) {
                System.out.println('1');
            }else {
                System.out.println('0');
            }
        }
    }
}
