//Author: Chris Ibraheem

import java.util.Scanner;
import java.util.Random;

public class passwordGenerator {
    public static void main (String args []) {
        System.out.println("Welcome to PassGen!\n");
        
        Scanner userInput = new Scanner(System.in);

        System.out.println("Quantity of Passwords");
        int quantity = userInput.nextInt();
        
        int type = 0;
        while (true) {
            System.out.println("Type of Password:");
            type = userInput.nextInt();
            if (type == 1 || type == 2 || type == 3 || type == 4 || type == 5 || type == 12 || type == 13 || type == 14 || type == 23 || type == 24 || type == 34) {
                break;
            }
            else {
                System.out.println("Not a valid preference, try again.");
            }
        }

        System.out.println("Length of Passwords:");
        int length = userInput.nextInt();

        for (int i = 0; i < quantity; i++) {
            generator(type,length);
            System.out.println();
        }

        userInput.close();
    }

    public static void generator(int type, int length) {
        //create random object to randomize selection
        Random r = new Random();
                
        //lowercase
        if (type == 1) {
            String lowercase = "abcdefghijklmnopqrstuvwxyz";
            for (int j = 0; j < length; j++) {
                System.out.print(lowercase.charAt(r.nextInt(lowercase.length())));
            }
        }
        //upper
        else if (type == 2) {
            String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            for (int j = 0; j < length; j++) {
                System.out.print(uppercase.charAt(r.nextInt(uppercase.length())));
            }
        }
        //numeric
        else if (type == 3) {
            String numbers = "1234567890";
            for (int j = 0; j < length; j++) {
                System.out.print(numbers.charAt(r.nextInt(numbers.length())));
            }
        }
        //special characters
        else if (type == 4) {
            String characters = "!@#$%^&*()-+_=";
            for (int j = 0; j < length; j++) {
                System.out.print(characters.charAt(r.nextInt(characters.length())));
            }
        }
        //all
        else if (type == 5) {
            String all = "abcdefghijklmnopqrstuvwxyz1234567890ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*()-+_=";
            for (int j = 0; j < length; j++) {
                System.out.print(all.charAt(r.nextInt(all.length())));
            }
        }
        //lower and upper
        else if (type == 12) {
            String lower_upper = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
            for (int j = 0; j < length; j++) {
                System.out.print(lower_upper.charAt(r.nextInt(lower_upper.length())));
            }
        }
        //lower and numeric
        else if (type == 13) {
            String lower_numeric = "abcdefghijklmnopqrstuvwxyz1234567890";
            for (int j = 0; j < length; j++) {
                System.out.print(lower_numeric.charAt(r.nextInt(lower_numeric.length())));
            }
        }
        //lower and special
        else if (type == 14) {
            String lower_special = "abcdefghijklmnopqrstuvwxyz!@#$%^&*()-+_=";
            for (int j = 0; j < length; j++) {
                System.out.print(lower_special.charAt(r.nextInt(lower_special.length())));
            }
        }
        //upper and numeric
        else if (type == 23) {
            String upper_numeric = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
            for (int j = 0; j < length; j++) {
                System.out.print(upper_numeric.charAt(r.nextInt(upper_numeric.length())));
            }
        }
        //upper and special
        else if (type == 24) {
            String upper_special = "ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*()-+_=";
            for (int j = 0; j < length; j++) {
                System.out.print(upper_special.charAt(r.nextInt(upper_special.length())));
            }
        }
        //numeric and special
        else if (type == 34) {
            String lower_upper = "1234567890!@#$%^&*()-+_=";
            for (int j = 0; j < length; j++) {
                System.out.print(lower_upper.charAt(r.nextInt(lower_upper.length())));
            }
        }
        else {
            System.out.println("Preference Input Error.");
        }
    }
}

/*
function takes the arrays as a parameter, concatenates them together into one string and executes the randomizer on it
*/