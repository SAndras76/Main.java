package hu.progmatic;

import java.util.Scanner;

public class Lesson_4_szombat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //System.out.println("Szombat van");

        System.out.println("Nappali tagozatos vagy? (i/n)");
        boolean nappali = scanner.nextLine().equalsIgnoreCase("i");
        //String nappali = scanner.nextLine();

        System.out.println("Hány órát dolgozol?");
        int munkaviszony = scanner.nextInt();
        scanner.nextLine();
        //ez a fenti sor kell ide, mert különben nem üríti ki az óra megadása utáni adatsort

        System.out.println("Támogatod-e az államot? (i/n)");
        //String bokezu = scanner.nextLine();
        boolean bokezu = scanner.nextLine().equalsIgnoreCase("i");

        System.out.println("Mennyi volt abevételed?");
        int bevetel = scanner.nextInt();
        scanner.nextLine();
        int netto = bevetel;
        //boolean foallasu = vagy true vagy false, más nem lehet

        boolean foallasu = !nappali && munkaviszony < 36;
        if (foallasu && bokezu) {
            //if (nappali.equalsIgnoreCase("i") && munkaviszony < 36 && bokezu.equalsIgnoreCase("i")) {
            netto = bevetel - 75000;
        } else if (foallasu) {
       // } else if (nappali.equalsIgnoreCase("i") && munkaviszony < 36) {
            netto = bevetel - 50000;
        } else {
            netto = bevetel - 25000;
        }
        System.out.println("A bevétel: " + bevetel);
        System.out.println("A netto jövedelem: " + netto);
            /*Ez innen törlendő
            System.out.println("Mellékállású");

            //System.out.println("Gratulálunk, lehetsz mellékállású vállalkozó");
        } else if (bokezu.equalsIgnoreCase("i")) {
            System.out.println("Főállású");

            //System.out.println("Sajnibajni, te főállású kell, hogy legyél");


           // String tamogatom = scanner.nextLine();*/


                    //String tamogatom = String.valueOf(scanner.nextLine().equalsIgnoreCase("i"));



        }

    }

