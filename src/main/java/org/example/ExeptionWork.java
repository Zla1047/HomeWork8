package org.example;

public class ExeptionWork {

    public static void main(String[] args) {
        try {
            throw new Exception("Example!");
        } catch (Exception e) {
            System.out.println("Catch Example: " + e.getMessage());
        } finally {
            System.out.println("Block finally");
        }
    }
}
