package hu.progmatic;

import java.util.Scanner;

public class Practice_0324_swim {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            //int[][] swimTimes = new int[3][4];

            System.out.println("Kérlek add meg a 3-mal ezelőtti napra 100m gyors eredményed");
            int free3 = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Kérlek add meg a 2-vel ezelőtti napra 100m gyors eredményed");
            int free2 = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Kérlek add meg a 1-gyel ezelőtti napra 100m gyors eredményed");
            int free1 = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Kérlek add meg a mai napra 100m gyors eredményed");
            int free0 = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Kérlek add meg a 3-mal ezelőtti napra 100m mell eredményed");
            int breast3 = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Kérlek add meg a 2-vel ezelőtti napra 100m mell eredményed");
            int breast2 = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Kérlek add meg a 1-gyel ezelőtti napra 100m mell eredményed");
            int breast1 = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Kérlek add meg a mai napra 100m mell eredményed");
            int breast0 = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Kérlek add meg a 3-mal ezelőtti napra 100m pillangó eredményed");
            int fly3 = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Kérlek add meg a 2-vel ezelőtti napra 100m pillangó eredményed");
            int fly2 = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Kérlek add meg a 1-gyel ezelőtti napra 100m pillangó eredményed");
            int fly1 = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Kérlek add meg a mai ezelőtti napra 100m pillangó eredményed");
            int fly0 = scanner.nextInt();
            scanner.nextLine();


            //int bestPerform = 0;
            int[][] swimTimes = new int [][]{
                    {free3, free2, free1, free0
                    },
                    {breast3, breast2, breast1, breast0
                    },
                    {fly3, fly2, fly1, fly0
                    },
            };
            int[] firstArrayOfSwimTimes = swimTimes[0];
            int veryFirstOfSwimTimes= swimTimes[0][0];
            System.out.println("Kérem az úszás kódot! 0= gyors, 1=mell, 2= pillangó");
            int swimCode = scanner.nextInt();
            scanner.nextLine();
            if (swimCode > 2) {
                System.out.println("0-1-2 számokat adhatsz csak!");
                return;


            }
            boolean voltEEgyPercAlatti = false;

            //int[]freeStyle = swimTimes[0];
            //int[]breastStroke = swimTimes[1];
            //int[]butterfly = swimTimes[2];

            System.out.println("Add meg a referencia időt másodpercben!");
            int referenceTime = scanner.nextInt();
            scanner.nextLine();
            for (int i = 0; i < swimTimes.length; i++) {
                if (swimTimes[0][0] < referenceTime) {
                    voltEEgyPercAlatti = true;
                    break;
                }
            }
            if (voltEEgyPercAlatti) {
                System.out.println("Volt jobb időd, mint " + referenceTime + "másodperc");
            } else {
                System.out.println("Lassú voltál");
            }

        }

        //public static boolean swimTimes() {

    }


