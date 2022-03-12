package hu.progmatic;

import java.util.Scanner;

public class Lesson_4_tozsde {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*int kftminimum = 3000000;
        int bevetel = 500_000_000;
        int kiadas = 500_000_000;
        int nyereseg = bevetel - kiadas;*/

        System.out.println("Mennyi pénzed van? ");
        int toke = scanner.nextInt();
        scanner.nextLine();
                int sajattoke = toke;

        if (sajattoke < 3_000_000) {
            System.out.println("Csóringer....:(");
        }

        while (sajattoke >= 3_000_000) {
            System.out.println("Mennyi volt a nyereség?");
            int nyereseg = scanner.nextInt();
            scanner.nextLine();
            sajattoke += nyereseg;
        }
        System.out.println("A maradék pénzed: " + sajattoke);

       /* System.out.println("Mennyi volt a cég bevétele?");
        int bevetel = scanner.nextInt();

        System.out.println("Mennyi volt a kiadásod? ");
        int kiadas = scanner.nextInt();

        System.out.println("A saját tőkéd jelenleg: " + toke + nyereseg);


        System.out.println("Mennyi volt a cég bevétele?");
        int bevetel2 = scanner.nextInt();


        System.out.println("Mennyi volt a cég bevétele?");
        int bevetel = scanner.nextInt();
        System.out.println("Mennyi volt a cég bevétele?");
        int bevetel = scanner.nextInt();
        System.out.println("Mennyi volt a cég bevétele?");
        int bevetel = scanner.nextInt();
        System.out.println("Mennyi volt a cég bevétele?");
        int bevetel = scanner.nextInt();


        if (kftminimum < 3000000) {
            System.out.println("fizess be a törzstőkébe!");*/


        }
    }

