package Opps;
import java.util.Scanner;

public class swichScan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a lowercase character: ");
        char ch = sc.next().charAt(0);

        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " is a vowel.");
                break;
            default: System.out.println(ch + " is a consonant.");
            sc.close();
        }
    }
}
