package main.java.com.company.exceptions;

public class ExceptionB extends ExceptionA {
    private static final long serialVersionUID = 7916205703655991524L;

    public ExceptionB(String message) {
        super(message);
        System.out.println("Inside ExceptionB class and " + message);
    }
}
