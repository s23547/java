import java.util.Scanner;
import java.util.InputMismatchException;

public class zadanie10 
{
    public static void main(String args[]) 
    {
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.printf("Rozmiar macierzy: ");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if(a<0 || b<0){
                System.out.printf("BLAD");
            }
            int macierz[][] = new int[a][b];
            System.out.println("Wprowadz liczby: ");
            for (int i = 0; i < a; i++) 
            {
                for (int j = 0; j < b; j++) 
                {
                    macierz[i][j] = scanner.nextInt();
                }
            }
            System.out.println("Twoja macierz po transpozycji: ");
            for (int i = 0; i < b; i++) 
            {
                for (int j = 0; j < a; j++) 
                {
                    System.out.print(macierz[j][i] + " ");
                }
                System.out.println(" ");
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