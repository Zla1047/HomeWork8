package org.example;


public class LastClass {

    public static void main(String[] args) {
        try {
            new LastClass().f();
        } catch (Exception e) {
            System.out.println("Caught in main method: " + e.getMessage());
        }
    }

    void g() throws Exception {
        throw new Exception("Exception from g()");
    }

    void f() throws Exception {
        try {
            g();
        } catch (Exception e) {
            throw new Exception("New exception from f()", e);
        }
    }
}
