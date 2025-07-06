package Housten;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Dog bengie = new Dog("bengie.png", "Bengie", 9);
        Dog jeremy = new Dog("jeremy.png", "Jeremy", 9);

        System.out.println("Bengie age " + bengie.age);
        System.out.println("Jeremy age " + jeremy.age);
    }
}
