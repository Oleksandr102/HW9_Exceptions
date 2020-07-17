package main.java.com.company.exceptions;

public class ExceptionA extends Exception{
    private static final long serialVersionUID = -3690287947029041174L;

    public ExceptionA(String message) {
        System.out.println("Inside ExceptionA class and " + message);
    }
}
