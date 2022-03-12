package hu.progmatic;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Lesson_5_0310_Osszegzo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Az első hány db  szám összegét adjam meg? ");
        int darab = scanner.nextInt();

        int osszeg = 0;
        int parosOsszeg = 0;

        for (int i =0; i < darab; i++) {
            osszeg += (i + 1);
            parosOsszeg += (2 * i);
        }

       /*osszeg += 1;
        osszeg += 2;
        osszeg += 3;*/
        /*System.out.println("A számok összege: " + osszeg);
        System.out.println("A páros számok összege: " + parosOsszeg);*/

        //5. FELADAT OMSZ KÖZBESZERZÉS

        //int meret = 3;

        //double[] homersekletek = new double[meret + 1];
        /*System.out.println("Hány nap adatiait szeretné lehívni?");
        int napok = scanner.nextInt();
        scanner.nextLine();
        int[] homersekletek = new int[napok];

        for (int i = 0; i < napok; i++); {
            //<-itt a napok helyett lehet homerseklet.length is
            System.out.println("Kérem a(z) " + (i + 1) + ". nap értékét..");
            homersekletek[i] = scanner.nextInt();
            scanner.nextLine();*/
        //System.out.println("Vége");

       /* System.out.println("Kérem a hőmérsékleteket:  ");
        String bemenet = scanner.nextLine();
        String[] adatok = bemenet.split(" ");
        int[] homersekletek = new int[adatok.length];

        for (int i = 0; i < homersekletek.length; i++) {
        homersekletek[i] = Integer.parseInt(adatok[i]);*/

        //7. feladat
        /*int szamlalo = 0,

        System.out.println("Kérem a hőmérsékleteket:  ");
        String bemenet = scanner.nextLine();
        String[] adatok = bemenet.split(" ");
        int[] homersekletek = new int[adatok.length];

        for (int i = 0; i < homersekletek.;) {
          if homersekletek[i] < 0; {
              szamlalo++ */
            }

        }




