import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char ch = input.charAt(0);
        System.out.println((int)ch);
        sc.close();
    }
}