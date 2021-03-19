import java.util.Scanner;
import java.util.InputMismatchException;

public class zadanie5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try{
        System.out.println("Podaj miesiac:");
        int miesiac = scanner.nextInt();
        if(miesiac>12 || miesiac<1){
            System.out.println("BLAD");
        }
        switch(miesiac){
            case 1:
                System.out.println("Styczen: 31 dni");
                break;
            case 2:
                System.out.println("Luty: 28 dni");
                break;
            case 3:
                System.out.println("Marzec: 31 dni");
                break;
            case 4:
                System.out.println("Kwiecien: 30 dni");
                break;
            case 5:
                System.out.println("Maj: 31 dni");
                break;
            case 6:
                System.out.println("Czerwiec: 30 dni");
                break;
            case 7:
                System.out.println("Lipiec: 31 dni");
                break;
            case 8:
                System.out.println("Sierpien: 31 dni");
                break;
            case 9:
                System.out.println("Wrzesien: 30 dni");
                break;
            case 10:
                System.out.println("Pazdziernik: 31 dni");
                break;
            case 11:
                System.out.println("Listopad: 30 dni");
                break;
            case 12:
                System.out.println("Grudzien: 31 dni");
                break;
        }
        }
        catch (InputMismatchException exception) {
            System.out.println("BLAD");
        }
        finally{
            scanner.close();
        }
    }
}
