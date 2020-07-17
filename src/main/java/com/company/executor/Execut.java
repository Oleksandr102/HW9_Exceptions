package main.java.com.company.executor;

import main.java.com.company.exceptions.ExceptionA;
import main.java.com.company.exceptions.ExceptionB;

import java.io.IOException;
import java.util.Scanner;

import static main.java.com.company.division.SafeDivision.division;
import static main.java.com.company.rethrowing.Rethrow.rethrowException;

public class Execut {

    public static void runable() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("1-ExceptionA, 2-ExceptionB, 3-Null Pointer Exception,4-IO Exception");
            System.out.println("Enter the type of Exception you want to throw");
            System.out.println();

            int choice = sc.nextInt();

            switch (choice) {
                case 1: {
                    throw new ExceptionA("ExceptionA was thrown");
                }
                case 2: {
                    throw new ExceptionB("ExceptionB was thrown");
                }
                case 3: {
                    throw new NullPointerException("Null Pointer Exception was thrown");
                }
                case 4: {
                    throw new IOException("IOException was thrown");
                }
                default: {
                    System.out.println("Enter the valid choice Try Again :(");
                }
            }
        } catch (ExceptionB ex) {
            System.out.println("This catch is for handling both ExceptionA and ExceptionB ");
        } catch (IOException ex) {
            System.out.println("Inside IO Exception catch block");
        } catch (NullPointerException ex) {
            System.out.println("Inside Null Pointer Exception catch block");
        } catch (Exception e) {
            System.out.println("Other type of Exception" + e.getMessage());
        } finally {
            System.out.println("Finally Exception Caught");
        }

        division();
        rethrowException();
    }
}
