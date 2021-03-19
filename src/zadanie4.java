import java.util.Scanner;
import java.util.InputMismatchException;

public class zadanie4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try{
            System.out.println("Boki: ");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
        

            if( a+b>c && a+c>b && b+c>a ){
                System.out.println("TAK");
            } 
            else if(a<0 || b<0 || c<0){
                System.out.println("BLAD");
                
            }
            else {
                System.out.println("NIE"); 
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
