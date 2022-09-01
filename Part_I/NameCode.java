package Part_I;

import java.util.*;

public class NameCode {
    static char[] dict = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', ' '};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter : \n\t1 for Text Encryption \n\t2 for Cipher Decryption");
        int choice = sc.nextInt();
        switch (choice) {
            case 1 -> {
                System.out.print("Enter a name : ");
                sc.nextLine();
                String str = sc.nextLine();
                textEncryption(str);
            }
            case 2 -> {
                System.out.print("Enter a number : ");
                String str = sc.next();
                cipherDecryption(str);
            }
            default -> {
                System.out.println("Invalid choice! Exiting..");
                System.exit(0);
            }
        }
    }

    private static void textEncryption(String str) {
        str = str.toLowerCase();
        ArrayList<Character> ch = new ArrayList<Character>();
        for (char c : dict) {
            ch.add(c);
        }
        int length = str.length();
        StringBuilder code = new StringBuilder(2*length);
        for (int i = 0; i < length; i++) {
            int n = ch.indexOf(str.charAt(i));
            if (n < 10){
                code.append("0").append(n);
            } else {
                code.append(n);
            }
        }
        System.out.println("Cipher generated : " + code);
    }

    private static void cipherDecryption(String str){
        int length = str.length();
        if (length % 2 == 0) {
            for (int i = 0; i < length; i = i + 2) {
                int n = Integer.parseInt(str.substring(i, i + 2));
                if (n < dict.length) {
                    if (i == 0 || n == 26) {
                        System.out.print(String.valueOf(dict[n]).toUpperCase());
                    } else {
                        System.out.print(dict[n]);
                    }
                } else {
                    System.out.println("Invalid digit code!");
                }
            }
        } else {
            System.out.println("The number should contain even number of digits!");
        }
    }
}
