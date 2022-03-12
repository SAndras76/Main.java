package hu.progmatic;

import java.util.Scanner;

public class Selmeczi_Andras_Mr_Mrs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Can you give me your name please?");
        String name = scanner.nextLine();


        System.out.println("Gender? (male / female");
        boolean gender = scanner.nextLine().equalsIgnoreCase("female");

        String female = "Mrs.";
        String male = "Mr.";
    if (gender) {
        System.out.println("Hi " + female + name +"!");
    } else {
        System.out.println("Hi " +male +name +"!");
    }
    }
}
