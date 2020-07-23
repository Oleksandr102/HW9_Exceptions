package main.java.com.company.executor;

import com.sun.jdi.AbsentInformationException;
import main.java.com.company.exceptions.ExceptionA;
import main.java.com.company.exceptions.ExceptionB;
import main.java.com.company.rethrowing.Rethrow;

import java.io.IOException;

import static main.java.com.company.division.SafeDivision.division;

public class Execute {

    public static void runnable() {
        try {
            throw new ExceptionA("ExceptionA was thrown");
        } catch (ExceptionA exceptionA) {
            System.out.println("This catch is handling ExceptionA");
        }
        try {
            throw new ExceptionB("ExceptionB was thrown");
        } catch (ExceptionB exceptionB) {
            System.out.println("This catch is handling ExceptionB");
        }
        try {
            throw new NullPointerException(/*"Null Pointer Exception was thrown"*/);
        } catch (Exception e) {
            System.out.println("Inside Null Pointer Exception catch block");
        }
        try {
            throw new IOException("IOException was thrown");
        } catch (IOException e) {
            System.out.println("Inside IO Exception catch block");
        }

        division();

        try {
            new Rethrow().method1();
        } catch (AbsentInformationException e) {
            System.out.println("Inside rethrow exception block");
        }
    }
}
