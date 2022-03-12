package hu.progmatic;

import java.util.Scanner;

public class Lesson_7_0310 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*String parancs;

        do {
            System.out.print(">> ");
            parancs = scanner.next().toLowerCase();

            switch  (parancs) {
                case "köszönés":
                    System.out.println("Sziasztok");
                    System.out.println("\t- köszönés");
                    System.out.println("\t- súgó");
                    System.out.println("\t- vége");

            }*/
        //} while (!parancs.equalsIgnoreCase("vége"));
        //KIRÁNDULÁS 1. feladat


        //double[] homersekletek = new double[] {10.0, 12.0};
        /*double[] homersekletek = {12.0, 10.0, 6.0, 8.0, 16.0, 22.0, 18.0, -4.0, 2.0, -2.0};
        System.out.println("Kérem az első napot! ");
        int elso = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Kérem a kirándulás hosszát napokban! ");
        int hossz = scanner.nextInt();
        scanner.nextLine();

        double elsoHomerseklet = homersekletek[elso - 1];
        double utolsoHomerseklet = homersekletek[elso - 1 + (hossz - 1)];
        double valtozas = utolsoHomerseklet - elsoHomerseklet;


        System.out.println("Az első napon mért hőmérséklet: " + homersekletek[elso -1]);
        System.out.println("Az utolsó napon mért hőmérséklet: " + homersekletek[elso + hossz - 2]);
        System.out.println("A hőmérséklet változása: " + valtozas);
        if (hossz > 1) {
            System.out.println("A hőmérséklet átlagos változása: " + valtozas / (hossz -1));*/

            // 2. feladat
           /* double[] homersekletek = {12.0, 10.0, 6.0, 8.0, 16.0, 22.0, 18.0, -4.0, 2.0, -2.0};
            System.out.println("Kérem az 1. napot:");
            homersekletek[0] = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("2. nap?");
            homersekletek[1] = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("3. nap?");
            homersekletek[2] = scanner.nextDouble();
            scanner.nextLine();*/
//3. feladat
        //double[] homersekletek = {12.0, 10.0, 6.0, 8.0, 16.0, 22.0, 18.0, -4.0, 2.0, -2.0};
       /* int i = 0;
        System.out.println("Kérem a(z) "  + (i + 1) + ". napot:");
        homersekletek[i] = scanner.nextDouble();
        scanner.nextLine();

        i++;

        System.out.println("Kérem a(z) "  + (i + 1) + ". napot:");
        homersekletek[i] = scanner.nextDouble();
        scanner.nextLine();

        i++;

        System.out.println("Kérem a(z) "  + (i + 1) + ". napot:");
        homersekletek[i] = scanner.nextDouble();
        scanner.nextLine();

        i++;*/

        //3. feladat -- FOR CIKLUS!
        //i = 0, i = 1, i = 2

        /*for (int i = 0; i < homersekletek.length; i++) {
            System.out.println("Kérem a(z) "  + (i + 1) + ". napot:");
            homersekletek[i] = scanner.nextDouble();
            scanner.nextLine();
        }
        */

        //4. feldata JÉGTÚRA
//int i = 0;
        double[] homersekletek = {12.0, 10.0, 6.0, 0.0, 0.0, 22.0, 0.0, -4.0, 2.0, -2.0};
        System.out.println("Kérem az első napot! ");
        int elso = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Kérem a kirándulás hosszát napokban! ");
        int hossz = scanner.nextInt();
        scanner.nextLine();
        //for (int i = 0; i < ([homersekletek = 0.0]); i++);
        /*int i = 1;
        homersekletek[i] = 0.0;
        i++;
        homersekletek[i] = 0.0;
        i++;
        homersekletek[i] = 0.0;
        i++;*/

        for (int i = elso -1; i < (elso + (hossz -1)); i++) {
            homersekletek[i] = 0.0;
        }
        System.out.println("vége");
    }

    }



