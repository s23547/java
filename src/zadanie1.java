import java.util.Scanner;

public class zadanie1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try{
        System.out.println("Boki: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("Pole prostokata wynosi: " + a * b);
        }

        finally{
            scanner.close();
        }
    }
}
