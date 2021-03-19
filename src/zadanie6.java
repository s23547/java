import java.util.Scanner;

public class zadanie6
{   
    public static void main(String args[]) 
    { 
        Scanner scanner = new Scanner(System.in);
        try{
            double [] numb = new double[3];
            System.out.println("Podaj trzy liczby: ");

            for(int i=0; i < numb.length; i++ ) 
            {
                numb[i] = scanner.nextInt();
            }

            System.out.println("\n");

            for(int i = 0 ; i < numb.length;i++)
            {
                for(int j = i+1 ; j< numb.length;j++)
                {
                    if(numb[i] > numb[j])
                    {
                        double temp = numb[i];
                        numb[i] = numb[j];
                        numb[j] = temp;
                    }
                } 
            }

            for(int x = 0; x < numb.length; x++)
            {
                System.out.print(" ");
                System.out.print(numb[x]);
            }

            System.out.println("\n");

            for (int i = numb.length - 1; i >= 0; i--)
                {
                    System.out.print(" ");
                    System.out.print(numb[i]);
                }
            }
        finally{
            scanner.close();
        }
    }    
}