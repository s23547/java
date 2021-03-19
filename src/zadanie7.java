import java.util.Scanner;
import java.util.InputMismatchException;

public class zadanie7 
{
    public static void main(String args[]) 
    {
        int skalar= 0;
        Scanner scan = new Scanner(System.in);
        try{
            System.out.println("Podaj wielkosci tablic: ");
            int n = scan.nextInt();
            int m = scan.nextInt();
            int [] tab1 = new int[n];
            int [] tab2 = new int[m];
            
            if (n > m || m > n || n <= 0) {
                System.out.println("BLAD");
                System.exit(0);
            }
            System.out.println("Podaj liczby do tablicy pierwszej: ");
            for(int i=0; i<n; i++)
            {
                tab1[i] = scan.nextInt();
            }
            System.out.println("Podaj liczby do tablicy drugiej: ");
            for(int j=0; j<m; j++)
            {
                tab2[j] = scan.nextInt();
            }
            for (int k=0; k<n; k++)
            {
                skalar += tab1[k] * tab2[k];
            }
            System.out.println("Iloczyn skalarny twoich tablic = " +skalar);
        }
        catch (InputMismatchException exception) {
            System.out.println("BLAD");
        }
        finally{
            scan.close();
        }
    }
}
