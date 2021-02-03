import java.util.Scanner;

public class Recursion {
    public static void main (String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a string --->");
        String phrase = sc.next();

        System.out.println(vowels(phrase));
    }//end of main

    public static int vowels( String s ){
        int counter = 0;
        char c;
        if(s.length() < 1)  return 0;

        else
            c = s.charAt(0);
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
            counter++;
        }
        return counter + vowels(s.substring(1));
    }//end of vowels

}//end of class
