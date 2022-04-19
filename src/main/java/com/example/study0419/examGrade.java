package com.example.study0419;

import java.util.Scanner;

public class examGrade {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(0 <= num && num<= 100) {
            if(90 <= num & num <= 100)
                System.out.println('A');
            else if (80 <= num && num <= 89)
                System.out.println('B');
            else if (70 <= num && num <= 79)
                System.out.println('C');
            else
                System.out.println('F');
        }
    }
