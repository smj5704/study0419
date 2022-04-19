package com.example.study0419;

import java.util.Scanner;

public class compareNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        scanner.close();

        if(num1>num2) System.out.println(">");
        else if(num1<num2) System.out.println("<");
        else System.out.println("==");

    }
}
