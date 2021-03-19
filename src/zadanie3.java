import java.util.Scanner;

public class zadanie3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("Tekst: ");
            String[] napis = scanner.nextLine().split("\\s+");
            System.out.println("%" + napis[1] + " " + napis[0] + "%");
        }
        
        finally{
            scanner.close();
        }
    }
}
