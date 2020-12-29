package lesson010121;

import java.util.Arrays;

public class task2 {

    public static void main(String[] args) {


       int [] array = {10,20,60,10,10,10,20,30,20,40,40,50,60,60,60};
      int uniqueElements = returnCountOfUniques(array);
      eleminateDuplicate(array,uniqueElements);
      System.out.println(uniqueElements+" sayda ferqli element var");





    }

    public static void eleminateDuplicate(int [] uneleminatedArray, int size){

        Arrays.sort(uneleminatedArray);
        int [] eleminatedArray=new int[size];
        int k=1,i=0,j=1;
        eleminatedArray[0]=uneleminatedArray[0];



        while(i<uneleminatedArray.length && j<uneleminatedArray.length) {


            if (uneleminatedArray[i] == uneleminatedArray[j])
            {
                j++;

            }
            else {

                eleminatedArray[k]=uneleminatedArray[j];
                i=j;
                k++;
            }
        }
        System.out.println(Arrays.toString(eleminatedArray));
    }


    public static int returnCountOfUniques(int [] array){

        Arrays.sort(array);
        int k=1,i=0,j=1;

        while(i<array.length && j<array.length){

            if(array[i]==array[j]){
                j++;
            }
            else{
                i=j;
                k++;
            }



        }
        return k;


    }

    }
