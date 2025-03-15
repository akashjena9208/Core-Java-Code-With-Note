package programmofstring;

import java.util.Scanner;

public class String13_Frequency_Of_Each_Char_WithoutUsing_Stringe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] count = new int[26]; // Array to store frequencies of letters

        System.out.println("Enter a string:");
        String str = sc.nextLine();

        // Loop through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            if (ch >= 'A' && ch <= 'Z') {
                count[ch - 'A']++; // For uppercase letters
            } else if (ch >= 'a' && ch <= 'z') {
                count[ch - 'a']++; // For lowercase letters
            }
        }

        // Print frequencies of each letter
        System.out.println("Frequency of each character:");
        for (int i = 0; i < count.length; i++) {
            if (count[i] > 0) { // Only print letters that appear in the string
                System.out.println((char)(i + 'A') + " ---> " + count[i]);
            }
        }

        sc.close();
    }
}
