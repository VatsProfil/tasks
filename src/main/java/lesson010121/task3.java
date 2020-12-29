package lesson010121;

import java.awt.*;
import java.util.Arrays;

public class task3 {

    public static void main(String[] args) {

        int [] array = {2,6,8,12,7,56,24,32,16,8,8,4,10,16};
        returnTwoSmallestNumber(array);

    }


    public static void returnTwoSmallestNumber(int [] array){

        int i=0,k=0;
        Arrays.sort(array);
        while(i<array.length){

            if(array[i]==array[i+1]){
                i++;
            }
            else
            {k=i+1;
            break;}
        }
        System.out.println(array[0] + " ve " + array[k] + " en kicik elementlerdir");


    }
}

