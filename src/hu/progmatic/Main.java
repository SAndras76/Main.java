package hu.progmatic;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


            Scanner scanner = new Scanner(System.in);

            System.out.println("Adj meg 3 számot és kiszámolom az átlagát");
            int usernumb1 = scanner.nextInt();
            int usernumb2 = scanner.nextInt();
            int usernumb3 = scanner.nextInt();
            int sumnumb = usernumb1 + usernumb2 + usernumb3;

            float f = (float) sumnumb /3F;

            System.out.println("A 3 szám átlaga: " + f);


            System.out.println("Adj meg 2 számot és kiszámolom az osztás utáni maradékot");
            int usernumb4 = scanner.nextInt();
            int usernumb5 = scanner.nextInt();
            int dividenumb = usernumb4 / usernumb5;

            System.out.println("Osztás eredménye: " + dividenumb);
            System.out.println("Osztás után a maradék: " + (usernumb4 - usernumb5 * (usernumb4 / usernumb5)));

    }
}
