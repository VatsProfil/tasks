package lesson140121;

public class LeapYear {


    public static void main(String[] args) {


        isLeap(100);

    }



    public static void isLeap(int year) {

        if(year%4==0 && year%100==0 && year%400==0){

            System.out.println("year is leap year");

        }

        else if(year%4!=0){

            System.out.println("year is not leap year");
        }

        else if(year%4==0 && year%100!=0){

            System.out.println("year is leap year");
        }

        else if(year%4==0 && year%100==0 && year%400!=0){

            System.out.println("year is not leap year");
        }


    }







}
