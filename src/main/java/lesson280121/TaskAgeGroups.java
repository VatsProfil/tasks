package lesson280121;

import java.time.LocalTime;
import java.util.*;

public class TaskAgeGroups {


    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        LocalTime time = LocalTime.now();


        System.out.print("for - start: "+time+" ");  // 265ms
        for(int i=0; i < 10000000;i++){

            list.add(random.nextInt(150));

        }
        time=LocalTime.now();
        System.out.println("finish: "+time);


        /*System.out.print("while - start: "+time+" "); // 255ms
        int j=0;
        while(j<10000000){

            list.add(random.nextInt(150));
            j++;

        }
        time=LocalTime.now();
        System.out.println("finish: "+time);*/

        /*int j=0;
        time=LocalTime.now();
        System.out.print("do-while start: "+time+" ");  // 239ms
        do{
            list.add(random.nextInt(150));

            j++;
        }
        while(j<10000000);
        time = LocalTime.now();
        System.out.println("finish: "+time);*/


        int [] groupCounts = new int[150];

        for(int i=0;i<150;i++){

            groupCounts[i]=Collections.frequency(list,i);
            System.out.println(i+" yaslilar: "+groupCounts[i]);
        }

       //System.out.println(Arrays.toString(groupCounts));






    }







}
