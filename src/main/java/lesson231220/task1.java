package lesson231220;

import java.util.Scanner;

public class task1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        int count = word.length();
        String middleChar=null;


        if(count%2!=0)
            middleChar = word.substring(count/2,(count/2)+1);
        else
            middleChar=word.substring((count/2)-1,(count/2)+1);


        System.out.println(middleChar);
    }
}
