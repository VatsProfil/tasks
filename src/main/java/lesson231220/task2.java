package lesson231220;

import java.util.Scanner;

public class task2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        String[] arrayVowel = {"a", "e", "i", "o", "u"};

        int  countVowel = 0;



        /*for (String av : arrayVowel) {

            if (word.contains(av))
                countVowel += 1;
        }

        System.out.println(countVowel+" sait səs var");*/


        for( int i=0; i< word.length(); i++ ){
            for( int j=0; j<5; j++ ){

                if(word.substring(i,i+1).contains(arrayVowel[j])){

                    countVowel+=1;

                }}

        }

        System.out.println(countVowel + " sait səs var");


    }
}
