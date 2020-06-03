package com.francis;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    printOut("Enter the string to find perms\n");
	    returnPerms(scanner.next());
    }

    static void returnPerms(String string){
        char[] stringarr = string.toCharArray();
        for(int i = 0; i < stringarr.length; i++){
            printOut(String.valueOf(stringarr[i]));
            for(int j = 0; j < stringarr.length; j++){
                if(i != j){
                    printOut(String.valueOf(stringarr[j]));
                }
                
            }
            printOut(" ");
        }
    }

    static void printOut(String string){
        System.out.print(string);
    }
}
