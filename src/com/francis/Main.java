package com.francis;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    printOut("Enter the string to find perms\n");
	    returnPerms(scanner.next(), "");
    }

    static void returnPerms(String str, String ans){
        if (str.length() == 0) {
            System.out.print(ans + " ");
            return;
        }

        for (int i = 0; i < str.length(); i++) {

            // ith character of str
            char ch = str.charAt(i);

            // Rest of the string after excluding
            // the ith character
            String ros = str.substring(0, i) +
                    str.substring(i + 1);

            // Recurvise call
            returnPerms(ros, ans + ch);
        }
    }

    static void printOut(String string){
        System.out.print(string);
    }
}
