package lesson010121;

import java.util.Optional;

public class task5 {

    public static void main(String[] args) {

        findDivisorsSum(10000);



    }


    public static void findDivisorsSum(int number){
        int sum=0;
        for(int i=1;i<number;i++){

            for(int j=1;j<i;j++){

                if(i%j==0) {
                    sum = sum + j;
                }


            }if(i<sum){
                System.out.println(i + " abundant number");
                sum=0;
            }
            else if(i>sum){
                System.out.println(i + " deficient number");
                sum=0;
            }

            else if(i==sum){
                System.out.println(i + " perfect number");
                sum=0;
            }


        }






    }


}
