package lesson010121;

public class task4 {

    public static void main(String[] args) {

        checkUglyNumber(1);
    }

    public static void checkUglyNumber(int number) {


        boolean isUglyNumber=true;
            for(int i=7;i<10000;i++){

                if(number%2==0 || number%3==0 || number%5==0 && number%i!=0) {

                }

                else {
                    isUglyNumber=false;
                }


            }

            if(isUglyNumber){
                System.out.println(number + " ugly number-dir");
            }
            else{
                System.out.println(number + " ugly number deyil");
            }


    }
}