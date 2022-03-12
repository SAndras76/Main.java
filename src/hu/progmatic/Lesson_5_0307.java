package hu.progmatic;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Lesson_5_0307 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        /*System.out.println("Kérem a szöveg hosszát!");
        int hossz= scanner.nextInt();
        scanner.nextLine();
        String szoveg = "";
        System.out.println(szoveg.length());
        System.out.println("abc");
        System.out.println("alma");
        System.out.println("alma" + 1);

        while (szoveg.length() < hossz) {
            System.out.println("kérem a következő betűt!");
            String darab = scanner.nextLine();
            szoveg += darab;
        }
        System.out.println("A szöveg : " + szoveg);*/

        /*String szoveg = "";
        // Ha blokkon belül hozzuk létre a változót
        //akkor már már nem fog létezni a while feltételnél,
        //mivel a blokkból kilépve megsemmisül
        String darab;

        do {
            System.out.println("kérem a következő darabot!");
            darab = scanner.nextLine();
            szoveg += darab;
        } while (darab.length() > 0);
        //(darab.equals(""); ez ugyanaz

        System.out.println("A megadott szöveg: ");*/
//Scanner scanner = new Scanner(System.in);

       /* System.out.println("Kérem a SL-t!");
        int stoploss = scanner.nextInt();
        scanner.nextInt();
        System.out.println("Kérem a vételi árat");
        int arfolyam = scanner.nextInt();
        scanner.nextInt();

        int napokszama = 0;

        while (arfolyam > stoploss) {
            System.out.println("Kérem a napi változást!");
            int valtozas = scanner.nextInt();
            arfolyam += valtozas;
            napokszama++;
        }
        System.out.println("Az utolsó árfolyam: " + arfolyam);
        System.out.println("Eltelt napok száma: " + napokszama);*/
//3. feladat
       /* System.out.println("Kérem a TP-t!");
        int take_profit = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Kérem a vételi árat");
        int arfolyam = scanner.nextInt();
        scanner.nextLine();

        int napokszama = 0;

        while (arfolyam < take_profit) {
            System.out.println("Kérem a nyereséget!");
            int valtozas = scanner.nextInt();
            arfolyam += valtozas;
            napokszama++;
        }
        System.out.println("Az utolsó árfolyam: " + arfolyam);
        System.out.println("Eltelt napok száma: " + napokszama);*/


        //int jelenlegiar =
//5. feladat
        /*System.out.println("Kérem az mai árat!");
        int mai = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Kérem a friss napi árat");
        int napi = scanner.nextInt();
        scanner.nextLine();

        int napokszama = 0;
        int valtozas;

        do {
            System.out.println("Kérem a mai árat");
            valtozas = scanner.nextInt();
            ;
            scanner.nextLine();

            napi += valtozas;
            napokszama++;
        } while (valtozas <= 0);*/
        //6. feladat
        //ugyanaz, mint az 5. csak forditva

        //7. feladat
       /* String jelszo;

        do {
            System.out.println("Kérem a jelszót!");
            jelszo = scanner.nextLine();

        if (jelszo.length() < 8) {
            System.out.println(" A jelszónak legalább 8 karakter hosszúnak kell lennie");
        }
        } while (jelszo.length() < 8);

        System.out.println("Az érvényes jelszó: " + jelszo);*/

        //8. feladat





       /* int iranyitoszam;

     do {
         System.out.println("Adj meg egy irányítószámot");
         int szam = scanner.nextInt();
         scanner.nextLine();
         if (szam < 1000 || szam < 9999) {

             System.out.println("A megadott irányítószám nem jó! 1000-9999 közé essen!");
         }
//nem jó valamiért
    } while (szam < 1000 || szam > 9999);
        System.out.println("Az érvényes irányítószám: " + iranyitoszam);*/



    }
}








