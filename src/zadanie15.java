import java.util.*;
import java.util.Scanner;

public class zadanie15 {

    static boolean areBracketsBalanced(String expr)
    {
        Deque<Character> stack
                = new ArrayDeque<Character>();

        for (int i = 0; i < expr.length(); i++)
        {
            char x = expr.charAt(i);

            if (x == '(' || x == '[' || x == '{')
            {
                stack.push(x);
                continue;
            }
            if (stack.isEmpty())
                return false;
            char check;
            switch (x) {
                case ')':
                    check = stack.pop();
                    if (check == '{' || check == '[')
                        return false;
                    break;

                case '}':
                    check = stack.pop();
                    if (check == '(' || check == '[')
                        return false;
                    break;

                case ']':
                    check = stack.pop();
                    if (check == '(' || check == '{')
                        return false;
                    break;
            }
        }

        return (stack.isEmpty());
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Podaj ciag nawiasow: ");
        String expr = scanner.nextLine();
        if (areBracketsBalanced(expr)){
            System.out.println("TAK ");
        }
        else{
            System.out.println("NIE ");
        }
        scanner.close();
    }
}