import java.util.Scanner;

public class Lesson_tozsde {
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
    int evek = 0;
        if (sajattoke < 3_000_000) {
            System.out.println("Csóringer....:(");
        }

        while (sajattoke >= 3_000_000) {
            System.out.println("Mennyi volt a nyereség?");
            String bemenet = scanner.nextLine();

            if (bemenet.equalsIgnoreCase("vege")) {
                int nyereseg = Integer.parseInt(bemenet);
                //int nyereseg = scanner.nextInt();
                //scanner.nextLine();

                //if (nyereseg != -999_999) {
                    sajattoke += nyereseg;

                    // evek++ esetén a régi érték kerül behelyettesítésre
                //evek++
                System.out.println("A saját tőke a(z) " + (evek++) + " év végén: " + sajattoke);
                } else {
                    break;
                }
            }
            System.out.println("A maradék pénzed: " + sajattoke);



        }
    }


