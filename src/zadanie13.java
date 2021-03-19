import java.util.Scanner;  

public class zadanie13 {
    public static int najwieksza(int[] tab, int index) {
        if(index > 0){
            return Math.max(tab[index], najwieksza(tab,index-1));
        } else {
            return tab[0];
        }
    }
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.printf("Podaj ile elementow: ");
            int n = scanner.nextInt();
            int[] tab = new int [n];
            int index = tab.length - 1;
            System.out.printf("Podaj elementy tablicy: ");
            for(int i = 0; i<n; i++) {
                tab[i] = scanner.nextInt();
            }
            System.out.println((najwieksza(tab, index)));
            scanner.close();
    }
}