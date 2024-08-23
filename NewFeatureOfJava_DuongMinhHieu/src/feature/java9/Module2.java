package feature.java9;

import feature.java8.Module1;

public class Module2 {
    public static void main(String[] args) {
        Module1 module1 = new Module1();
        module1.printMessage();
        System.out.println("Hello from Module 2!");
    }
}