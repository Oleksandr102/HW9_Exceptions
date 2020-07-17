package main.java.com.company.rethrowing;

public class Rethrow {

    public static void rethrowException() {
        try {
            Rethrow reThrowException = new Rethrow();
            reThrowException.method1();
        } catch (Exception e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
    }

    private void method1() throws Exception {
        try {
            method2();
        } catch (Exception e) {
            throw new Exception("This Exception thrown in first method.");
        }
    }

    private void method2() throws Exception {
        throw new Exception("This Exception thrown in second method.");
    }
}

