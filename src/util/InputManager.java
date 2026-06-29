package util;

import java.util.Scanner;

public class InputManager {

public static Scanner sc = new Scanner(System.in);

public static int getInt(){

        return sc.nextInt();

}

public static String getString(){

        return sc.next();

   }
}