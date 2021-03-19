import java.util.Scanner;

public class zadanie14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Wprowadz liczby: ");
        int liczba1 = scanner.nextInt();
        int liczba2 = scanner.nextInt();
        int dodaj1 = 0, dodaj2 = 0;
        for(int i = 1 ; i < liczba1 ; i++) {
            if(liczba1 % i == 0)
                dodaj1 = dodaj1 + i;
        }
        for(int i = 1 ; i < liczba2 ; i++) {
            if(liczba2 % i == 0)
                dodaj2 = dodaj2 + i;
        }
        if(liczba1 == dodaj2 && liczba2 == dodaj1){
            System.out.println("TAK");
        }
        else{
            System.out.println("NIE");
        }
        scanner.close();
    }
}