package lesson280121;

import java.util.*;

public class TaskAlphabetic {

    public static void main(String[] args) {

        String text="Salam salam necesen necesen ";
        char [] stringCharsArray = convertStringToArray(text);
        List<Character> array = new ArrayList<Character>();

        for(int i=0;i<text.length();i++){

            if((int)stringCharsArray[i] == 32){

                Collections.sort(array);
                for(char k:array){
                    System.out.print(k);
                }

                array = new ArrayList<>();
                System.out.print(" ");
            }

            else {
                array.add(stringCharsArray[i]);
            }

        }

    }

    public static char[] convertStringToArray(String string){

        char [] array = new char[string.length()];

        for(int i=0;i<array.length;i++){

            array[i]=string.toLowerCase().charAt(i);

        }

        return array;
    }










}
