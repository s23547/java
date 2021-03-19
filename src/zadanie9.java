import java.util.Scanner; //BEZ CHARA ZROBIONE

public class zadanie9 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("Podaj wyraz: ");
            String a = scanner.nextLine();
            int h = a.length();

            int kk = 0;
            int k = (h - 1);
            for (int i = 0; i < h; i++) {

                if (a.charAt(i) != a.charAt(k)) {
                    kk = 1;
                    break;
                }
                k--;
            }

            if (kk == 1)
                System.out.println("NIE");
            else {
                System.out.println("TAK");
            }
        }
        finally{
            scanner.close();
        }
    }
}