package main;

import java.awt.*;

public class variables {
    public static void main(String[] args) {
        String message = "Hello \"World!\"";
        System.out.println(message.endsWith("!"));
        System.out.println(message.length());
        System.out.println(message.replace("World","jack"));
        System.out.println(message.toUpperCase());
        System.out.println(message.trim());
    }
}
