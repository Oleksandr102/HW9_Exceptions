package main.java.com.company.division;

import java.util.Scanner;

public class SafeDivision {


    public static void division() {
        int a;
        double c = 0;
        boolean error;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number: ");
        a = in.nextInt();
        float b = 0f;
        do {
            try {
                error = false;
                System.out.print("Enter second number(cannot be 0): ");
                b = in.nextInt();
                c = a / b;
            } catch (Exception d) {
                System.out.println("cannot divide by 0");
                error = true;
            }
        } while (error);
        System.out.println(a + "/" + b + "=" + (double) a / c);
    }
}

