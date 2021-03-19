import java.util.Scanner; //DO ZROBIENIA GWIAZDKI DO PRAWEJ

public class zadanie8 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        try{
            System.out.println("Liczba n: "); //do lewej
            int n = scanner.nextInt();
            for( int i=1;i<=n;i++){
                for(int j=0;j<i;j++){
                    System.out.print("*");
                }
                System.out.println();

            }
            for( int i=n;i>=1;i--){
                for(int j=0;j<i;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
            for( int  i=n; i>=1; i--){  //do prawej
                for( int  j=n; j>i; j--){  
                    System.out.print(" ");  
                }  
                for( int k=1; k<=i; k++){  
                    System.out.print ( "*" );  
                }  
                System.out.println(" ");  
            }  
            for (int i=0; i<n; i++){
                for (int j=2; j<=n-i; j++){  
                    System.out.print(" ");  
                }  
                for (int k=0;k<=i;k++){  
                    System.out.print("*");  
                }   
                System.out.println(" ");  
            }  

        }

        finally{
            scanner.close();
        }
    }
}
