import java.util.Scanner;

public class zadanie12 {
    public static void main(String args[]) {
        java.text.DecimalFormat df = new java.text.DecimalFormat("0.00");
        Scanner scanner = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        try{
            System.out.printf("Podaj wiek w sekundach: ");
            float wiek = scanner.nextInt();
            float obrot = 31557600;
            float ziemia = wiek/obrot;
            System.out.printf("Podaj planete: ");
            String planeta = scan.nextLine();
            switch (planeta) {
                case "Merkury":
                    System.out.println("Twoj wiek na Merkury to: " + df.format(ziemia * 0.2408467));
                    break;
                case "Wenus":
                    System.out.println("Twoj wiek na Wenus to: " + df.format(ziemia * 0.61519726));
                    break;
                case "Ziemia":
                    System.out.println("Twoj wiek na Ziemi to: " + df.format(ziemia));
                    break;
                case "Mars":
                    System.out.println("Twoj wiek na Marsie to: " + df.format(ziemia * 1.8808158));
                    break;
                case "Jowisz":
                    System.out.println("Twoj wiek na Jowiszu to: " + df.format(ziemia * 11.862615));
                    break;
                case "Saturn":
                    System.out.println("Twoj wiek na Saturnie to: " + df.format(ziemia * 29.447498));
                    break;
                case "Uran":
                    System.out.println("Twoj wiek na Uranie to: " + df.format(ziemia * 84.016846));
                    break;
                case "Neptun":
                    System.out.println("Twoj wiek na Neptunie to: " + df.format(ziemia * 164.79132));
                    break;
                default: {
                    System.out.println("BLAD");
                    break;
                }
            }
        }
        finally{
            scanner.close();
            scan.close();
        }
            
        }
    }

