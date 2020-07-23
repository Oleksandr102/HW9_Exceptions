package main.java.com.company.rethrowing;

import com.sun.jdi.AbsentInformationException;

public class Rethrow {

    public void method1() throws AbsentInformationException {
        try {
            System.out.println("inside rethrow method 1");
            method2();
        } catch (Exception e) {
            throw new AbsentInformationException();
        }
    }

    public void method2() throws AbsentInformationException {
        System.out.println("inside rethrow method 2");
        throw new AbsentInformationException();
    }
}

